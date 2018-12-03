package black.bracken.chicken.key.match.roster

import black.bracken.chicken.key.DownModelKey
import black.bracken.chicken.key.SimpleModelKey
import black.bracken.chicken.model.MatchRosterAttributes
import black.bracken.chicken.model.MatchRosterAttributesStats
import black.bracken.chicken.model.ModelDealer
import black.bracken.chicken.model.enumerations.region.RegionShard

/**
 * @author BlackBracken
 */
object MatchRosterAttributesKeys {

    val SHARD_ID = SimpleModelKey<MatchRosterAttributes, RegionShard>("shardId") { RegionShard.valueOf(it as String) }

    val ATTRIBUTES = DownModelKey<MatchRosterAttributes, MatchRosterAttributesStats>("stats") { MatchRosterAttributesStats(it) }

    val WON = SimpleModelKey<MatchRosterAttributes, String>("won")

}

val ModelDealer<MatchRosterAttributes>.shardId get() = this[MatchRosterAttributesKeys.SHARD_ID]
val ModelDealer<MatchRosterAttributes>.attributes get() = this[MatchRosterAttributesKeys.ATTRIBUTES]
val ModelDealer<MatchRosterAttributes>.won get() = this[MatchRosterAttributesKeys.WON]