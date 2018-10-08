package black.bracken.chicken.key.match.asset

import black.bracken.chicken.key.SimpleModelKey
import black.bracken.chicken.model.ExtractableJsonModel
import black.bracken.chicken.model.MatchAssetAttributes
import java.net.URL
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

/**
 * @author BlackBracken
 */
object MatchAssetAttributesKeys {

    val URL = SimpleModelKey<MatchAssetAttributes, URL>("URL") { any -> URL(any as String) }

    val CREATED_AT = SimpleModelKey<MatchAssetAttributes, LocalDateTime>("createdAt") { any ->
        LocalDateTime.parse(any as String, DateTimeFormatter.ofPattern("yyyy-MM-ddTHH:mm:ssZ"))
    }

    val NAME = SimpleModelKey<MatchAssetAttributes, String>("name")

}

val ExtractableJsonModel<MatchAssetAttributes>.url get() = this[MatchAssetAttributesKeys.URL]
val ExtractableJsonModel<MatchAssetAttributes>.createdAt get() = this[MatchAssetAttributesKeys.CREATED_AT]
val ExtractableJsonModel<MatchAssetAttributes>.name get() = this[MatchAssetAttributesKeys.NAME]