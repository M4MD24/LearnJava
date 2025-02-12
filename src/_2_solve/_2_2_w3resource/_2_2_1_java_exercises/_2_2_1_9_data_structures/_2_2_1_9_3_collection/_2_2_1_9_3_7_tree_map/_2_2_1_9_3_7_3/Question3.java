package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_9_data_structures._2_2_1_9_3_collection._2_2_1_9_3_7_tree_map._2_2_1_9_3_7_3;

import java.util.TreeMap;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to search for a key in a Tree Map.</h2>
 */

public class Question3 {
    private static final TreeMap<String, String> COLORS = new TreeMap<>();

    public static void main(final String[] ARGUMENTS) {
        addColors();
        System.out.print(COLORS.containsKey("#32CD32"));
    }

    private static void addColors() {
        COLORS.put("#FF0000", "Red");
        COLORS.put("#32CD32", "LimeGreen");
        COLORS.put("#DC143C", "Crimson");
        COLORS.put("#000000", "Black");
        COLORS.put("#FFFFFF", "White");
    }
}