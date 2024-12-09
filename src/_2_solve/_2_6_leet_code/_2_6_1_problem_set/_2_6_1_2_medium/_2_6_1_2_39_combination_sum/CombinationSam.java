package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_39_combination_sum;

import java.util.ArrayList;
import java.util.List;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where the chosen numbers sum to target. You may return the combinations in any order.
 * <br/>
 * <br/>
 * The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the
 * frequency
 * of at least one of the chosen numbers is different.
 * <br/>
 * <br/>
 * The test cases are generated such that the number of unique combinations that sum up to target is less than 150 combinations for the given input.
 * </h2>
 */

public class CombinationSam {
    public static void main(final String[] PARAMETERS) {
        System.out.print(combinationSum(
                new int[]{2, 3, 6, 7},
                7
        ));
    }

    private static List<List<Integer>> combinationSum(final int[] COMBINATIONS, final int TARGET_SUM) {
        final List<List<Integer>> COMBINATIONS_OF_TARGET_SUM = new ArrayList<>();
        findCombinationsOfTargetSum(
                COMBINATIONS_OF_TARGET_SUM,
                new ArrayList<>(),
                COMBINATIONS,
                TARGET_SUM,
                0
        );
        return COMBINATIONS_OF_TARGET_SUM;
    }

    private static void findCombinationsOfTargetSum(
            final List<List<Integer>> COMBINATIONS_OF_TARGET_SUM,
            final List<Integer> CURRENT_COMBINATION,
            final int[] COMBINATIONS,
            final int REMAINING_TARGET,
            final int CURRENT_NUMBER
    ) {
        if (REMAINING_TARGET == 0)
            COMBINATIONS_OF_TARGET_SUM.add(new ArrayList<>(CURRENT_COMBINATION));
        else
            for (int index = CURRENT_NUMBER; index < COMBINATIONS.length; index++)
                if (COMBINATIONS[index] <= REMAINING_TARGET) {
                    CURRENT_COMBINATION.add(COMBINATIONS[index]);
                    findCombinationsOfTargetSum(
                            COMBINATIONS_OF_TARGET_SUM,
                            CURRENT_COMBINATION,
                            COMBINATIONS,
                            REMAINING_TARGET - COMBINATIONS[index],
                            index
                    );
                    CURRENT_COMBINATION.removeLast();
                }
    }
}