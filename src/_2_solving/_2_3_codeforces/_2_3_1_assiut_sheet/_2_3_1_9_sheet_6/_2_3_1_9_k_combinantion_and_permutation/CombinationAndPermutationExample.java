package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_9_sheet_6._2_3_1_9_k_combinantion_and_permutation;

import java.util.Scanner;

/**
 * <h1>K. Combination and Permutation</h1>
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
 * <h2>Given two numbers A and B. Print NCR and NPR of A and B.</h2>
 * <br/>
 * <h1>Note:</h1>
 * <ul>
 *     <li>NCR is the Combination.</li>
 *     <li>NPR is the Permutation.</li>
 * </ul>
 * <br/>
 * <h1>Input:</h1>
 * <h2>5 3</h2>
 * <h1>Output:</h1>
 * <h2>10 60</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>6 2</h2>
 * <h1>Output:</h1>
 * <h2>15 30</h2>
 */

public class CombinationAndPermutationExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static final byte NUMBER_1 = INPUT.nextByte(),
            NUMBER_2 = INPUT.nextByte();

    public static void main(final String[] PARAMETERS) {
        System.out.print(getCombination() + " " + getPermutation());
    }

    private static long getPermutation() {
        return getFactorial(NUMBER_1) / getFactorial((byte) (NUMBER_1 - NUMBER_2));
    }

    private static long getCombination() {
        return getFactorial(NUMBER_1) / getFactorial((byte) (NUMBER_1 - NUMBER_2)) / getFactorial(NUMBER_2);
    }

    private static long getFactorial(final byte NUMBER) {
        long multiplication = 1;
        for (int index = 2; index <= NUMBER; index++)
            multiplication *= index;
        return multiplication;
    }
}