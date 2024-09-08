package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_8_sheet_5._2_3_1_8_h_n_times;

import java.util.Scanner;

/**
 * <h1>H. N Times</h1>
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
 * <h2>Given a number N and a character C. Print the CHARACTER(C) N times.</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>Solve this problem using function and don't use built-in function.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 2
 * <br/>
 * 1 n
 * <br/>
 * 5 O
 * </h2>
 * <h1>Output:</h1>
 * <h2>
 * n
 * <br/
 * O O O O O
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 1
 * <br/>
 * 8 z
 * </h2>
 * <h1>Output:</h1>
 * <h2>z z z z z z z z</h2>
 */

public class NTimesExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static byte countOfTestCases = INPUT.nextByte();

    public static void main(final String[] PARAMETERS) {
        inputValues();
    }

    private static void inputValues() {
        while (countOfTestCases > 0) {
            repeat(INPUT.nextByte(), INPUT.next().charAt(0));
            if (countOfTestCases-- > 1) System.out.println();
        }
    }

    private static void repeat(byte length, final char CHARACTER) {
        while (length > 0) {
            System.out.print(CHARACTER);
            if (length-- > 1) System.out.print(" ");
        }
    }
}