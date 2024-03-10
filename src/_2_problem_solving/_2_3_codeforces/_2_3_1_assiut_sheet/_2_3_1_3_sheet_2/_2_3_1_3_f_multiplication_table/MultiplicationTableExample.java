package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_3_sheet_2._2_3_1_3_f_multiplication_table;

import java.util.Scanner;

/**
 * <h1>F. Multiplication table</h1>
 * <h2>
 * time limit per test: 1 second
 * <br/>
 * memory limit per test: 64 megabytes
 * <br/>
 * input: standard input
 * <br/>
 * output: standard output
 * </h2>
 * <br/>
 * <h1>Question:</h1>
 * <h2>Given a number N. Print the multiplication table of the number from 1 to 12</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>1<h2/>
 * <h1>Output:</h1>
 * <h2>
 * 1 * 1 = 1
 * <br/>
 * 1 * 2 = 2
 * <br/>
 * 1 * 3 = 3
 * <br/>
 * 1 * 4 = 4
 * <br/>
 * 1 * 5 = 5
 * <br/>
 * 1 * 6 = 6
 * <br/>
 * 1 * 7 = 7
 * <br/>
 * 1 * 8 = 8
 * <br/>
 * 1 * 9 = 9
 * <br/>
 * 1 * 10 = 10
 * <br/>
 * 1 * 11 = 11
 * <br/>
 * 1 * 12 = 12
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>2<h2/>
 * <h1>Output:</h1>
 * <h2>
 * 2 * 1 = 1
 * <br/>
 * 2 * 2 = 2
 * <br/>
 * 2 * 3 = 3
 * <br/>
 * 2 * 4 = 4
 * <br/>
 * 2 * 5 = 5
 * <br/>
 * 2 * 6 = 6
 * <br/>
 * 2 * 7 = 7
 * <br/>
 * 2 * 8 = 8
 * <br/>
 * 2 * 9 = 9
 * <br/>
 * 2 * 10 = 10
 * <br/>
 * 2 * 11 = 11
 * <br/>
 * 2 * 12 = 12
 * </h2>
 */

public class MultiplicationTableExample {
    private static final Scanner INPUT = new Scanner(System.in);

    public static void main(String[] args) {
        final int FIRST_NUMBER = INPUT.nextByte();
        printMultiplicationTable(FIRST_NUMBER);
    }

    private static void printMultiplicationTable(final int FIRST_NUMBER) {
        for (byte secondNumber = 1; secondNumber < 13; secondNumber++) {
            System.out.print(FIRST_NUMBER + " * " + secondNumber + " = " + (FIRST_NUMBER * secondNumber));
            if (secondNumber != 12) System.out.println();
        }
    }
}