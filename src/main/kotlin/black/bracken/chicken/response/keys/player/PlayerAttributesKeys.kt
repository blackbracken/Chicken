package black.bracken.chicken.response.keys.player

import black.bracken.chicken.response.ModelKey
import black.bracken.chicken.response.models.PlayerAttributes
import black.bracken.chicken.response.models.region.RegionShard

/**
 * See official document at [https://documentation.pubg.com/en/players-endpoint.html].
 *
 * @author BlackBracken
 */
object PlayerAttributesKeys {

    val NAME = ModelKey<PlayerAttributes, String> { model -> model.jsonObject["name"] as String }

    val SHARD_ID = ModelKey<PlayerAttributes, RegionShard> { model -> RegionShard.valueOf(model.jsonObject["shardId"] as String) }

    val PATCH_VERSION = ModelKey<PlayerAttributes, String> { model -> model.jsonObject["patchVersion"] as String }

    val TITLE_ID = ModelKey<PlayerAttributes, String> { model -> model.jsonObject["titleId"] as String }

}