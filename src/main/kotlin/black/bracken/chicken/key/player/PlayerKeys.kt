package black.bracken.chicken.key.player

import black.bracken.chicken.key.ModelKey
import black.bracken.chicken.model.Player
import black.bracken.chicken.model.PlayerAttributes
import black.bracken.chicken.model.PlayerMatch
import black.bracken.chicken.model.PlayerRelationships
import black.bracken.chicken.model.region.RegionShard
import com.beust.klaxon.JsonArray
import com.beust.klaxon.JsonObject

/**
 * @author BlackBracken
 */
object PlayerKeys {

    val ID = ModelKey { jsonObject -> jsonObject["id"] as String }

    val ATTRIBUTES = ModelKey { jsonObject -> PlayerAttributes(jsonObject["attributes"] as JsonObject) }

    val RELATIONSHIPS = ModelKey { jsonObject -> PlayerRelationships(jsonObject["relationships"] as JsonObject) }

}

val Player.id: String get() = this[PlayerKeys.ID]
val Player.attributes: PlayerAttributes get() = this[PlayerKeys.ATTRIBUTES]
val Player.relationships: PlayerRelationships get() = this[PlayerKeys.RELATIONSHIPS]

object PlayerAttributesKeys {

    val NAME = ModelKey { jsonObject -> jsonObject["name"] as String }

    val SHARD_ID = ModelKey { jsonObject -> RegionShard.valueOf(jsonObject["shardId"] as String) }

    val PATCH_VERSION = ModelKey { jsonObject -> jsonObject["patchVersion"] as String }

    val TITLE_ID = ModelKey { jsonObject -> jsonObject["titleId"] as String }

}

val Player.name: String get() = attributes[PlayerAttributesKeys.NAME]
val Player.shard: RegionShard get() = attributes[PlayerAttributesKeys.SHARD_ID]
val Player.patchVersion: String get() = attributes[PlayerAttributesKeys.PATCH_VERSION]
val Player.titleId: String get() = attributes[PlayerAttributesKeys.TITLE_ID]

object PlayerRelationshipsKeys {

    @Suppress("UNCHECKED_CAST")
    val MATCHES = ModelKey { jsonObject ->
        val matches: JsonArray<JsonObject> = (jsonObject["matches"] as JsonObject)["data"] as JsonArray<JsonObject>
        matches.map { PlayerMatch(it["id"] as String) }.toList()
    }

}

val Player.matches: List<PlayerMatch> get() = relationships[PlayerRelationshipsKeys.MATCHES]