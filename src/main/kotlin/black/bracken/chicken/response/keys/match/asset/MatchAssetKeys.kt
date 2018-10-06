package black.bracken.chicken.response.keys.match.asset

import black.bracken.chicken.response.DownModelKey
import black.bracken.chicken.response.SimpleModelKey
import black.bracken.chicken.response.models.MatchAsset
import black.bracken.chicken.response.models.MatchAssetAttributes

private typealias Subject = MatchAsset

/**
 * @author BlackBracken
 */
object MatchAssetKeys {

    val ID = SimpleModelKey<MatchAsset, String>("id")

    val ATTRIBUTES = DownModelKey<MatchAsset, MatchAssetAttributes>("attributes") { jsonObject -> MatchAssetAttributes(jsonObject) }

}