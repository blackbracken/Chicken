package black.bracken.chicken.key.match.participant

import black.bracken.chicken.key.DownModelKey
import black.bracken.chicken.key.SimpleModelKey
import black.bracken.chicken.model.MatchParticipant
import black.bracken.chicken.model.MatchParticipantAttributes
import black.bracken.chicken.model.ModelDealer

/**
 * @author BlackBracken
 */
object MatchParticipantKeys {

    val ID = SimpleModelKey<MatchParticipant, String>("id")

    val ATTRIBUTES = DownModelKey<MatchParticipant, MatchParticipantAttributes>("attributes") { MatchParticipantAttributes(it) }

}

val ModelDealer<MatchParticipant>.id get() = this[MatchParticipantKeys.ID]
val ModelDealer<MatchParticipant>.attributes get() = this[MatchParticipantKeys.ATTRIBUTES]