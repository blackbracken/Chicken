package black.bracken.chicken.key.player

import black.bracken.chicken.key.SimpleModelKey
import black.bracken.chicken.model.ExtractableJsonModel
import black.bracken.chicken.model.PlayerAttributes
import black.bracken.chicken.model.enumerations.region.RegionShard

/**
 * See official document at [https://documentation.pubg.com/en/players-endpoint.html].
 *
 * @author BlackBracken
 */
object PlayerAttributesKeys {

    val NAME = SimpleModelKey<PlayerAttributes, String>("name")

    val SHARD_ID = SimpleModelKey<PlayerAttributes, RegionShard>("shardId") { any -> RegionShard.valueOf(any as String) }

    val PATCH_VERSION = SimpleModelKey<PlayerAttributes, String>("patchVersion")

    val TITLE_ID = SimpleModelKey<PlayerAttributes, String>("titleId")

}

val ExtractableJsonModel<PlayerAttributes>.name: String get() = this[PlayerAttributesKeys.NAME]
val ExtractableJsonModel<PlayerAttributes>.shardId: RegionShard get() = this[PlayerAttributesKeys.SHARD_ID]
val ExtractableJsonModel<PlayerAttributes>.patchVersion: String get() = this[PlayerAttributesKeys.PATCH_VERSION]
val ExtractableJsonModel<PlayerAttributes>.titleId: String get() = this[PlayerAttributesKeys.TITLE_ID]