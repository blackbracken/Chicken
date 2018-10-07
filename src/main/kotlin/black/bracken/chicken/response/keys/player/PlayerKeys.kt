package black.bracken.chicken.response.keys.player

import black.bracken.chicken.response.DownModelKey
import black.bracken.chicken.response.SimpleModelKey
import black.bracken.chicken.response.models.Player
import black.bracken.chicken.response.models.PlayerAttributes
import black.bracken.chicken.response.models.PlayerRelationships

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