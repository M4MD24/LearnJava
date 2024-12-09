package _2_solve._2_2_w3resource._2_2_9_data_structures._2_2_9_3_collection._2_2_9_3_7_tree_map._2_2_9_3_7_10;

import java.util.TreeMap;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to get a reverse order view of the keys contained in a given map.</h2>
 */

public class Question10 {
    private static final TreeMap<String, String> COLORS = new TreeMap<>();

    public static void main(final String[] PARAMETERS) {
        addColors();
        System.out.println("Before Sort: " + COLORS);
        System.out.print("After Sort: " + COLORS.descendingKeySet());
    }

    private static void addColors() {
        COLORS.put("#FF0000", "Red");
        COLORS.put("#32CD32", "LimeGreen");
        COLORS.put("#DC143C", "Crimson");
        COLORS.put("#000000", "Black");
        COLORS.put("#FFFFFF", "White");
    }
}