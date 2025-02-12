package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_9_data_structures._2_2_1_9_3_collection._2_2_1_9_3_7_tree_map._2_2_1_9_3_7_7;

import java.util.Comparator;
import java.util.TreeMap;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to sort keys in a Tree Map by using a comparator.</h2>
 */

public class Question7 {
    private static final TreeMap<String, String> COLORS = new TreeMap<>(Comparator.reverseOrder());

    public static void main(final String[] ARGUMENTS) {
        addColors();
        System.out.println(COLORS);
    }

    private static void addColors() {
        COLORS.put("#FF0000", "Red");
        COLORS.put("#32CD32", "LimeGreen");
        COLORS.put("#DC143C", "Crimson");
        COLORS.put("#000000", "Black");
        COLORS.put("#FFFFFF", "White");
    }
}