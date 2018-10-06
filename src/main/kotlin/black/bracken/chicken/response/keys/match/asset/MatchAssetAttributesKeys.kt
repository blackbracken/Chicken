package black.bracken.chicken.response.keys.match.asset

import black.bracken.chicken.response.SimpleModelKey
import black.bracken.chicken.response.models.MatchAssetAttributes
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