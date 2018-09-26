package black.bracken.chicken.response

/**
 * A key to extract values from [JsonModel].
 *
 * @author BlackBracken
 */
class ModelKey<M : JsonModel, out R : Any>(val extract: (M) -> R)