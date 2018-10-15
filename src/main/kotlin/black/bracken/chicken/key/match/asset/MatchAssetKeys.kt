package black.bracken.chicken.key.match.asset

import black.bracken.chicken.key.DownModelKey
import black.bracken.chicken.key.SimpleModelKey
import black.bracken.chicken.model.ModelDealer
import black.bracken.chicken.model.MatchAsset
import black.bracken.chicken.model.MatchAssetAttributes

/**
 * @author BlackBracken
 */
object MatchAssetKeys {

    val ID = SimpleModelKey<MatchAsset, String>("id")

    val ATTRIBUTES = DownModelKey<MatchAsset, MatchAssetAttributes>("attributes") { jsonObject -> MatchAssetAttributes(jsonObject) }

}

val ModelDealer<MatchAsset>.id get() = this[MatchAssetKeys.ID]
val ModelDealer<MatchAsset>.attributes get() = this[MatchAssetKeys.ATTRIBUTES]