package black.bracken.chicken.response.keys.player

import black.bracken.chicken.response.ExtractableJsonModel
import black.bracken.chicken.response.ModelKey
import black.bracken.chicken.response.models.Player
import black.bracken.chicken.response.models.PlayerAttributes
import black.bracken.chicken.response.models.PlayerRelationships
import com.beust.klaxon.JsonObject

/**
 * See official document at [https://documentation.pubg.com/en/players-endpoint.html].
 *
 * @author BlackBracken
 */
object PlayerKeys {

    val ID = ModelKey<Player, String> { model -> model.jsonObject["id"] as String }

    val ATTRIBUTES = ModelKey<Player, ExtractableJsonModel<PlayerAttributes>> { model ->
        ExtractableJsonModel(PlayerAttributes(model.jsonObject["attributes"] as JsonObject))
    }

    val RELATIONSHIPS = ModelKey<Player, ExtractableJsonModel<PlayerRelationships>> { model ->
        ExtractableJsonModel(PlayerRelationships(model.jsonObject["relationships"] as JsonObject))
    }

}