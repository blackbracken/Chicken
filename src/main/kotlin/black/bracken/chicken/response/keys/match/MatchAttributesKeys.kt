package black.bracken.chicken.response.keys.match

import black.bracken.chicken.response.ModelKey
import black.bracken.chicken.response.models.MatchAttributes
import black.bracken.chicken.response.models.enumerations.GameMode
import black.bracken.chicken.response.models.enumerations.MapName
import black.bracken.chicken.response.models.enumerations.region.RegionShard
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

/**
 * @author BlackBracken
 */
object MatchAttributesKeys {

    val CREATED_AT = ModelKey<MatchAttributes, LocalDateTime> { model ->
        LocalDateTime.parse(
                model.jsonObject["createdAt"] as String,
                DateTimeFormatter.ofPattern("yyyy-MM-ddTHH:mm:ssZ")
        )
    }

    val DURATION = ModelKey<MatchAttributes, Int> { model -> model.jsonObject["duration"] as Int }

    val GAME_MODE = ModelKey<MatchAttributes, GameMode> { model ->
        GameMode.valueOf((model.jsonObject["gameMode"] as String).toUpperCase())
    }

    val MAP_NAME = ModelKey<MatchAttributes, MapName> { model ->
        MapName.valueOf((model.jsonObject["mapName"] as String).toUpperCase())
    }

    val IS_CUSTOM_MATCH = ModelKey<MatchAttributes, Boolean> { model ->
        (model.jsonObject["isCustomMatch"] as String).toBoolean()
    }

    val SHARD_ID = ModelKey<MatchAttributes, RegionShard> { model ->
        RegionShard.valueOf(model.jsonObject["shardId"] as String)
    }

    val TITLE_ID = ModelKey<MatchAttributes, String> { model -> model.jsonObject["titleId"] as String }

}