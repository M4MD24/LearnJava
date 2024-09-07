package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_8_sheet_5._2_3_1_8_d_prime_function;

import java.util.Scanner;

/**
 * <h1>D. Wonderful Number</h1>
 * <h2>
 * time limit per test: 2 second
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
 * A prime number is a number that is greater than 1 and has only two factors which are 1 and itself. The first few prime numbers are 2, 3, 5, 7, 11, 13, 17, 19, 23 and 29.
 * <br/>
 * Given a number N. Determine whether N is prime or not.
 * </h2>
 * <br/>
 * <h1>Note:</h1>
 * <ul>
 *     <li>Solve this problem using function.</li>
 *     <li>Don't use an array.</li>
 * </ul>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 3
 * <br/>
 * 2
 * <br/>
 * 4
 * <br/>
 * 8
 * </h2>
 * <h1>Output:</h1>
 * <h2>
 * YES
 * <br/>
 * NO
 * <br/>
 * NO
 * </h2>
 */

public class PrimeFunctionExample {
    private static final Scanner INPUT = new Scanner(System.in);

    public static void main(final String[] PARAMETERS) {
        short coutnOfTestCases = INPUT.nextShort();
        while (coutnOfTestCases > 0) {
            System.out.print(isPrime(INPUT.nextInt()));
            if (coutnOfTestCases-- > 1) System.out.println();
        }
    }

    private static String isPrime(final int NUMBER) {
        if (NUMBER == 1) return "NO";
        for (int index = 2; index <= Math.sqrt(NUMBER); index++)
            if (NUMBER % index == 0)
                return "NO";
        return "YES";
    }
}