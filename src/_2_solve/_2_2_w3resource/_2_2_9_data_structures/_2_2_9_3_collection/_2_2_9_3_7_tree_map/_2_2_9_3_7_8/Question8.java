package _2_solve._2_2_w3resource._2_2_9_data_structures._2_2_9_3_collection._2_2_9_3_7_tree_map._2_2_9_3_7_8;

import java.util.TreeMap;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to get a key-value mapping associated with the greatest key and the least key in a map.</h2>
 */

public class Question8 {
    private static final TreeMap<String, String> COLORS = new TreeMap<>();

    public static void main(final String[] PARAMETERS) {
        addColors();
        System.out.println("Greatest Entry: " + COLORS.firstEntry());
        System.out.print("Least Entry: " + COLORS.lastEntry());
    }

    private static void addColors() {
        COLORS.put("#FF0000", "Red");
        COLORS.put("#32CD32", "LimeGreen");
        COLORS.put("#DC143C", "Crimson");
        COLORS.put("#000000", "Black");
        COLORS.put("#FFFFFF", "White");
    }
}