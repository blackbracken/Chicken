package black.bracken.chicken.key.match.asset

import black.bracken.chicken.key.SimpleModelKey
import black.bracken.chicken.model.MatchAssetAttributes
import black.bracken.chicken.model.ModelDealer
import java.net.URL
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

/**
 * @author BlackBracken
 */
object MatchAssetAttributesKeys {

    val URL = SimpleModelKey<MatchAssetAttributes, URL>("URL") { URL(it as String) }

    val CREATED_AT = SimpleModelKey<MatchAssetAttributes, LocalDateTime>("createdAt") {
        LocalDateTime.parse(it as String, DateTimeFormatter.ofPattern("yyyy-MM-ddTHH:mm:ssZ"))
    }

    val NAME = SimpleModelKey<MatchAssetAttributes, String>("name")

}

val ModelDealer<MatchAssetAttributes>.url get() = this[MatchAssetAttributesKeys.URL]
val ModelDealer<MatchAssetAttributes>.createdAt get() = this[MatchAssetAttributesKeys.CREATED_AT]
val ModelDealer<MatchAssetAttributes>.name get() = this[MatchAssetAttributesKeys.NAME]