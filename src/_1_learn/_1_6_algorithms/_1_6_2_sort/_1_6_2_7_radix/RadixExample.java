package _1_learn._1_6_algorithms._1_6_2_sort._1_6_2_7_radix;

import java.util.Arrays;

public class RadixExample {
    public static void main(final String[] ARGUMENTS) {
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
        System.arraycopy(NUMBERS_AFTER_COUNTING_SORTING, 0, NUMBERS, 0, LENGTH);
    }

    private static void radixSort(final int[] NUMBERS) {
        final int MAXIMUM_NUMBER = getMaximumNumber(NUMBERS);
        for (int place = 1; MAXIMUM_NUMBER / place > 0; place *= 10)
            countingSort(NUMBERS, place);
    }

    private static int getMaximumNumber(final int[] NUMBERS) {
        int maximumNumber = NUMBERS[0];
        for (int index = 1; index < NUMBERS.length; index++)
            if (NUMBERS[index] > maximumNumber)
                maximumNumber = NUMBERS[index];
        return maximumNumber;
    }
}