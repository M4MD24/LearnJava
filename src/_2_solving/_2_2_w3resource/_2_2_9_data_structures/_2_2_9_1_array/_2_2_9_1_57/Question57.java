package _2_solving._2_2_w3resource._2_2_9_data_structures._2_2_9_1_array._2_2_9_1_57;

import java.util.Arrays;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to check if a sub-array is formed by consecutive integers from a given array of integers.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Numbers = [2, 5, 0, 2, 1, 4, 3, 6, 1, 0]</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * The largest sub-array is [1, 7]
 * <br/>
 * Elements of the sub-array: [5, 0, 2, 1, 4, 3, 6]
 * </h2>
 */

public class Question57 {
    public static void main(final String[] PARAMETERS) {
        final int[] NUMBERS = {2, 5, 0, 2, 1, 4, 3, 6, 1, 0};
        System.out.println("Numbers = " + Arrays.toString(NUMBERS));
        printIndicesAndNumbersLargestConsecutiveSubArray(NUMBERS);
    }

    private static void printIndicesAndNumbersLargestConsecutiveSubArray(final int[] NUMBERS) {
        int countOfLengthNumbers = 1,
                largestCountOfConsecutiveSubArray = -1,
                startIndexOfLargestConsecutiveSubArray = -1,
                endIndexOfLargestConsecutiveSubArray = -1;
        int[] largestSubArray = new int[0];
        while (countOfLengthNumbers <= NUMBERS.length) {
            final int INDEX_OF_END = NUMBERS.length - countOfLengthNumbers;
            for (int indexOfStart = 0; indexOfStart <= INDEX_OF_END; indexOfStart++) {
                final int[] CURRENT_SUB_ARRAY = Arrays.copyOfRange(NUMBERS, indexOfStart, indexOfStart + countOfLengthNumbers);
                if (Arrays.stream(CURRENT_SUB_ARRAY).distinct().count() == Arrays.stream(CURRENT_SUB_ARRAY).toArray().length
                        && countOfLengthNumbers > largestCountOfConsecutiveSubArray) {
                    largestSubArray = CURRENT_SUB_ARRAY;
                    largestCountOfConsecutiveSubArray = countOfLengthNumbers;
                    startIndexOfLargestConsecutiveSubArray = indexOfStart;
                    endIndexOfLargestConsecutiveSubArray = largestSubArray.length;
                }
            }
            countOfLengthNumbers++;
        }
        if (largestCountOfConsecutiveSubArray != -1)
            System.out.printf("""
                            The largest sub-array is [%d, %d]
                            Elements of the sub-array: %s""",
                    startIndexOfLargestConsecutiveSubArray,
                    endIndexOfLargestConsecutiveSubArray,
                    Arrays.toString(largestSubArray)
            );
        else
            System.out.print("Nothing!");
    }
}