package black.bracken.chicken.model

import com.beust.klaxon.JsonObject

/**
 * @author BlackBracken
 */

class Match(override val jsonObject: JsonObject) : JsonModel

class MatchIncluded(override val jsonObject: JsonObject) : JsonModel

interface MatchIncludedChild : JsonModel

class MatchAttributes(override val jsonObject: JsonObject) : JsonModel

class MatchRelationships(override val jsonObject: JsonObject) : JsonModel

class MatchRoster(override val jsonObject: JsonObject) : MatchIncludedChild

class MatchRosterAttributes(override val jsonObject: JsonObject) : JsonModel

class MatchRosterAttributesStats(override val jsonObject: JsonObject) : JsonModel

class MatchParticipant(override val jsonObject: JsonObject) : MatchIncludedChild

class MatchParticipantAttributes(override val jsonObject: JsonObject) : JsonModel

class MatchParticipantAttributesStats(override val jsonObject: JsonObject) : JsonModel

class MatchAsset(override val jsonObject: JsonObject) : MatchIncludedChild

class MatchAssetAttributes(override val jsonObject: JsonObject) : JsonModel