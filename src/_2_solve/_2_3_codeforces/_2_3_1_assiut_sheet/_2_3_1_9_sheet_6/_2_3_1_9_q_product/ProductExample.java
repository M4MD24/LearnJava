package _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_9_sheet_6._2_3_1_9_q_product;

import java.util.Scanner;

/**
 * <h1>Q. Product</h1>
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
 * <h2>Given three numbers L,R and M. Print the product of all numbers from L to R (inclusive) module M.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>1 20 10007</h2>
 * <h1>Output:</h1>
 * <h2>8707</h2>
 */

public class ProductExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static int number1 = INPUT.nextInt(),
            number2 = INPUT.nextInt();
    private static final int NUMBER_3 = INPUT.nextInt();

    public static void main(final String[] ARGUMENTS) {
        if (number1 > number2) swap();
        System.out.print(productAndSummationOfAllFromMinimumNumberToMaximumNumberInclusive(number1, number2));
    }

    private static long productAndSummationOfAllFromMinimumNumberToMaximumNumberInclusive(final int MINIMUM_NUMBER, final int MAXIMUM_NUMBER) {
        long result = 1;
        for (int index = MINIMUM_NUMBER; index <= MAXIMUM_NUMBER; index++) {
            result *= index;
            result %= NUMBER_3;
        }
        return result;
    }

    private static void swap() {
        number1 += number2;
        number2 = number1 - number2;
        number1 -= number2;
    }
}