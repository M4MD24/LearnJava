package _2_solving._2_2_w3resource._2_2_13_algorithms._2_2_13_2_sort._2_2_13_2_5;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to sort an array of given integers using the Heap sort algorithm.</h2>
 */

public class Question5 {
    public static void main(final String[] PARAMETERS) {
        final int[] NUMBERS = {45, 7, 20, 20, 40, 25, 40, 23, -2};
        System.out.println("Original Numbers: " + Arrays.toString(NUMBERS));
        heapSort(NUMBERS);
        System.out.print("After Heap Sort : " + Arrays.toString(NUMBERS));
    }

    private static void heapify(final int[] NUMBERS, final int LENGTH, final int CURRENT_INDEX) {
        int largestNumberIndex = CURRENT_INDEX;
        final int LEFT = 2 * CURRENT_INDEX + 1,
                RIGHT = 2 * CURRENT_INDEX + 2;
        if (LEFT < LENGTH && NUMBERS[LEFT] > NUMBERS[largestNumberIndex])
            largestNumberIndex = LEFT;
        if (RIGHT < LENGTH && NUMBERS[RIGHT] > NUMBERS[largestNumberIndex])
            largestNumberIndex = RIGHT;
        if (largestNumberIndex != CURRENT_INDEX) {
            final int TEMPORARY_NUMBER = NUMBERS[CURRENT_INDEX];
            NUMBERS[CURRENT_INDEX] = NUMBERS[largestNumberIndex];
            NUMBERS[largestNumberIndex] = TEMPORARY_NUMBER;
            heapify(NUMBERS, LENGTH, largestNumberIndex);
        }
    }

    private static void heapSort(final int[] NUMBERS) {
        final int LENGTH = NUMBERS.length;
        for (int index = LENGTH / 2 - 1; index >= 0; index--)
            heapify(NUMBERS, LENGTH, index);
        for (int index = LENGTH - 1; index >= 0; index--) {
            final int TEMPORARY_NUMBER = NUMBERS[0];
            NUMBERS[0] = NUMBERS[index];
            NUMBERS[index] = TEMPORARY_NUMBER;
            heapify(NUMBERS, index, 0);
        }
    }
}