package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_5_sheet_3._2_3_1_5_q_count_subarrays;

import java.util.Scanner;

/**
 * <h1>Q. Count Sub-arrays</h1>
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
 * A sub-array of array is an array composed from a contiguous block of the original array's elements.
 * <br/>
 * In other words A sub-array A[i-j], where (1≤i≤j≤N), is a sequence of integers Ai, Ai+1, ..., Aj.
 * <br/>
 * For Example:
 * <br/>
 * IF array = [1,6,3,7] then the sub-arrays are [1] , [6] , [3] , [7] , [1,6] , [6,3],[3,7], [1,6,3] , [6,3,7] , [1,6,3,7] .
 * <br/>
 * Something like [1,3] would not be a sub-array as it's not a contiguous subsection of the original array.
 * <br/>
 * Given a number N and an array A of N numbers. Print the number of sub-arrays which are non-decreasing.
 * </h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>A sub-array A[i-j] is non-decreasing if (Ai ≤ Ai+1 ≤ Ai+2 ≤ ... ≤ Aj).</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 2
 * <br/>
 * 5
 * <br/>
 * 1 4 2 3 5
 * <br/>
 * 1
 * <br/>
 * 5
 * </h2>
 * <h1>Output:</h1>
 * <h2>
 * 9
 * <br/>
 * 1
 * </h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>
 * First example:
 * <br/>
 * All valid sub-arrays are: [1] , [1,4] , [4] , [2] , [3] , [5] , [2,3] , [3,5] , [2,3,5]
 * <br/>
 * Second example:
 * <br/>
 * Only single sub-array [5] is non-decreasing, that singleton sub-arrays (have only one element) are identically non-decreasing.
 * </h2>
 */

public class CountSubArraysExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static byte length;
    private static int[] numbers;

    public static void main(String[] args) {
        byte countOfTestCases = INPUT.nextByte();
        while (countOfTestCases > 0) {
            inputValues();
            System.out.print(countOfSubArrays());
            if (countOfTestCases-- > 1) System.out.println();
        }
    }

    private static int countOfSubArrays() {
        int countOfSubArrays = length;
        for (int round = 1; round <= length; round++)
            for (int start = 0, end = round; end < length; start++, end++)
                if (isFromMinimumToMaximum(start, end))
                    countOfSubArrays++;
        return countOfSubArrays;
    }

    private static boolean isFromMinimumToMaximum(int start, int end) {
        for (int index = start; index + 1 <= end; index++)
            if (numbers[index] > numbers[index + 1])
                return false;
        return true;
    }

    private static void inputValues() {
        numbers = new int[length = INPUT.nextByte()];
        for (int index = 0; index < length; index++) numbers[index] = INPUT.nextInt();
    }
}