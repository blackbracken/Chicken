package black.bracken.chicken.key.match.participant

import black.bracken.chicken.key.SimpleModelKey
import black.bracken.chicken.model.ExtractableJsonModel
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

val ExtractableJsonModel<MPAS>.dbnos get() = this[MPASKeys.DBNOS]
val ExtractableJsonModel<MPAS>.assists get() = this[MPASKeys.ASSISTS]
val ExtractableJsonModel<MPAS>.boosts get() = this[MPASKeys.BOOSTS]
val ExtractableJsonModel<MPAS>.damageDealt get() = this[MPASKeys.DAMAGE_DEALT]
val ExtractableJsonModel<MPAS>.deathType get() = this[MPASKeys.DEATH_TYPE]
val ExtractableJsonModel<MPAS>.headshotKills get() = this[MPASKeys.HEADSHOT_KILLS]
val ExtractableJsonModel<MPAS>.heals get() = this[MPASKeys.HEALS]
val ExtractableJsonModel<MPAS>.killPlace get() = this[MPASKeys.KILL_PLACE]
val ExtractableJsonModel<MPAS>.killPoints get() = this[MPASKeys.KILL_POINTS]
val ExtractableJsonModel<MPAS>.killPointsDelta get() = this[MPASKeys.KILL_POINTS_DELTA]
val ExtractableJsonModel<MPAS>.killStreaks get() = this[MPASKeys.KILL_STREAKS]
val ExtractableJsonModel<MPAS>.kills get() = this[MPASKeys.KILLS]
val ExtractableJsonModel<MPAS>.lastKillPoints get() = this[MPASKeys.LAST_KILL_POINTS]
val ExtractableJsonModel<MPAS>.lastWinPoints get() = this[MPASKeys.LAST_WIN_POINTS]
val ExtractableJsonModel<MPAS>.longestKill get() = this[MPASKeys.LONGEST_KILL]
val ExtractableJsonModel<MPAS>.mostDamage get() = this[MPASKeys.MOST_DAMAGE]
val ExtractableJsonModel<MPAS>.name get() = this[MPASKeys.NAME]
val ExtractableJsonModel<MPAS>.playerId get() = this[MPASKeys.PLAYER_ID]
val ExtractableJsonModel<MPAS>.revives get() = this[MPASKeys.REVIVES]
val ExtractableJsonModel<MPAS>.rideDistance get() = this[MPASKeys.RIDE_DISTANCE]
val ExtractableJsonModel<MPAS>.roadKills get() = this[MPASKeys.ROAD_KILLS]
val ExtractableJsonModel<MPAS>.swimDistance get() = this[MPASKeys.SWIM_DISTANCE]
val ExtractableJsonModel<MPAS>.teamKills get() = this[MPASKeys.TEAM_KILLS]
val ExtractableJsonModel<MPAS>.timeSurvived get() = this[MPASKeys.TIME_SURVIVED]
val ExtractableJsonModel<MPAS>.vehicleDestroys get() = this[MPASKeys.VEHICLE_DESTROYS]
val ExtractableJsonModel<MPAS>.walkDistance get() = this[MPASKeys.WALK_DISTANCE]
val ExtractableJsonModel<MPAS>.weaponsAcquired get() = this[MPASKeys.WEAPONS_ACQUIRED]
val ExtractableJsonModel<MPAS>.winPlace get() = this[MPASKeys.WIN_PLACE]
val ExtractableJsonModel<MPAS>.winPoints get() = this[MPASKeys.WIN_POINTS]
val ExtractableJsonModel<MPAS>.winPointsDelta get() = this[MPASKeys.WIN_POINTS_DELTA]