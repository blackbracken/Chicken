package black.bracken.chicken.request.player

import black.bracken.chicken.ChickenClient
import black.bracken.chicken.request.Request
import black.bracken.chicken.model.ExtractableJsonModel
import black.bracken.chicken.model.Player
import black.bracken.chicken.model.enumerations.region.RegionShard
import com.beust.klaxon.JsonArray
import com.beust.klaxon.JsonObject
import okhttp3.HttpUrl

/**
 * @author BlackBracken
 */
class FilteredPlayersRequest(
        private val regionShard: RegionShard,
        private val filter: Filter
) : Request<List<ExtractableJsonModel<Player>>> {

    data class Filter(
            val idList: List<String> = listOf(),
            val nameList: List<String> = listOf()
    ) {

        init {
            if (idList.isEmpty() && nameList.isEmpty()) throw IllegalArgumentException("Either idList or nameList must not be empty")
            if (idList.isNotEmpty() && nameList.isNotEmpty()) throw IllegalArgumentException("Either idList or nameList must be empty")
        }

    }

    override fun buildRequestUrl(builder: HttpUrl.Builder) = builder
            .addPathSegment(ChickenClient.SHARDS)
            .addPathSegment(regionShard.toString())
            .addPathSegment("players")
            .apply {
                if (filter.idList.isNotEmpty()) addEncodedQueryParameter("filter[accountIds]", filter.idList.joinToString(separator = ","))
                if (filter.nameList.isNotEmpty()) addEncodedQueryParameter("filter[playerNames]", filter.nameList.joinToString(separator = ","))
            }
            .build()!!

    @Suppress("UNCHECKED_CAST")
    override fun transformJson(jsonObject: JsonObject) = (jsonObject["data"] as JsonArray<JsonObject>).map { childJson -> ExtractableJsonModel(Player(childJson)) }

}