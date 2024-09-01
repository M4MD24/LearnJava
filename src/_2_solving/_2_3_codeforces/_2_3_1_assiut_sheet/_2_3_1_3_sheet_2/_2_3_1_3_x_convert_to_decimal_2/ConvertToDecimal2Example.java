package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_3_sheet_2._2_3_1_3_x_convert_to_decimal_2;

import java.util.Scanner;

/**
 * <h1>X. Convert To Decimal 2</h1>
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
 * <h2>Given a number N. Print the result of doing the following operation on N:</h2>
 * <ul>
 *     <li>Convert N to its binary representation.</li>
 *     <li>Count number of ones in the above binary representation.</li>
 *     <li>Print the equivalent decimal number that its binary representation has only the number of ones that were counted above.</li>
 * </ul>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 3
 * <br/>
 * 10
 * <br/>
 * 7
 * <br/>
 * 8
 * </h2>
 * <h1>Output:</h1>
 * <h2>
 * 3
 * <br/>
 * 7
 * <br/>
 * 1
 * </h2>
 */

public class ConvertToDecimal2Example {
    final static Scanner INPUT = new Scanner(System.in);

    public static void main(final String[] ARGS) {
        final int LENGTH = INPUT.nextInt();
        processDecimalNumbers(LENGTH);
    }

    private static void processDecimalNumbers(final int LENGTH) {
        for (int index = 0; index < LENGTH; index++) {
            final int DECIMAL_NUMBER = INPUT.nextInt();
            processSingleDecimalNumber(DECIMAL_NUMBER);
        }
    }

    private static void processSingleDecimalNumber(int decimalNumber) {
        final String BINARY_REPRESENTATION = Integer.toBinaryString(decimalNumber);
        final int ONES_COUNT = countOnes(BINARY_REPRESENTATION),
                RESULT_CONVERT_TO_DECIMAL_WITH_ONES = convertToDecimalWithOnes(ONES_COUNT);
        System.out.println(RESULT_CONVERT_TO_DECIMAL_WITH_ONES);
    }

    private static int countOnes(String binary) {
        int count = 0;
        for (char digit : binary.toCharArray())
            if (digit == '1') count++;
        return count;
    }

    private static int convertToDecimalWithOnes(final int count) {
        final String ONES_BINARY = "1".repeat(count);
        return Integer.parseInt(ONES_BINARY, 2);
    }
}