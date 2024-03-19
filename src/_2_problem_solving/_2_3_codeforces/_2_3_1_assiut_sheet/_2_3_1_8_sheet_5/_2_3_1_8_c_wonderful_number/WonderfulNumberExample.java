package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_8_sheet_5._2_3_1_8_c_wonderful_number;

import java.util.Scanner;

/**
 * <h1>C. Wonderful Number</h1>
 * <h2>
 * time limit per test: 1 second
 * <br/>
 * memory limit per test: 64 megabytes
 * <br/>
 * input: standard input
 * <br/>
 * output: standard output
 * </h2>
 * <br/>
 * <h1>Question:</h1>
 * <h2>Given a number N. Determine whether N is wonderful or not.</h2>
 * <br/>
 * <h1>Note:</h1>
 * <ul>
 *     <li>A number is wonderful if this number is odd and its binary representation is palindrome.</li>
 *     <li>Solve this problem using two functions. </li>
 * </ul>
 * <br/>
 * <h1>Input:</h1>
 * <h2>3</h2>
 * <h1>Output:</h1>
 * <h2>YES</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>4</h2>
 * <h1>Output:</h1>
 * <h2>NO</h2>
 */

public class WonderfulNumberExample {
    public static void main(String[] args) {
        final Scanner INPUT = new Scanner(System.in);
        final int TARGET_NUMBER = INPUT.nextInt();
        System.out.print(isWonderfulNumber(TARGET_NUMBER));
    }

    private static String isWonderfulNumber(int target_number) {
        if (target_number % 2 == 0) return "NO";
        else {
            int currentBinaryNumbersIndex = 0;
            final int[] BINARY_NUMBERS = new int[100];
            while (target_number != 0) {
                BINARY_NUMBERS[currentBinaryNumbersIndex] = target_number % 2;
                target_number /= 2;
                currentBinaryNumbersIndex++;
            }

            for (int currentIndex = 0, reversedBinaryNumbersIndex = currentBinaryNumbersIndex - 1; reversedBinaryNumbersIndex >= 0; currentIndex++, reversedBinaryNumbersIndex--)
                if (BINARY_NUMBERS[currentIndex] != BINARY_NUMBERS[reversedBinaryNumbersIndex])
                    return "NO";

            return "YES";
        }
    }
}