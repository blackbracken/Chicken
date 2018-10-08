package black.bracken.chicken.key.match

import black.bracken.chicken.key.DownModelKey
import black.bracken.chicken.key.SimpleModelKey
import black.bracken.chicken.model.ExtractableJsonModel
import black.bracken.chicken.model.Match
import black.bracken.chicken.model.MatchAttributes
import black.bracken.chicken.model.MatchRelationships

/**
 * @author BlackBracken
 */
object MatchKeys {

    val ID = SimpleModelKey<Match, String>("id")

    val ATTRIBUTES = DownModelKey<Match, MatchAttributes>("attributes") { jsonObject -> MatchAttributes(jsonObject) }

    val RELATIONSHIPS = DownModelKey<Match, MatchRelationships>("relationships") { jsonObject -> MatchRelationships(jsonObject) }

}

val ExtractableJsonModel<Match>.id get() = this[MatchKeys.ID]
val ExtractableJsonModel<Match>.attributes get() = this[MatchKeys.ATTRIBUTES]
val ExtractableJsonModel<Match>.relationships get() = this[MatchKeys.RELATIONSHIPS]