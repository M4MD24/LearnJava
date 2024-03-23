package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_5_sheet_3._2_3_1_5_l_maximum_subarray;

import java.util.Scanner;

/**
 * <h1>L. Maximum Sub-array</h1>
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
 * If array = [1,6,3,7] then the sub-arrays are [1] , [6] , [3] , [7] , [1,6] , [6,3],[3,7], [1,6,3] , [6,3,7] , [1,6,3,7].
 * <br/>
 * Something like [1,3] would not be a sub-array as it's not a contiguous subsection of the original array.
 * <br/>
 * Given a number N and an array A of N numbers. Print the maximum number of every sub-array separated by space.
 * </h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>
 * First Case :
 * <br/>
 * All Sub arrays are :
 * <br/>
 * [1] , [6] , [3] , [7] , [1,6] , [6,3],[3,7], [1,6,3] , [6,3,7] , [1,6,3,7]
 * <br/>
 * - Sub-array [1] it maximum number is 1.
 * <br/>
 * - Sub-array [6] it maximum number is 6.
 * <br/>
 * - Sub-array [3] it maximum number is 3.
 * <br/>
 * - Sub-array [7] it maximum number is 7.
 * <br/>
 * - Sub-array [1,6] it maximum number is 6.
 * <br/>
 * - Sub-array [6,3] it maximum number is 6.
 * <br/>
 * - Sub-array [3,7] it maximum number is 7.
 * <br/>
 * - Sub-array [1,6,3] it maximum number is 6.
 * <br/>
 * - Sub-array [6,3,7] it maximum number is 7.
 * <br/>
 * - Sub-array [1,6,3,7] it maximum number is 7.
 * <br/>
 * so the maximum numbers are [ 1,6,3,7,6,6,7,6,7,7] you can print them in any order.
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 2
 * <br/>
 * 4
 * <br/>
 * 1 6 3 7
 * <br/>
 * 3
 * <br/>
 * 3 1 2
 * </h2>
 * <h1>Output:</h1>
 * <h2>
 * 1 6 3 7 6 6 7 6 7 7
 * <br/>
 * 3 3 3 1 2 2
 * </h2>
 */

public class MaximumSubArrayExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static int length;
    private static int[] numbers;

    public static void main(String[] args) {
        int countOfTestCases = INPUT.nextInt();
        while (countOfTestCases > 0) {
            length = INPUT.nextInt();
            inputAndPrintValues();
            printMaximumSubArray();
            if (countOfTestCases-- > 1) System.out.println();
        }
    }

    private static void printMaximumSubArray() {
        int start = 0,
                end = 0,
                maximumSum = 0;
        while (end != length - 1) {
            if (start == end) maximumSum = Math.max(numbers[start], numbers[start + 1]);
            else maximumSum = Math.max(maximumSum, numbers[start + 1]);
            System.out.print(maximumSum);
            start++;
            if (start == length - 1) {
                end++;
                start = end;
            }
            if (start != length - 1) System.out.print(" ");
        }
    }

    private static void inputAndPrintValues() {
        numbers = new int[length];
        for (int index = 0; index < length; index++) {
            numbers[index] = INPUT.nextInt();
            System.out.print(numbers[index] + " ");
        }
    }
}