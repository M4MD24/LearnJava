package _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_12_sheet_9._2_3_1_12_q_dreamoon_and_stairs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * <h1>Q. Dreamoon and Stairs</h1>
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
 * <h2>
 * Dreamoon wants to climb up a stair of n steps. He can climb 1 or 2 steps at each move. Dreamoon wants the number of moves to be a multiple of an integer m.
 * <br/>
 * What is the minimal number of moves making him climb to the top of the stairs that satisfies his condition?
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>10 2</h2>
 * <h1>Output</h1>
 * <h2>6</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>3 5</h2>
 * <h1>Output:</h1>
 * <h2>-1</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>
 * For the first sample, Dreamoon could climb in 6 moves with following sequence of steps: {2, 2, 2, 2, 1, 1}.
 * <br/>
 * For the second sample, there are only three valid sequence of steps {2, 1}, {1, 2}, {1, 1, 1} with 2, 2, and 3 steps respectively. All these numbers are not multiples of 5.
 * </h2>
 */

public class DeamoonAndStairsExample {
    public static void main(final String[] PARAMETERS) throws IOException {
        final BufferedReader INPUT = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter OUTPUT = new BufferedWriter(new OutputStreamWriter(System.out));
        final StringTokenizer LINE = new StringTokenizer(INPUT.readLine());
        OUTPUT.write(String.valueOf(returnCountOfClimbedStairs(Short.parseShort(LINE.nextToken()), Byte.parseByte(LINE.nextToken()))));
        OUTPUT.flush();
    }

    private static short returnCountOfClimbedStairs(final short STAIRS, final byte TARGET_NUMBER) {
        short countOfClimbedStairs = (STAIRS % 2 == 0) ? (short) (STAIRS / 2) : (short) (STAIRS / 2 + 1);
        while (countOfClimbedStairs < STAIRS)
            if (countOfClimbedStairs % TARGET_NUMBER == 0) break;
            else countOfClimbedStairs++;
        return (countOfClimbedStairs % TARGET_NUMBER == 0) ? countOfClimbedStairs : -1;
    }
}