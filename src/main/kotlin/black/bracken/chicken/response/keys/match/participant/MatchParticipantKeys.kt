package black.bracken.chicken.response.keys.match.participant

import black.bracken.chicken.response.DownModelKey
import black.bracken.chicken.response.SimpleModelKey
import black.bracken.chicken.response.models.MatchParticipant
import black.bracken.chicken.response.models.MatchParticipantAttributes

/**
 * @author BlackBracken
 */
object MatchParticipantKeys {

    val ID = SimpleModelKey<MatchParticipant, String>("id")

    val ATTRIBUTES = DownModelKey<MatchParticipant, MatchParticipantAttributes>("attributes") { jsonObject -> MatchParticipantAttributes(jsonObject) }

}