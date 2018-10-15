package black.bracken.chicken.request.player

import black.bracken.chicken.request.Request
import black.bracken.chicken.model.ModelDealer
import black.bracken.chicken.model.Player
import black.bracken.chicken.model.enumerations.region.RegionShard
import com.beust.klaxon.JsonObject
import okhttp3.HttpUrl

/**
 * @author BlackBracken
 */
class PlayerWithNameRequest(
        regionShard: RegionShard,
        name: String
) : Request<ModelDealer<Player>> {

    private val filteredRequest = FilteredPlayersRequest(regionShard, FilteredPlayersRequest.Filter(nameList = listOf(name)))

    override fun buildRequestUrl(builder: HttpUrl.Builder): HttpUrl = filteredRequest.buildRequestUrl(builder)

    override fun transformJson(jsonObject: JsonObject) = filteredRequest.transformJson(jsonObject).first()

}