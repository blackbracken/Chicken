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

val ModelDealer<Match>.id get() = this[MatchKeys.ID]
val ModelDealer<Match>.attributes get() = this[MatchKeys.ATTRIBUTES]
val ModelDealer<Match>.relationships get() = this[MatchKeys.RELATIONSHIPS]
val ModelDealer<Match>.included get() = this[MatchKeys.INCLUDED]

val ModelDealer<Match>.rosters get() = this.included.rosters
val ModelDealer<Match>.participants get() = this.included.participants
val ModelDealer<Match>.assets get() = this.included.assets