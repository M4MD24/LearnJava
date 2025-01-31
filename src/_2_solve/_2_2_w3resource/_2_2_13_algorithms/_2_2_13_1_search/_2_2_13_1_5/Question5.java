package _2_solve._2_2_w3resource._2_2_13_algorithms._2_2_13_1_search._2_2_13_1_5;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to find a specified element in a given sorted array of elements using Exponential search.</h2>
 */

public class Question5 {
    public static void main(final String[] ARGUMENTS) {
        final int[] NUMBERS = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        final int TARGET = 10;
        System.out.print(exponentialSearch(NUMBERS, TARGET));
    }

    private static String exponentialSearch(final int[] ARRAY, final int TARGET) {
        int startSum = 0;
        if (ARRAY[startSum] == TARGET)
            return "element found at index: " + startSum;
        startSum = 1;
        while (startSum < ARRAY.length &&
                ARRAY[startSum] <= TARGET)
            startSum *= 2;
        final int FINALLY_INDEX = Arrays.binarySearch(
                ARRAY,
                startSum / 2,
                Math.min(startSum, ARRAY.length),
                TARGET
        );
        return FINALLY_INDEX != -1
                ? "element found at index: " + FINALLY_INDEX
                : "Element not found";
    }
}