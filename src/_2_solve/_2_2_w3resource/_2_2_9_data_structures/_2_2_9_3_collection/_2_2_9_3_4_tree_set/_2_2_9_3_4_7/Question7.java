package _2_solve._2_2_w3resource._2_2_9_data_structures._2_2_9_3_collection._2_2_9_3_4_tree_set._2_2_9_3_4_7;

import java.util.TreeSet;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to get the number of elements in a tree set.</h2>
 */

public class Question7 {
    private static final TreeSet<String> COLORS = new TreeSet<>();

    public static void main(final String[] PARAMETERS) {
        addColors();
        System.out.print(COLORS.size());
    }

    private static void addColors() {
        COLORS.add("Red");
        COLORS.add("LimeGreen");
        COLORS.add("Crimson");
        COLORS.add("Black");
        COLORS.add("White");
    }
}