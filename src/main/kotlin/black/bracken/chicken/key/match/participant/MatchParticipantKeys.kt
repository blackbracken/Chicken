package black.bracken.chicken.key.match.participant

import black.bracken.chicken.key.DownModelKey
import black.bracken.chicken.key.SimpleModelKey
import black.bracken.chicken.model.ExtractableJsonModel
import black.bracken.chicken.model.MatchParticipant
import black.bracken.chicken.model.MatchParticipantAttributes

/**
 * @author BlackBracken
 */
object MatchParticipantKeys {

    val ID = SimpleModelKey<MatchParticipant, String>("id")

    val ATTRIBUTES = DownModelKey<MatchParticipant, MatchParticipantAttributes>("attributes") { jsonObject -> MatchParticipantAttributes(jsonObject) }

}

val ExtractableJsonModel<MatchParticipant>.id get() = this[MatchParticipantKeys.ID]
val ExtractableJsonModel<MatchParticipant>.attributes get() = this[MatchParticipantKeys.ATTRIBUTES]