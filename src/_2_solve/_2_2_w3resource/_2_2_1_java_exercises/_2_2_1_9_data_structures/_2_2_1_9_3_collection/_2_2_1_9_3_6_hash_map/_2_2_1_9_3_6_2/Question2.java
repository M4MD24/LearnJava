package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_9_data_structures._2_2_1_9_3_collection._2_2_1_9_3_6_hash_map._2_2_1_9_3_6_2;

import java.util.HashMap;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to count the number of key-value (size) mappings in a map.</h2>
 */

public class Question2 {
    private static final HashMap<String, String> COLORS = new HashMap<>();

    public static void main(final String[] ARGUMENTS) {
        addColors();
        System.out.print(COLORS.size());
    }

    private static void addColors() {
        COLORS.put("#FF0000", "Red");
        COLORS.put("#32CD32", "LimeGreen");
        COLORS.put("#DC143C", "Crimson");
        COLORS.put("#000000", "Black");
        COLORS.put("#FFFFFF", "White");
    }
}