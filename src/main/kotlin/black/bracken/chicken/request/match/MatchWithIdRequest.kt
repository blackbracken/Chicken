package black.bracken.chicken.request.match

import black.bracken.chicken.ChickenClient
import black.bracken.chicken.model.Match
import black.bracken.chicken.model.ModelDealer
import black.bracken.chicken.model.enumerations.region.RegionShard
import black.bracken.chicken.request.Request
import com.beust.klaxon.JsonObject
import okhttp3.HttpUrl

/**
 * @author BlackBracken
 */
class MatchWithIdRequest(
        private val regionShard: RegionShard,
        private val id: String
) : Request<ModelDealer<Match>> {

    override fun buildRequestUrl(builder: HttpUrl.Builder): HttpUrl = builder
            .addPathSegment(ChickenClient.SHARDS)
            .addPathSegment(regionShard.toString())
            .addPathSegment("matches")
            .addPathSegment(id)
            .build()

    override fun transformJson(jsonObject: JsonObject): ModelDealer<Match> = ModelDealer(Match(jsonObject))

}