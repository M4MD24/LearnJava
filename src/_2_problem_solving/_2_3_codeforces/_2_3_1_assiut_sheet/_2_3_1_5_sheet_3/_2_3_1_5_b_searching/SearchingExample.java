package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_5_sheet_3._2_3_1_5_b_searching;

import java.util.Scanner;

/**
 * <h1>B. Searching</h1>
 * <h2>
 * time limit per test: 2 second
 * <br/>
 * memory limit per test: 64 megabytes
 * <br/>
 * input: standard input
 * <br/>
 * output: standard output
 * </h2>
 * <br/>
 * <h1>Question:</h1>
 * <h2>Given a number N and an array A of N numbers. Determine if the number X exists in array A or not and print its position (0-index).</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>X may be found once or more than once and may not be found.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 3
 * <br/>
 * 3 0 1
 * <br/>
 * 0
 * </h2>
 * <h1>Output:</h1>
 * <h2>1</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 5
 * <br/>
 * 1 3 0 4 5
 * <br/>
 * 10
 * </h2>
 * <h1>Output:</h1>
 * <h2>-1</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 4
 * <br/>
 * 2 3 2 1
 * <br/>
 * 2
 * </h2>
 * <h1>Output:</h1>
 * <h2>0</h2>
 */

public class SearchingExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static final int LENGTH = INPUT.nextInt();
    private static final long[] NUMBERS = new long[LENGTH];

    public static void main(final String[] ARGS) {
        inputValues();
        System.out.print(searchValue(INPUT.nextLong()));
    }

    private static int searchValue(long targetValue) {
        for (int index = 0; index < LENGTH; index++) if (NUMBERS[index] == targetValue) return index;
        return -1;
    }

    private static void inputValues() {
        for (int index = 0; index < LENGTH; index++) NUMBERS[index] = INPUT.nextInt();
    }
}