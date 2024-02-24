package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_136_question_136;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to find possible distinct paths from the top-left corner to the bottom-right corner of a given grid (m x n).</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>You can move either down or right at any point in time.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>Unique paths from top-left corner to bottom-right corner of the said grid: 3</h2>
 */
public class Question136 {
    public static int countUniquePaths(final int MAX_HEIGHT, final int MAX_WIDTH) {
        if (MAX_HEIGHT <= 0 || MAX_WIDTH <= 0) return 0;
        int[][] grid = new int[MAX_HEIGHT][MAX_WIDTH];
        for (int height = MAX_HEIGHT - 1; height >= 0; --height)
            for (int width = MAX_WIDTH - 1; width >= 0; --width)
                grid[height][width] = getPaths(grid, height, width);
        return grid[0][0];
    }

    private static int getPaths(final int[][] GRID, final int HEIGHT, final int WIDTH) {
        if (HEIGHT >= GRID.length - 1 || WIDTH >= GRID[0].length - 1) return 1;
        return GRID[HEIGHT][WIDTH + 1] + GRID[HEIGHT + 1][WIDTH];
    }

    public static void main(String[] args) {
        final int MAX_HEIGHT = 6,
                MAX_WIDTH = 6;
        System.out.println("Unique paths from top-left corner to bottom-right corner of the said grid: " + countUniquePaths(MAX_HEIGHT, MAX_WIDTH));
    }
}