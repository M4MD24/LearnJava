package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_9_data_structures._2_2_1_1_9_3_collection._2_2_1_1_9_3_3_hash_set._2_2_1_1_9_3_3_1;

import java.util.HashSet;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to append the specified element to the end of a hash set.</h2>
 */

public class Question1 {
    private static final HashSet<String> COLORS = new HashSet<>();

    public static void main(final String[] ARGUMENTS) {
        addColors();
        System.out.print(COLORS);
    }

    private static void addColors() {
        COLORS.add("Red");
        COLORS.add("LimeGreen");
        COLORS.add("Crimson");
        COLORS.add("Black");
        COLORS.add("White");
    }
}