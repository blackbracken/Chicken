package black.bracken.chicken.key.match.participant

import black.bracken.chicken.key.DownModelKey
import black.bracken.chicken.key.SimpleModelKey
import black.bracken.chicken.model.ModelDealer
import black.bracken.chicken.model.MatchParticipantAttributes
import black.bracken.chicken.model.MatchParticipantAttributesStats
import black.bracken.chicken.model.enumerations.region.RegionShard

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

val ModelDealer<MatchParticipantAttributes>.actor get() = this[MatchParticipantAttributesKeys.ACTOR]
val ModelDealer<MatchParticipantAttributes>.shardId get() = this[MatchParticipantAttributesKeys.SHARD_ID]
val ModelDealer<MatchParticipantAttributes>.statsNew get() = this[MatchParticipantAttributesKeys.STATS_NEW]