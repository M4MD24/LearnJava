package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_5_sheet_3._2_3_1_5_p_minimize_number;

import java.util.Scanner;

/**
 * <h1>P. Minimize Number</h1>
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
 * Given a number N and an array A of N positive numbers. Print maximum possible operations that can be performed.
 * <br/>
 * The operation is as follows: if all numbers are even then divide each of them by 2 otherwise, you can not perform any more operations.
 * </h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>
 * First Example: Initially, [8,12,40] are written on the blackboard. Since all those integers are even, You can perform the operation.
 * <br/>
 * After the operation is performed once, [4,6,20] are written on the blackboard. Since all those integers are again even, You can perform the operation.
 * <br/>
 * After the operation is performed twice, [2,3,10] are written on the blackboard. Now, there is an odd number 3 on the blackboard, so you cannot perform the operation any more.
 * <br/>
 * Thus, you can perform the operation at most twice.
 * <br/>
 * Second example: Since there is an odd number 5 on the blackboard already in the beginning, You cannot perform the operation at all.
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 3
 * <br/>
 * 8 12 40
 * </h2>
 * <h1>Output:</h1>
 * <h2>2</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 4
 * <br/>
 * 5 6 8 10
 * </h2>
 * <h1>Output:</h1>
 * <h2>0</h2>
 */

public class MinimizeNumberExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static final int LENGTH = INPUT.nextInt();
    private static final int[] NUMBERS = new int[LENGTH];
    private static boolean doOperations = true;

    public static void main(final String[] ARGS) {
        inputValues();
        System.out.print(getMinimizeNumber());
    }

    private static int getMinimizeNumber() {
        int minimizeCounter = 0;
        if (doOperations) {
            for (int index = 0; index < LENGTH; index++) {
                int currentCounter = 0,
                        currentValue = NUMBERS[index];
                if (currentValue % 2 != 0) return 0;
                while (currentValue % 2 == 0) {
                    currentCounter++;
                    currentValue /= 2;
                }
                if (index == 0 || currentCounter < minimizeCounter) minimizeCounter = currentCounter;
            }
        }
        return minimizeCounter;
    }

    private static void inputValues() {
        for (int index = 0; index < LENGTH; index++) if ((NUMBERS[index] = INPUT.nextInt()) % 2 != 0) doOperations = false;
    }
}