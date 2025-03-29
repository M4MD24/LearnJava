package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_9_data_structures._2_2_1_1_9_3_collection._2_2_1_1_9_3_7_tree_map._2_2_1_1_9_3_7_11;

import java.util.TreeMap;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to get a key-value mapping associated with the greatest key less than or equal to the given key.</h2>
 */

public class Question11 {
    private static final TreeMap<Integer, String> COLORS = new TreeMap<>();

    public static void main(final String[] ARGUMENTS) {
        addColors();
        System.out.print(COLORS.floorEntry(3));
    }

    private static void addColors() {
        COLORS.put(1, "One");
        COLORS.put(4, "Four");
        COLORS.put(5, "Five");
        COLORS.put(8, "Eight");
        COLORS.put(10, "Ten");
    }
}