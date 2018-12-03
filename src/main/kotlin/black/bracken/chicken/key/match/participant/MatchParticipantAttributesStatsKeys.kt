package black.bracken.chicken.key.match.participant

import black.bracken.chicken.key.SimpleModelKey
import black.bracken.chicken.model.ModelDealer
import black.bracken.chicken.model.MatchParticipantAttributesStats
import black.bracken.chicken.model.enumerations.DeathType

private typealias MPAS = MatchParticipantAttributesStats
private typealias MPASKeys = MatchParticipantAttributesStatsKeys

/**
 * @author BlackBracken
 */
object MatchParticipantAttributesStatsKeys {

    val DBNOS = SimpleModelKey<MPAS, Int>("DBNOs")

    val ASSISTS = SimpleModelKey<MPAS, Int>("assists")

    val BOOSTS = SimpleModelKey<MPAS, Int>("boosts")

    val DAMAGE_DEALT = SimpleModelKey<MPAS, Double>("damageDealt")

    val DEATH_TYPE = SimpleModelKey<MPAS, DeathType>("deathType") { DeathType.valueOf(it as String) }

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

val ModelDealer<MPAS>.dbnos get() = this[MPASKeys.DBNOS]
val ModelDealer<MPAS>.assists get() = this[MPASKeys.ASSISTS]
val ModelDealer<MPAS>.boosts get() = this[MPASKeys.BOOSTS]
val ModelDealer<MPAS>.damageDealt get() = this[MPASKeys.DAMAGE_DEALT]
val ModelDealer<MPAS>.deathType get() = this[MPASKeys.DEATH_TYPE]
val ModelDealer<MPAS>.headshotKills get() = this[MPASKeys.HEADSHOT_KILLS]
val ModelDealer<MPAS>.heals get() = this[MPASKeys.HEALS]
val ModelDealer<MPAS>.killPlace get() = this[MPASKeys.KILL_PLACE]
val ModelDealer<MPAS>.killPoints get() = this[MPASKeys.KILL_POINTS]
val ModelDealer<MPAS>.killPointsDelta get() = this[MPASKeys.KILL_POINTS_DELTA]
val ModelDealer<MPAS>.killStreaks get() = this[MPASKeys.KILL_STREAKS]
val ModelDealer<MPAS>.kills get() = this[MPASKeys.KILLS]
val ModelDealer<MPAS>.lastKillPoints get() = this[MPASKeys.LAST_KILL_POINTS]
val ModelDealer<MPAS>.lastWinPoints get() = this[MPASKeys.LAST_WIN_POINTS]
val ModelDealer<MPAS>.longestKill get() = this[MPASKeys.LONGEST_KILL]
val ModelDealer<MPAS>.mostDamage get() = this[MPASKeys.MOST_DAMAGE]
val ModelDealer<MPAS>.name get() = this[MPASKeys.NAME]
val ModelDealer<MPAS>.playerId get() = this[MPASKeys.PLAYER_ID]
val ModelDealer<MPAS>.revives get() = this[MPASKeys.REVIVES]
val ModelDealer<MPAS>.rideDistance get() = this[MPASKeys.RIDE_DISTANCE]
val ModelDealer<MPAS>.roadKills get() = this[MPASKeys.ROAD_KILLS]
val ModelDealer<MPAS>.swimDistance get() = this[MPASKeys.SWIM_DISTANCE]
val ModelDealer<MPAS>.teamKills get() = this[MPASKeys.TEAM_KILLS]
val ModelDealer<MPAS>.timeSurvived get() = this[MPASKeys.TIME_SURVIVED]
val ModelDealer<MPAS>.vehicleDestroys get() = this[MPASKeys.VEHICLE_DESTROYS]
val ModelDealer<MPAS>.walkDistance get() = this[MPASKeys.WALK_DISTANCE]
val ModelDealer<MPAS>.weaponsAcquired get() = this[MPASKeys.WEAPONS_ACQUIRED]
val ModelDealer<MPAS>.winPlace get() = this[MPASKeys.WIN_PLACE]
val ModelDealer<MPAS>.winPoints get() = this[MPASKeys.WIN_POINTS]
val ModelDealer<MPAS>.winPointsDelta get() = this[MPASKeys.WIN_POINTS_DELTA]