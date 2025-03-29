package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_9_data_structures._2_2_1_1_9_1_array._2_2_1_1_9_1_12;

import java.util.HashSet;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to find duplicate values in an array of integer values.</h2>
 */

public class Question12 {
    public static void main(final String[] ARGUMENTS) {
        final int[] NUMBERS = {1, 2, 5, 3, 4, 4, 0, 5, 6, 7, 8, 9, 0};
        printDuplicatedNumbers(NUMBERS);
    }

    private static void printDuplicatedNumbers(final int[] NUMBERS) {
        final HashSet<Integer> DISTINCT = new HashSet<>();
        for (final int NUMBER : NUMBERS)
            if (!DISTINCT.add(NUMBER))
                System.out.println(NUMBER + " is Duplicated!");
    }
}