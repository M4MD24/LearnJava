package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_8_sheet_5._2_3_1_8_j_average;

import java.util.Scanner;

/**
 * <h1>J. Average</h1>
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
 * <h2>Given an array A of size N. Print the average(mean) of the array numbers.</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>Solve this problem using function</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 3
 * <br/>
 * 1.0 2.0 5.0
 * </h2>
 * <h1>Output:</h1>
 * <h2>2.6666667</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 4
 * <br/>
 * 1.0 7.0 4.0 9.0
 * </h2>
 * <h1>Output:</h1>
 * <h2>5.2500000</h2>
 */

public class AverageExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static final short LENGTH = INPUT.nextShort();

    public static void main(String[] args) {
        System.out.print(inputValuesAndPrintAverage());
    }

    private static String inputValuesAndPrintAverage() {
        double sum = 0;
        for (short index = 0; index < LENGTH; index++) sum += INPUT.nextDouble();
        return String.format("%.7f", sum / LENGTH);
    }
}