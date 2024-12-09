package _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_8_sheet_5._2_3_1_8_i_swapping_with_matrix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * <h1>I. Swapping with Matrix</h1>
 * <h2>
 * time limit per test: 1 second
 * <br/>
 * memory limit per test: 256 megabytes
 * <br/>
 * input: standard input
 * <br/>
 * output: standard output
 * </h2>
 * <br/>
 * <h1>Problem:</h1>
 * <h2>Given a matrix A of size N∗N. Print the Matrix after doing the following operations:</h2>
 * <ol>
 *     <li>swap row X with row Y.</li>
 *     <li>swap column X with column Y.</li>
 * </ol>
 * <br/>
 * <h1>Note:</h1>
 * <h2>Solve this problem using function and don't use built-in function.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 4 3 1
 * <br/>
 * 1 2 3 -5
 * <br/>
 * -5 4 0 3
 * <br/>
 * 7 7 1 2
 * <br/>
 * 40 6 5 11
 * </h2>
 * <h1>Output:</h1>
 * <h2>
 * 1 7 7 2
 * <br/>
 * 0 4 -5 3
 * <br/>
 * 3 2 1 -5
 * <br/>
 * 5 6 40 11
 * </h2>
 */

public class SwappingWithMatrixExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static final short TWO_DIMENSIONAL_LENGTH,
            NUMBER_1,
            NUMBER_2;

    static {
        try {
            TWO_DIMENSIONAL_LENGTH = INPUT.nextShort();
            NUMBER_1 = (short) (INPUT.nextShort() - 1);
            NUMBER_2 = (short) (INPUT.nextShort() - 1);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static final short[][] MATRIX_ARRAY = new short[TWO_DIMENSIONAL_LENGTH][TWO_DIMENSIONAL_LENGTH];

    public static void main(final String[] PARAMETERS) throws Exception {
        inputValues();
        swapRows();
        printValues();
    }

    private static void printValues() {
        for (short row = 0; row < TWO_DIMENSIONAL_LENGTH; row++) {
            for (short colum = 0; colum < TWO_DIMENSIONAL_LENGTH; colum++)
                System.out.print(MATRIX_ARRAY[row][colum] + " ");
            System.out.println();
        }
    }

    private static void inputValues() throws IOException {
        for (short row = 0; row < TWO_DIMENSIONAL_LENGTH; row++) {
            for (short colum = 0; colum < TWO_DIMENSIONAL_LENGTH; colum++)
                MATRIX_ARRAY[row][colum] = INPUT.nextShort();
            swapColumns(row);
        }
    }

    private static void swapColumns(final short ROW) {
        MATRIX_ARRAY[ROW][NUMBER_1] += MATRIX_ARRAY[ROW][NUMBER_2];
        MATRIX_ARRAY[ROW][NUMBER_2] = (short) (MATRIX_ARRAY[ROW][NUMBER_1] - MATRIX_ARRAY[ROW][NUMBER_2]);
        MATRIX_ARRAY[ROW][NUMBER_1] -= MATRIX_ARRAY[ROW][NUMBER_2];
    }

    public static void swapRows() {
        final short[] TEMPORARY_ARRAY = MATRIX_ARRAY[NUMBER_1];
        MATRIX_ARRAY[NUMBER_1] = MATRIX_ARRAY[NUMBER_2];
        MATRIX_ARRAY[NUMBER_2] = TEMPORARY_ARRAY;
    }

    private static class Scanner {
        StringTokenizer stringTokenizer;
        final BufferedReader INPUT;

        public Scanner(final InputStream INPUT_STREAM) {
            INPUT = new BufferedReader(new InputStreamReader(INPUT_STREAM));
        }

        public StringBuffer next() throws IOException {
            while (stringTokenizer == null || !stringTokenizer.hasMoreTokens())
                stringTokenizer = new StringTokenizer(INPUT.readLine());
            return new StringBuffer(stringTokenizer.nextToken());
        }

        public short nextShort() throws IOException {
            return Short.parseShort(String.valueOf(next()));
        }
    }
}