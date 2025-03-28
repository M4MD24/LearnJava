package _2_solve._2_7_hacker_rank._2_7_1_java._2_7_1_31_2d_array;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * @see _2_solve._2_7_hacker_rank._2_7_1_java._2_7_1_31_2d_array.files <h2>Question</h2>
 */

public class TwoDimensionalArray {
    public static void main(final String[] ARGUMENTS) throws IOException {
        final BufferedReader INPUT = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter OUTPUT = new BufferedWriter(new OutputStreamWriter(System.out));
        final int[][] MATRIX = new int[6][6];
        for (int row = 0; row < 6; row++) {
            final String[] LINE = INPUT.readLine().split(" ");
            for (int column = 0; column < 6; column++)
                MATRIX[row][column] = Integer.parseInt(LINE[column]);
        }
        int maximumSum = Integer.MIN_VALUE;
        for (int row = 1; row < 5; row++)
            for (int column = 1; column < 5; column++) {
                final int CURRENT_SUM = MATRIX[row - 1][column - 1] + MATRIX[row - 1][column] + MATRIX[row - 1][column + 1]
                        + MATRIX[row][column]
                        + MATRIX[row + 1][column - 1] + MATRIX[row + 1][column] + MATRIX[row + 1][column + 1];
                if (CURRENT_SUM > maximumSum)
                    maximumSum = CURRENT_SUM;
            }
        OUTPUT.write(maximumSum + "");
        OUTPUT.flush();
    }
}