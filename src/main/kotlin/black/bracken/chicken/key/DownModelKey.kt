package black.bracken.chicken.key

import black.bracken.chicken.model.JsonModel
import black.bracken.chicken.model.ModelDealer
import com.beust.klaxon.JsonObject

/**
 * @author BlackBracken
 */
class DownModelKey<in M : JsonModel, R : JsonModel>(
        private val id: String,
        private val instantiate: (JsonObject) -> R
) : ModelKey<M, ModelDealer<R>>({ ModelDealer(instantiate(it.jsonObject[id] as JsonObject)) })