package black.bracken.chicken.model

import com.beust.klaxon.JsonObject

/**
 * @author BlackBracken
 */

class Tournament(override val jsonObject: JsonObject) : JsonModel

class TournamentRelationships(override val jsonObject: JsonObject) : JsonModel

class TournamentIncluded(override val jsonObject: JsonObject) : JsonModel

class TournamentIncludedMatch(override val jsonObject: JsonObject) : JsonModel