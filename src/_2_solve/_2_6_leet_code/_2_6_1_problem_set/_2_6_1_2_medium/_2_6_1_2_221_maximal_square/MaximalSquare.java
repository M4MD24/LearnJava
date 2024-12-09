package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_221_maximal_square;

/**
 * <h1>Problem:</h1>
 * <h2>Given an m x n binary matrix filled with 0's and 1's, find the largest square containing only 1's and return its area.</h2>
 */

public class MaximalSquare {
    public static void main(final String[] PARAMETERS) {
        final char[][] MATRIX = {
                {'1', '0', '1', '0', '0'},
                {'1', '0', '1', '1', '1'},
                {'1', '1', '1', '1', '1'},
                {'1', '0', '0', '1', '0'}
        };
        System.out.print(maximalSquare(MATRIX));
    }

    private static int maximalSquare(final char[][] matrix) {
        final int ROWS = matrix.length;
        if (ROWS == 0)
            return 0;
        final int COLUMNS = matrix[0].length;
        if (COLUMNS == 0)
            return 0;
        else {
            final int[] MAX_SQUARE_SIDE_LENGTHS = new int[COLUMNS + 1];
            int maximumSquareSide = 0, previousDiagonalValue = 0;
            for (int currentRow = 1; currentRow <= ROWS; currentRow++)
                for (int currentColumn = 1; currentColumn <= COLUMNS; currentColumn++) {
                    final int TEMPORARY_VALUE = MAX_SQUARE_SIDE_LENGTHS[currentColumn];
                    if (matrix[currentRow - 1][currentColumn - 1] == '1') {
                        MAX_SQUARE_SIDE_LENGTHS[currentColumn] = Math.min(
                                Math.min(
                                        MAX_SQUARE_SIDE_LENGTHS[currentColumn - 1],
                                        MAX_SQUARE_SIDE_LENGTHS[currentColumn]
                                ), previousDiagonalValue
                        ) + 1;
                        maximumSquareSide = Math.max(
                                maximumSquareSide,
                                MAX_SQUARE_SIDE_LENGTHS[currentColumn]
                        );
                    } else
                        MAX_SQUARE_SIDE_LENGTHS[currentColumn] = 0;
                    previousDiagonalValue = TEMPORARY_VALUE;
                }
            return maximumSquareSide * maximumSquareSide;
        }
    }
}