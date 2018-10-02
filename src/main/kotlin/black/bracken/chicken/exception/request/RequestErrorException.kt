package black.bracken.chicken.exception.request

/**
 * @author BlackBracken
 */
open class RequestErrorException(val errorCode: Int, message: String? = null) : RuntimeException(message)

object UnauthorizedErrorException : RequestErrorException(401, "Unauthorized")

object NotFoundErrorException : RequestErrorException(404, "Not Found")

object UnsupportedMediaTypeErrorException : RequestErrorException(415, "Unsupported media type")

object ExceedRateLimitErrorException : RequestErrorException(427, "Too many requests")
