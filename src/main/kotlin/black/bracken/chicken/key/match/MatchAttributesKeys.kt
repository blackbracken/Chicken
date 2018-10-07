package black.bracken.chicken.key.match

import black.bracken.chicken.key.SimpleModelKey
import black.bracken.chicken.model.MatchAttributes
import black.bracken.chicken.model.enumerations.GameMode
import black.bracken.chicken.model.enumerations.MapName
import black.bracken.chicken.model.enumerations.region.RegionShard
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

/**
 * @author BlackBracken
 */
object MatchAttributesKeys {

    val CREATED_AT = SimpleModelKey<MatchAttributes, LocalDateTime>("createdAt") { any ->
        LocalDateTime.parse(
                any as String,
                DateTimeFormatter.ofPattern("yyyy-MM-ddTHH:mm:ssZ")
        )
    }

    val DURATION = SimpleModelKey<MatchAttributes, Int>("duration")

    val GAME_MODE = SimpleModelKey<MatchAttributes, GameMode>("gameMode") { any -> GameMode.valueOf(any as String) }

    val MAP_NAME = SimpleModelKey<MatchAttributes, MapName>("mapName") { any -> MapName.valueOf(any as String) }

    val IS_CUSTOM_MATCH = SimpleModelKey<MatchAttributes, Boolean>("isCustomMatch")

    val SHARD_ID = SimpleModelKey<MatchAttributes, RegionShard>("shardId") { any -> RegionShard.valueOf(any as String) }

    val TITLE_ID = SimpleModelKey<MatchAttributes, String>("titleId")

}