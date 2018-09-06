package black.bracken.chicken.exception

/**
 * @author BlackBracken
 */
sealed class ChickenException(val errorCode: Int) : RuntimeException()

object UnauthorizedException : ChickenException(401)

object NotFoundException : ChickenException(404)

object UnsupportedMediaTypeException : ChickenException(415)

object ExceedRateLimitException : ChickenException(427)