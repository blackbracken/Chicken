package black.bracken.chicken.response.keys.match.roster

import black.bracken.chicken.response.ExtractableJsonModel
import black.bracken.chicken.response.ModelKey
import black.bracken.chicken.response.models.MatchRoster
import black.bracken.chicken.response.models.MatchRosterAttributes
import com.beust.klaxon.JsonObject

/**
 * @author BlackBracken
 */
object MatchRosterKeys {

    val ID = ModelKey<MatchRoster, String> { model -> model.jsonObject["id"] as String }

    val ATTRIBUTES = ModelKey<MatchRoster, ExtractableJsonModel<MatchRosterAttributes>> { model ->
        ExtractableJsonModel(MatchRosterAttributes(model.jsonObject["attributes"] as JsonObject))
    }

}