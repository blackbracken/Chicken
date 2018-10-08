package black.bracken.chicken.key.player

import black.bracken.chicken.key.DownModelKey
import black.bracken.chicken.key.SimpleModelKey
import black.bracken.chicken.model.ExtractableJsonModel
import black.bracken.chicken.model.Player
import black.bracken.chicken.model.PlayerAttributes
import black.bracken.chicken.model.PlayerRelationships

/**
 * See official document at [https://documentation.pubg.com/en/players-endpoint.html].
 *
 * @author BlackBracken
 */
object PlayerKeys {

    val ID = SimpleModelKey<Player, String>("id")

    val ATTRIBUTES = DownModelKey<Player, PlayerAttributes>("attributes") { jsonObject -> PlayerAttributes(jsonObject) }

    val RELATIONSHIPS = DownModelKey<Player, PlayerRelationships>("relationships") { jsonObject -> PlayerRelationships(jsonObject) }

}

val ExtractableJsonModel<Player>.id get() = this[PlayerKeys.ID]
val ExtractableJsonModel<Player>.attributes get() = this[PlayerKeys.ATTRIBUTES]
val ExtractableJsonModel<Player>.relationships get() = this[PlayerKeys.RELATIONSHIPS]
val ExtractableJsonModel<Player>.name get() = attributes[PlayerAttributesKeys.NAME]
val ExtractableJsonModel<Player>.shard get() = attributes[PlayerAttributesKeys.SHARD_ID]
val ExtractableJsonModel<Player>.patchVersion get() = attributes[PlayerAttributesKeys.PATCH_VERSION]
val ExtractableJsonModel<Player>.titleId get() = attributes[PlayerAttributesKeys.TITLE_ID]
val ExtractableJsonModel<Player>.matches get() = relationships[PlayerRelationshipsKeys.MATCHES]