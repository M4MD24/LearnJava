package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_5_sheet_3._2_3_1_5_n_check_code;

import java.util.Scanner;

/**
 * <h1>N. Check Code</h1>
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
 * <h2>
 * Given two numbers A,B and a code S consisting of digits (0,1,2,...,9) and a symbol '-'.
 * <br/>
 * Determine if the code follows the following rules or not:
 * </h2>
 * <ul>
 *     <li>The position A+1 in the code is the symbol '-'.</li>
 *     <li>All other characters are one of the following digits: (0,1,2,...,9).</li>
 * </ul>
 * <br/>
 * <h1>Note:</h1>
 * <h2>First Example:The (A+1)-th character of code is '-', and the other characters are digits from '0' through '9', so it follows the format.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 3 3
 * <br/>
 * 269-665
 * </h2>
 * <h1>Output:</h1>
 * <h2>Yes</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 1 1
 * <br/>
 * 12-
 * </h2>
 * <h1>Output:</h1>
 * <h2>No</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 1 2
 * <br/>
 * 7444
 * </h2>
 * <h1>Output:</h1>
 * <h2>No</h2>
 */

public class CheckCodeExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static final byte LENGTH_1 = INPUT.nextByte(),
            LENGTH_2 = INPUT.nextByte();
    private static final String CODE = INPUT.next();

    public static void main(final String[] PARAMETERS) {
        checkCode();
    }

    private static void checkCode() {
        if (CODE.lastIndexOf('-') != -1) {
            final byte INDEX_OF_HYPHEN = (byte) CODE.lastIndexOf('-'),
                    NUMBERS_LENGTH_1 = (byte) CODE.substring(0, INDEX_OF_HYPHEN).length(),
                    NUMBERS_LENGTH_2 = (byte) CODE.substring(INDEX_OF_HYPHEN + 1).length();
            if (NUMBERS_LENGTH_1 == LENGTH_1 &&
                    NUMBERS_LENGTH_2 == LENGTH_2) System.out.print("Yes");
            else System.out.print("No");
        } else System.out.print("No");
    }
}