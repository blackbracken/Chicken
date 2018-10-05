package black.bracken.chicken.response

/**
 * @author BlackBracken
 */
@Suppress("UNCHECKED_CAST")
class SimpleModelKey<M : JsonModel, out R : Any>(private val id: String) : ModelKey<M, R>({ model -> model.jsonObject[id] as R })