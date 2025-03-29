package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_9_data_structures._2_2_1_1_9_1_array._2_2_1_1_9_1_26;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to move all 0's to the end of an array. Maintain the relative order of the other (non-zero) array elements.</h2>
 */

public class Question26 {
    public static void main(final String[] ARGUMENTS) {
        final int[] NUMBERS = {1, 0, 2, 3, 0, 4, 5, 0, 6, 7, 8, 9};
        System.out.println("Original Numbers: " + Arrays.toString(NUMBERS));
        moveAllZerosToEnd(NUMBERS);
        System.out.print("After Move All Zeros to End: " + Arrays.toString(NUMBERS));
    }

    private static void moveAllZerosToEnd(final int[] NUMBERS) {
        for (int indexOfStart = 0, indexOfEnd = NUMBERS.length;
             indexOfStart < indexOfEnd;
             indexOfStart++)
            if (NUMBERS[indexOfStart] == 0)
                swapLoop(NUMBERS, indexOfStart, indexOfEnd - 1);
    }

    private static void swapLoop(final int[] NUMBERS, int indexOfStart, int indexOfEnd) {
        while (indexOfStart < indexOfEnd)
            swap(NUMBERS, indexOfStart++, indexOfStart);
    }

    private static void swap(final int[] NUMBERS, final int INDEX_OF_FIRST_NUMBER, final int INDEX_OF_SECOND_NUMBER) {
        NUMBERS[INDEX_OF_FIRST_NUMBER] += NUMBERS[INDEX_OF_SECOND_NUMBER];
        NUMBERS[INDEX_OF_SECOND_NUMBER] = NUMBERS[INDEX_OF_FIRST_NUMBER] - NUMBERS[INDEX_OF_SECOND_NUMBER];
        NUMBERS[INDEX_OF_FIRST_NUMBER] -= NUMBERS[INDEX_OF_SECOND_NUMBER];
    }
}