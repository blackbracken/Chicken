package black.bracken.chicken.response.keys.match.participant

import black.bracken.chicken.response.SimpleModelKey
import black.bracken.chicken.response.models.MatchParticipantAttributesStats
import black.bracken.chicken.response.models.enumerations.DeathType

private typealias Subject = MatchParticipantAttributesStats

/**
 * @author BlackBracken
 */
object MatchParticipantAttributesStatsKeys {

    val DBNOS = SimpleModelKey<Subject, Int>("DBNOs")

    val ASSISTS = SimpleModelKey<Subject, Int>("assists")

    val BOOSTS = SimpleModelKey<Subject, Int>("boosts")

    val DAMAGE_DEALT = SimpleModelKey<Subject, Double>("damageDealt")

    val DEATH_TYPE = SimpleModelKey<Subject, DeathType>("deathType") { jsonObject -> DeathType.valueOf(jsonObject as String) }

    val HEADSHOT_KILLS = SimpleModelKey<Subject, Int>("headshotKills")

    val HEALS = SimpleModelKey<Subject, Int>("heals")

    val KILL_PLACE = SimpleModelKey<Subject, Int>("killPlace")

    val KILL_POINTS = SimpleModelKey<Subject, Int>("killPoints")

    val KILL_POINTS_DELTA = SimpleModelKey<Subject, Double>("killPointsDelta")

    val KILL_STREAKS = SimpleModelKey<Subject, Double>("killStreaks")

    val KILLS = SimpleModelKey<Subject, Int>("kills")

    val LAST_KILL_POINTS = SimpleModelKey<Subject, Int>("lastKillPoints")

    val LAST_WIN_POINTS = SimpleModelKey<Subject, Int>("lastWinPoints")

    val LONGEST_KILL = SimpleModelKey<Subject, Double>("longestKill")

    val MOST_DAMAGE = SimpleModelKey<Subject, Double>("mostDamage")

    val NAME = SimpleModelKey<Subject, String>("name")

    val PLAYER_ID = SimpleModelKey<Subject, String>("playerId")

    val REVIVES = SimpleModelKey<Subject, Int>("revives")

    val RIDE_DISTANCE = SimpleModelKey<Subject, Double>("rideDistance")

    val ROAD_KILLS = SimpleModelKey<Subject, Int>("roadKills")

    val SWIM_DISTANCE = SimpleModelKey<Subject, Double>("swimDistance")

    val TEAM_KILLS = SimpleModelKey<Subject, Int>("teamKills")

    val TIME_SURVIVED = SimpleModelKey<Subject, Double>("timeSurvived")

    val VEHICLE_DESTROYS = SimpleModelKey<Subject, Int>("vehicleDestroys")

    val WALK_DISTANCE = SimpleModelKey<Subject, Double>("walkDistance")

    val WEAPONS_ACQUIRED = SimpleModelKey<Subject, Int>("weaponsAcquired")

    val WIN_PLACE = SimpleModelKey<Subject, Int>("winPlace")

    val WIN_POINTS = SimpleModelKey<Subject, Int>("winPoints")

    val WIN_POINTS_DELTA = SimpleModelKey<Subject, Double>("winPointsDelta")

}