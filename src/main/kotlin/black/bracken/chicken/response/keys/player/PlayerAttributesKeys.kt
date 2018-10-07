package black.bracken.chicken.response.keys.player

import black.bracken.chicken.response.SimpleModelKey
import black.bracken.chicken.response.models.PlayerAttributes
import black.bracken.chicken.response.models.enumerations.region.RegionShard

/**
 * See official document at [https://documentation.pubg.com/en/players-endpoint.html].
 *
 * @author BlackBracken
 */
object PlayerAttributesKeys {

    val NAME = SimpleModelKey<PlayerAttributes, String>("name")

    val SHARD_ID = SimpleModelKey<PlayerAttributes, RegionShard>("shardId") { any -> RegionShard.valueOf(any as String) }

    val PATCH_VERSION = SimpleModelKey<PlayerAttributes, String>("patchVersion")

    val TITLE_ID = SimpleModelKey<PlayerAttributes, String>("titleId")

}