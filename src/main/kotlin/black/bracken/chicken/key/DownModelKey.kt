package black.bracken.chicken.key

import black.bracken.chicken.model.JsonModel
import black.bracken.chicken.model.ModelDealer
import com.beust.klaxon.JsonObject

/**
 * @author BlackBracken
 */
class DownModelKey<M : JsonModel, R : JsonModel>(
        private val id: String,
        private val instantiate: (JsonObject) -> R
) : ModelKey<M, ModelDealer<R>>(
        { model -> ModelDealer(instantiate(model.jsonObject[id] as JsonObject)) }
)