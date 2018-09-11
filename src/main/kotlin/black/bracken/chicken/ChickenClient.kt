package black.bracken.chicken

import okhttp3.HttpUrl
import okhttp3.OkHttpClient
import okhttp3.Request

private typealias ChickenRequest<V> = black.bracken.chicken.request.Request<V>

/**
 * @author BlackBracken
 */
class ChickenClient(private val apiKey: String) {

    companion object {
        const val SCHEME = "https"
        const val HOST = "api.pubg.com"
        const val SHARDS = "shards"
    }

    private val client = OkHttpClient()

    fun <R : Any, Q : ChickenRequest<R>> request(chickenRequest: Q): Submitted<R> {
        val request = Request.Builder()
                .url(chickenRequest.buildHttpUrl(HttpUrl.Builder().scheme(SCHEME).host(HOST)))
                .addHeader("Authorization", "Bearer $apiKey")
                .addHeader("Accept", "application/vnd.api+json")
                .addHeader("Accept-Encoding", "gzip")
                .build()
        return Submitted({ client.newCall(request) }, { jsonObject -> chickenRequest.squeezeJson(jsonObject) })
    }

}