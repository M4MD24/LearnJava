package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_1_sheet_1._2_3_1_1_y_the_last_2_digits;

import java.util.Scanner;

/**
 * <h1>Y. The last 2 digits</h1>
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
 * <h2>
 * Given 4 numbers A, B, C and D.
 * <br/>
 * Print the last 2 digits from their Multiplication.
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>5 7 2 4</h2>
 * <h1>Output:</h1>
 * <h2>80</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>3 9 9 9</h2>
 * <h1>Output:</h1>
 * <h2>87</h2>
 */

public class TheLast2DigitsExample {
    private static final Scanner INPUT = new Scanner(System.in);

    public static void main(final String[] PARAMETERS) {
        final long NUMBER_1 = Integer.parseInt(INPUT.next()),
                NUMBER_2 = Integer.parseInt(INPUT.next()),
                NUMBER_3 = Integer.parseInt(INPUT.next()),
                NUMBER_4 = Integer.parseInt(INPUT.next());
        final long RESULT = multiplication4Numbers(NUMBER_1, NUMBER_2, NUMBER_3, NUMBER_4);
        System.out.print(getLast2Digits(RESULT));
    }

    private static long multiplication4Numbers(final long NUMBER_1, final long NUMBER_2, final long NUMBER_3, final long NUMBER_4) {
        return (NUMBER_1 % 100) * (NUMBER_2 % 100) * (NUMBER_3 % 100) * (NUMBER_4 % 100);
    }

    private static String getLast2Digits(long result) {
        return String.valueOf(result % 100 / 10) + result % 10;
    }
}