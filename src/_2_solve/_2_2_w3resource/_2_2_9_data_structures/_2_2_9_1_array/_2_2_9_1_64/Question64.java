package _2_solve._2_2_w3resource._2_2_9_data_structures._2_2_9_1_array._2_2_9_1_64;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to find the Longest Bi-tonic Sub-array in a given array.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Numbers = {4, 5, 9, 5, 6, 10, 11, 9, 6, 4, 5}</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * The longest bi-tonic sub-array is [3,9]
 * <br/>
 * Elements of the said sub-array: 5 6 10 11 9 6 4
 * <br/>
 * The length of longest bi-tonic sub-array is 7
 * </h2>
 */

public class Question64 {
    public static void main(final String[] PARAMETERS) {
        final int[] NUMBERS = {4, 5, 9, 5, 6, 10, 11, 9, 6, 4, 5};
        System.out.println("Numbers: " + Arrays.toString(NUMBERS));
        printLongestBiTonicSubArray(NUMBERS);
    }

    private static void printLongestBiTonicSubArray(final int[] NUMBERS) {
        int startIndexOfLongestBiTonicSubArray = 0,
                endIndexOfLongestBiTonicSubArray = 1,
                currentIndex = 1;
        while (currentIndex < NUMBERS.length) {
            final int CURRENT_END_INDEX = currentIndex - 1;
            while (currentIndex < NUMBERS.length &&
                    NUMBERS[currentIndex] > NUMBERS[currentIndex - 1])
                currentIndex++;
            final int CURRENT_START_INDEX = currentIndex - 1;
            while (currentIndex < NUMBERS.length &&
                    NUMBERS[currentIndex] < NUMBERS[currentIndex - 1])
                currentIndex++;
            if (CURRENT_END_INDEX != CURRENT_START_INDEX &&
                    CURRENT_START_INDEX != currentIndex - 1 &&
                    currentIndex - CURRENT_END_INDEX > endIndexOfLongestBiTonicSubArray) {
                startIndexOfLongestBiTonicSubArray = CURRENT_END_INDEX;
                endIndexOfLongestBiTonicSubArray = currentIndex - CURRENT_END_INDEX;
            }
        }
        System.out.printf("""
                        The longest bi-tonic sub-array is [%d,%d]
                        Elements of the said sub-array: %s
                        The length of longest bi-tonic sub-array is %d""",
                startIndexOfLongestBiTonicSubArray,
                startIndexOfLongestBiTonicSubArray + endIndexOfLongestBiTonicSubArray - 1,
                Arrays.toString(Arrays.copyOfRange(NUMBERS, startIndexOfLongestBiTonicSubArray, startIndexOfLongestBiTonicSubArray + endIndexOfLongestBiTonicSubArray)),
                endIndexOfLongestBiTonicSubArray);
    }
}