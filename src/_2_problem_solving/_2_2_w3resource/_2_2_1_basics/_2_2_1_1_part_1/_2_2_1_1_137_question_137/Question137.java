package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_137_question_137;

/**
 * <h1>Question:?</h1>
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
    public static int countPaths(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        // If the starting cell is an obstacle, return 0.
        if (grid[0][0] == 1) {
            return 0;
        }

        // Create a 2D array to store the number of paths to each cell.
        int[][] dp = new int[m][n];

        // Initialize the first row and column.
        for (int i = 0; i < m; i++) {
            dp[i][0] = (grid[i][0] == 0) ? 1 : 0;
        }
        for (int j = 0; j < n; j++) {
            dp[0][j] = (grid[0][j] == 0) ? 1 : 0;
        }

        // Fill the dp table using dynamic programming.
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (grid[i][j] == 0) {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }

        // Return the number of paths to the bottom-right corner.
        return dp[m - 1][n - 1];
    }

    public static void main(String[] args) {
        int[][] obstacleGrid = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        int uniquePaths = countPaths(obstacleGrid);
        System.out.println("Unique paths from top-left corner to bottom-right corner of the grid: " + uniquePaths);
    }
}