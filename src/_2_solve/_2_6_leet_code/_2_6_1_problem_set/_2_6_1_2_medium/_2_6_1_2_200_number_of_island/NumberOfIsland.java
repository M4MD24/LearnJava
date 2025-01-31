package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_200_number_of_island;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.
 * <br/>
 * <br/>
 * An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically. You may assume all four edges of the grid are all surrounded by water.
 * </h2>
 */

public class NumberOfIsland {
    public static void main(final String[] ARGUMENTS) {
        final char[][] GRID = new char[][]{
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        System.out.print(numIslands(GRID));
    }

    private static int numIslands(final char[][] GRID) {
        int count = 0;
        for (int row = 0; row < GRID.length; row++)
            for (int column = 0; column < GRID[0].length; column++)
                if (GRID[row][column] == '1') {
                    count++;
                    depthFirstSearch(GRID, row, column);
                }
        System.gc();
        return count;
    }

    private static void depthFirstSearch(final char[][] GRID, final int ROW, final int COLUMN) {
        if (
                ROW >= 0 &&
                        ROW < GRID.length &&
                        COLUMN >= 0 &&
                        COLUMN < GRID[0].length &&
                        GRID[ROW][COLUMN] != '0'
        ) {
            GRID[ROW][COLUMN] = '0';
            depthFirstSearch(GRID, ROW + 1, COLUMN);
            depthFirstSearch(GRID, ROW - 1, COLUMN);
            depthFirstSearch(GRID, ROW, COLUMN + 1);
            depthFirstSearch(GRID, ROW, COLUMN - 1);
        }
    }
}