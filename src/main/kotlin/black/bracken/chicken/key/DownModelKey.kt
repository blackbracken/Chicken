package black.bracken.chicken.key

import black.bracken.chicken.model.ExtractableJsonModel
import black.bracken.chicken.model.JsonModel
import com.beust.klaxon.JsonObject

/**
 * @author BlackBracken
 */
class DownModelKey<M : JsonModel, R : JsonModel>(
        val id: String,
        val instantiate: (JsonObject) -> R
) : ModelKey<M, ExtractableJsonModel<R>>(
        { model -> ExtractableJsonModel(instantiate(model.jsonObject[id] as JsonObject)) }
)