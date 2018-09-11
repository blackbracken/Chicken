package black.bracken.chicken.key

import com.beust.klaxon.JsonObject

/**
 * @author BlackBracken
 */
class ModelKey<R>(val transform: (JsonObject) -> R)