package black.bracken.chicken.response.keys.match.participant

import black.bracken.chicken.response.DownModelKey
import black.bracken.chicken.response.SimpleModelKey
import black.bracken.chicken.response.models.MatchParticipantAttributes
import black.bracken.chicken.response.models.MatchParticipantAttributesStats
import black.bracken.chicken.response.models.enumerations.region.RegionShard

/**
 * @author BlackBracken
 */
object MatchParticipantAttributesKeys {

    val ACTOR = SimpleModelKey<MatchParticipantAttributes, String>("actor")

    val SHARD_ID = SimpleModelKey<MatchParticipantAttributes, RegionShard>("shardId") { any -> RegionShard.valueOf(any as String) }

    val STATS_NEW = DownModelKey<MatchParticipantAttributes, MatchParticipantAttributesStats>("stats") { jsonObject ->
        MatchParticipantAttributesStats(jsonObject)
    }

}