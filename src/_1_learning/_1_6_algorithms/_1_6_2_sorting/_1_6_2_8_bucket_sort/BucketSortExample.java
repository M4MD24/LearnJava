package _1_learning._1_6_algorithms._1_6_2_sorting._1_6_2_8_bucket_sort;

import java.util.Arrays;

public class BucketSortExample {
    public static void main(final String[] ARGS) {
        final int[] NUMBERS = {90, 40, 5, 15, 40, 30, 9, 9};
        System.out.println("Original Numbers : " + Arrays.toString(NUMBERS));
        radixSort(NUMBERS);
        System.out.print("After Bucket Sort: " + Arrays.toString(NUMBERS));
    }

    private static void radixSort(final int[] NUMBERS) {
        final int MAXIMUM_NUMBER = getMaximumNumber(NUMBERS);
        final int[] NUMBERS_AFTER_BUCKET_SORT = new int[MAXIMUM_NUMBER + 1];
        for (int index = 0; index <= MAXIMUM_NUMBER; index++)
            NUMBERS_AFTER_BUCKET_SORT[index] = 0;
        for (final int NUMBER : NUMBERS)
            NUMBERS_AFTER_BUCKET_SORT[NUMBER]++;
        for (int round = 0, index = 0; round <= MAXIMUM_NUMBER; round++)
            while (NUMBERS_AFTER_BUCKET_SORT[round]-- > 0)
                NUMBERS[index++] = round;
    }

    private static int getMaximumNumber(final int[] NUMBERS) {
        int maxNumber = NUMBERS[0];
        for (int index = 1; index < NUMBERS.length; index++)
            if (NUMBERS[index] > maxNumber)
                maxNumber = NUMBERS[index];
        return maxNumber;
    }
}