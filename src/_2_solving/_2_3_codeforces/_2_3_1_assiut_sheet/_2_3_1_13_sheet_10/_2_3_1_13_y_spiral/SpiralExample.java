package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_13_sheet_10._2_3_1_13_y_spiral;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * <h1>Y. Spiral</h1>
 * <h2>
 * time limit per test: 5 second
 * <br/>
 * memory limit per test: 256 megabytes
 * <br/>
 * input: standard input
 * <br/>
 * output: standard output
 * </h2>
 * <br/>
 * <h1>Question:</h1>
 * <h2>
 * Given an n * m matrix.
 * <br/>
 * Print all it's elements in spiral order.
 * <br/>
 * See the figure below for more clarification.
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 4 4
 * <br/>
 * 1 2 3 4
 * <br/>
 * 12 13 14 5
 * <br/>
 * 11 16 15 6
 * <br/>
 * 10 9 8 7
 * </h2>
 * <h1>Output:</h1>
 * <h2>1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 </h2>
 *
 * @see _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_13_sheet_10._2_3_1_13_x_strange_addition.images <h2>Figture</h2>
 */

public class SpiralExample {
    private static short rows,
            columns;
    private static long[][] matrix;

    public static void main(final String[] ARGS) throws IOException {
        inputMatrixAsSpiralSort();
        printSpiralOrder();
    }

    private static void printSpiralOrder() throws IOException {
        final BufferedWriter OUTPUT = new BufferedWriter(new OutputStreamWriter(System.out));
        short row = 0,
                column = 0;
        while (row < rows && column < columns) {
            for (short index = column; index < columns; index++)
                OUTPUT.write(matrix[row][index] + " ");
            row++;
            for (short index = row; index < rows; index++)
                OUTPUT.write(matrix[index][columns - 1] + " ");
            columns--;
            if (row < rows) {
                for (short index = (short) (columns - 1); index >= column; index--)
                    OUTPUT.write(matrix[rows - 1][index] + " ");
                rows--;
            }
            if (column < columns) {
                for (short index = (short) (rows - 1); index >= row; index--)
                    OUTPUT.write(matrix[index][column] + " ");
                column++;
            }
        }
        OUTPUT.flush();
    }

    private static void inputMatrixAsSpiralSort() throws IOException {
        final BufferedReader INPUT = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer line = new StringTokenizer(INPUT.readLine());
        rows = Short.parseShort(line.nextToken());
        columns = Short.parseShort(line.nextToken());
        matrix = new long[rows][columns];
        for (short row = 0; row < rows; row++) {
            line = new StringTokenizer(INPUT.readLine());
            for (short column = 0; column < columns; column++)
                matrix[row][column] = Long.parseLong(line.nextToken());
        }
    }
}