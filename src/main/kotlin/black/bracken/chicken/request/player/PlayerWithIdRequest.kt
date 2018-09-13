package black.bracken.chicken.request.player

import black.bracken.chicken.ChickenClient
import black.bracken.chicken.model.Player
import black.bracken.chicken.model.region.RegionShard
import black.bracken.chicken.request.Request
import com.beust.klaxon.JsonObject
import okhttp3.HttpUrl

/**
 * @author BlackBracken
 */
class PlayerWithIdRequest(
        private val regionShard: RegionShard,
        private val accountId: String
) : Request<Player> {

    override fun buildHttpUrl(builder: HttpUrl.Builder): HttpUrl = builder
            .addPathSegment(ChickenClient.SHARDS)
            .addPathSegment(regionShard.toString())
            .addPathSegment("players")
            .addPathSegment(accountId)
            .build()

    override fun squeezeJson(jsonObject: JsonObject): Player = Player(jsonObject["data"] as JsonObject)

}