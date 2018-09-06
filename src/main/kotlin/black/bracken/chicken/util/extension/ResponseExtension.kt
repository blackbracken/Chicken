package black.bracken.chicken.util.extension

import okhttp3.Response
import okio.GzipSource
import okio.Okio
import java.io.IOException

/**
 * @author BlackBracken
 */

// LINK: https://gist.github.com/vovkab/b9c8ffa86d97e685d3cb
internal val Response.decodedBody: String?
    get() {
        val body = body() ?: return null

        return if (header("Content-Encoding")?.toLowerCase()?.contains("gzip") == true) {
            unzip()
        } else {
            body.string()
        }
    }

private fun Response.unzip(): String? = try {
    Okio.buffer(GzipSource(body()!!.source())).readUtf8()
} catch (ex: IOException) {
    null
}