package _1_learning._1_6_algorithms._1_6_2_sort._1_6_2_6_counting;

import java.util.Arrays;

public class CountingExample {
    public static void main(final String[] ARGS) {
        final int[] NUMBERS = {11, 30, 24, 16, 7, 31, 7, 16, 39, 41};
        System.out.println("Original Numbers   : " + Arrays.toString(NUMBERS));
        countingSort(NUMBERS);
        System.out.print("After Counting Sort: " + Arrays.toString(NUMBERS));
    }

    private static void countingSort(final int[] NUMBERS) {
        final int LENGTH = NUMBERS.length,
                MAXIMUM_NUMBER = getMaximumNumber(NUMBERS);
        final int[] NUMBERS_COUNTER = new int[MAXIMUM_NUMBER + 1],
                NUMBERS_AFTER_COUNTING_SORTING = new int[LENGTH + 1];
        for (final int NUMBER : NUMBERS)
            NUMBERS_COUNTER[NUMBER]++;
        for (int index = 1; index <= MAXIMUM_NUMBER; index++)
            NUMBERS_COUNTER[index] += NUMBERS_COUNTER[index - 1];
        for (int index = LENGTH - 1; index >= 0; index--)
            NUMBERS_AFTER_COUNTING_SORTING[NUMBERS_COUNTER[NUMBERS[index]]-- - 1] = NUMBERS[index];
        System.arraycopy(NUMBERS_AFTER_COUNTING_SORTING, 0, NUMBERS, 0, LENGTH);
    }

    private static int getMaximumNumber(final int[] NUMBERS) {
        int maximumNumber = NUMBERS[0];
        for (int index = 1; index < NUMBERS.length; index++)
            if (NUMBERS[index] > maximumNumber)
                maximumNumber = NUMBERS[index];
        return maximumNumber;
    }
}