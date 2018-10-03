package black.bracken.chicken.response.keys.match.roster

import black.bracken.chicken.response.ExtractableJsonModel
import black.bracken.chicken.response.ModelKey
import black.bracken.chicken.response.models.MatchRosterAttributes
import black.bracken.chicken.response.models.MatchRosterAttributesStats
import black.bracken.chicken.response.models.enumerations.region.RegionShard
import com.beust.klaxon.JsonObject

/**
 * @author BlackBracken
 */
object MatchRosterAttributesKeys {

    val SHARD_ID = ModelKey<MatchRosterAttributes, RegionShard> { model ->
        RegionShard.valueOf(model.jsonObject["shardId"] as String)
    }

    val ATTRIBUTES = ModelKey<MatchRosterAttributes, ExtractableJsonModel<MatchRosterAttributesStats>> { model ->
        ExtractableJsonModel(MatchRosterAttributesStats(model.jsonObject["stats"] as JsonObject))
    }

    val WON = ModelKey<MatchRosterAttributes, String> { model -> model.jsonObject["won"] as String }

}