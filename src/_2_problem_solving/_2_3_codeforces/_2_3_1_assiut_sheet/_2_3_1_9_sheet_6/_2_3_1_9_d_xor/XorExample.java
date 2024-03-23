package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_9_sheet_6._2_3_1_9_d_xor;

import java.util.Scanner;

/**
 * <h1>D. Xor</h1>
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
 * <h2>Given three numbers A, B and Q. Determine the value of the Qth element using the formula below</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>5 3 1</h2>
 * <h1>Output:</h1>
 * <h2>5</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>5 3 2</h2>
 * <h1>Output:</h1>
 * <h2>3</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>5 3 3</h2>
 * <h1>Output:</h1>
 * <h2>6</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>
 * In Java to use xor operator you may write:
 * <br/>
 * int x = a ^ b;
 * <br/>
 * but if you need to print a ^ b, you should write
 * <br/>
 * System.out.print(a ^ b);
 * </h2>
 *
 * @see _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_9_sheet_6._2_3_1_9_d_xor.images <h2>Formula</h2>
 */

public class XorExample {
    public static void main(String[] args) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(getXorResult(INPUT.nextLong(), INPUT.nextLong(), INPUT.nextLong()));
    }

    private static long getXorResult(final long NUMBER_1, final long NUMBER_2, final long NUMBER_3) {
        long RESULT_OF_NUMBER_3 = NUMBER_3 % 3;
        if (RESULT_OF_NUMBER_3 == 1) return NUMBER_1;
        else if (RESULT_OF_NUMBER_3 == 2) return NUMBER_2;
        else return NUMBER_1 ^ NUMBER_2;
    }
}