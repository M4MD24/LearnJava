package _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_1_sheet_1._2_3_1_1_f_digits_summation;

import java.util.Scanner;

/**
 * <h1>F. Digits Summation</h1>
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
 * <h1>Problem:</h1>
 * <h2>Given two numbers N and M. Print the summation of their last digits.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>13 12</h2>
 * <br/>
 * <h1>Output:</h1>
 * <h2>5</h2>
 */

public class DigitsSummationExample {
    private static final Scanner input = new Scanner(System.in);

    public static void main(final String[] PARAMETERS) {
        long number1 = Long.parseLong(input.next()),
                number2 = Long.parseLong(input.next());
        number1 %= 10;
        number2 %= 10;
        System.out.print(number1 + number2);
    }
}