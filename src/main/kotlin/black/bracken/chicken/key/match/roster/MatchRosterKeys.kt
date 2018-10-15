package black.bracken.chicken.key.match.roster

import black.bracken.chicken.key.DownModelKey
import black.bracken.chicken.key.SimpleModelKey
import black.bracken.chicken.model.ModelDealer
import black.bracken.chicken.model.MatchRoster
import black.bracken.chicken.model.MatchRosterAttributes

/**
 * @author BlackBracken
 */
object MatchRosterKeys {

    val ID = SimpleModelKey<MatchRoster, String>("id")

    val ATTRIBUTES = DownModelKey<MatchRoster, MatchRosterAttributes>("attributes") { jsonObject ->
        MatchRosterAttributes(jsonObject)
    }

}

val ModelDealer<MatchRoster>.id get() = this[MatchRosterKeys.ID]
val ModelDealer<MatchRoster>.attributes get() = this[MatchRosterKeys.ATTRIBUTES]