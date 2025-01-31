package _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_3_sheet_2._2_3_1_3_l_greatest_common_divisor;

import java.util.Scanner;

/**
 * <h1>L. Greatest Common Divisor</h1>
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
 * <h2>Given two numbers A and B. Print the greatest common divisor between (A, B).</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>12 8</h2>
 * <h1>Output:</h1>
 * <h2>4</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>3 7</h2>
 * <h1>Output:</h1>
 * <h2>1</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>5 10</h2>
 * <h1>Output:</h1>
 * <h2>5</h2>
 */

public class GreatestCommonDivisorExample {
    private static final Scanner INPUT = new Scanner(System.in);

    public static void main(final String[] ARGUMENTS) {
        final long NUMBER_1 = INPUT.nextLong(),
                NUMBER_2 = INPUT.nextLong();
        System.out.print(greatestCommonDivisor(NUMBER_1, NUMBER_2));
    }

    private static long greatestCommonDivisor(final long NUMBER_1, final long NUMBER_2) {
        final long minimumNumber = Math.min(NUMBER_1, NUMBER_2);
        long greatestCommonDivisor = 1;
        for (long divisor = 1; divisor <= minimumNumber; divisor++)
            if (NUMBER_1 % divisor == 0 && NUMBER_2 % divisor == 0) greatestCommonDivisor = divisor;
        return greatestCommonDivisor;
    }
}