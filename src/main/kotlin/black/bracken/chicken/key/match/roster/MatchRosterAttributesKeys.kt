package black.bracken.chicken.key.match.roster

import black.bracken.chicken.key.DownModelKey
import black.bracken.chicken.key.SimpleModelKey
import black.bracken.chicken.model.ExtractableJsonModel
import black.bracken.chicken.model.MatchRosterAttributes
import black.bracken.chicken.model.MatchRosterAttributesStats
import black.bracken.chicken.model.enumerations.region.RegionShard

/**
 * @author BlackBracken
 */
object MatchRosterAttributesKeys {

    val SHARD_ID = SimpleModelKey<MatchRosterAttributes, RegionShard>("shardId") { any -> RegionShard.valueOf(any as String) }

    val ATTRIBUTES = DownModelKey<MatchRosterAttributes, MatchRosterAttributesStats>("stats") { jsonObject ->
        MatchRosterAttributesStats(jsonObject)
    }

    val WON = SimpleModelKey<MatchRosterAttributes, String>("won")

}

val ExtractableJsonModel<MatchRosterAttributes>.shardId get() = this[MatchRosterAttributesKeys.SHARD_ID]
val ExtractableJsonModel<MatchRosterAttributes>.attributes get() = this[MatchRosterAttributesKeys.ATTRIBUTES]
val ExtractableJsonModel<MatchRosterAttributes>.won get() = this[MatchRosterAttributesKeys.WON]