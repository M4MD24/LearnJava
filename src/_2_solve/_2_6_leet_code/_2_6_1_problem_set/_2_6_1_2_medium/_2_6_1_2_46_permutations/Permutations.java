package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_46_permutations;

import java.util.ArrayList;
import java.util.List;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Given an array nums of distinct integers, return all the possible permutations.
 * <br/>
 * You can return the answer in any order.
 * </h2>
 */

public class Permutations {
    public static void main(final String[] PARAMETERS) {
        System.out.print(permute(new int[]{1, 2, 3}));
    }

    private static List<List<Integer>> permute(final int[] NUMBERS) {
        System.gc();
        final List<List<Integer>> ALL_PERMUTATIONS = new ArrayList<>();
        generatePermutations(NUMBERS, 0, ALL_PERMUTATIONS);
        return ALL_PERMUTATIONS;
    }

    private static void generatePermutations(final int[] NUMBERS, final int START_INDEX, final List<List<Integer>> ALL_PERMUTATIONS) {
        if (START_INDEX == NUMBERS.length) {
            final List<Integer> PERMUTATION = new ArrayList<>();
            for (final int NUMBER : NUMBERS)
                PERMUTATION.add(NUMBER);
            ALL_PERMUTATIONS.add(PERMUTATION);
        } else
            for (int number = START_INDEX; number < NUMBERS.length; number++) {
                swap(NUMBERS, START_INDEX, number);
                generatePermutations(NUMBERS, START_INDEX + 1, ALL_PERMUTATIONS);
                swap(NUMBERS, START_INDEX, number);
            }
    }

    private static void swap(final int[] NUMBERS, final int FIRST_INDEX, final int SECOND_INDEX) {
        if (FIRST_INDEX != SECOND_INDEX) {
            NUMBERS[FIRST_INDEX] ^= NUMBERS[SECOND_INDEX];
            NUMBERS[SECOND_INDEX] = NUMBERS[FIRST_INDEX] ^ NUMBERS[SECOND_INDEX];
            NUMBERS[FIRST_INDEX] ^= NUMBERS[SECOND_INDEX];
        }
    }
}