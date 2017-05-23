package com.example.joshuamcwilliams.posedown

/**
 * Created by joshuamcwilliams on 1/16/16.
 */
object Utils {
    fun getNameByTag(tag: String): String {
        var poseName = ""
        when (tag) {
            "frontDouble" -> poseName = "Front Double Bicep"
            "backDouble" -> poseName = "Back Double Bicep"
            "frontLat" -> poseName = "Front Lat Spread"
            "mostMuscular" -> poseName = "Most Muscular"
            "sideChest" -> poseName = "Side Chest"
            "sideTricep" -> poseName = "Side Tricep"
            "abAndThigh" -> poseName = "Abdominal and Thigh"
            "rearLat" -> poseName = "Rear Lat Spread"
            else -> {
            }
        }

        return poseName
    }
}
