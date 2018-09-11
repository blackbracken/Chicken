package black.bracken.chicken.request

import com.beust.klaxon.JsonObject
import okhttp3.HttpUrl

/**
 * @author BlackBracken
 */
interface Request<V : Any> {

    fun buildHttpUrl(builder: HttpUrl.Builder): HttpUrl

    fun squeezeJson(jsonObject: JsonObject): V

}