package _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_10_sheet_7._2_3_1_10_s_array_average;

import java.util.Scanner;

/**
 * <h1>S. Array Average</h1>
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
 * <h2>Given a number N and an array A of N numbers. Calculate the average of these numbers.</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>Solve this problem using recursion.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 5
 * <br/>
 * 1 2 3 4 5
 * </h2>
 * <h1>Output:</h1>
 * <h2>3.000000</h2>
 */

public class ArrayAverageExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static final byte length = INPUT.nextByte();
    private static final double[] NUMBERS = new double[length];

    public static void main(final String[] PARAMETERS) {
        inputValues(0);
        System.out.printf("%.6f", getAverage(0));
    }

    private static double sumOfNumbers = 0;

    private static double getAverage(int index) {
        if (index < length) {
            sumOfNumbers += NUMBERS[index++];
            return getAverage(index);
        } else return sumOfNumbers / length;
    }

    private static void inputValues(int index) {
        if (index < length) {
            NUMBERS[index++] = INPUT.nextInt();
            inputValues(index);
        }
    }
}