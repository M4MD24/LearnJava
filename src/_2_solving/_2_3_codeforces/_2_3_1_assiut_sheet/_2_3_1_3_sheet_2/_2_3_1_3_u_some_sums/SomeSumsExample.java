package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_3_sheet_2._2_3_1_3_u_some_sums;

import java.util.Scanner;

/**
 * <h1>U. Some Sums</h1>
 * <h2>
 * time limit per test: 2 second
 * <br/>
 * memory limit per test: 256 megabytes
 * <br/>
 * input: standard input
 * <br/>
 * output: standard output
 * </h2>
 * <br/>
 * <h1>Problem:</h1>
 * <h2>Given three numbers N, A, B. Print the summation of the numbers between 1 and N whose sum of digits is between A and B inclusive.</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>
 * In the first simple:
 * <br/>
 * Among the numbers not greater than 20, the numbers whose sums of digits are between 2 and 5, are: 2,3,4,5,11,12,13,14 and 20.
 * <br/>
 * So the answer is: 84.
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>20 2 5</h2>
 * <h1>Output:</h1>
 * <h2>84</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>10 1 2</h2>
 * <h1>Output:</h1>
 * <h2>13</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>100 4 16</h2>
 * <h1>Output:</h1>
 * <h2>4554</h2>
 */

public class SomeSumsExample {
    private static final Scanner INPUT = new Scanner(System.in);

    public static void main(final String[] PARAMETERS) {
        final int NUMBER_1 = INPUT.nextInt(),
                NUMBER_2 = INPUT.nextInt(),
                NUMBER_3 = INPUT.nextInt();
        calculateSummationOfTheNumbersBetweenNumbers(NUMBER_1, NUMBER_2, NUMBER_3);
    }

    private static void calculateSummationOfTheNumbersBetweenNumbers(final int NUMBER_1, final int NUMBER_2, final int NUMBER_3) {
        int totalSum = 0;
        for (int number = 1; number <= NUMBER_1; number++) {
            int digitSum = calculateDigitSum(number);
            if (digitSum >= NUMBER_2 && digitSum <= NUMBER_3) totalSum += number;
        }
        System.out.println(totalSum);
    }

    private static int calculateDigitSum(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}