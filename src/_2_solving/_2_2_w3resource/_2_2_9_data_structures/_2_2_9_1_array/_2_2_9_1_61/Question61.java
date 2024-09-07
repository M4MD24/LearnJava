package _2_solving._2_2_w3resource._2_2_9_data_structures._2_2_9_1_array._2_2_9_1_61;

import java.util.Arrays;
import java.util.HashSet;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to rearrange a given array of unique elements such that every second element of the array is greater than its left and right elements.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Numbers = [1, 2, 4, 9, 5, 3, 8, 7, 10, 12, 14]</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Array with every second element is greater than its left and right elements:
 * <br/>
 * [1, 4, 2, 9, 3, 8, 5, 10, 7, 14, 12]
 * </h2>
 */

public class Question61 {
    public static void main(final String[] PARAMETERS) {
        final int[] NUMBERS = {1, 2, 4, 9, 5, 3, 8, 7, 10, 12, 14};
        System.out.println("Original Numbers: " + Arrays.toString(NUMBERS));
        System.out.print("Numbers with every second number is greater than its left and right numbers:\n" + Arrays.toString(rearrangeEverySecondNumberIsGreaterThanLeftAndRightNumbersOfUniqueNumbers(NUMBERS)));
    }

    private static int[] rearrangeEverySecondNumberIsGreaterThanLeftAndRightNumbersOfUniqueNumbers(final int[] NUMBERS) {
        if (Arrays.stream(NUMBERS).allMatch(new HashSet<>()::add)) {
            Arrays.sort(NUMBERS);
            for (
                    int secondNumberIndex = 1, thirdNumberIndex = 2;
                    thirdNumberIndex < NUMBERS.length;
                    secondNumberIndex += 2, thirdNumberIndex += 2
            )
                swapNumbers(NUMBERS, secondNumberIndex, thirdNumberIndex);
        } else
            System.out.print("Numbers aren't unique!");
        return NUMBERS;
    }

    private static void swapNumbers(final int[] NUMBERS, final int SECOND_NUMBER_INDEX, final int THIRD_NUMBER_INDEX) {
        NUMBERS[SECOND_NUMBER_INDEX] += NUMBERS[THIRD_NUMBER_INDEX];
        NUMBERS[THIRD_NUMBER_INDEX] = NUMBERS[SECOND_NUMBER_INDEX] - NUMBERS[THIRD_NUMBER_INDEX];
        NUMBERS[SECOND_NUMBER_INDEX] -= NUMBERS[THIRD_NUMBER_INDEX];
    }
}