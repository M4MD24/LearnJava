package _2_solve._2_2_w3resource._2_2_13_algorithms._2_2_13_2_sort._2_2_13_2_7;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to sort an array of given integers using the Insertion sort algorithm.</h2>
 */

public class Question7 {
    public static void main(final String[] ARGUMENTS) {
        final int[] NUMBERS = {5, 2, 8, 1, 9, 4, 10, 6, 3, 7};
        System.out.print(insertionSort(NUMBERS));
    }

    private static String insertionSort(final int[] ARRAY) {
        for (int firstIndex = 0; firstIndex < ARRAY.length; firstIndex++) {
            final int KEY = ARRAY[firstIndex];
            int secondIndex = firstIndex - 1;
            while (secondIndex >= 0 && ARRAY[secondIndex] > KEY) {
                ARRAY[secondIndex + 1] = ARRAY[secondIndex];
                secondIndex -= 1;
            }
            ARRAY[secondIndex + 1] = KEY;
        }
        return Arrays.toString(ARRAY);
    }
}