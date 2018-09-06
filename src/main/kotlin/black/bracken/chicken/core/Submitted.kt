package black.bracken.chicken.core

import black.bracken.chicken.exception.ExceedRateLimitException
import black.bracken.chicken.exception.NotFoundException
import black.bracken.chicken.exception.UnauthorizedException
import black.bracken.chicken.exception.UnsupportedMediaTypeException
import black.bracken.chicken.util.extension.decodedBody
import okhttp3.Call
import kotlin.concurrent.thread

/**
 * @author BlackBracken
 */
class Submitted<R>(private val call: () -> Call, private val transform: (String) -> R) {

    fun complete(): R {
        val response = call().execute()

        return when (response.code()) {
            200 -> transform(response.decodedBody!!)
            401 -> throw UnauthorizedException
            404 -> throw NotFoundException
            415 -> throw UnsupportedMediaTypeException
            429 -> throw ExceedRateLimitException
            else -> throw IllegalStateException("unexpected something happened")
        }
    }

    fun completeOrNull(): R? = try {
        complete()
    } catch (throwable: Throwable) {
        null
    }

    fun queue(success: ((R) -> Unit) = {}, failure: ((Throwable) -> Unit) = { throw it }): Unit = thread {
        try {
            success(complete())
        } catch (throwable: Throwable) {
            failure(throwable)
        }
    }.run()

    fun queue(action: (R) -> Unit): Unit = queue(success = action)

}