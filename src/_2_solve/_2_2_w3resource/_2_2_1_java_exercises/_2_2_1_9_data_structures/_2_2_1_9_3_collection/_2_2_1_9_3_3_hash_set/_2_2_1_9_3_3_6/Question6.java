package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_9_data_structures._2_2_1_9_3_collection._2_2_1_9_3_3_hash_set._2_2_1_9_3_3_6;

import java.util.HashSet;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to clone a hash set to another hash set.</h2>
 */

public class Question6 {
    private static final HashSet<String> COLORS = new HashSet<>();

    public static void main(final String[] ARGUMENTS) {
        addColors();
        final HashSet<String> ANOTHER_COLORS = (HashSet<String>) COLORS.clone();
        System.out.print(ANOTHER_COLORS);
    }

    private static void addColors() {
        COLORS.add("Red");
        COLORS.add("LimeGreen");
        COLORS.add("Crimson");
        COLORS.add("Black");
        COLORS.add("White");
    }
}