package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_9_data_structures._2_2_1_1_9_3_collection._2_2_1_1_9_3_4_tree_set._2_2_1_1_9_3_4_5;

import java.util.TreeSet;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to get the first and last elements in a tree set.</h2>
 */

public class Question5 {
    private static final TreeSet<String> COLORS = new TreeSet<>();

    public static void main(final String[] ARGUMENTS) {
        addColors();
        System.out.println("First Color: " + COLORS.first());
        System.out.print("Second Color: " + COLORS.last());
    }

    private static void addColors() {
        COLORS.add("Red");
        COLORS.add("LimeGreen");
        COLORS.add("Crimson");
        COLORS.add("Black");
        COLORS.add("White");
    }
}