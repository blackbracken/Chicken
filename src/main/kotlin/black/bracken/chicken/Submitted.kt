package black.bracken.chicken

import black.bracken.chicken.exception.request.*
import black.bracken.chicken.util.extension.decodedBody
import com.beust.klaxon.JsonObject
import com.beust.klaxon.Parser
import okhttp3.Call
import kotlin.concurrent.thread

/**
 * @author BlackBracken
 */
class Submitted<R : Any>(private val call: () -> Call, private val squeeze: (JsonObject) -> R) {

    private val parser = Parser()

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

        return squeeze(parser.parse(StringBuilder(response.decodedBody)) as JsonObject)
    }

    fun completeOrNull(): R? = try {
        complete()
    } catch (throwable: Throwable) {
        null
    }

    fun queue(success: (R) -> Unit = {}, failure: ((Throwable) -> Unit) = { throw it }): Unit = thread {
        try {
            success(complete())
        } catch (throwable: Throwable) {
            failure(throwable)
        }
    }.run()

    fun queue(action: (R) -> Unit): Unit = queue(success = action)

}