package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_9_data_structures._2_2_1_1_9_1_array._2_2_1_1_9_1_15;

import java.util.HashSet;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to find common elements between two integer arrays.</h2>
 */

public class Question15 {
    public static void main(final String[] ARGUMENTS) {
        final int[] FIRST_NUMBER = {
                520,
                112,
                365,
                25,
                56,
                789,
        };
        final int[] SECOND_NUMBER = {
                520,
                88,
                365,
                10,
                6452,
                789,
        };
        printCommonElements(FIRST_NUMBER, SECOND_NUMBER);
    }

    private static void printCommonElements(final int[] FIRST_NUMBERS, final int[] SECOND_NUMBERS) {
        final HashSet<Integer> FIRST_DISTINCT_NUMBERS = new HashSet<>(),
                SECOND_DISTINCT_NUMBERS = new HashSet<>();
        for (final int NUMBER : FIRST_NUMBERS)
            FIRST_DISTINCT_NUMBERS.add(NUMBER);
        for (final int NUMBER : SECOND_NUMBERS)
            SECOND_DISTINCT_NUMBERS.add(NUMBER);
        for (final int DISTINCT_STRING : FIRST_DISTINCT_NUMBERS)
            if (SECOND_DISTINCT_NUMBERS.contains(DISTINCT_STRING))
                System.out.println(DISTINCT_STRING);
    }
}