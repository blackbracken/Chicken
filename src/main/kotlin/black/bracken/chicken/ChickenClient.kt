package black.bracken.chicken

import black.bracken.chicken.core.Submitted
import black.bracken.chicken.request.ChickenRequest
import okhttp3.HttpUrl
import okhttp3.OkHttpClient
import okhttp3.Request

/**
 * @author BlackBracken
 */
class ChickenClient(private val apiKey: String) {

    companion object {
        private const val SCHEME = "https"
        private const val HOST = "api.pubg.com"
    }

    private val client = OkHttpClient()

    fun <M, R : ChickenRequest<M>> request(chickenRequest: R): Submitted<M> {
        val request = Request.Builder()
                .url(chickenRequest.createHttpUrl(HttpUrl.Builder().scheme(SCHEME).host(HOST)))
                .addHeader("Authorization", "Bearer $apiKey")
                .addHeader("Accept", "application/vnd.api+json")
                .addHeader("Accept-Encoding", "gzip")
                .build()
        return Submitted({ client.newCall(request) }, chickenRequest.transformingResponse)
    }

}