package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_48_rotate_image;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>
 * You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
 * <br/>
 * You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.
 * </h2>
 */

public class RotateImage {
    public static void main(final String[] PARAMETERS) {
        final int[][] MATRIX = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        rotate(MATRIX);
        System.out.print(Arrays.deepToString(MATRIX));
    }

    private static void rotate(final int[][] MATRIX) {
        final int DIMENSIONS_LENGTH = MATRIX.length;
        for (int row = 0; row < DIMENSIONS_LENGTH / 2; row++)
            for (int column = row; column < DIMENSIONS_LENGTH - row - 1; column++) {
                final int TEMPORARY_ELEMENT = MATRIX[row][column];
                MATRIX[row][column] = MATRIX[DIMENSIONS_LENGTH - column - 1][row];
                MATRIX[DIMENSIONS_LENGTH - column - 1][row] = MATRIX[DIMENSIONS_LENGTH - row - 1][DIMENSIONS_LENGTH - column - 1];
                MATRIX[DIMENSIONS_LENGTH - row - 1][DIMENSIONS_LENGTH - column - 1] = MATRIX[column][DIMENSIONS_LENGTH - row - 1];
                MATRIX[column][DIMENSIONS_LENGTH - row - 1] = TEMPORARY_ELEMENT;
            }
    }
}