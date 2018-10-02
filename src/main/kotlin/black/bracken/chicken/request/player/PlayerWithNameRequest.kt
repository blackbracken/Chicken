package black.bracken.chicken.request.player

import black.bracken.chicken.request.Request
import black.bracken.chicken.response.ExtractableJsonModel
import black.bracken.chicken.response.models.Player
import black.bracken.chicken.response.models.enumerations.region.RegionShard
import com.beust.klaxon.JsonObject
import okhttp3.HttpUrl

class PlayerWithNameRequest(
        regionShard: RegionShard,
        name: String
) : Request<ExtractableJsonModel<Player>> {

    private val filteredRequest = FilteredPlayersRequest(regionShard, FilteredPlayersRequest.Filter(nameList = listOf(name)))

    override fun buildRequestUrl(builder: HttpUrl.Builder): HttpUrl = filteredRequest.buildRequestUrl(builder)

    override fun transformJson(jsonObject: JsonObject) = filteredRequest.transformJson(jsonObject).first()

}