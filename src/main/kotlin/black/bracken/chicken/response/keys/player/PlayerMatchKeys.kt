package black.bracken.chicken.response.keys.player

import black.bracken.chicken.response.SimpleModelKey
import black.bracken.chicken.response.models.PlayerMatch

/**
 * See official document at [https://documentation.pubg.com/en/players-endpoint.html].
 *
 * @author BlackBracken
 */
object PlayerMatchKeys {

    val ID = SimpleModelKey<PlayerMatch, String>("id")

}