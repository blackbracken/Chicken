package black.bracken.chicken.key.tournaments

import black.bracken.chicken.key.ModelKey
import black.bracken.chicken.model.ModelDealer
import black.bracken.chicken.model.TournamentIncluded
import black.bracken.chicken.model.TournamentIncludedMatch
import com.beust.klaxon.JsonObject

/**
 * @author BlackBracken
 */
object TournamentIncludedKeys {

    val MATCHES = ModelKey<TournamentIncluded, List<ModelDealer<TournamentIncludedMatch>>> { model ->
        model.jsonObject.array<JsonObject>("matches")!!
                .map { jsonObject -> ModelDealer(TournamentIncludedMatch(jsonObject)) }
                .toList()
    }

}

val ModelDealer<TournamentIncluded>.matches get() = this[TournamentIncludedKeys.MATCHES]