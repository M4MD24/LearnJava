package _2_solving._2_2_w3resource._2_2_9_data_structures._2_2_9_1_array._2_2_9_1_68;

import java.util.Arrays;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to create all possible permutations of a given array of distinct integers.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>
 * First Numbers = {1, 2, 3, 4}
 * <br/>
 * Second Numbers = {1, 2, 3}
 * </h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Possible permutations of the said array:
 * <br/>
 * [1, 2, 3, 4]
 * <br/>
 * [1, 2, 4, 3]
 * <br/>
 * ....
 * <br/>
 * [4, 1, 3, 2]
 * <br/>
 * [4, 1, 2, 3]
 * <br/>
 * Possible permutations of the said array:
 * <br/>
 * [1, 2, 3]
 * <br/>
 * [1, 3, 2]
 * <br/>
 * ...
 * <br/>
 * [3, 2, 1]
 * <br/>
 * [3, 1, 2]
 * </h2>
 */

public class Question68 {
    public static void main(final String[] ARGS) {
        final int[] FIRST_NUMBERS = {1, 2, 3, 4},
                SECOND_NUMBERS = {1, 2, 3};
        printAllPossiblePermutationsOfNumbers(FIRST_NUMBERS);
        System.out.println();
        printAllPossiblePermutationsOfNumbers(SECOND_NUMBERS);
    }

    private static void printAllPossiblePermutationsOfNumbers(final int[] NUMBERS) {
        System.out.println("Possible permutations of the said array:");
        if (Arrays.stream(NUMBERS).distinct().count() == NUMBERS.length)
            permute(NUMBERS, 0);
        else
            System.out.println("Numbers aren't distinct!");
    }

    private static void permute(final int[] NUMBERS, final int START_INDEX) {
        if (START_INDEX == NUMBERS.length - 1)
            System.out.println(Arrays.toString(NUMBERS));
        else
            for (int index = START_INDEX; index < NUMBERS.length; index++) {
                swap(NUMBERS, START_INDEX, index);
                permute(NUMBERS, START_INDEX + 1);
                swap(NUMBERS, START_INDEX, index);
            }
    }

    private static void swap(final int[] NUMBERS, final int FIRST_INDEX, final int SECOND_INDEX) {
        final int TEMPORARY_NUMBER = NUMBERS[FIRST_INDEX];
        NUMBERS[FIRST_INDEX] = NUMBERS[SECOND_INDEX];
        NUMBERS[SECOND_INDEX] = TEMPORARY_NUMBER;
    }
}