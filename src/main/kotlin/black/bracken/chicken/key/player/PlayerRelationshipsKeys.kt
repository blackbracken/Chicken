package black.bracken.chicken.key.player

import black.bracken.chicken.key.ModelKey
import black.bracken.chicken.model.ExtractableJsonModel
import black.bracken.chicken.model.PlayerMatch
import black.bracken.chicken.model.PlayerRelationships
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

val ExtractableJsonModel<PlayerRelationships>.matches get() = this[PlayerRelationshipsKeys.MATCHES]