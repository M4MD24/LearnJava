package _2_solving._2_2_w3resource._2_2_13_algorithms._2_2_13_2_sort._2_2_13_2_19;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to sort an array of given integers using the Bucket Sort Algorithm.</h2>
 */

public class Question19 {
    public static void main(final String[] PARAMETERS) {
        final int[] NUMBERS = {5, 2, 8, 1, 9, 4, 10, 6, 3, 7};
        System.out.print(bucketSort(NUMBERS));
    }

    private static String bucketSort(final int[] NUMBERS) {
        final int MAXIMUM_NUMBER = Arrays.stream(NUMBERS)
                .max()
                .getAsInt();
        final int[] NUMBERS_AFTER_BUCKET_SORT = new int[MAXIMUM_NUMBER + 1];
        for (int index = 0; index <= MAXIMUM_NUMBER; index++)
            NUMBERS_AFTER_BUCKET_SORT[index] = 0;
        for (final int NUMBER : NUMBERS)
            NUMBERS_AFTER_BUCKET_SORT[NUMBER]++;
        for (int round = 0, index = 0; round <= MAXIMUM_NUMBER; round++)
            while (NUMBERS_AFTER_BUCKET_SORT[round]-- > 0)
                NUMBERS[index++] = round;
        return Arrays.toString(NUMBERS);
    }
}