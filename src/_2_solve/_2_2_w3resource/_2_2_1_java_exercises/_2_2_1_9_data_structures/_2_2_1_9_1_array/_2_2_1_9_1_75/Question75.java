package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_9_data_structures._2_2_1_9_1_array._2_2_1_9_1_75;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to calculate the largest gap between sorted elements of an array of integers.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Original array: [23, -2, 45, 38, 12, 4, 6]</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>Largest gap between sorted numbers of the said array: 15</h2>
 */

public class Question75 {
    public static void main(final String[] ARGUMENTS) {
        final int[] NUMBERS = {23, -2, 45, 38, 12, 4, 6};
        printTestOfPrintLargestGapBetweenSortedNumbers(NUMBERS);
    }

    private static void printTestOfPrintLargestGapBetweenSortedNumbers(final int[] NUMBERS) {
        System.out.println("Original numbers: " + Arrays.toString(NUMBERS));
        System.out.print("Largest gap between sorted numbers of the said array: " + getLargestGapBetweenSortedNumbers(NUMBERS));
    }

    private static int getLargestGapBetweenSortedNumbers(final int[] NUMBERS) {
        Arrays.sort(NUMBERS);
        int largestGapBetweenSortedNumbers = NUMBERS[1] - NUMBERS[0];
        for (int firstNumberIndex = 1, secondNumberIndex = 2; secondNumberIndex < NUMBERS.length; firstNumberIndex++, secondNumberIndex++) {
            final int CURRENT_GEP_BETWEEN_SORTED_NUMBERS = NUMBERS[secondNumberIndex] - NUMBERS[firstNumberIndex];
            if (CURRENT_GEP_BETWEEN_SORTED_NUMBERS > largestGapBetweenSortedNumbers)
                largestGapBetweenSortedNumbers = CURRENT_GEP_BETWEEN_SORTED_NUMBERS;
        }
        return largestGapBetweenSortedNumbers;
    }
}