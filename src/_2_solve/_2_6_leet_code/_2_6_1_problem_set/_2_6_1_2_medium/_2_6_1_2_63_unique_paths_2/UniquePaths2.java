package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_63_unique_paths_2;

/**
 * <h1>Problem:</h1>
 * <h2>
 * You are given an m x n integer array grid. There is a robot initially located at the top-left corner (i.e., grid[0][0]). The robot tries to move to the bottom-right corner (i.e., grid[m - 1][n - 1]). The robot can only move either down or right at any point in time.
 * <br/>
 * <br/>
 * An obstacle and space are marked as 1 or 0 respectively in grid. A path that the robot takes cannot include any square that is an obstacle.
 * <br/>
 * <br/>
 * Return the number of possible unique paths that the robot can take to reach the bottom-right corner.
 * <br/>
 * <br/>
 * The testcases are generated so that the answer will be less than or equal to 2 * 109.
 * </h2>
 */

public class UniquePaths2 {
    public static void main(final String[] PARAMETERS) {
        final int[][] GRID = {
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}
        };
        System.out.print(uniquePathsWithObstacles(GRID));
    }

    private static int uniquePathsWithObstacles(final int[][] OBSTACLE_GRID) {
        final int MAX_HEIGHT = OBSTACLE_GRID.length;
        if (MAX_HEIGHT == 0)
            return 0;
        else {
            final int MAX_WIDTH = OBSTACLE_GRID[0].length;
            if (MAX_WIDTH == 0)
                return 0;
            else {
                final int[][] UNIQUE_PATHS = new int[MAX_HEIGHT + 1][MAX_WIDTH + 1];
                UNIQUE_PATHS[MAX_HEIGHT][MAX_WIDTH - 1] = 1;
                for (int height = MAX_HEIGHT - 1; height >= 0; --height)
                    for (int width = MAX_WIDTH - 1; width >= 0; --width)
                        UNIQUE_PATHS[height][width] = (OBSTACLE_GRID[height][width] == 0)
                                ? UNIQUE_PATHS[height + 1][width] + UNIQUE_PATHS[height][width + 1]
                                : 0;
                return UNIQUE_PATHS[0][0];
            }
        }
    }

// >
    /*private static int uniquePathsWithObstacles(final int[][] OBSTACLE_GRID) {
        final int MAX_HEIGHT = OBSTACLE_GRID.length;
        if (MAX_HEIGHT == 0)
            return 0;
        else {
            final int MAX_WIDTH = OBSTACLE_GRID[0].length;
            if (MAX_WIDTH == 0)
                return 0;
            else {
                final int[] PATH_COUNT = new int[MAX_WIDTH];
                PATH_COUNT[0] = OBSTACLE_GRID[0][0] == 0
                        ? 1
                        : 0;
                for (final int[] ROW : OBSTACLE_GRID)
                    for (int column = 0; column < MAX_WIDTH; column++)
                        if (ROW[column] == 1)
                            PATH_COUNT[column] = 0;
                        else if (column > 0)
                            PATH_COUNT[column] += PATH_COUNT[column - 1];
                return PATH_COUNT[MAX_WIDTH - 1];
            }
        }
    }*/
}