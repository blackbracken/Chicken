package black.bracken.chicken.model

import black.bracken.chicken.key.ModelKey
import com.beust.klaxon.JsonObject

/**
 * Represents a data model involves [JsonObject].
 *
 * @author BlackBracken
 */
abstract class Model(private val jsonObject: JsonObject) {

    /** and exports values which corresponds the given [ModelKey]
     * Returns a value which corresponds the given [ModelKey] by extracting [jsonObject].
     */
    operator fun <R> get(key: ModelKey<R>): R = key.transform(jsonObject)

}