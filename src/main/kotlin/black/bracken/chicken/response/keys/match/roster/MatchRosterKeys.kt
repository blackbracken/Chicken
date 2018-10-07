package black.bracken.chicken.response.keys.match.roster

import black.bracken.chicken.response.DownModelKey
import black.bracken.chicken.response.SimpleModelKey
import black.bracken.chicken.response.models.MatchRoster
import black.bracken.chicken.response.models.MatchRosterAttributes

/**
 * @author BlackBracken
 */
object MatchRosterKeys {

    val ID = SimpleModelKey<MatchRoster, String>("id")

    val ATTRIBUTES = DownModelKey<MatchRoster, MatchRosterAttributes>("attributes") { jsonObject ->
        MatchRosterAttributes(jsonObject)
    }

}