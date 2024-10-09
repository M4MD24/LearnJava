package _2_solving._2_2_w3resource._2_2_9_data_structures._2_2_9_3_collection._2_2_9_3_6_hash_map._2_2_9_3_6_3;

import java.util.HashMap;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to copy all mappings from the specified map to another map.</h2>
 */

public class Question3 {
    private static final HashMap<String, String> COLORS = new HashMap<>();

    public static void main(final String[] PARAMETERS) {
        addColors();
        final HashMap<String, String> ANOTHER_COLORS = new HashMap<>(COLORS);
        System.out.print(ANOTHER_COLORS);
    }

    private static void addColors() {
        COLORS.put("#FF0000", "Red");
        COLORS.put("#32CD32", "LimeGreen");
        COLORS.put("#DC143C", "Crimson");
        COLORS.put("#000000", "Black");
        COLORS.put("#FFFFFF", "White");
    }
}