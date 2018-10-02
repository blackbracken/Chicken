package black.bracken.chicken.response.keys.match

import black.bracken.chicken.response.ExtractableJsonModel
import black.bracken.chicken.response.ModelKey
import black.bracken.chicken.response.models.MatchAsset
import black.bracken.chicken.response.models.MatchAssetAttributes
import com.beust.klaxon.JsonObject

/**
 * @author BlackBracken
 */
object MatchAssetKeys {

    val ID = ModelKey<MatchAsset, String> { model -> model.jsonObject["id"] as String }

    val ATTRIBUTES = ModelKey<MatchAsset, ExtractableJsonModel<MatchAssetAttributes>> { model ->
        ExtractableJsonModel(MatchAssetAttributes(model.jsonObject["attributes"] as JsonObject))
    }

}