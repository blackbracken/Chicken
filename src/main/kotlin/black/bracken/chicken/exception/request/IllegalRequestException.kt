package black.bracken.chicken.exception.request

/**
 * @author BlackBracken
 */
open class IllegalRequestException(val errorCode: Int) : RuntimeException()