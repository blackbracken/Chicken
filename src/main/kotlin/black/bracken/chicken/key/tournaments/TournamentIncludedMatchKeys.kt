package black.bracken.chicken.key.tournaments

import black.bracken.chicken.key.SimpleModelKey
import black.bracken.chicken.model.ModelDealer
import black.bracken.chicken.model.TournamentIncludedMatch

/**
 * @author BlackBracken
 */
object TournamentIncludedMatchKeys {

    val ID = SimpleModelKey<TournamentIncludedMatch, String>("id")

}

val ModelDealer<TournamentIncludedMatch>.id get() = this[TournamentIncludedMatchKeys.ID]