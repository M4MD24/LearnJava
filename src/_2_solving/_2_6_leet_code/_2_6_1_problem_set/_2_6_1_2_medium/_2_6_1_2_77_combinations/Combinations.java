package _2_solving._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_77_combinations;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Given two integers n and k, return all possible combinations of k numbers chosen from the range [1, n].
 * <br/>
 * <br/>
 * You may return the answer in any order.
 * </h2>
 */

public class Combinations {
    public static void main(final String[] PARAMETERS) {
        System.out.print(combine(
                4,
                2
        ));
    }

    private static List<List<Integer>> combine(final int UPPER_LIMIT, final int COMBINATION_LENGTH) {
        System.gc();
        return new AbstractList<>() {
            private List<List<Integer>> combinations;

            private void createCombination(final int INDEX, final List<Integer> COMBINATION) {
                if (COMBINATION.size() == COMBINATION_LENGTH)
                    combinations.add(new ArrayList<>(COMBINATION));
                else
                    for (int index = INDEX; index <= UPPER_LIMIT; index++) {
                        COMBINATION.add(index);
                        createCombination(index + 1, COMBINATION);
                        COMBINATION.removeLast();
                    }
            }

            private void init() {
                if (combinations == null) {
                    combinations = new ArrayList<>();
                    createCombination(1, new ArrayList<>());
                }
            }

            @Override
            public List<Integer> get(final int INDEX) {
                return combinations.get(INDEX);
            }

            @Override
            public int size() {
                init();
                return combinations.size();
            }
        };
    }

// >
    /*private static List<List<Integer>> combine(final int UPPER_LIMIT, final int COMBINATION_LENGTH) {
        final List<List<Integer>> ALL_COMBINATIONS = new ArrayList<>();
        findCombinations(
                1,
                UPPER_LIMIT,
                COMBINATION_LENGTH,
                new ArrayList<>(),
                ALL_COMBINATIONS
        );
        return ALL_COMBINATIONS;
    }

    private static void findCombinations(
            final int START,
            final int UPPER_LIMIT,
            final int COMBINATION_LENGTH,
            final List<Integer> CURRENT_COMBINATION,
            final List<List<Integer>> ALL_COMBINATIONS
    ) {
        if (CURRENT_COMBINATION.size() == COMBINATION_LENGTH)
            ALL_COMBINATIONS.add(new ArrayList<>(CURRENT_COMBINATION));
        else
            for (int number = START; number <= UPPER_LIMIT; number++) {
                CURRENT_COMBINATION.add(number);
                findCombinations(
                        number + 1,
                        UPPER_LIMIT,
                        COMBINATION_LENGTH,
                        CURRENT_COMBINATION,
                        ALL_COMBINATIONS
                );
                CURRENT_COMBINATION.removeLast();
            }
    }*/
}