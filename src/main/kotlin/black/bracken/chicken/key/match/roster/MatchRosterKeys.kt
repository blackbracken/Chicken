package black.bracken.chicken.key.match.roster

import black.bracken.chicken.key.DownModelKey
import black.bracken.chicken.key.SimpleModelKey
import black.bracken.chicken.model.MatchRoster
import black.bracken.chicken.model.MatchRosterAttributes
import black.bracken.chicken.model.ModelDealer

/**
 * @author BlackBracken
 */
object MatchRosterKeys {

    val ID = SimpleModelKey<MatchRoster, String>("id")

    val ATTRIBUTES = DownModelKey<MatchRoster, MatchRosterAttributes>("attributes") { MatchRosterAttributes(it) }

}

val ModelDealer<MatchRoster>.id get() = this[MatchRosterKeys.ID]
val ModelDealer<MatchRoster>.attributes get() = this[MatchRosterKeys.ATTRIBUTES]