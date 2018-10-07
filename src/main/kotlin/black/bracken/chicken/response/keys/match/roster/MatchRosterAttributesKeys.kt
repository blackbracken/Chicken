package black.bracken.chicken.response.keys.match.roster

import black.bracken.chicken.response.DownModelKey
import black.bracken.chicken.response.ModelKey
import black.bracken.chicken.response.SimpleModelKey
import black.bracken.chicken.response.models.MatchRosterAttributes
import black.bracken.chicken.response.models.MatchRosterAttributesStats
import black.bracken.chicken.response.models.enumerations.region.RegionShard

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