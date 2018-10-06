package black.bracken.chicken.response

/**
 * @author BlackBracken
 */
@Suppress("UNCHECKED_CAST")
class SimpleModelKey<M : JsonModel, out R : Any>(
        private val id: String,
        private val transform: (Any) -> R = { it as R }
) : ModelKey<M, R>({ model -> transform(model.jsonObject[id]!!) })