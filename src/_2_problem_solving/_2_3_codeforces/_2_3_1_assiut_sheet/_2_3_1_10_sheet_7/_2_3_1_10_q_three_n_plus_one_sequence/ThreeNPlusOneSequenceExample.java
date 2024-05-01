package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_10_sheet_7._2_3_1_10_q_three_n_plus_one_sequence;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <h1>Q. 3n + 1 sequence</h1>
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
 * Given a number n, you should print the length of the 3n+1 sequence starting with n.
 * <br/>
 * The sequence is constructed as follows:
 * </h2>
 * <ul>
 *     <li>If the number n is odd, the next number will be 3n+1.</li>
 *     <li>If the number n is even, the next number will be n/2.</li>
 * </ul>
 * <br/>
 * <h1>Note:</h1>
 * <h2>Solve this problem using recursion.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>1</h2>
 * <h1>Output:</h1>
 * <h2>1</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>2</h2>
 * <h1>Output:</h1>
 * <h2>2</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>3</h2>
 * <h1>Output:</h1>
 * <h2>8</h2>
 */

public class ThreeNPlusOneSequenceExample {
    public static void main(final String[] ARGS) throws IOException {
        System.out.print(returnCountOf3NPlus1(Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine())));
    }

    private static int count = 0;

    private static int returnCountOf3NPlus1(int number) {
        count++;
        if (number == 1) return count;
        if (number % 2 == 0) return returnCountOf3NPlus1(number / 2);
        else return returnCountOf3NPlus1(3 * number + 1);
    }
}