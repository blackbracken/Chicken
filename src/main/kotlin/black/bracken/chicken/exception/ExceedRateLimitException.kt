package black.bracken.chicken.exception

/**
 * Represents an exception which thrown because the amount of available request reaches rate limit.
 *
 * @author BlackBracken
 */
class ExceedRateLimitException : RuntimeException()