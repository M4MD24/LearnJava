package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_9_sheet_6._2_3_1_9_p_factorial_digits;

import java.util.Scanner;

/**
 * <h1>P. Factorial Digits</h1>
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
 * <h2>Given a number N. Print the number of digits of N!.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>5</h2>
 * <h1>Output:</h1>
 * <h2>Number of digits of 5! is 3</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>In the first example: 5! = 5*4*3*2*1 = 120. And 120 has 3 digits.</h2>
 */

public class FactorialDigitsExample {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        final int VALUE = INPUT.nextInt();
        System.out.printf("Number of digits of %d! is %d", VALUE, getFactorialDigitsLength(VALUE));
    }

    private static long getFactorialDigitsLength(final int TARGET_NUMBER) {
        double factorialDigitsLength = 1;
        for (int index = 2; index <= TARGET_NUMBER; index++) factorialDigitsLength += Math.log10(index);
        return (long) factorialDigitsLength;
    }
}