package _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_10_sheet_7._2_3_1_10_d_print_digits_using_recursion;

import java.util.Scanner;

/**
 * <h1>D. Print Digits Using Recursion</h1>
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
 * <h2>Given a number N. Print the digits of N separated by a space.</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>Solve this problem using recursion.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 3
 * <br/>
 * 121
 * <br/>
 * 39
 * <br/>
 * 123456
 * </h2>
 * <h1>Output:</h1>
 * <h2>
 * 1 2 1
 * <br/>
 * 3 9
 * <br/>
 * 1 2 3 4 5 6
 * </h2>
 */

public class PrintDigitsUsingRecursionExample {
    private static final Scanner INPUT = new Scanner(System.in);

    public static void main(final String[] PARAMETERS) {
        inputValuesRecursion(INPUT.nextByte());
    }

    private static void inputValuesRecursion(byte countOfTestCases) {
        if (countOfTestCases-- > 0) {
            inputValuesRecursion(countOfTestCases);
            System.out.println(printDigitsWithSpaces(INPUT.next()));
            index = 0;
        }
    }

    private static int index = 0;

    private static String printDigitsWithSpaces(String digits) {
        if (index < digits.length()) return digits.charAt(index++) + " " + printDigitsWithSpaces(digits);
        else return "";
    }
}