package black.bracken.chicken.key

import black.bracken.chicken.model.JsonModel

/**
 * @author BlackBracken
 */
@Suppress("UNCHECKED_CAST")
class SimpleModelKey<M : JsonModel, out R : Any>(
        private val id: String,
        private val transform: (Any) -> R = { it as R }
) : ModelKey<M, R>({ model -> transform(model.jsonObject[id]!!) })