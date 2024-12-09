package _2_solve._2_2_w3resource._2_2_9_data_structures._2_2_9_1_array._2_2_9_1_58;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * <h1>Problem:</h1>
 * <h2>Given two sorted arrays A and B of size p and q, write a Java program to merge elements of A with B by maintaining the sorted order i.e. fill A with first p smallest elements and fill B with remaining elements.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>
 * First Numbers = {1, 5, 6, 7, 8, 10}
 * <br/>
 * Second Numbers = {2, 4, 9}
 * </h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Sorted Arrays:
 * <br/>
 * First Numbers = [1, 2, 4, 5, 6, 7]
 * <br/>
 * Second Numbers =  [8, 9, 10]
 * </h2>
 */

public class Question58 {
    public static void main(final String[] PARAMETERS) {
        final int[] FIRST_NUMBERS = {1, 5, 6, 7, 8, 10},
                SECOND_NUMBERS = {2, 4, 9};
        printNumbers(FIRST_NUMBERS, SECOND_NUMBERS);
        printSortedNumbersAfterMergeAndSplit(FIRST_NUMBERS, SECOND_NUMBERS);
    }

    private static void printSortedNumbersAfterMergeAndSplit(int[] firstNumbers, int[] secondNumbers) {
        final int LENGTH_OF_FIRST_NUMBERS = firstNumbers.length,
                LENGTH_OF_SECOND_NUMBERS = secondNumbers.length;
        final int[] MERGED_NUMBERS = IntStream.concat(
                Arrays.stream(firstNumbers),
                Arrays.stream(secondNumbers)
        ).toArray();
        Arrays.sort(MERGED_NUMBERS);
        firstNumbers = Arrays.stream(MERGED_NUMBERS)
                .limit(LENGTH_OF_FIRST_NUMBERS)
                .toArray();
        secondNumbers = Arrays.stream(MERGED_NUMBERS)
                .skip(LENGTH_OF_FIRST_NUMBERS)
                .limit(LENGTH_OF_SECOND_NUMBERS)
                .toArray();
        System.out.printf("""
                        Sorted Numbers:
                        First Numbers: %s
                        Second Numbers: %s""",
                Arrays.toString(firstNumbers),
                Arrays.toString(secondNumbers));
    }

    private static void printNumbers(final int[] FIRST_NUMBERS, final int[] SECOND_NUMBERS) {
        System.out.printf("""
                        Original Numbers:
                        First Numbers: %s
                        Second Numbers: %s
                        %n""",
                Arrays.toString(FIRST_NUMBERS),
                Arrays.toString(SECOND_NUMBERS));
    }
}