package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_10_sheet_7._2_3_1_10_f_print_even_indices;

import java.util.Scanner;

/**
 * <h1>F. Print Even Indices</h1>
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
 * <h2>Given a number N and an array A of N numbers. Print the numbers in even indices in a reversed order.</h2>
 * <br/>
 * <h1>Note:</h1>
 * <ul>
 *     <li>Assume array A is 0-based indexing.</li>
 *     <li>Solve this problem using recursion.</li>
 * </ul>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 4
 * <br/>
 * 1 4 2 7
 * </h2>
 * <h1>Output:</h1>
 * <h2>2 1 </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 7
 * <br/>
 * 1 5 8 2 3 9 11
 * </h2>
 * <h1>Output:</h1>
 * <h2>11 3 8 1 </h2>
 */

public class PrintEvenIndicesExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static int length = INPUT.nextInt();
    private static final int[] NUMBERS = new int[length];

    public static void main(final String[] ARGS) {
        inputValuesRecursion(0);
        System.out.print(returnEvenIndicesValuesRecursion());
    }

    private static String returnEvenIndicesValuesRecursion() {
        if (length-- > 0)
            return (length % 2 == 0)
                    ? NUMBERS[length] + " " + returnEvenIndicesValuesRecursion()
                    : returnEvenIndicesValuesRecursion();
        else return "";
    }

    private static void inputValuesRecursion(int index) {
        if (index < length) {
            NUMBERS[index] = INPUT.nextInt();
            inputValuesRecursion(++index);
        }
    }
}