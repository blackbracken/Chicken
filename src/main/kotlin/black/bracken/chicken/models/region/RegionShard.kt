package black.bracken.chicken.models.region

import black.bracken.chicken.models.region.Platform.PC
import black.bracken.chicken.models.region.Platform.XBOX
import black.bracken.chicken.models.region.Region.*

/**
 * @author BlackBracken
 */
enum class RegionShard(val platform: Platform, val region: Region) {

    XBOX_AS(XBOX, ASIA),

    XBOX_EU(XBOX, EUROPE),

    XBOX_NA(XBOX, NORTH_AMERICA),

    XBOX_OC(XBOX, OCEANIA),


    PC_KRJP(PC, KOREA),

    PC_JP(PC, JAPAN),

    PC_NA(PC, NORTH_AMERICA),

    PC_EU(PC, EUROPE),

    PC_RU(PC, RUSSIA),

    PC_OC(PC, OCEANIA),

    PC_KAKAO(PC, KAKAO),

    PC_SEA(PC, SOUTH_EAST_ASIA),

    PC_SA(PC, SOUTH_AND_CENTRAL_AMERICA),

    PC_AS(PC, ASIA),

    PC_TOURNAMENT(PC, TOURNAMENTS);


    override fun toString() = name.toLowerCase().replace("_", "-")

}