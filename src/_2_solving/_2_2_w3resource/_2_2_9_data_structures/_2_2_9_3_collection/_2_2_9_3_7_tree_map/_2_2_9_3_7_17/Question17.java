package _2_solving._2_2_w3resource._2_2_9_data_structures._2_2_9_3_collection._2_2_9_3_7_tree_map._2_2_9_3_7_17;

import java.util.TreeMap;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to get the greatest key strictly less than the given key. Return null if there is no such key.</h2>
 */

public class Question17 {
    private static final TreeMap<Integer, String> COLORS = new TreeMap<>();

    public static void main(final String[] PARAMETERS) {
        addColors();
        System.out.print(COLORS.lowerKey(2));
    }

    private static void addColors() {
        COLORS.put(1, "One");
        COLORS.put(4, "Four");
        COLORS.put(5, "Five");
        COLORS.put(8, "Eight");
        COLORS.put(10, "Ten");
    }
}