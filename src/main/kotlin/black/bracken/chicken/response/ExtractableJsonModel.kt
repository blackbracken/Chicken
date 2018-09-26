package black.bracken.chicken.response

/**
 * @author BlackBracken
 */
class ExtractableJsonModel<M : JsonModel>(private val model: M) {

    operator fun <R : Any> get(key: ModelKey<M, R>): R = key.extract(model)

}
