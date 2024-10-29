package _2_solving._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_64_minimum_path_sum;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Given a m x n grid filled with non-negative numbers, find a path from top left to bottom right, which minimizes the sum of all numbers along its path.
 * <br/>
 * <br/>
 * Note: You can only move either down or right at any point in time.
 * </h2>
 */

public class MinimumPathSum {
    public static void main(final String[] PARAMETERS) {
        final int[][] GRID = {
                {1, 3, 1},
                {1, 5, 1},
                {4, 2, 1}
        };
        System.out.print(minPathSum(GRID));
    }

    private static int minPathSum(final int[][] GRID) {
        final int ROWS = GRID.length,
                COLUMNS = GRID[0].length;
        for (int row = 0; row < ROWS; row++)
            for (int column = 0; column < COLUMNS; column++)
                if (row != 0 || column != 0)
                    GRID[row][column] += (
                            row == 0
                                    ? GRID[row][column - 1]
                                    : (
                                    column == 0
                                            ? GRID[row - 1][column]
                                            : Math.min(
                                            GRID[row - 1][column],
                                            GRID[row][column - 1]
                                    )
                            )
                    );
        return GRID[ROWS - 1][COLUMNS - 1];
    }
}