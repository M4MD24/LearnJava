package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_1_basics._2_2_1_1_1_part_1._2_2_1_1_1_137;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to find possible unique paths considering some obstacles, from top-left corner to bottom-right corner of a given grid (m x n).</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>
 * You can move either down or right at any point in time and an obstacle and empty space is marked as 1 and 0 respectively in the grid.
 * <br/>
 * int[][] obstacle_Grid ={
 * <br/>
 * {0, 0, 0},
 * <br/>
 * {0, 1, 0},
 * <br/>
 * {0, 0, 0},
 * <br/>
 * };
 * </h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>Unique paths from top-left corner to bottom-right corner of the said grid (considering some obstacles): 4</h2>
 */
public class Question137 {
    public static int possibleUniquePaths(final int[][] OBSTACLE_GRID) {
        final int MAX_HEIGHT = OBSTACLE_GRID.length;
        if (MAX_HEIGHT == 0)
            return 0;
        final int MAX_WIDTH = OBSTACLE_GRID[0].length;
        if (MAX_WIDTH == 0)
            return 0;
        final int[][] UNIQUE_PATHS = new int[MAX_HEIGHT + 1][MAX_WIDTH + 1];
        UNIQUE_PATHS[MAX_HEIGHT][MAX_WIDTH - 1] = 1;
        for (int height = MAX_HEIGHT - 1; height >= 0; --height)
            for (int width = MAX_WIDTH - 1; width >= 0; --width)
                UNIQUE_PATHS[height][width] = (OBSTACLE_GRID[height][width] == 0)
                        ? UNIQUE_PATHS[height + 1][width] + UNIQUE_PATHS[height][width + 1]
                        : 0;
        return UNIQUE_PATHS[0][0];
    }

    public static void main(final String[] ARGUMENTS) {
        int[][] obstacle_Grid = {
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0},
        };
        System.out.println("Unique paths from top-left corner to bottom-right corner of the said grid (considering some obstacles): " + possibleUniquePaths(obstacle_Grid));
    }
}