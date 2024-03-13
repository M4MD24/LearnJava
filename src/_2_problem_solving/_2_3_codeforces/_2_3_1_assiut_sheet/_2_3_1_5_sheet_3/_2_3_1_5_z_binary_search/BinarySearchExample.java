package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_5_sheet_3._2_3_1_5_z_binary_search;

import java.util.Arrays;
import java.util.Scanner;

/**
 * <h1>Z. Binary Search</h1>
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
 * <h2>
 * Given 2 numbers N and Q, array A of N numbers and Q queries each one contains a number X.
 * <br/>
 * For each query print a single line that contains "found" if the number X  exists in array A otherwise, print "not found".
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 5 3
 * <br/>
 * 1 5 4 3 2
 * <br/>
 * 5
 * <br/>
 * 3
 * <br/>
 * 6
 * </h2>
 * <h1>Output:</h1>
 * <h2>
 * found
 * <br/>
 * found
 * <br/>
 * not found
 * </h2>
 */

public class BinarySearchExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static final int LENGTH = INPUT.nextInt();
    private static int countOfTestCases = INPUT.nextInt();
    private static final int[] NUMBERS = new int[LENGTH];

    public static void main(String[] args) {
        inputValues();
        Arrays.sort(NUMBERS);
        while (countOfTestCases > 0) {
            System.out.print(searchWithBinarySearch(INPUT.nextInt()));
            if (countOfTestCases-- > 1) System.out.println();
        }
    }

    private static String searchWithBinarySearch(final int TARGET_NUMBER) {
        int left = 0,
                right = LENGTH - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (NUMBERS[middle] == TARGET_NUMBER) return "found";
            else if (NUMBERS[middle] < TARGET_NUMBER) left = middle + 1;
            else right = middle - 1;
        }
        return "not found";
    }

    private static void inputValues() {
        for (int index = 0; index < LENGTH; index++) NUMBERS[index] = INPUT.nextInt();
    }
}