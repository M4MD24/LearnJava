package _2_solving._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_189_rotate_array;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.</h2>
 */

public class RotateArray {
    public static void main(final String[] PARAMETERS) {
        final int[] NUMBERS = {1, 2, 3, 4, 5, 6, 7};
        final int COUNT_OF_STEPS = 3;
        rotateArray(NUMBERS, COUNT_OF_STEPS);
        System.out.print(Arrays.toString(NUMBERS));
    }

    private static void rotateArray(final int[] NUMBERS, int countOfSteps) {
        final int LENGTH = NUMBERS.length;
        countOfSteps %= LENGTH;
        if (countOfSteps != 0) {
            final int[] TEMPORARY_NUMBERS = new int[LENGTH];
            System.arraycopy(NUMBERS, LENGTH - countOfSteps, TEMPORARY_NUMBERS, 0, countOfSteps);
            System.arraycopy(NUMBERS, 0, TEMPORARY_NUMBERS, countOfSteps, LENGTH - countOfSteps);
            System.arraycopy(TEMPORARY_NUMBERS, 0, NUMBERS, 0, LENGTH);
        }
    }

// >
    /*private static void rotateArray(final int[] NUMBERS, int countOfSteps) {
        final int NUMBERS_LENGTH = NUMBERS.length;
        countOfSteps %= NUMBERS_LENGTH;
        reverse(
                NUMBERS,
                0,
                NUMBERS_LENGTH - 1
        );
        reverse(
                NUMBERS,
                0,
                countOfSteps - 1
        );
        reverse(
                NUMBERS,
                countOfSteps,
                NUMBERS_LENGTH - 1
        );
    }

    private static void reverse(final int[] NUMBERS, int left, int right) {
        while (left < right) {
            NUMBERS[left] ^= NUMBERS[right];
            NUMBERS[right] ^= NUMBERS[left];
            NUMBERS[left] ^= NUMBERS[right];
            left++;
            right--;
        }
    }*/
}