package black.bracken.chicken.key.tournaments

import black.bracken.chicken.key.ModelKey
import black.bracken.chicken.model.ExtractableJsonModel
import black.bracken.chicken.model.TournamentIncluded
import black.bracken.chicken.model.TournamentIncludedMatch
import com.beust.klaxon.JsonObject

/**
 * @author BlackBracken
 */
object TournamentIncludedKeys {

    val MATCHES = ModelKey<TournamentIncluded, List<ExtractableJsonModel<TournamentIncludedMatch>>> { model ->
        model.jsonObject.array<JsonObject>("matches")!!
                .map { jsonObject -> ExtractableJsonModel(TournamentIncludedMatch(jsonObject)) }
                .toList()
    }

}

val ExtractableJsonModel<TournamentIncluded>.matches get() = this[TournamentIncludedKeys.MATCHES]