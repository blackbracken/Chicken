package black.bracken.chicken.request.player

import black.bracken.chicken.ChickenClient
import black.bracken.chicken.model.Player
import black.bracken.chicken.model.region.RegionShard
import black.bracken.chicken.request.Request
import com.beust.klaxon.JsonArray
import com.beust.klaxon.JsonObject
import okhttp3.HttpUrl

/**
 * @author BlackBracken
 */
class FilteredPlayersRequest(
        private val regionShard: RegionShard,
        private val filteredIdList: List<String> = listOf(),
        private val filteredNameList: List<String> = listOf()
) : Request<List<Player>> {

    init {
        if (filteredIdList.isEmpty() && filteredNameList.isEmpty()) {
            throw IllegalArgumentException("Either filteredIdList or filteredNameList must be filled")
        }
    }

    override fun buildHttpUrl(builder: HttpUrl.Builder): HttpUrl = builder
            .addPathSegment(ChickenClient.SHARDS)
            .addPathSegment(regionShard.toString())
            .addPathSegment("players")
            .apply {
                if (filteredIdList.isNotEmpty()) addEncodedQueryParameter("filter[accountIds]", filteredIdList.joinToString(separator = ","))
                if (filteredNameList.isNotEmpty()) addEncodedQueryParameter("filter[playerNames]", filteredNameList.joinToString(separator = ","))
            }
            .build()

    @Suppress("UNCHECKED_CAST")
    override fun squeezeJson(jsonObject: JsonObject): List<Player> = (jsonObject["data"] as JsonArray<JsonObject>).map { childJson -> Player(childJson) }

}