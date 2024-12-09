package _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_7_sheet_4._2_3_1_7_e_count;

import java.util.Scanner;

/**
 * <h1>E. Count</h1>
 * <h2>
 * time limit per test: 2 second
 * <br/>
 * memory limit per test: 64 megabytes
 * <br/>
 * input: standard input
 * <br/>
 * output: standard output
 * </h2>
 * <br/>
 * <h1>Problem:</h1>
 * <h2>Given a string S. Print the summation of its digits.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>351</h2>
 * <h1>Output:</h1>
 * <h2>9</h2>
 */

public class CountExample {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        final String TEXT = INPUT.next();
        System.out.print(sum(TEXT));
    }

    private static int sum(final String TEXT) {
        int sum = 0;
        for (int character : TEXT.toCharArray()) sum += character - '0';
        return sum;
    }
}