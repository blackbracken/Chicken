package black.bracken.chicken.key.match.roster

import black.bracken.chicken.key.SimpleModelKey
import black.bracken.chicken.model.ExtractableJsonModel
import black.bracken.chicken.model.MatchRosterAttributesStats

/**
 * @author BlackBracken
 */
object MatchRosterAttributesStatsKeys {

    val RANK = SimpleModelKey<MatchRosterAttributesStats, Int>("rank")

    val TEAM_ID = SimpleModelKey<MatchRosterAttributesStats, Int>("teamId")

}

val ExtractableJsonModel<MatchRosterAttributesStats>.rank get() = this[MatchRosterAttributesStatsKeys.RANK]
val ExtractableJsonModel<MatchRosterAttributesStats>.teamId get() = this[MatchRosterAttributesStatsKeys.TEAM_ID]