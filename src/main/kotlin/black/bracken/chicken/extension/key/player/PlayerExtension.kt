package black.bracken.chicken.extension.key.player

import black.bracken.chicken.response.ExtractableJsonModel
import black.bracken.chicken.response.keys.player.PlayerAttributesKeys
import black.bracken.chicken.response.keys.player.PlayerKeys
import black.bracken.chicken.response.keys.player.PlayerRelationshipsKeys
import black.bracken.chicken.response.models.Player
import black.bracken.chicken.response.models.PlayerAttributes
import black.bracken.chicken.response.models.PlayerMatch
import black.bracken.chicken.response.models.PlayerRelationships
import black.bracken.chicken.response.models.region.RegionShard

/**
 * @author BlackBracken
 */

val ExtractableJsonModel<Player>.id: String get() = this[PlayerKeys.ID]

val ExtractableJsonModel<Player>.attributes: ExtractableJsonModel<PlayerAttributes> get() = this[PlayerKeys.ATTRIBUTES]

val ExtractableJsonModel<Player>.relationships: ExtractableJsonModel<PlayerRelationships> get() = this[PlayerKeys.RELATIONSHIPS]

val ExtractableJsonModel<Player>.name: String get() = attributes[PlayerAttributesKeys.NAME]

val ExtractableJsonModel<Player>.shard: RegionShard get() = attributes[PlayerAttributesKeys.SHARD_ID]

val ExtractableJsonModel<Player>.patchVersion: String get() = attributes[PlayerAttributesKeys.PATCH_VERSION]

val ExtractableJsonModel<Player>.titleId: String get() = attributes[PlayerAttributesKeys.TITLE_ID]

val ExtractableJsonModel<Player>.matches: List<ExtractableJsonModel<PlayerMatch>> get() = relationships[PlayerRelationshipsKeys.MATCHES]