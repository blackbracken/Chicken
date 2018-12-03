package black.bracken.chicken.key.player

import black.bracken.chicken.key.ModelKey
import black.bracken.chicken.model.ModelDealer
import black.bracken.chicken.model.PlayerMatch
import black.bracken.chicken.model.PlayerRelationships
import com.beust.klaxon.JsonArray
import com.beust.klaxon.JsonObject

/**
 * See official document at [https://documentation.pubg.com/en/players-endpoint.html].
 *
 * @author BlackBrackenK
 */
object PlayerRelationshipsKeys {

    @Suppress("UNCHECKED_CAST")
    val MATCHES = ModelKey<PlayerRelationships, List<ModelDealer<PlayerMatch>>> { model ->
        ((model.jsonObject["matches"] as JsonObject)["data"] as JsonArray<JsonObject>).map { ModelDealer(PlayerMatch(it)) }
    }

}

val ModelDealer<PlayerRelationships>.matches get() = this[PlayerRelationshipsKeys.MATCHES]