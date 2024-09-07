package _2_solving._2_2_w3resource._2_2_9_data_structures._2_2_9_1_array._2_2_9_1_55;

import java.util.Arrays;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to print all sub-arrays with 0 sum present in a given array of integers</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>
 * first numbers = {1, 3, -7, 3, 2, 3, 1, -3, -2, -2}
 * <br/>
 * second numbers = {1, 2, -3, 4, 5, 6}
 * <br/>
 * third numbers= {1, 2, -2, 3, 4, 5, 6}
 * </h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Original array: [1, 3, -7, 3, 2, 3, 1, -3, -2, -2]
 * <br/>
 * Sub-arrays with 0 sum : [1, 3, -7, 3]
 * <br/>
 * Sub-arrays with 0 sum : [3, -7, 3, 2, 3, 1, -3, -2]
 * <br/>
 * <br/>
 * Original array: [1, 2, -3, 4, 5, 6]
 * <br/>
 * Sub-arrays with 0 sum : [1, 2, -3]
 * <br/>
 * <br/>
 * Original array: [1, 2, -2, 3, 4, 5, 6]
 * <br/>
 * Sub-arrays with 0 sum : [2, -2]
 * </h2>
 */

public class Question55 {
    public static void main(final String[] PARAMETERS) {
        final int[][] ARRAYS_OF_NUMBERS = {
                {1, 3, -7, 3, 2, 3, 1, -3, -2, -2},
                {1, 2, -3, 4, 5, 6},
                {1, 2, -2, 3, 4, 5, 6}
        };
        for (final int[] NUMBERS : ARRAYS_OF_NUMBERS) {
            System.out.println("Original Numbers: " + Arrays.toString(NUMBERS));
            printSubArraysAfterSummationEqualsZero(NUMBERS);
            System.out.println();
        }
    }

    private static void printSubArraysAfterSummationEqualsZero(final int[] NUMBERS) {
        int countOfLengthNumbers = 1;
        while (countOfLengthNumbers <= NUMBERS.length) {
            for (int indexOfStart = 0; indexOfStart <= NUMBERS.length - countOfLengthNumbers; indexOfStart++) {
                final int[] SUB_ARRAY = Arrays.copyOfRange(NUMBERS, indexOfStart, indexOfStart + countOfLengthNumbers);
                if (Arrays.stream(SUB_ARRAY).sum() == 0)
                    System.out.println("Sub-Array with 0 Sum: " + Arrays.toString(SUB_ARRAY));
            }
            countOfLengthNumbers++;
        }
    }
}