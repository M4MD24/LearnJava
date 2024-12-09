package _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_4_contest_2._2_3_1_4_g_construct_the_sum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <h1>G. Construct the Sum</h1>
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
 * <h2>You are given two integers n and s, and you have to find distinct positive integers, such that each of them is ≤ n, and their summation =s. Otherwise, state that this is impossible.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 4
 * <br/>
 * 5 3
 * <br/>
 * 7 10
 * <br/>
 * 6 4
 * <br/>
 * 2 10
 * </h2>
 * <h1>Output:</h1>
 * <h2>
 * 2 1
 * <br/>
 * 4 3 2 1
 * <br/>
 * 3 1
 * <br/>
 * -1
 * </h2>
 */

public class ConstructTheSumExample {
    private static final BufferedReader INPUT = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuffer OUTPUT = new StringBuffer();

    public static void main(final String[] PARAMETERS) throws IOException {
        int length = Integer.parseInt(INPUT.readLine());
        while (length > 0) {
            inputValues();
            if (length-- > 1) OUTPUT.append("\n");
        }
        System.out.print(OUTPUT);
    }

    private static void inputValues() throws IOException {
        final String[] NUMBERS_LINE = INPUT.readLine().split(" ");
        constructSum(Integer.parseInt(NUMBERS_LINE[0]), Long.parseLong(NUMBERS_LINE[1]));
    }

    private static void constructSum(int firstNumber, long secondNumber) {
        if (secondNumber > (firstNumber * (firstNumber + 1L) / 2)) OUTPUT.append(-1);
        else {
            final int[] NUMBERS = new int[firstNumber];
            int index = 0;
            while (firstNumber >= 1) {
                if (secondNumber - firstNumber >= 0) {
                    NUMBERS[index++] = firstNumber;
                    secondNumber -= firstNumber;
                }
                if (secondNumber == 0) break;
                firstNumber--;
            }
            if (secondNumber == 0) for (int reversedIndex = index - 1; reversedIndex >= 0; reversedIndex--) OUTPUT.append(NUMBERS[reversedIndex]).append(" ");
            else OUTPUT.append(-1);
        }
    }
}