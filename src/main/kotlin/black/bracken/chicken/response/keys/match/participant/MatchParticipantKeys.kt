package black.bracken.chicken.response.keys.match.participant

import black.bracken.chicken.response.ExtractableJsonModel
import black.bracken.chicken.response.ModelKey
import black.bracken.chicken.response.models.MatchParticipant
import black.bracken.chicken.response.models.MatchParticipantAttributes
import com.beust.klaxon.JsonObject

/**
 * @author BlackBracken
 */
object MatchParticipantKeys {

    val ID = ModelKey<MatchParticipant, String> { model -> model.jsonObject["id"] as String }

    val ATTRIBUTES = ModelKey<MatchParticipant, ExtractableJsonModel<MatchParticipantAttributes>> { model ->
        ExtractableJsonModel(MatchParticipantAttributes(model.jsonObject["attributes"] as JsonObject))
    }

}