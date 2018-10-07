package black.bracken.chicken.model

import com.beust.klaxon.JsonObject

/**
 * See official document at [https://documentation.pubg.com/en/players-endpoint.html].
 *
 * @author BlackBracken
 */

class Player(override val jsonObject: JsonObject) : JsonModel

class PlayerAttributes(override val jsonObject: JsonObject) : JsonModel

class PlayerRelationships(override val jsonObject: JsonObject) : JsonModel

class PlayerMatch(override val jsonObject: JsonObject) : JsonModel