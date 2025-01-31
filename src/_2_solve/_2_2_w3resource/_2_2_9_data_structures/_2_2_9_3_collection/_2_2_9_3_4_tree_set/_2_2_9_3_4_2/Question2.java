package _2_solve._2_2_w3resource._2_2_9_data_structures._2_2_9_3_collection._2_2_9_3_4_tree_set._2_2_9_3_4_2;

import java.util.TreeSet;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to iterate through all elements in a tree set.</h2>
 */

public class Question2 {
    private static final TreeSet<String> COLORS = new TreeSet<>();

    public static void main(final String[] ARGUMENTS) {
        addColors();
        printAllColors();
    }

    private static void printAllColors() {
        for (final String COLOR : COLORS)
            System.out.print(COLOR + ' ');
    }

    private static void addColors() {
        COLORS.add("Red");
        COLORS.add("LimeGreen");
        COLORS.add("Crimson");
        COLORS.add("Black");
        COLORS.add("White");
    }
}