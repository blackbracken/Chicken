package black.bracken.chicken.extension.key.match

import black.bracken.chicken.response.ExtractableJsonModel
import black.bracken.chicken.response.keys.match.roster.MatchRosterKeys
import black.bracken.chicken.response.models.MatchRoster

/**
 * @author BlackBracken
 */

val ExtractableJsonModel<MatchRoster>.id get() = this[MatchRosterKeys.ID]

val ExtractableJsonModel<MatchRoster>.attributes get() = this[MatchRosterKeys.ATTRIBUTES]