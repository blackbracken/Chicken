package black.bracken.chicken.response.models

import black.bracken.chicken.response.JsonModel
import com.beust.klaxon.JsonObject

/**
 * @author BlackBracken
 */

class Match(override val jsonObject: JsonObject) : JsonModel

class MatchAttributes(override val jsonObject: JsonObject) : JsonModel

class MatchRelationships(override val jsonObject: JsonObject) : JsonModel

class MatchRoster(override val jsonObject: JsonObject) : JsonModel

class MatchRosterAttributes(override val jsonObject: JsonObject) : JsonModel

class MatchRosterAttributesStats(override val jsonObject: JsonObject) : JsonModel

class MatchParticipant(override val jsonObject: JsonObject) : JsonModel

class MatchParticipantAttributes(override val jsonObject: JsonObject) : JsonModel

class MatchParticipantAttributesStats(override val jsonObject: JsonObject) : JsonModel

class MatchAsset(override val jsonObject: JsonObject) : JsonModel

class MatchAssetAttributes(override val jsonObject: JsonObject) : JsonModel