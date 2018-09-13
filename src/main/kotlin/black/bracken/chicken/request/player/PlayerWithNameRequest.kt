package black.bracken.chicken.request.player

import black.bracken.chicken.model.Player
import black.bracken.chicken.model.region.RegionShard
import black.bracken.chicken.request.Request
import com.beust.klaxon.JsonObject
import okhttp3.HttpUrl

class PlayerWithNameRequest(
        private val regionShard: RegionShard,
        private val name: String
) : Request<Player> {

    private val filteredRequest = FilteredPlayersRequest(regionShard, filteredNameList = listOf(name))

    override fun buildHttpUrl(builder: HttpUrl.Builder): HttpUrl = filteredRequest.buildHttpUrl(builder)

    override fun squeezeJson(jsonObject: JsonObject): Player = filteredRequest.squeezeJson(jsonObject).first()

}