package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_4_contest_2._2_3_1_2_g_construct_the_sum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

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
 * <h1>Question:</h1>
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
    public static void main(String[] args) throws IOException {
        final BufferedReader BUFFERED_READER = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(BUFFERED_READER.readLine());
        StringBuilder output = new StringBuilder();
        while (length-- > 0) inputValues(BUFFERED_READER, output);
        System.out.print(output);
    }

    private static void inputValues(BufferedReader BUFFERED_READER, StringBuilder output) throws IOException {
        final String[] TOKENS = BUFFERED_READER.readLine().split(" ");
        int firstNumber = Integer.parseInt(TOKENS[0]);
        long secondNumber = Long.parseLong(TOKENS[1]);
        if (secondNumber > (firstNumber * (firstNumber + 1L) / 2)) output.append("-1\n");
        else {
            final ArrayList<Integer> NUMBERS = new ArrayList<>();
            while (firstNumber >= 1) {
                if (secondNumber - firstNumber >= 0) {
                    NUMBERS.add(firstNumber);
                    secondNumber -= firstNumber;
                }
                if (secondNumber == 0) break;
                firstNumber--;
            }
            if (secondNumber == 0) {
                for (int i = NUMBERS.size() - 1; i >= 0; i--) output.append(NUMBERS.get(i)).append(" ");
                output.append("\n");
            } else output.append("-1\n");
        }
    }
}