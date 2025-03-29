package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_9_data_structures._2_2_1_1_9_3_collection._2_2_1_1_9_3_3_hash_set._2_2_1_1_9_3_3_2;

import java.util.HashSet;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to iterate through all elements in a hash list.</h2>
 */

public class Question2 {
    private static final HashSet<String> COLORS = new HashSet<>();

    public static void main(final String[] ARGUMENTS) {
        addColors();
        printAllColors();
    }

    private static void printAllColors() {
        for (String color : COLORS)
            System.out.print(color + ' ');
    }

    private static void addColors() {
        COLORS.add("Red");
        COLORS.add("LimeGreen");
        COLORS.add("Crimson");
        COLORS.add("Black");
        COLORS.add("White");
    }
}