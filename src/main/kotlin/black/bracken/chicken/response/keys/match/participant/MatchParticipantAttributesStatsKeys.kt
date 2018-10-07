package black.bracken.chicken.response.keys.match.participant

import black.bracken.chicken.response.SimpleModelKey
import black.bracken.chicken.response.models.MatchParticipantAttributesStats
import black.bracken.chicken.response.models.enumerations.DeathType

private typealias MPAS = MatchParticipantAttributesStats

/**
 * @author BlackBracken
 */
object MatchParticipantAttributesStatsKeys {

    val DBNOS = SimpleModelKey<MPAS, Int>("DBNOs")

    val ASSISTS = SimpleModelKey<MPAS, Int>("assists")

    val BOOSTS = SimpleModelKey<MPAS, Int>("boosts")

    val DAMAGE_DEALT = SimpleModelKey<MPAS, Double>("damageDealt")

    val DEATH_TYPE = SimpleModelKey<MPAS, DeathType>("deathType") { jsonObject -> DeathType.valueOf(jsonObject as String) }

    val HEADSHOT_KILLS = SimpleModelKey<MPAS, Int>("headshotKills")

    val HEALS = SimpleModelKey<MPAS, Int>("heals")

    val KILL_PLACE = SimpleModelKey<MPAS, Int>("killPlace")

    val KILL_POINTS = SimpleModelKey<MPAS, Int>("killPoints")

    val KILL_POINTS_DELTA = SimpleModelKey<MPAS, Double>("killPointsDelta")

    val KILL_STREAKS = SimpleModelKey<MPAS, Double>("killStreaks")

    val KILLS = SimpleModelKey<MPAS, Int>("kills")

    val LAST_KILL_POINTS = SimpleModelKey<MPAS, Int>("lastKillPoints")

    val LAST_WIN_POINTS = SimpleModelKey<MPAS, Int>("lastWinPoints")

    val LONGEST_KILL = SimpleModelKey<MPAS, Double>("longestKill")

    val MOST_DAMAGE = SimpleModelKey<MPAS, Double>("mostDamage")

    val NAME = SimpleModelKey<MPAS, String>("name")

    val PLAYER_ID = SimpleModelKey<MPAS, String>("playerId")

    val REVIVES = SimpleModelKey<MPAS, Int>("revives")

    val RIDE_DISTANCE = SimpleModelKey<MPAS, Double>("rideDistance")

    val ROAD_KILLS = SimpleModelKey<MPAS, Int>("roadKills")

    val SWIM_DISTANCE = SimpleModelKey<MPAS, Double>("swimDistance")

    val TEAM_KILLS = SimpleModelKey<MPAS, Int>("teamKills")

    val TIME_SURVIVED = SimpleModelKey<MPAS, Double>("timeSurvived")

    val VEHICLE_DESTROYS = SimpleModelKey<MPAS, Int>("vehicleDestroys")

    val WALK_DISTANCE = SimpleModelKey<MPAS, Double>("walkDistance")

    val WEAPONS_ACQUIRED = SimpleModelKey<MPAS, Int>("weaponsAcquired")

    val WIN_PLACE = SimpleModelKey<MPAS, Int>("winPlace")

    val WIN_POINTS = SimpleModelKey<MPAS, Int>("winPoints")

    val WIN_POINTS_DELTA = SimpleModelKey<MPAS, Double>("winPointsDelta")

}