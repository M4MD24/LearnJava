package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_9_data_structures._2_2_1_9_1_array._2_2_1_9_1_19;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to add two matrices of the same size.</h2>
 */

public class Question19 {
    public static void main(final String[] ARGUMENTS) {
        final int[][] FIRST_MATRIX = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };
        final int[][] SECOND_MATRIX = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };
        printResultOfTwoMatricesOfTheSameSize(FIRST_MATRIX, SECOND_MATRIX);
    }

    private static void printResultOfTwoMatricesOfTheSameSize(final int[][] FIRST_MATRIX, final int[][] SECOND_MATRIX) {
        for (final int[] ROWS : getTwoMatricesOfTheSameSize(FIRST_MATRIX, SECOND_MATRIX)) {
            for (final int NUMBER : ROWS)
                System.out.print(NUMBER + " ");
            System.out.println();
        }
    }

    private static int[][] getTwoMatricesOfTheSameSize(final int[][] FIRST_MATRIX, final int[][] SECOND_MATRIX) {
        final int[][] RESULT_OF_ADD_TWO_MATRICES = new int[FIRST_MATRIX.length][SECOND_MATRIX[0].length];
        for (int row = 0; row < FIRST_MATRIX.length; row++)
            for (int column = 0; column < SECOND_MATRIX[row].length; column++)
                RESULT_OF_ADD_TWO_MATRICES[row][column] = FIRST_MATRIX[row][column] + SECOND_MATRIX[row][column];
        return RESULT_OF_ADD_TWO_MATRICES;
    }
}