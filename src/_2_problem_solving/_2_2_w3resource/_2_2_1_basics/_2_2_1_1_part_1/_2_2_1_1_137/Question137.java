package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_137;

/**
 * <h1>Question:</h1>
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
    public static int possibleUniquePaths(int[][] obstacle_Grid) {
        final int MAX_HEIGHT = obstacle_Grid.length;
        if (MAX_HEIGHT == 0) return 0;
        final int MAX_WIDTH = obstacle_Grid[0].length;
        if (MAX_WIDTH == 0) return 0;

        int[][] uniquePaths = new int[MAX_HEIGHT + 1][MAX_WIDTH + 1];
        uniquePaths[MAX_HEIGHT][MAX_WIDTH - 1] = 1;

        for (int height = MAX_HEIGHT - 1; height >= 0; --height)
            for (int width = MAX_WIDTH - 1; width >= 0; --width)
                uniquePaths[height][width] = (obstacle_Grid[height][width] == 0) ? uniquePaths[height + 1][width] + uniquePaths[height][width + 1] : 0;

        return uniquePaths[0][0];
    }

    public static void main(final String[] ARGS) {
        int[][] obstacle_Grid = {
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0},
        };
        System.out.println("Unique paths from top-left corner to bottom-right corner of the said grid (considering some obstacles): " + possibleUniquePaths(obstacle_Grid));
    }
}