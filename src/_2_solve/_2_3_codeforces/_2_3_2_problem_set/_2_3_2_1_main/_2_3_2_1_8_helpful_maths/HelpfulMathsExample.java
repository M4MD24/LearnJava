package _2_solve._2_3_codeforces._2_3_2_problem_set._2_3_2_1_main._2_3_2_1_8_helpful_maths;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * <h1>T. Helpful Maths</h1>
 * <h2>
 * time limit per test: 2 second
 * <br/>
 * memory limit per test: 256 megabytes
 * <br/>
 * input: standard input
 * <br/>
 * output: standard output
 * </h2>
 * <br/>
 * <h1>Problem:</h1>
 * <h2>
 * Xenia the beginner mathematician is a third year student at elementary school. She is now learning the addition operation.
 * <br/>
 * The teacher has written down the sum of multiple numbers. Pupils should calculate the sum. To make the calculation easier, the sum only contains numbers 1, 2 and 3. Still, that isn't enough for Xenia. She is only beginning to count, so she can calculate a sum only if the summands follow in non-decreasing order. For example, she can't calculate sum 1+3+2+1 but she can calculate sums 1+1+2 and 3+3.
 * <br/>
 * You've got the sum that was written on the board. Rearrange the summans and print the sum in such a way that Xenia can calculate the sum.
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>3+2+1</h2>
 * <h1>Output:</h1>
 * <h2>1+2+3</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>1+1+3+1+3</h2>
 * <h1>Output:</h1>
 * <h2>1+1+1+3+3</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>2</h2>
 * <h1>Output:</h1>
 * <h2>2</h2>
 */

public class HelpfulMathsExample {
    private static final BufferedReader INPUT = new BufferedReader(new InputStreamReader(System.in));
    private static String[] NUMBERS;

    public static void main(final String[] ARGUMENTS) throws IOException {
        inputValues();
        System.out.print(returnValuesRecursion((byte) 0));
    }

    private static String returnValuesRecursion(byte index) {
        if (index < NUMBERS.length - 1)
            return NUMBERS[index++] + "+" + returnValuesRecursion(index);
        else if (index < NUMBERS.length)
            return NUMBERS[index];
        else
            return "";
    }

    private static void inputValues() throws IOException {
        NUMBERS = INPUT.readLine().split("\\+");
        Arrays.sort(NUMBERS);
    }
}