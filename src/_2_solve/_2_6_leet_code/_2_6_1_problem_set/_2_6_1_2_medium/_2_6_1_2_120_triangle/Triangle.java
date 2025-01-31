package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_120_triangle;

import java.util.List;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Given a triangle array, return the minimum path sum from top to bottom.
 * <br/>
 * <br/>
 * For each step, you may move to an adjacent number of the row below. More formally, if you are on index i on the current row, you may move to either index i or index i + 1 on the next row.
 * </h2>
 */

public class Triangle {
    public static void main(final String[] ARGUMENTS) {
        final List<List<Integer>> TRIANGLE = List.of(
                List.of(2),
                List.of(3, 4),
                List.of(6, 5, 7),
                List.of(4, 1, 8, 3)
        );
        System.out.print(minimumTotal(TRIANGLE));
    }

    private static int minimumTotal(final List<List<Integer>> TRIANGLE) {
        final int COUNT_OF_ROWS = TRIANGLE.size();
        final int[] MINIMUM_PATH_SUMS = new int[COUNT_OF_ROWS];
        for (int index = 0; index < COUNT_OF_ROWS; index++)
            MINIMUM_PATH_SUMS[index] = TRIANGLE.get(COUNT_OF_ROWS - 1).get(index);
        for (int row = COUNT_OF_ROWS - 2; row >= 0; row--)
            for (int column = 0; column <= row; column++)
                MINIMUM_PATH_SUMS[column] = TRIANGLE.get(row).get(column) + Math.min(
                        MINIMUM_PATH_SUMS[column],
                        MINIMUM_PATH_SUMS[column + 1]
                );
        return MINIMUM_PATH_SUMS[0];
    }
}