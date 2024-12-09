package _2_solve._2_2_w3resource._2_2_9_data_structures._2_2_9_1_array._2_2_9_1_73;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to sort a given array of distinct integers where all its numbers are sorted except two numbers.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>
 * First Numbers = {3, 5, 6, 9, 8, 7}
 * <br/>
 * Second Numbers = {5, 0, 1, 2, 3, 4, -2}
 * </h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * After sorting new array becomes: [3, 5, 6, 7, 8, 9]
 * <br/>
 * After sorting new array becomes: [-2, 0, 1, 2, 3, 4, 5]
 * </h2>
 */

public class Question73 {
    public static void main(final String[] PARAMETERS) {
        final int[] FIRST_NUMBER = {3, 5, 6, 9, 8, 7},
                SECOND_NUMBERS = {5, 0, 1, 2, 3, 4, -2};
        printTestOfNewSortingArrayWithSpecifiedCondition(FIRST_NUMBER);
        System.out.println('\n');
        printTestOfNewSortingArrayWithSpecifiedCondition(SECOND_NUMBERS);
    }

    private static void printTestOfNewSortingArrayWithSpecifiedCondition(final int[] NUMBER) {
        System.out.println("Numbers: " + Arrays.toString(NUMBER));
        System.out.print("After sorting new array: " + Arrays.toString(getNewArrayAfterSorting(NUMBER)));
    }

    private static int[] getNewArrayAfterSorting(final int[] NUMBERS) {
        int firstNumberIndex = 0,
                secondNumberIndex = NUMBERS.length - 1;
        while (NUMBERS[firstNumberIndex] < NUMBERS[firstNumberIndex + 1] &&
                firstNumberIndex < NUMBERS.length - 2)
            firstNumberIndex++;
        while (NUMBERS[secondNumberIndex] > NUMBERS[secondNumberIndex - 1] &&
                secondNumberIndex > 1)
            secondNumberIndex--;
        if (firstNumberIndex != NUMBERS.length - 1 &&
                secondNumberIndex != 1)
            swapTwoNumbersInNumbers(NUMBERS, firstNumberIndex, secondNumberIndex);
        else
            System.out.println("Nothing to swap!");
        return NUMBERS;
    }

    private static void swapTwoNumbersInNumbers(final int[] NUMBERS, final int FIRST_NUMBER_INDEX, final int SECOND_NUMBER_INDEX) {
        final int TEMPORARY = NUMBERS[FIRST_NUMBER_INDEX];
        NUMBERS[FIRST_NUMBER_INDEX] = NUMBERS[SECOND_NUMBER_INDEX];
        NUMBERS[SECOND_NUMBER_INDEX] = TEMPORARY;
    }
}