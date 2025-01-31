package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_130_surrounded_regions;

/**
 * <h1>Problem:</h1>
 * <h2>You are given an m x n matrix board containing letters 'X' and 'O', capture regions that are surrounded:</h2>
 * <ul>
 *     <li>Connect: A cell is connected to adjacent cells horizontally or vertically.</li>
 *     <li>Region: To form a region connect every 'O' cell.</li>
 *     <li>Surround: The region is surrounded with 'X' cells if you can connect the region with 'X' cells and none of the region cells are on the edge of the board.</li>
 * </ul>
 * <h2>A surrounded region is captured by replacing all 'O's with 'X's in the input matrix board.</h2>
 */

public class SurroundRegions {
    public static void main(final String[] ARGUMENTS) {
        final char[][] BOARD = {
                {'X', 'X', 'X', 'X'},
                {'X', 'O', 'O', 'X'},
                {'X', 'X', 'O', 'X'},
                {'X', 'O', 'X', 'X'}
        };
        solve(BOARD);
        printBoard(BOARD);
    }

    private static void printBoard(final char[][] BOARD) {
        for (final char[] ROW : BOARD) {
            for (final char ELEMENT : ROW)
                System.out.print(ELEMENT + " ");
            System.out.println();
        }
    }

    private static void solve(final char[][] BOARD) {
        if (BOARD.length != 0) {
            final int ROWS = BOARD.length,
                    COLUMNS = BOARD[0].length;
            for (int row = 0; row < ROWS; row++) {
                if (BOARD[row][0] == 'O')
                    depthFirstSearch(BOARD, row, 0);
                if (BOARD[row][COLUMNS - 1] == 'O')
                    depthFirstSearch(BOARD, row, COLUMNS - 1);
            }
            for (int column = 0; column < COLUMNS; column++) {
                if (BOARD[0][column] == 'O')
                    depthFirstSearch(BOARD, 0, column);
                if (BOARD[ROWS - 1][column] == 'O')
                    depthFirstSearch(BOARD, ROWS - 1, column);
            }
            for (int row = 0; row < ROWS; row++)
                for (int column = 0; column < COLUMNS; column++)
                    BOARD[row][column] = BOARD[row][column] == 'O'
                            ? 'X'
                            : (BOARD[row][column] == '#'
                            ? 'O'
                            : BOARD[row][column]);
            System.gc();
        }
    }

    private static void depthFirstSearch(final char[][] GRID, final int ROW, final int COLUMN) {
        if (
                ROW >= 0 &&
                        ROW < GRID.length &&
                        COLUMN >= 0 &&
                        COLUMN < GRID[0].length &&
                        GRID[ROW][COLUMN] == 'O'
        ) {
            GRID[ROW][COLUMN] = '#';
            depthFirstSearch(GRID, ROW + 1, COLUMN);
            depthFirstSearch(GRID, ROW - 1, COLUMN);
            depthFirstSearch(GRID, ROW, COLUMN + 1);
            depthFirstSearch(GRID, ROW, COLUMN - 1);
        }
    }
}