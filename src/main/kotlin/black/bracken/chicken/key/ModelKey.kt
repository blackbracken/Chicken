package black.bracken.chicken.key

import black.bracken.chicken.model.Model
import com.beust.klaxon.JsonObject

/**
 * A key to extract values from [Model].
 *
 * @author BlackBracken
 */
class ModelKey<R>(internal val transform: (JsonObject) -> R)