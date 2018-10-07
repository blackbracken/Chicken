package black.bracken.chicken.request.player

import black.bracken.chicken.ChickenClient
import black.bracken.chicken.request.Request
import black.bracken.chicken.model.ExtractableJsonModel
import black.bracken.chicken.model.Player
import black.bracken.chicken.model.enumerations.region.RegionShard
import com.beust.klaxon.JsonObject
import okhttp3.HttpUrl

/**
 * @author BlackBracken
 */
class PlayerWithIdRequest(
        private val regionShard: RegionShard,
        private val accountId: String
) : Request<ExtractableJsonModel<Player>> {

    override fun buildRequestUrl(builder: HttpUrl.Builder) = builder
            .addPathSegment(ChickenClient.SHARDS)
            .addPathSegment(regionShard.toString())
            .addPathSegment("players")
            .addPathSegment(accountId)
            .build()!!

    override fun transformJson(jsonObject: JsonObject) = ExtractableJsonModel(Player(jsonObject["data"] as JsonObject))

}