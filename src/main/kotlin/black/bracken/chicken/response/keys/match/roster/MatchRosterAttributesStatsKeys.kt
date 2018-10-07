package black.bracken.chicken.response.keys.match.roster

import black.bracken.chicken.response.SimpleModelKey
import black.bracken.chicken.response.models.MatchRosterAttributesStats

/**
 * @author BlackBracken
 */
object MatchRosterAttributesStatsKeys {

    val RANK = SimpleModelKey<MatchRosterAttributesStats, Int>("rank")

    val TEAM_ID = SimpleModelKey<MatchRosterAttributesStats, Int>("teamId")

}