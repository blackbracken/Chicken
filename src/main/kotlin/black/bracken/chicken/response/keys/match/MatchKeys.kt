package black.bracken.chicken.response.keys.match

import black.bracken.chicken.response.DownModelKey
import black.bracken.chicken.response.SimpleModelKey
import black.bracken.chicken.response.models.Match
import black.bracken.chicken.response.models.MatchAttributes
import black.bracken.chicken.response.models.MatchRelationships

/**
 * @author BlackBracken
 */
object MatchKeys {

    val ID = SimpleModelKey<Match, String>("id")

    val ATTRIBUTES = DownModelKey<Match, MatchAttributes>("attributes") { jsonObject -> MatchAttributes(jsonObject) }

    val RELATIONSHIPS = DownModelKey<Match, MatchRelationships>("relationships") { jsonObject -> MatchRelationships(jsonObject) }

}