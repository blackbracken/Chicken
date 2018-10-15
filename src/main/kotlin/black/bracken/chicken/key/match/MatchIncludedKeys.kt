package black.bracken.chicken.key.match

import black.bracken.chicken.key.ModelKey
import black.bracken.chicken.model.*
import com.beust.klaxon.JsonObject

private typealias IncludedChildModelKey<C> = ModelKey<MatchIncluded, List<ModelDealer<C>>>

/**
 * @author BlackBracken
 */
object MatchIncludedKeys {

    private class ChildModelKey<C : MatchIncludedChild>(
            private val typeName: String,
            private val instantiate: (JsonObject) -> C
    ) : ModelKey<MatchIncluded, List<ModelDealer<C>>>({ model ->
        model.jsonObject.values
                .asSequence()
                .mapNotNull { it as? JsonObject }
                .filter { jsonObject -> jsonObject.getOrDefault("type", "") == typeName }
                .map { jsonObject -> ModelDealer(instantiate(jsonObject)) }
                .toList()
    })

    val ROSTERS: IncludedChildModelKey<MatchRoster> = ChildModelKey("roster") { jsonObject -> MatchRoster(jsonObject) }

    val PARTICIPANTS: IncludedChildModelKey<MatchParticipant> = ChildModelKey("participant") { jsonObject -> MatchParticipant(jsonObject) }

    val ASSETS: IncludedChildModelKey<MatchAsset> = ChildModelKey("asset") { jsonObject -> MatchAsset(jsonObject) }

}

val ModelDealer<MatchIncluded>.rosters get() = this[MatchIncludedKeys.ROSTERS]
val ModelDealer<MatchIncluded>.participants get() = this[MatchIncludedKeys.PARTICIPANTS]
val ModelDealer<MatchIncluded>.assets get() = this[MatchIncludedKeys.ASSETS]