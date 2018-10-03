package black.bracken.chicken.response.keys.match.roster

import black.bracken.chicken.response.ModelKey
import black.bracken.chicken.response.models.MatchRoster

/**
 * @author BlackBracken
 */
object MatchRosterKeys {

    val ID = ModelKey<MatchRoster, String> { model -> model.jsonObject["id"] as String }

}