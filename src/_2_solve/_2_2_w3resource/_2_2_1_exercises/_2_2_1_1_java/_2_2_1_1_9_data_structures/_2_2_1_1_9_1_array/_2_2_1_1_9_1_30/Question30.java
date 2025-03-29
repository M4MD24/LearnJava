package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_9_data_structures._2_2_1_1_9_1_array._2_2_1_1_9_1_30;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to check if an array of integers is without 0 and -1.</h2>
 */

public class Question30 {
    public static void main(final String[] ARGUMENTS) {
        final int[] NUMBERS = {1, 2, 3, 0, 4, 5, 6, 7, 8, 9, 0};
        System.out.println(Arrays.toString(NUMBERS));
        System.out.print(checkNumbersAreWithoutZeroAndNegativeOne(NUMBERS));
    }

    private static boolean checkNumbersAreWithoutZeroAndNegativeOne(final int[] NUMBERS) {
        return isWithoutZero(NUMBERS) && isWithoutNegativeOne(NUMBERS);
    }

    private static boolean isWithoutNegativeOne(final int[] NUMBERS) {
        return Arrays.stream(NUMBERS).anyMatch(number -> number == -1);
    }

    private static boolean isWithoutZero(final int[] NUMBERS) {
        return Arrays.stream(NUMBERS).anyMatch(number -> number == 0);
    }
}