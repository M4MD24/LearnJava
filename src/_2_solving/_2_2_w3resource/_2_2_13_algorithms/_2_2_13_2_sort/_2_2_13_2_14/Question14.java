package _2_solving._2_2_w3resource._2_2_13_algorithms._2_2_13_2_sort._2_2_13_2_14;

import java.util.Arrays;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to sort an array of given integers using the Pancake sort algorithm.</h2>
 */

public class Question14 {
    public static void main(final String[] PARAMETERS) {
        final int[] NUMBERS = {5, 2, 8, 1, 9, 4, 10, 6, 3, 7};
        System.out.print(pancakeSort(NUMBERS));
    }

    private static String pancakeSort(final int[] NUMBERS) {
        for (int currentSize = NUMBERS.length; currentSize > 1; currentSize--) {
            final int MAXIMUM_INDEX = findMaxIndex(NUMBERS, currentSize);
            if (MAXIMUM_INDEX != currentSize - 1) {
                flip(NUMBERS, MAXIMUM_INDEX);
                flip(NUMBERS, currentSize - 1);
            }
        }
        return Arrays.toString(NUMBERS);
    }

    private static void flip(final int[] NUMBERS, int endIndex) {
        for (int startIndex = 0; startIndex < endIndex; startIndex++, endIndex--) {
            final int TEMPORARY_ELEMENT = NUMBERS[startIndex];
            NUMBERS[startIndex] = NUMBERS[endIndex];
            NUMBERS[endIndex] = TEMPORARY_ELEMENT;
        }
    }

    private static int findMaxIndex(final int[] NUMBERS, final int MAXIMUM_INDEX) {
        int maxIndex = 0;
        for (int index = 1; index < MAXIMUM_INDEX; index++)
            if (NUMBERS[index] > NUMBERS[maxIndex])
                maxIndex = index;
        return maxIndex;
    }
}