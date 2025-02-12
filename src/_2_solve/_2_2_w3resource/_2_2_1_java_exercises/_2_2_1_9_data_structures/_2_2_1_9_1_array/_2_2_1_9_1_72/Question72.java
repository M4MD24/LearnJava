package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_9_data_structures._2_2_1_9_1_array._2_2_1_9_1_72;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to find and print one continuous sub-array (from a given array of integers) that if you only sort the said sub-array in ascending order then the entire array will be sorted in ascending order.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>
 * First Number = {1, 2, 3, 0, 4, 6}
 * <br/>
 * Second Number = {1, 3, 2, 7, 5, 6, 4, 8}
 * </h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Continuous sub-array:
 * <br/>
 * 1 2 3 0 4
 * <br/>
 * Continuous sub-array:
 * <br/>
 * 1 3 2 7 5 6 4 8
 * </h2>
 */

public class Question72 {
    public static void main(final String[] ARGUMENTS) {
        final int[] FIRST_NUMBERS = {1, 2, 3, 0, 4, 6},
                SECOND_NUMBERS = {1, 3, 2, 7, 5, 6, 4, 8};
        printTestOfContinuousSubArrayWithSpecifiedCondition(FIRST_NUMBERS);
        System.out.println('\n');
        printTestOfContinuousSubArrayWithSpecifiedCondition(SECOND_NUMBERS);
    }

    private static void printTestOfContinuousSubArrayWithSpecifiedCondition(final int[] NUMBERS) {
        System.out.println("Numbers: " + Arrays.toString(NUMBERS));
        System.out.println("Continuous sub-array:");
        for (final int NUMBER : getContinuousSortedNumbers(NUMBERS))
            System.out.print(NUMBER + " ");
    }

    private static int[] getContinuousSortedNumbers(final int[] NUMBERS) {
        int[] largestSubArray;
        int countOfLengthNumbers = 2,
                largestCountOfConsecutiveSubArray = -1,
                startIndexOfLargestConsecutiveSubArray = -1,
                endIndexOfLargestConsecutiveSubArray = -1;
        while (countOfLengthNumbers <= NUMBERS.length) {
            final int INDEX_OF_END = NUMBERS.length - countOfLengthNumbers;
            for (int indexOfStart = 0; indexOfStart <= INDEX_OF_END; indexOfStart++) {
                final int[] CURRENT_SUB_ARRAY = Arrays.copyOfRange(NUMBERS, indexOfStart, indexOfStart + countOfLengthNumbers);
                Arrays.sort(CURRENT_SUB_ARRAY);
                if (Arrays.stream(CURRENT_SUB_ARRAY).distinct().count() == Arrays.stream(CURRENT_SUB_ARRAY).toArray().length &&
                        countOfLengthNumbers > largestCountOfConsecutiveSubArray &&
                        areConsecutive(CURRENT_SUB_ARRAY)) {
                    largestSubArray = CURRENT_SUB_ARRAY;
                    largestCountOfConsecutiveSubArray = countOfLengthNumbers;
                    startIndexOfLargestConsecutiveSubArray = indexOfStart;
                    endIndexOfLargestConsecutiveSubArray = largestSubArray.length;
                }
            }
            countOfLengthNumbers++;
        }
        return Arrays.copyOfRange(NUMBERS, startIndexOfLargestConsecutiveSubArray, endIndexOfLargestConsecutiveSubArray);
    }

    private static boolean areConsecutive(final int[] NUMBERS) {
        return IntStream.range(1, NUMBERS.length)
                .allMatch(index -> NUMBERS[index - 1] + 1 == NUMBERS[index]);
    }
}