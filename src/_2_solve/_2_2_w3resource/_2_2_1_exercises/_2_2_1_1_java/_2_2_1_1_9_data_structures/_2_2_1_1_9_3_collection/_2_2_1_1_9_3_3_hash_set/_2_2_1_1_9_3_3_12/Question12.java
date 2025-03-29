package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_9_data_structures._2_2_1_1_9_3_collection._2_2_1_1_9_3_3_hash_set._2_2_1_1_9_3_3_12;

import java.util.HashSet;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to remove all elements from a hash set.</h2>
 */

public class Question12 {
    private static final HashSet<String> COLORS = new HashSet<>();

    public static void main(final String[] ARGUMENTS) {
        addColorsCodes();
        System.out.println("Before Clear: " + COLORS);
        COLORS.clear();
        System.out.print("After Clear: " + COLORS);
    }

    private static void addColorsCodes() {
        addColorCode("fFfFff");
        addColorCode("32Cd32");
        addColorCode("fF0000");
        addColorCode("000000");
    }

    private static void addColorCode(final String COLOR) {
        Question12.COLORS.add('#' + COLOR.toUpperCase());
    }
}