package black.bracken.chicken.key.player

import black.bracken.chicken.key.SimpleModelKey
import black.bracken.chicken.model.ModelDealer
import black.bracken.chicken.model.PlayerMatch

/**
 * See official document at [https://documentation.pubg.com/en/players-endpoint.html].
 *
 * @author BlackBracken
 */
object PlayerMatchKeys {

    val ID = SimpleModelKey<PlayerMatch, String>("id")

}

val ModelDealer<PlayerMatch>.id get() = this[PlayerMatchKeys.ID]