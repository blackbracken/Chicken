package black.bracken.chicken.key.match

import black.bracken.chicken.key.SimpleModelKey
import black.bracken.chicken.model.ModelDealer
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

val ModelDealer<MatchAttributes>.createdAt get() = this[MatchAttributesKeys.CREATED_AT]
val ModelDealer<MatchAttributes>.duration get() = this[MatchAttributesKeys.DURATION]
val ModelDealer<MatchAttributes>.gameMode get() = this[MatchAttributesKeys.GAME_MODE]
val ModelDealer<MatchAttributes>.mapName get() = this[MatchAttributesKeys.MAP_NAME]
val ModelDealer<MatchAttributes>.isCustomMatch get() = this[MatchAttributesKeys.IS_CUSTOM_MATCH]
val ModelDealer<MatchAttributes>.shardId get() = this[MatchAttributesKeys.SHARD_ID]
val ModelDealer<MatchAttributes>.titleId get() = this[MatchAttributesKeys.TITLE_ID]