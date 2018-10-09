package black.bracken.chicken.key.match

import black.bracken.chicken.key.DownModelKey
import black.bracken.chicken.key.SimpleModelKey
import black.bracken.chicken.model.*
import com.beust.klaxon.JsonObject

/**
 * @author BlackBracken
 */
object MatchKeys {

    val ID = SimpleModelKey<Match, String>("id")

    val ATTRIBUTES = DownModelKey<Match, MatchAttributes>("attributes") { jsonObject -> MatchAttributes(jsonObject["data"] as JsonObject) }

    val RELATIONSHIPS = DownModelKey<Match, MatchRelationships>("relationships") { jsonObject -> MatchRelationships(jsonObject["data"] as JsonObject) }

    val INCLUDED = DownModelKey<Match, MatchIncluded>("included") { jsonObject -> MatchIncluded(jsonObject) }

}

val ExtractableJsonModel<Match>.id get() = this[MatchKeys.ID]
val ExtractableJsonModel<Match>.attributes get() = this[MatchKeys.ATTRIBUTES]
val ExtractableJsonModel<Match>.relationships get() = this[MatchKeys.RELATIONSHIPS]
val ExtractableJsonModel<Match>.included get() = this[MatchKeys.INCLUDED]

val ExtractableJsonModel<Match>.rosters get() = this.included.rosters
val ExtractableJsonModel<Match>.participants get() = this.included.participants
val ExtractableJsonModel<Match>.assets get() = this.included.assets