package black.bracken.chicken.extension.key.player

import black.bracken.chicken.response.ExtractableJsonModel
import black.bracken.chicken.response.keys.player.PlayerRelationshipsKeys
import black.bracken.chicken.response.models.PlayerRelationships

/**
 * @author BlackBracken
 */

val ExtractableJsonModel<PlayerRelationships>.matches get() = this[PlayerRelationshipsKeys.MATCHES]