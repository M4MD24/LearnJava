package _2_solve._2_2_w3resource._2_2_9_data_structures._2_2_9_3_collection._2_2_9_3_6_hash_map._2_2_9_3_6_8;

import java.util.HashMap;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to test if a map contains a mapping for the specified value.</h2>
 */

public class Question8 {
    private static final HashMap<String, String> COLORS = new HashMap<>();

    public static void main(final String[] ARGUMENTS) {
        addColors();
        final String TARGET_COLOR = "Red";
        System.out.print(COLORS.containsValue(TARGET_COLOR));
    }

    private static void addColors() {
        COLORS.put("#FF0000", "Red");
        COLORS.put("#32CD32", "LimeGreen");
        COLORS.put("#DC143C", "Crimson");
        COLORS.put("#000000", "Black");
        COLORS.put("#FFFFFF", "White");
    }
}