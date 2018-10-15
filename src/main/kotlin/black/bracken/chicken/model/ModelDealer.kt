package black.bracken.chicken.model

import black.bracken.chicken.key.ModelKey

/**
 * @author BlackBracken
 */
class ModelDealer<M : JsonModel>(private val model: M) {

    operator fun <R : Any> get(key: ModelKey<M, R>): R = key.extract(model)

}
