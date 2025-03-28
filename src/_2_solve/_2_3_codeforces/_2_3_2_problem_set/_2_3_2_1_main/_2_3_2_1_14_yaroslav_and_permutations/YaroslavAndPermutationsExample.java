package _2_solve._2_3_codeforces._2_3_2_problem_set._2_3_2_1_main._2_3_2_1_14_yaroslav_and_permutations;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 * <h1>O. Yaroslav and Permutations</h1>
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
 * Yaroslav has an array that consists of n integers. In one second Yaroslav can swap two neighboring array elements. Now Yaroslav is wondering if he can obtain an array where any two neighboring elements would be distinct in a finite time.
 * <br/>
 * Help Yaroslav.
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 1
 * <br/>
 * 1
 * </h2>
 * <h1>Output</h1>
 * <h2>YES</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 3
 * <br/>
 * 1 1 2
 * </h2>
 * <h1>Output:</h1>
 * <h2>YES</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 4
 * <br/>
 * 7 7 7 7
 * </h2>
 * <h1>Output:</h1>
 * <h2>NO</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>
 * In the first sample the initial array fits well.
 * <br/>
 * In the second sample Yaroslav can get array: 1, 2, 1. He can swap the last and the second last elements to obtain it.
 * <br/>
 * In the third sample Yarosav can't get the array he needs.
 * </h2>
 */

public class YaroslavAndPermutationsExample {
    private static final BufferedReader INPUT = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter OUTPUT = new BufferedWriter(new OutputStreamWriter(System.out));
    private static byte countOfNumbers;
    private static short[] numbers;

    public static void main(final String[] PARAMETERS) throws IOException {
        inputNumbers();
        OUTPUT.write(isMatchesYaroslavCriteria() ? "YES" : "NO");
        OUTPUT.flush();
    }

    private static boolean isMatchesYaroslavCriteria() {
        boolean isMatchesYaroslavCriteria = true;
        if (countOfNumbers > 1) {
            byte lastMaximumNumberLength = 0;
            for (byte round = 0; round < countOfNumbers; round++) {
                byte currentMaximumNumberLength = 0;
                for (byte index = 0; index < countOfNumbers; index++) if (numbers[round] == numbers[index]) currentMaximumNumberLength++;
                if (currentMaximumNumberLength > lastMaximumNumberLength) lastMaximumNumberLength = currentMaximumNumberLength;
            }
            return (countOfNumbers % 2 == 0) ? (lastMaximumNumberLength <= countOfNumbers / 2) : (lastMaximumNumberLength <= countOfNumbers / 2 + 1);
        }
        return isMatchesYaroslavCriteria;
    }

    private static void inputNumbers() throws IOException {
        countOfNumbers = Byte.parseByte(INPUT.readLine());
        numbers = new short[countOfNumbers];
        final StringTokenizer LINE = new StringTokenizer(INPUT.readLine());
        for (byte index = 0; index < countOfNumbers; index++) numbers[index] = Short.parseShort(LINE.nextToken());
    }
}