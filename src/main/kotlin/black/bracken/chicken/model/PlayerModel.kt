package black.bracken.chicken.model

import com.beust.klaxon.JsonObject

/**
 * @author BlackBracken
 */
class Player(jsonObject: JsonObject) : Model(jsonObject)

class PlayerAttributes(jsonObject: JsonObject) : Model(jsonObject)

class PlayerRelationships(jsonObject: JsonObject) : Model(jsonObject)

data class PlayerMatch(val id: String)