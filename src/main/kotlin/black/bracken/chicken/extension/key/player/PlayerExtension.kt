package black.bracken.chicken.extension.key.player

import black.bracken.chicken.response.ExtractableJsonModel
import black.bracken.chicken.response.keys.player.PlayerAttributesKeys
import black.bracken.chicken.response.keys.player.PlayerKeys
import black.bracken.chicken.response.keys.player.PlayerRelationshipsKeys
import black.bracken.chicken.response.models.Player

/**
 * @author BlackBracken
 */

val ExtractableJsonModel<Player>.id get() = this[PlayerKeys.ID]

val ExtractableJsonModel<Player>.attributes get() = this[PlayerKeys.ATTRIBUTES]

val ExtractableJsonModel<Player>.relationships get() = this[PlayerKeys.RELATIONSHIPS]

val ExtractableJsonModel<Player>.name get() = attributes[PlayerAttributesKeys.NAME]

val ExtractableJsonModel<Player>.shard get() = attributes[PlayerAttributesKeys.SHARD_ID]

val ExtractableJsonModel<Player>.patchVersion get() = attributes[PlayerAttributesKeys.PATCH_VERSION]

val ExtractableJsonModel<Player>.titleId get() = attributes[PlayerAttributesKeys.TITLE_ID]

val ExtractableJsonModel<Player>.matches get() = relationships[PlayerRelationshipsKeys.MATCHES]