package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_13_sheet_10._2_3_1_13_q_bulbs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * <h1>Q. Bulbs</h1>
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
 * <h1>Input:</h1>
 * <h2>
 * 5
 * <br/>
 * 2 1 3 5 4
 * </h2>
 * <h1>Output:</h1>
 * <h2>3</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 5
 * <br/>
 * 3 2 4 1 5
 * </h2>
 * <h1>Output:</h1>
 * <h2>2</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 4
 * <br/>
 * 4 1 2 3
 * </h2>
 * <h1>Output:</h1>
 * <h2>1</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 6
 * <br/>
 * 2 1 4 3 6 5
 * </h2>
 * <h1>Output:</h1>
 * <h2>3</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 6
 * <br/>
 * 1 2 3 4 5 6
 * </h2>
 * <h1>Output:</h1>
 * <h2>6</h2>
 * <br/>
 * <h1>Note:</h1>
 * <ol>
 *     <li>All bulbs turned on, are blue at the moment 1, 2 and 4 (index-0).</li>
 *     <li>All bulbs turned on, are blue at the moment 3, and 4.</li>
 *     <li>All bulbs turned on, are blue at the moment 3, bulb 4th changes to blue at the moment 3.</li>
 * </ol>
 *
 * @see _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_13_sheet_10._2_3_1_13_q_bulbs.images <h2>Question</h2>
 */

public class Bulbs {
    private static int countOfBulbs;
    private static int[] bulbs;

    public static void main(final String[] ARGS) throws IOException {
        final BufferedWriter OUTPUT = new BufferedWriter(new OutputStreamWriter(System.out));
        inputValues();
        OUTPUT.write(String.valueOf(getCountOfTimesAllBulbsAreOn()));
        OUTPUT.flush();
    }

    private static int getCountOfTimesAllBulbsAreOn() {
        int maxBulbIndex = 0, countOfTimesAllBulbsTurnsOn = 0;
        for (int index = 0; index < countOfBulbs; index++) {
            maxBulbIndex = Math.max(maxBulbIndex, bulbs[index]);
            if (index + 1 == maxBulbIndex) countOfTimesAllBulbsTurnsOn++;
        }
        return countOfTimesAllBulbsTurnsOn;
    }

    private static void inputValues() throws IOException {
        final BufferedReader INPUT = new BufferedReader(new InputStreamReader(System.in));
        countOfBulbs = Integer.parseInt(INPUT.readLine());
        bulbs = new int[countOfBulbs];
        final StringTokenizer LINE = new StringTokenizer(INPUT.readLine());
        for (int index = 0; index < countOfBulbs; index++) bulbs[index] = Integer.parseInt(LINE.nextToken());
    }
}