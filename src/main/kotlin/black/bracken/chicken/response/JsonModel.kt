package black.bracken.chicken.response

import com.beust.klaxon.JsonObject

/**
 * Represents a data model involves [JsonObject].
 *
 * @author BlackBracken
 */
interface JsonModel {

    val jsonObject: JsonObject

}