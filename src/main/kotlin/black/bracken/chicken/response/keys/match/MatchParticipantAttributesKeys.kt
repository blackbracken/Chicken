package black.bracken.chicken.response.keys.match

import black.bracken.chicken.response.ExtractableJsonModel
import black.bracken.chicken.response.ModelKey
import black.bracken.chicken.response.models.MatchParticipantAttributes
import black.bracken.chicken.response.models.MatchParticipantAttributesStats
import black.bracken.chicken.response.models.enumerations.region.RegionShard
import com.beust.klaxon.JsonObject

/**
 * @author BlackBracken
 */
object MatchParticipantAttributesKeys {

    val ACTOR = ModelKey<MatchParticipantAttributes, String> { model -> model.jsonObject["actor"] as String }

    val SHARD_ID = ModelKey<MatchParticipantAttributes, RegionShard> { model ->
        RegionShard.valueOf((model.jsonObject["shardId"] as String).toUpperCase())
    }

    val STATS = ModelKey<MatchParticipantAttributes, ExtractableJsonModel<MatchParticipantAttributesStats>> { model ->
        ExtractableJsonModel(MatchParticipantAttributesStats(model.jsonObject["stats"] as JsonObject))
    }

}