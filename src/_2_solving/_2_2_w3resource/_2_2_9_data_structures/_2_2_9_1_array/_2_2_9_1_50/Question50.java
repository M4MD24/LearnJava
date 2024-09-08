package _2_solving._2_2_w3resource._2_2_9_data_structures._2_2_9_1_array._2_2_9_1_50;

import java.util.Arrays;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to sort an array of positive integers from an array. In the sorted array the value of the first element should be maximum, the second value should be a minimum, third should be the second maximum, the fourth should be the second minimum and so on.</h2>
 */

public class Question50 {
    public static void main(final String[] PARAMETERS) {
        final int[] NUMBERS = {-4, 8, 6, -5, 6, -2, 1, 0, 2, 3, -11, 2};
        System.out.println("Original Numbers: " + Arrays.toString(NUMBERS));
        System.out.print("After Arrangement: " + Arrays.toString(getArrangementMaximumAndMinimumNumbers(NUMBERS)));
    }

    private static int[] getArrangementMaximumAndMinimumNumbers(final int[] NUMBERS) {
        Arrays.sort(NUMBERS);
        final int LENGTH_OF_NUMBERS = NUMBERS.length;
        final int[] AFTER_ARRANGEMENT_MAXIMUM_AND_MINIMUM_NUMBERS_NUMBERS = new int[LENGTH_OF_NUMBERS];
        int minimumNumbersIndex = 0,
                maximumNumbersIndex = LENGTH_OF_NUMBERS - 1,
                afterArrangementMaximumAndMinimumNumbersNumbersIndex = 0;
        boolean isMaximumTurn = true;
        while (minimumNumbersIndex <= maximumNumbersIndex) {
            if (isMaximumTurn)
                AFTER_ARRANGEMENT_MAXIMUM_AND_MINIMUM_NUMBERS_NUMBERS[afterArrangementMaximumAndMinimumNumbersNumbersIndex] = NUMBERS[maximumNumbersIndex--];
            else
                AFTER_ARRANGEMENT_MAXIMUM_AND_MINIMUM_NUMBERS_NUMBERS[afterArrangementMaximumAndMinimumNumbersNumbersIndex] = NUMBERS[minimumNumbersIndex++];
            isMaximumTurn = !isMaximumTurn;
            afterArrangementMaximumAndMinimumNumbersNumbersIndex++;
        }
        return AFTER_ARRANGEMENT_MAXIMUM_AND_MINIMUM_NUMBERS_NUMBERS;
    }
}