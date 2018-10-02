package black.bracken.chicken.response.keys.match

import black.bracken.chicken.response.ExtractableJsonModel
import black.bracken.chicken.response.ModelKey
import black.bracken.chicken.response.models.Match
import black.bracken.chicken.response.models.MatchAttributes
import black.bracken.chicken.response.models.MatchRelationships
import com.beust.klaxon.JsonObject

/**
 * @author BlackBracken
 */
object MatchKeys {

    val ID = ModelKey<Match, String> { model -> model.jsonObject["id"] as String }

    val ATTRIBUTES = ModelKey<Match, ExtractableJsonModel<MatchAttributes>> { model ->
        ExtractableJsonModel(MatchAttributes(model.jsonObject["attributes"] as JsonObject))
    }

    val RELATIONSHIPS = ModelKey<Match, ExtractableJsonModel<MatchRelationships>> { model ->
        ExtractableJsonModel(MatchRelationships(model.jsonObject["relationships"] as JsonObject))
    }

}