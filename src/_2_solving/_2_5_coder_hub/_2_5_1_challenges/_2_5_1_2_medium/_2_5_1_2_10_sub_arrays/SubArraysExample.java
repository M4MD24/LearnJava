package _2_solving._2_5_coder_hub._2_5_1_challenges._2_5_1_2_medium._2_5_1_2_10_sub_arrays;

import java.util.Arrays;

public class SubArraysExample {
    public static void main(final String[] PARAMETERS) {
        System.out.println(Arrays.toString(getResultOfSubtractBetweenNumbers(new int[]{2, 4, 88}, new int[]{4, 2, 88})));
        System.out.println(Arrays.toString(getResultOfSubtractBetweenNumbers(new int[]{-3, 4, 0}, new int[]{93, 22, 7})));
        System.out.println(Arrays.toString(getResultOfSubtractBetweenNumbers(new int[]{7, 8, 2}, new int[]{4, 5, 1})));
        System.out.print(Arrays.toString(getResultOfSubtractBetweenNumbers(new int[]{19, 29}, new int[]{10, 20})));
    }

    private static int[] getResultOfSubtractBetweenNumbers(final int[] FIRST_NUMBERS, final int[] SECOND_NUMBERS) {
        final int[] RESULT_OF_SUBTRACT_BETWEEN_NUMBERS = new int[FIRST_NUMBERS.length];
        for (int index = 0; index < RESULT_OF_SUBTRACT_BETWEEN_NUMBERS.length; index++)
            RESULT_OF_SUBTRACT_BETWEEN_NUMBERS[index] = SECOND_NUMBERS[index] - FIRST_NUMBERS[index];
        return RESULT_OF_SUBTRACT_BETWEEN_NUMBERS;
    }
}