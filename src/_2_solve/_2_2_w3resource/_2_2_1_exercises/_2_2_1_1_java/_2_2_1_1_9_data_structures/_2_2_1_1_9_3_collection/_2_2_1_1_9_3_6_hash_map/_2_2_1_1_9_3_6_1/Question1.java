package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_9_data_structures._2_2_1_1_9_3_collection._2_2_1_1_9_3_6_hash_map._2_2_1_1_9_3_6_1;

import java.util.HashMap;
import java.util.Map;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to associate the specified value with the specified key in a HashMap.</h2>
 */

public class Question1 {
    private static final HashMap<String, String> COLORS = new HashMap<>();

    public static void main(final String[] ARGUMENTS) {
        addColors();
        printAllColors();
    }

    private static void printAllColors() {
        for (final Map.Entry<String, String> ENTRY : COLORS.entrySet())
            System.out.printf("%7s %s%n",
                    ENTRY.getKey(),
                    ENTRY.getValue());
    }

    private static void addColors() {
        COLORS.put("#FF0000", "Red");
        COLORS.put("#32CD32", "LimeGreen");
        COLORS.put("#DC143C", "Crimson");
        COLORS.put("#000000", "Black");
        COLORS.put("#FFFFFF", "White");
    }
}