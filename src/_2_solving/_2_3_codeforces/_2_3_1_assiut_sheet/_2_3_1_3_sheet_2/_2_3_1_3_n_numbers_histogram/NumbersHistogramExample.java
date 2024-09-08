package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_3_sheet_2._2_3_1_3_n_numbers_histogram;

import java.util.Scanner;

/**
 * <h1>N. Numbers Histogram</h1>
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
 * <h1>Question:</h1>
 * <h2>Given 3 lines of input described as follow:</h2>
 * <ol>
 *     <li>First line contains a symbol S</li>
 *     <li>Second line contains a number N</li>
 *     <li>Third line contains N numbers.</li>
 * </ol>
 * <h2>For each number X^i in the N numbers print a new line that contains the symbol S repeated X^i time.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * +
 * <br/>
 * 5
 * <br/>
 * 5 2 4 3 7
 * </h2>
 * <h1>Output:</h1>
 * <h2>
 * +++++
 * <br/>
 * ++
 * <br/>
 * ++++
 * <br/>
 * +++
 * <br/>
 * +++++++
 * </h2>
 */

public class NumbersHistogramExample {
    private static final Scanner INPUT = new Scanner(System.in);

    public static void main(final String[] PARAMETERS) {
        final char SYMBOL = INPUT.next().charAt(0);
        final int LENGTH = INPUT.nextInt();
        inputValues(SYMBOL, LENGTH);
    }

    private static void inputValues(final char SYMBOL, final int LENGTH) {
        for (int index = 0; index < LENGTH; index++) {
            int NUMBER = INPUT.nextInt();
            while (NUMBER-- > 0) System.out.print(SYMBOL);
            if (index != LENGTH - 1) System.out.println();
        }
    }
}