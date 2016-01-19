package com.example.joshuamcwilliams.posedown;

/**
 * Created by joshuamcwilliams on 1/16/16.
 */
public class Utils {
    public static String getNameByTag (String tag){
        String poseName = "";
        switch (tag){
            case "frontDouble":
                poseName = "Front Double Bicep";
                break;
            case "backDouble":
                poseName = "Back Double Bicep";
                break;
            case "frontLat":
                poseName = "Front Lat Spread";
                break;
            case "mostMuscular":
                poseName = "Most Muscular";
                break;
            case "sideChest":
                poseName = "Side Chest";
                break;
            case "sideTricep":
                poseName = "Side Tricep";
                break;
            case "abAndThigh":
                poseName = "Abdominal and Thigh";
                break;
            case "rearLat":
                poseName = "Rear Lat Spread";
                break;
            default:
                break;
        }

        return poseName;
    }
}
