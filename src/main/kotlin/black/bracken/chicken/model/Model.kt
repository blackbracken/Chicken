package black.bracken.chicken.model

import black.bracken.chicken.key.ModelKey
import com.beust.klaxon.JsonObject

/**
 * @author BlackBracken
 */
abstract class Model(private val jsonObject: JsonObject) {

    operator fun <R> get(key: ModelKey<R>): R = key.transform(jsonObject)

}