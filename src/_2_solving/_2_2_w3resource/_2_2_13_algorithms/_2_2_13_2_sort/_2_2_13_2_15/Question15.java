package _2_solving._2_2_w3resource._2_2_13_algorithms._2_2_13_2_sort._2_2_13_2_15;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to sort an array of given integers using the Permutation sort algorithm.</h2>
 */

public class Question15 {
    public static void main(final String[] PARAMETERS) {
        final int[] NUMBERS = {5, 2, 8, 1, 9, 4, 10, 6, 3, 7};
        System.out.print(permutationSort(NUMBERS));
    }

    private static String permutationSort(final int[] NUMBERS) {
        final int MAXIMUM_LENGTH = NUMBERS.length;
        final int[][] ALL_PERMUTATIONS = new int[getFactorial(MAXIMUM_LENGTH)][MAXIMUM_LENGTH];
        generateAllPermutations(
                NUMBERS,
                new int[MAXIMUM_LENGTH],
                0,
                ALL_PERMUTATIONS,
                new boolean[MAXIMUM_LENGTH],
                MAXIMUM_LENGTH
        );
        return Arrays.toString(findMinimumPermutation(ALL_PERMUTATIONS));
    }

    private static int permutationIndex = 0;

    private static void generateAllPermutations(final int[] ORIGINAL_ARRAY, final int[] CURRENT_ARRAY, final int CURRENT_INDEX, final int[][] ALL_PERMUTATIONS, final boolean[] IS_USED, final int TOTAL_LENGTH) {
        if (CURRENT_INDEX == TOTAL_LENGTH)
            System.arraycopy(
                    CURRENT_ARRAY,
                    0,
                    ALL_PERMUTATIONS[permutationIndex++],
                    0,
                    TOTAL_LENGTH
            );
        else
            for (int index = 0; index < TOTAL_LENGTH; index++)
                if (!IS_USED[index]) {
                    CURRENT_ARRAY[CURRENT_INDEX] = ORIGINAL_ARRAY[index];
                    IS_USED[index] = true;
                    generateAllPermutations(
                            ORIGINAL_ARRAY,
                            CURRENT_ARRAY,
                            CURRENT_INDEX + 1,
                            ALL_PERMUTATIONS,
                            IS_USED, TOTAL_LENGTH
                    );
                    IS_USED[index] = false;
                }
    }

    private static int[] findMinimumPermutation(final int[][] ALL_PERMUTATIONS) {
        return Arrays.stream(ALL_PERMUTATIONS)
                .min(Arrays::compare)
                .orElse(ALL_PERMUTATIONS[0]);
    }

    private static int getFactorial(final int NUMBER) {
        int multiplication = 1;
        for (int index = 2; index <= NUMBER; index++)
            multiplication *= index;
        return multiplication;
    }
}