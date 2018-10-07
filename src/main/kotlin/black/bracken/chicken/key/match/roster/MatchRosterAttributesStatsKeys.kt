package black.bracken.chicken.key.match.roster

import black.bracken.chicken.key.SimpleModelKey
import black.bracken.chicken.model.MatchRosterAttributesStats

/**
 * @author BlackBracken
 */
object MatchRosterAttributesStatsKeys {

    val RANK = SimpleModelKey<MatchRosterAttributesStats, Int>("rank")

    val TEAM_ID = SimpleModelKey<MatchRosterAttributesStats, Int>("teamId")

}