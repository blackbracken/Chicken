package black.bracken.chicken.key.tournaments

import black.bracken.chicken.key.DownModelKey
import black.bracken.chicken.key.SimpleModelKey
import black.bracken.chicken.model.ExtractableJsonModel
import black.bracken.chicken.model.Tournament
import black.bracken.chicken.model.TournamentIncluded
import black.bracken.chicken.model.TournamentRelationships
import com.beust.klaxon.JsonObject

/**
 * @author BlackBracken
 */
object TournamentKeys {

    val ID = SimpleModelKey<Tournament, String>("id")

    val RELATIONSHIPS = DownModelKey<Tournament, TournamentRelationships>("relationships") { jsonObject ->
        TournamentRelationships(jsonObject["data"] as JsonObject)
    }

    val INCLUDED = DownModelKey<Tournament, TournamentIncluded>("included") { jsonObject -> TournamentIncluded(jsonObject) }

}

val ExtractableJsonModel<Tournament>.id get() = this[TournamentKeys.ID]
val ExtractableJsonModel<Tournament>.relationships get() = this[TournamentKeys.RELATIONSHIPS]
val ExtractableJsonModel<Tournament>.included get() = this[TournamentKeys.INCLUDED]