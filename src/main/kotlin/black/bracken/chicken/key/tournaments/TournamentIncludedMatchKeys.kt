package black.bracken.chicken.key.tournaments

import black.bracken.chicken.key.SimpleModelKey
import black.bracken.chicken.model.ExtractableJsonModel
import black.bracken.chicken.model.TournamentIncludedMatch

/**
 * @author BlackBracken
 */
object TournamentIncludedMatchKeys {

    val ID = SimpleModelKey<TournamentIncludedMatch, String>("id")

}

val ExtractableJsonModel<TournamentIncludedMatch>.id get() = this[TournamentIncludedMatchKeys.ID]