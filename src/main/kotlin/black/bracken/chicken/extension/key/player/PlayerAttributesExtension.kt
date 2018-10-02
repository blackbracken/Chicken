package black.bracken.chicken.extension.key.player

import black.bracken.chicken.response.ExtractableJsonModel
import black.bracken.chicken.response.keys.player.PlayerAttributesKeys
import black.bracken.chicken.response.models.PlayerAttributes
import black.bracken.chicken.response.models.enumerations.region.RegionShard

/**
 * @author BlackBracken
 */

val ExtractableJsonModel<PlayerAttributes>.name: String get() = this[PlayerAttributesKeys.NAME]

val ExtractableJsonModel<PlayerAttributes>.shardId: RegionShard get() = this[PlayerAttributesKeys.SHARD_ID]

val ExtractableJsonModel<PlayerAttributes>.patchVersion: String get() = this[PlayerAttributesKeys.PATCH_VERSION]

val ExtractableJsonModel<PlayerAttributes>.titleId: String get() = this[PlayerAttributesKeys.TITLE_ID]