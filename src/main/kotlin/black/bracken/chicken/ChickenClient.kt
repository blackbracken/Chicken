package black.bracken.chicken

import okhttp3.HttpUrl
import okhttp3.OkHttpClient
import okhttp3.Request

private typealias ChickenRequest<V> = black.bracken.chicken.request.Request<V>

/**
 * A client to get data from PUBG API.
 *
 * @author BlackBracken
 */
class ChickenClient(private val apiKey: String) {

    companion object {
        const val SCHEME = "https"
        const val HOST = "api.pubg.com"
        const val SHARDS = "shards"
    }

    private val client = OkHttpClient()

    /**
     * Returns [Prepared] is ready to request.
     */
    fun <R : Any, Q : ChickenRequest<R>> prepare(chickenRequest: Q): Prepared<R> {
        val request = Request.Builder()
                .url(chickenRequest.buildRequestUrl(HttpUrl.Builder().scheme(SCHEME).host(HOST)))
                .addHeader("Authorization", "Bearer $apiKey")
                .addHeader("Accept", "application/vnd.api+json")
                .addHeader("Accept-Encoding", "gzip")
                .build()
        return Prepared({ client.newCall(request) }, { chickenRequest.transformJson(it) })
    }

}