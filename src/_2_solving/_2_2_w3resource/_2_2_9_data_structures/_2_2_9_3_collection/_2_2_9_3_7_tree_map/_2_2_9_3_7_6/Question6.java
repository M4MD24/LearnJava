package _2_solving._2_2_w3resource._2_2_9_data_structures._2_2_9_3_collection._2_2_9_3_7_tree_map._2_2_9_3_7_6;

import java.util.TreeMap;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to delete all elements from a Tree Map.</h2>
 */

public class Question6 {
    private static final TreeMap<String, String> COLORS = new TreeMap<>();

    public static void main(final String[] PARAMETERS) {
        addColors();
        System.out.println("■ Before Clear");
        System.out.println(COLORS);
        COLORS.clear();
        System.out.println("\n■ After Clear");
        System.out.print(COLORS);
    }

    private static void addColors() {
        COLORS.put("#FF0000", "Red");
        COLORS.put("#32CD32", "LimeGreen");
        COLORS.put("#DC143C", "Crimson");
        COLORS.put("#000000", "Black");
        COLORS.put("#FFFFFF", "White");
    }
}