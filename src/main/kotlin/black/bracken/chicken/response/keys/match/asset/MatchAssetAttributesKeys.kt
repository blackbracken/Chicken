package black.bracken.chicken.response.keys.match.asset

import black.bracken.chicken.response.ModelKey
import black.bracken.chicken.response.models.MatchAssetAttributes
import java.net.URL
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

/**
 * @author BlackBracken
 */
object MatchAssetAttributesKeys {

    val URL = ModelKey<MatchAssetAttributes, URL> { model -> java.net.URL(model.jsonObject["URL"] as String) }

    val CREATED_AT = ModelKey<MatchAssetAttributes, LocalDateTime> { model ->
        LocalDateTime.parse(
                model.jsonObject["createdAt"] as String,
                DateTimeFormatter.ofPattern("yyyy-MM-ddTHH:mm:ssZ")
        )
    }

    val NAME = ModelKey<MatchAssetAttributes, String> { model -> model.jsonObject["name"] as String }

}