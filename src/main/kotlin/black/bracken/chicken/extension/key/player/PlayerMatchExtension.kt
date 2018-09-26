package black.bracken.chicken.extension.key.player

import black.bracken.chicken.response.ExtractableJsonModel
import black.bracken.chicken.response.keys.player.PlayerMatchKeys
import black.bracken.chicken.response.models.PlayerMatch

/**
 * @author BlackBracken
 */

val ExtractableJsonModel<PlayerMatch>.id: String get() = this[PlayerMatchKeys.ID]