package black.bracken.chicken.extension.key.match

import black.bracken.chicken.response.ExtractableJsonModel
import black.bracken.chicken.response.keys.match.MatchKeys
import black.bracken.chicken.response.models.Match

/**
 * @author BlackBracken
 */

val ExtractableJsonModel<Match>.id get() = this[MatchKeys.ID]

val ExtractableJsonModel<Match>.attributes get() = this[MatchKeys.ATTRIBUTES]

val ExtractableJsonModel<Match>.relationships get() = this[MatchKeys.RELATIONSHIPS]