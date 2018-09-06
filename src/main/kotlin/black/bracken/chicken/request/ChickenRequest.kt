package black.bracken.chicken.request

import okhttp3.HttpUrl

/**
 * @author BlackBracken
 */
interface ChickenRequest<M> {

    val transformingResponse: (String) -> M

    fun createHttpUrl(builder: HttpUrl.Builder): HttpUrl

}