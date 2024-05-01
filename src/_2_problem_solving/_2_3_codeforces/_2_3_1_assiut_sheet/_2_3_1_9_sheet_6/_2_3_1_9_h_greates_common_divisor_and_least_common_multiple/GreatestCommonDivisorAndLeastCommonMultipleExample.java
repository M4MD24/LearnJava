package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_9_sheet_6._2_3_1_9_h_greates_common_divisor_and_least_common_multiple;

import java.util.Scanner;

/**
 * <h1>H. Greatest Common Divisor and Least Common Multiple</h1>
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
 * <h2>Given two numbers A and B. Print the GCD and LCM of A and B.</h2>
 * <br/>
 * <h1>Note:</h1>
 * <ul>
 *     <li>GCD is the greatest common divisor of A and B.</li>
 *     <li>LCM is the least common multiple of A and B.</li>
 * </ul>
 * <br/>
 * <h1>Input:</h1>
 * <h2>12 18</h2>
 * <h1>Output:</h1>
 * <h2>6 36</h2>
 */

public class GreatestCommonDivisorAndLeastCommonMultipleExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static long greatestCommonDivisor,
            leastCommonMultiple;

    public static void main(final String[] ARGS) {
        inputValues();
        System.out.print(greatestCommonDivisor + " " + leastCommonMultiple);
    }

    private static void inputValues() {
        final long NUMBER_1 = INPUT.nextLong(),
                NUMBER_2 = INPUT.nextLong();
        greatestCommonDivisor = getGreatestCommonDivisor(NUMBER_1, NUMBER_2);
        leastCommonMultiple = getLeastCommonMultiple(NUMBER_1, NUMBER_2, greatestCommonDivisor);
    }

    public static long getGreatestCommonDivisor(long number1, long number2) {
        while (number2 != 0) {
            number1 += number2;
            number2 = number1 - number2;
            number1 -= number2;
            number2 %= number1;
        }
        return number1;
    }

    public static long getLeastCommonMultiple(final long NUMBER_1, final long NUMBER_2, final long GCD) {
        return (NUMBER_1 / GCD) * NUMBER_2;
    }
}