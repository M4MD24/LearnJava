package _2_solving._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_54_spiral_matrix;

import java.util.ArrayList;
import java.util.List;

/**
 * <h1>Problem:</h1>
 * <h2>Given an m x n matrix, return all elements of the matrix in spiral order.</h2>
 */

public class SpiralMatrix {
    public static void main(final String[] PARAMETERS) {
        final int[][] MATRIX = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        System.out.print(spiralOrder(MATRIX));
    }

    private static List<Integer> spiralOrder(final int[][] MATRIX) {
        int rows = MATRIX.length,
                columns = MATRIX[0].length;

        final List<Integer> MULTIPLICATIONS_RESULTS = new ArrayList<>();
        short row = 0,
                column = 0;
        while (row < rows && column < columns) {
            for (short index = column; index < columns; index++)
                MULTIPLICATIONS_RESULTS.add(MATRIX[row][index]);
            row++;
            for (short index = row; index < rows; index++)
                MULTIPLICATIONS_RESULTS.add(MATRIX[index][columns - 1]);
            columns--;
            if (row < rows) {
                for (short index = (short) (columns - 1); index >= column; index--)
                    MULTIPLICATIONS_RESULTS.add(MATRIX[rows - 1][index]);
                rows--;
            }
            if (column < columns) {
                for (short index = (short) (rows - 1); index >= row; index--)
                    MULTIPLICATIONS_RESULTS.add(MATRIX[index][column]);
                column++;
            }
        }
        return MULTIPLICATIONS_RESULTS;
    }
}