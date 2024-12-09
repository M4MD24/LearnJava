package _2_solve._2_2_w3resource._2_2_13_algorithms._2_2_13_2_sort._2_2_13_2_3;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to sort an array of given integers using the Radix sort algorithm.</h2>
 */

public class Question3 {
    public static void main(final String[] PARAMETERS) {
        final int[] NUMBERS = {161, 269, 370, 101, 125, 125, 716, 54, 54, 868, 12};
        System.out.println("Original Numbers: " + Arrays.toString(NUMBERS));
        radixSort(NUMBERS);
        System.out.print("After Radix Sort: " + Arrays.toString(NUMBERS));
    }

    private static void countingSort(final int[] NUMBERS, final int PLACE) {
        final int LENGTH = NUMBERS.length;
        final int[] NUMBERS_AFTER_COUNTING_SORTING = new int[LENGTH + 1],
                NUMBERS_COUNTER = new int[10];
        for (final int NUMBER : NUMBERS)
            NUMBERS_COUNTER[(NUMBER / PLACE) % 10]++;
        for (int index = 1; index < 10; index++)
            NUMBERS_COUNTER[index] += NUMBERS_COUNTER[index - 1];
        for (int index = LENGTH - 1; index >= 0; index--)
            NUMBERS_AFTER_COUNTING_SORTING[NUMBERS_COUNTER[(NUMBERS[index] / PLACE) % 10]-- - 1] = NUMBERS[index];
        System.arraycopy(
                NUMBERS_AFTER_COUNTING_SORTING,
                0,
                NUMBERS,
                0,
                LENGTH
        );
    }

    private static void radixSort(final int[] NUMBERS) {
        final int MAXIMUM_NUMBER = Arrays.stream(NUMBERS)
                .max()
                .getAsInt();
        for (int place = 1; MAXIMUM_NUMBER / place > 0; place *= 10)
            countingSort(NUMBERS, place);
    }
}