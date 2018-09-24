package black.bracken.chicken.request

import com.beust.klaxon.JsonObject
import okhttp3.HttpUrl

/**}
 * Represents request transforms the received data.
 *
 * @author BlackBracken
 * @param V A type getting by transforming [JsonObject].
 */
interface Request<V : Any> {

    fun buildHttpUrl(builder: HttpUrl.Builder): HttpUrl

    fun transformJson(jsonObject: JsonObject): V

}