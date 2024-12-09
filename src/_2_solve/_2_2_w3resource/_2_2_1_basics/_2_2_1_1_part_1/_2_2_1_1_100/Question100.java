package _2_solve._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_100;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to count the elements that differ by 1 or less between two given arrays of integers with the same length.</h2>
 */

public class Question100 {
    public static void main(final String[] PARAMETERS) {

        final int[] FIRST_ARRAY = {10, 11, 10, 20, 43, 20, 50};
        final int[] SECOND_ARRAY = {10, 13, 11, 20, 44, 30, 50};

        System.out.printf("First Array : %s\nSecond Array: %s\n", Arrays.toString(FIRST_ARRAY), Arrays.toString(SECOND_ARRAY));

        countElementBetweenArraysDifferedBy1(FIRST_ARRAY, SECOND_ARRAY);
    }

    private static void countElementBetweenArraysDifferedBy1(final int[] FIRST_ARRAY, final int[] SECOND_ARRAY) {
        int elementsSum = 0;
        if (FIRST_ARRAY.length == SECOND_ARRAY.length) {
            for (int index = 0; index < FIRST_ARRAY.length; index++) {
                int difference = Math.abs(FIRST_ARRAY[index] - SECOND_ARRAY[index]);
                if (difference == 1) ++elementsSum;
            }
        } else System.out.print("Arrays aren't same length");
        System.out.print("Element Sum : " + elementsSum);
    }
}