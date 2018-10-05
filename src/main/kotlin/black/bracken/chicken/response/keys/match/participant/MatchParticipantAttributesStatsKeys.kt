package black.bracken.chicken.response.keys.match.participant

import black.bracken.chicken.response.ModelKey
import black.bracken.chicken.response.models.MatchParticipantAttributesStats
import black.bracken.chicken.response.models.enumerations.DeathType

/**
 * @author BlackBracken
 *
 * TODO: remove boiler plates
 */
object MatchParticipantAttributesStatsKeys {

    val DBNOS = ModelKey<MatchParticipantAttributesStats, Int> { model -> model.jsonObject["DBNOs"] as Int }

    val ASSISTS = ModelKey<MatchParticipantAttributesStats, Int> { model -> model.jsonObject["assists"] as Int }

    val BOOSTS = ModelKey<MatchParticipantAttributesStats, Int> { model -> model.jsonObject["boosts"] as Int }

    val DAMAGE_DEALT = ModelKey<MatchParticipantAttributesStats, Double> { model -> model.jsonObject["damageDealt"] as Double }

    val DEATH_TYPE = ModelKey<MatchParticipantAttributesStats, DeathType> { model -> DeathType.valueOf(model.jsonObject["deathType"] as String) }

    val HEADSHOT_KILLS = ModelKey<MatchParticipantAttributesStats, Int> { model -> model.jsonObject["headshotKills"] as Int }

    val HEALS = ModelKey<MatchParticipantAttributesStats, Int> { model -> model.jsonObject["heals"] as Int }

    val KILL_PLACE = ModelKey<MatchParticipantAttributesStats, Int> { model -> model.jsonObject["killPlace"] as Int }

    val KILL_POINTS = ModelKey<MatchParticipantAttributesStats, Int> { model -> model.jsonObject["killPoints"] as Int }

    val KILL_POINTS_DELTA = ModelKey<MatchParticipantAttributesStats, Double> { model -> model.jsonObject["killPointsDelta"] as Double }

    val KILL_STREAKS = ModelKey<MatchParticipantAttributesStats, Double> { model -> model.jsonObject["killStreaks"] as Double }

    val KILLS = ModelKey<MatchParticipantAttributesStats, Int> { model -> model.jsonObject["kills"] as Int }

    val LAST_KILL_POINTS = ModelKey<MatchParticipantAttributesStats, Int> { model -> model.jsonObject["lastKillPoints"] as Int }

    val LAST_WIN_POINTS = ModelKey<MatchParticipantAttributesStats, Int> { model -> model.jsonObject["lastWinPoints"] as Int }

    val LONGEST_KILL = ModelKey<MatchParticipantAttributesStats, Double> { model -> model.jsonObject["longestKill"] as Double }

    val MOST_DAMAGE = ModelKey<MatchParticipantAttributesStats, Double> { model -> model.jsonObject["mostDamage"] as Double }

    val NAME = ModelKey<MatchParticipantAttributesStats, String> { model -> model.jsonObject["name"] as String }

    val PLAYER_ID = ModelKey<MatchParticipantAttributesStats, String> { model -> model.jsonObject["playerId"] as String }

    val REVIVES = ModelKey<MatchParticipantAttributesStats, Int> { model -> model.jsonObject["revives"] as Int }

    val RIDE_DISTANCE = ModelKey<MatchParticipantAttributesStats, Double> { model -> model.jsonObject["rideDistance"] as Double }

    val ROAD_KILLS = ModelKey<MatchParticipantAttributesStats, Int> { model -> model.jsonObject["roadKills"] as Int }

    val SWIM_DISTANCE = ModelKey<MatchParticipantAttributesStats, Double> { model -> model.jsonObject["swimdistance"] as Double }

    val TEAM_KILLS = ModelKey<MatchParticipantAttributesStats, Int> { model -> model.jsonObject["teamKills"] as Int }

    val TIME_SURVIVED = ModelKey<MatchParticipantAttributesStats, Double> { model -> model.jsonObject["timeSurvived"] as Double }

    val VEHICLE_DESTROYS = ModelKey<MatchParticipantAttributesStats, Int> { model -> model.jsonObject["vehicleDestroys"] as Int }

    val WALK_DISTANCE = ModelKey<MatchParticipantAttributesStats, Double> { model -> model.jsonObject["walkDistance"] as Double }

    val WEAPONS_ACQUIRED = ModelKey<MatchParticipantAttributesStats, Int> { model -> model.jsonObject["weaponsAcquired"] as Int }

    val WIN_PLACE = ModelKey<MatchParticipantAttributesStats, Int> { model -> model.jsonObject["winPlace"] as Int }

    val WIN_POINTS = ModelKey<MatchParticipantAttributesStats, Int> { model -> model.jsonObject["winPoints"] as Int }

    val WIN_POINTS_DELTA = ModelKey<MatchParticipantAttributesStats, Double> { model -> model.jsonObject["winPointsDelta"] as Double }

}