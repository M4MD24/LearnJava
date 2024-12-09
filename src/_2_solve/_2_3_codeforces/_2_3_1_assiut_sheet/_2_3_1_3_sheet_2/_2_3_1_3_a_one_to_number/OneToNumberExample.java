package _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_3_sheet_2._2_3_1_3_a_one_to_number;

import java.util.Scanner;

/**
 * <h1>A. One to Number</h1>
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
 * <h2>Given a number N. Print numbers from 1 to N in separate lines.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>5</h2>
 * <h1>Output:</h1>
 * <h2>
 * 1
 * <br/>
 * 2
 * <br/>
 * 3
 * <br/>
 * 4
 * <br/>
 * 5
 * </h2>
 */

public class OneToNumberExample {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        printToNumber(INPUT.nextInt());
    }

    private static void printToNumber(final int NUMBER) {
        for (int index = 1; index <= NUMBER; index++) {
            System.out.print(index);
            if (index != NUMBER) System.out.println();
        }
    }
}