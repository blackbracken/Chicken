package black.bracken.chicken

import black.bracken.chicken.exception.request.*
import black.bracken.chicken.request.Request
import black.bracken.chicken.util.decodedBody
import com.beust.klaxon.JsonObject
import com.beust.klaxon.Parser
import okhttp3.Call
import java.net.UnknownHostException
import kotlin.concurrent.thread

/**
 * A wrapped [Request] which can be submitted to PUBG API immediately in some ways.
 *
 * @author BlackBracken
 * @param R A returned type by requesting
 */
class Prepared<R : Any> internal constructor(
        private val call: () -> Call,
        private val transform: (JsonObject) -> R
) {

    private val parser = Parser()

    /**
     * Submits [call] **while blocking** then returns the received value is transformed into [R]; done in synchronous.
     *
     * @throws [UnknownHostException] if couldn't reach/connect host.
     * @throws [NotFoundException] if couldn't find specified api.
     * @throws [UnsupportedMediaTypeException] if didn't support media type.
     * @throws [ExceedRateLimitException] if exceeded rate limit.
     * @throws [IllegalRequestException] if received response-code is not 200 and unexpected.
     */
    fun complete(): R {
        val response = call().execute()

        // error handling
        when (response.code()) {
            200 -> Unit
            401 -> throw UnauthorizedException
            404 -> throw NotFoundException
            415 -> throw UnsupportedMediaTypeException
            429 -> throw ExceedRateLimitException
            else -> throw IllegalRequestException(response.code())
        }

        return transform(parser.parse(StringBuilder(response.decodedBody)) as JsonObject)
    }

    /**
     * Submits [call] **in another thread (non-blocking)** then executes [success] with transformed [R] if success otherwise [failure] with happened [Throwable];
     * done in asynchronous.
     *
     * @see [complete] Throws exceptions same as [complete] in [failure]
     */
    fun queue(success: (R) -> Unit, failure: ((Throwable) -> Unit)): Unit = thread {
        try {
            success(complete())
        } catch (throwable: Throwable) {
            failure(throwable)
        }
    }.run()

    /**
     * Submits [call] **in another thread (non-blocking)** then executes [success] with transformed [R] if success otherwise throws [Throwable];
     * done in asynchronous.
     *
     * @see [complete] Throws exceptions same as [complete]
     */
    fun queue(success: (R) -> Unit): Unit = queue(success) { throw it }

}