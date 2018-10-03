package black.bracken.chicken.response.keys.match.roster

import black.bracken.chicken.response.ModelKey
import black.bracken.chicken.response.models.MatchRosterAttributesStats

/**
 * @author BlackBracken
 */
object MatchRosterAttributesStatsKeys {

    val RANK = ModelKey<MatchRosterAttributesStats, Int> { model -> model.jsonObject["rank"] as Int }

    val TEAM_ID = ModelKey<MatchRosterAttributesStats, Int> { model -> model.jsonObject["teamId"] as Int }

}