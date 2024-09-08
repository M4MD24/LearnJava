package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_5_sheet_3._2_3_1_5_r_permutation_with_arrays;

import java.util.Arrays;
import java.util.Scanner;

/**
 * <h1>R. Permutation with Arrays</h1>
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
 * <h2>Given a number N and two arrays A, B of N numbers. Determine if B is a permutation of A or not.</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>
 * A permutation is an arrangement of all or part of a set of objects.
 * <br/>
 * For example: The array [2, 1, 3], [3, 2, 1] and [2, 3, 1] are permutation of the array [1, 2, 3].
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 4
 * <br/>
 * 4 2 3 7
 * <br/>
 * 2 3 4 9
 * </h2>
 * <h1>Output:</h1>
 * <h2>no</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 5
 * <br/>
 * 5 1 1 9 3
 * <br/>
 * 1 9 1 5 3
 * </h2>
 * <h1>Output:</h1>
 * <h2>yes</h2>
 */

public class PermutationWithArraysExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static final short LENGTH = INPUT.nextShort();

    public static void main(final String[] PARAMETERS) {
        final int[] FIRST_NUMBERS = inputValues(),
                SECOND_NUMBERS = inputValues();
        Arrays.sort(FIRST_NUMBERS);
        Arrays.sort(SECOND_NUMBERS);
        System.out.print(isPermutation(FIRST_NUMBERS, SECOND_NUMBERS));
    }

    private static String isPermutation(final int[] FIRST_NUMBERS, final int[] SECOND_NUMBERS) {
        for (int index = 0; index < LENGTH; index++)
            if (FIRST_NUMBERS[index] != SECOND_NUMBERS[index])
                return "no";
        return "yes";
    }

    private static int[] inputValues() {
        int[] ARRAY = new int[LENGTH];
        for (int index = 0; index < LENGTH; index++) ARRAY[index] = INPUT.nextInt();
        return ARRAY;
    }
}