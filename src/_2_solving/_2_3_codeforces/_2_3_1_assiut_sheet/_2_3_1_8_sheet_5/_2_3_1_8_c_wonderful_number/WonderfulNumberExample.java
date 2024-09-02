package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_8_sheet_5._2_3_1_8_c_wonderful_number;

import java.util.Scanner;

/**
 * <h1>C. Wonderful Number</h1>
 * <h2>
 * time limit per test: 1 second
 * <br/>
 * memory limit per test: 64 megabytes
 * <br/>
 * input: standard input
 * <br/>
 * output: standard output
 * </h2>
 * <br/>
 * <h1>Question:</h1>
 * <h2>Given a number N. Determine whether N is wonderful or not.</h2>
 * <br/>
 * <h1>Note:</h1>
 * <ul>
 *     <li>A number is wonderful if this number is odd and its binary representation is palindrome.</li>
 *     <li>Solve this problem using two functions.</li>
 * </ul>
 * <br/>
 * <h1>Input:</h1>
 * <h2>3</h2>
 * <h1>Output:</h1>
 * <h2>YES</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>4</h2>
 * <h1>Output:</h1>
 * <h2>NO</h2>
 */

public class WonderfulNumberExample {
    public static void main(final String[] ARGS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(isWonderful(INPUT.nextInt()));
    }

    public static String isWonderful(int number) {
        if (number % 2 == 0) return "NO";
        final StringBuffer BINARY_NUMBER = new StringBuffer(Integer.toBinaryString(number)),
                REVERSED_TEXT = new StringBuffer(BINARY_NUMBER).reverse();
        final short MIDDLE_LENGTH = (short) (BINARY_NUMBER.length() / 2);
        return (BINARY_NUMBER.substring(0, MIDDLE_LENGTH).equals(REVERSED_TEXT.substring(0, MIDDLE_LENGTH))) ? "YES" : "NO";
    }
}