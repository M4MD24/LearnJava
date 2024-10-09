package _2_solving._2_6_leet_code._2_6_2_problem_set._2_6_2_2_medium._2_6_2_2_289_game_of_life;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>
 * According to Wikipedia's article: "The Game of Life, also known simply as Life, is a cellular automaton devised by the British mathematician John Horton Conway in 1970."
 * <br/>
 * The board is made up of an m x n grid of cells, where each cell has an initial state: live (represented by a 1) or dead (represented by a 0). Each cell interacts with its eight neighbors (horizontal, vertical, diagonal) using the following four rules (taken from the above Wikipedia article):
 * </h2>
 * <ol>
 * <li>Any live cell with fewer than two live neighbors dies as if caused by under-population.</li>
 * <li>Any live cell with two or three live neighbors lives on to the next generation.</li>
 * <li>Any live cell with more than three live neighbors dies, as if by over-population.</li>
 * <li>Any dead cell with exactly three live neighbors becomes a live cell, as if by reproduction.</li>
 * </ol>
 * <br/>
 * <h2>
 * The next state is created by applying the above rules simultaneously to every cell in the current state, where births and deaths occur simultaneously. Given the current state of the m x n grid board, return the next state.
 * </h2>
 */

public class GameOfLife {
    public static void main(final String[] PARAMETERS) {
        final int[][] MATRIX = {
                {0, 1, 0},
                {0, 0, 1},
                {1, 1, 1},
                {0, 0, 0}
        };
        gameOfLife(MATRIX);
        System.out.print(Arrays.deepToString(MATRIX));
    }

    private static void gameOfLife(final int[][] BOARD) {
        final int ROWS = BOARD.length,
                COLUMNS = BOARD[0].length;
        final int[][] NEXT = new int[ROWS][COLUMNS];
        for (int row = 0; row < ROWS; row++)
            for (int column = 0; column < COLUMNS; column++) {
                final int LIVE_NEIGHBORS = countLiveNeighbors(BOARD, row, column);
                NEXT[row][column] = (BOARD[row][column] == 1 && (LIVE_NEIGHBORS == 2 || LIVE_NEIGHBORS == 3))
                        ? 1
                        : (BOARD[row][column] == 0 && LIVE_NEIGHBORS == 3)
                        ? 1
                        : 0;
            }
        System.arraycopy(
                NEXT,
                0,
                BOARD,
                0,
                ROWS
        );
    }

    private static int countLiveNeighbors(final int[][] BOARD, final int ROWS, final int COLUMNS) {
        int countOfLiveNeighbors = 0;
        for (int row = Math.max(0, ROWS - 1); row <= Math.min(ROWS + 1, BOARD.length - 1); row++)
            for (int column = Math.max(0, COLUMNS - 1); column <= Math.min(COLUMNS + 1, BOARD[0].length - 1); column++)
                countOfLiveNeighbors += (row == ROWS && column == COLUMNS)
                        ? 0
                        : BOARD[row][column];
        return countOfLiveNeighbors;
    }
}