package _2_solve._2_2_w3resource._2_2_13_algorithms._2_2_13_2_sort._2_2_13_2_12;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to sort an array of given integers using the CountingSort algorithm.</h2>
 */

public class Question12 {
    public static void main(final String[] PARAMETERS) {
        final int[] NUMBERS = {5, 2, 8, 1, 9, 4, 10, 6, 3, 7};
        System.out.print(countingSort(NUMBERS));
    }

    private static String countingSort(final int[] NUMBERS) {
        final int LENGTH = NUMBERS.length,
                MAXIMUM_NUMBER = Arrays.stream(NUMBERS)
                        .max()
                        .getAsInt();
        final int[] NUMBERS_COUNTER = new int[MAXIMUM_NUMBER + 1],
                NUMBERS_AFTER_COUNTING_SORTING = new int[LENGTH + 1];
        for (final int NUMBER : NUMBERS)
            NUMBERS_COUNTER[NUMBER]++;
        for (int index = 1; index <= MAXIMUM_NUMBER; index++)
            NUMBERS_COUNTER[index] += NUMBERS_COUNTER[index - 1];
        for (int index = LENGTH - 1; index >= 0; index--)
            NUMBERS_AFTER_COUNTING_SORTING[NUMBERS_COUNTER[NUMBERS[index]]-- - 1] = NUMBERS[index];
        System.arraycopy(NUMBERS_AFTER_COUNTING_SORTING, 0, NUMBERS, 0, LENGTH);
        return Arrays.toString(NUMBERS);
    }
}