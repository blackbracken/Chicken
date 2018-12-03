package black.bracken.chicken.key

import black.bracken.chicken.model.JsonModel

/**
 * @author BlackBracken
 */
@Suppress("UNCHECKED_CAST")
class SimpleModelKey<in M : JsonModel, out R : Any>(
        private val id: String,
        private val transform: (Any) -> R = { it as R }
) : ModelKey<M, R>({ transform(it.jsonObject[id]!!) })