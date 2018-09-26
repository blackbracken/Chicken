package black.bracken.chicken.response.keys.player

import black.bracken.chicken.response.ExtractableJsonModel
import black.bracken.chicken.response.ModelKey
import black.bracken.chicken.response.models.PlayerMatch
import black.bracken.chicken.response.models.PlayerRelationships
import com.beust.klaxon.JsonArray
import com.beust.klaxon.JsonObject

/**
 * See official document at [https://documentation.pubg.com/en/players-endpoint.html].
 *
 * @author BlackBracken
 */
object PlayerRelationshipsKeys {

    @Suppress("UNCHECKED_CAST")
    val MATCHES = ModelKey<PlayerRelationships, List<ExtractableJsonModel<PlayerMatch>>> { model ->
        (model.jsonObject["matches"] as JsonArray<JsonObject>).map { jsonObject -> ExtractableJsonModel(PlayerMatch(jsonObject)) }
    }

}