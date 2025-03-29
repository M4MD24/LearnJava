package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_9_data_structures._2_2_1_1_9_3_collection._2_2_1_1_9_3_6_hash_map._2_2_1_1_9_3_6_10;

import java.util.HashMap;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to get the value of a specified key in a map.</h2>
 */

public class Question10 {
    private static final HashMap<String, String> COLORS = new HashMap<>();

    public static void main(final String[] ARGUMENTS) {
        addColors();
        final String TARGET_COLOR = "#FF0000";
        System.out.print(COLORS.get(TARGET_COLOR));
    }

    private static void addColors() {
        COLORS.put("#FF0000", "Red");
        COLORS.put("#32CD32", "LimeGreen");
        COLORS.put("#DC143C", "Crimson");
        COLORS.put("#000000", "Black");
        COLORS.put("#FFFFFF", "White");
    }
}