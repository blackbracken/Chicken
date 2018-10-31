package black.bracken.chicken.key

import black.bracken.chicken.model.JsonModel

/**
 * A key to extract values from [JsonModel].
 *
 * @author BlackBracken
 */
open class ModelKey<in M : JsonModel, out R : Any>(val extract: (M) -> R)