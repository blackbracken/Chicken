package black.bracken.chicken.request.match

import black.bracken.chicken.ChickenClient
import black.bracken.chicken.request.Request
import black.bracken.chicken.response.ExtractableJsonModel
import black.bracken.chicken.response.models.enumerations.region.RegionShard
import com.beust.klaxon.JsonObject
import okhttp3.HttpUrl

/**
 * @author BlackBracken
 */
class MatchWithNameRequest(
        private val regionShard: RegionShard,
        private val id: String
) : Request<ExtractableJsonModel<*>> {

    override fun buildRequestUrl(builder: HttpUrl.Builder): HttpUrl = builder
            .addPathSegment(ChickenClient.SHARDS)
            .addPathSegment(regionShard.toString())
            .addPathSegment("matches")
            .addPathSegment(id)
            .build()

    override fun transformJson(jsonObject: JsonObject): ExtractableJsonModel<*> {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}