package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_73_set_matrix_zeroes;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
 * <br/>
 * You must do it in place.
 * </h2>
 */

public class SetMatrixZeroes {
    public static void main(final String[] PARAMETERS) {
        final int[][] MATRIX = {
                {1, 2, 0},
                {4, 5, 6},
                {7, 8, 9}
        };
        setZeros(MATRIX);
        System.out.print(Arrays.deepToString(MATRIX));
    }

    private static void setZeros(final int[][] MATRIX) {
        final int ROWS = MATRIX.length,
                COLUMN = MATRIX[0].length;
        boolean columnZero = false;
        for (int row = 0; row < ROWS; row++) {
            if (MATRIX[row][0] == 0)
                columnZero = true;
            for (int column = 1; column < COLUMN; column++)
                if (MATRIX[row][column] == 0)
                    MATRIX[row][0] = MATRIX[0][column] = 0;
        }
        for (int row = 1; row < ROWS; row++)
            for (int column = 1; column < COLUMN; column++)
                if (MATRIX[row][0] == 0 || MATRIX[0][column] == 0)
                    MATRIX[row][column] = 0;
        if (MATRIX[0][0] == 0)
            for (int column = 0; column < COLUMN; column++)
                MATRIX[0][column] = 0;
        if (columnZero)
            for (int row = 0; row < ROWS; row++)
                MATRIX[row][0] = 0;
    }
}