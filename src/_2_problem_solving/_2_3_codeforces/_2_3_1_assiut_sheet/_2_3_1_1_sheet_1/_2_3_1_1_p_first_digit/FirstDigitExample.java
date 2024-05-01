package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_1_sheet_1._2_3_1_1_p_first_digit;

import java.util.Scanner;

/**
 * <h1>P. First Digit</h1>
 * <h2>
 * time limit per test: 0.25 second
 * <br/>
 * memory limit per test: 64 megabytes
 * <br/>
 * input: standard input
 * <br/>
 * output: standard output
 * </h2>
 * <br/>
 * <h1>Question:</h1>
 * <h2>Given a number X. Print "EVEN" if the first digit of X is even number. Otherwise print "ODD".</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>4569</h2>
 * <h1>Output:</h1>
 * <h2>EVEN</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>3569</h2>
 * <h1>Output:</h1>
 * <h2>ODD</h2>
 */

public class FirstDigitExample {
    private static final Scanner INPUT = new Scanner(System.in);

    public static void main(final String[] ARGS) {
        long number = INPUT.nextLong(),
                firstDigit = 0;
        while (number != 0) {
            firstDigit = number % 10;
            number /= 10;
        }
        System.out.print((firstDigit % 2 == 0) ? "EVEN" : "ODD");
    }
}