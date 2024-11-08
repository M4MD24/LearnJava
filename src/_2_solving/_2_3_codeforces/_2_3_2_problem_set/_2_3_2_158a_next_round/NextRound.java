package _2_solving._2_3_codeforces._2_3_2_problem_set._2_3_2_158a_next_round;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * <h1>158A. Next Round</h1>
 * <h2>
 * time limit per test: 3 second
 * <br/>
 * memory limit per test: 256 megabytes
 * <br/>
 * input: standard input
 * <br/>
 * output: standard output
 * </h2>
 * <br/>
 * <br/>
 * <h1>Problem:</h1>
 * <h2>
 * "Contestant who earns a score equal to or greater than the k-th place finisher's score will advance to the next round, as long as the contestant earns a positive score..." — an excerpt from contest rules.
 * <br/>
 * <br/>
 * A total of n participants took part in the contest (n ≥ k), and you already know their scores. Calculate how many participants will advance to the next round.
 * </h2>
 * <br/>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 8 5
 * <br/>
 * 10 9 8 7 7 7 5 5
 * </h2>
 * <br/>
 * <br/>
 * <h1>Output:</h1>
 * <h2>6</h2>
 * <br/>
 * <br/>
 * <h1>Note:</h1>
 * <h2>
 * In the first example the participant on the 5th place earned 7 points. As the participant on the 6th place also earned 7 points, there are 6 advancers.
 * <br/>
 * <br/>
 * In the second example nobody got a positive score.
 * </h2>
 */

public class NextRound {
    public static void main(String[] args) throws IOException {
        final BufferedReader INPUT = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter OUTPUT = new BufferedWriter(new OutputStreamWriter(System.out));
        final String[] FIRST_LINE = INPUT.readLine().split(" ");
        final int COUNT_OF_NUMBERS = Integer.parseInt(FIRST_LINE[0]);
        final int TARGET_NUMBER = Integer.parseInt(FIRST_LINE[1]);
        final String[] SECOND_LINE = INPUT.readLine().split(" ");
        final int[] NUMBERS = new int[COUNT_OF_NUMBERS];
        for (int index = 0; index < COUNT_OF_NUMBERS; index++)
            NUMBERS[index] = Integer.parseInt(SECOND_LINE[index]);
        int advancingScore = NUMBERS[TARGET_NUMBER - 1];
        int advancingCount = 0;
        for (final int NUMBER : NUMBERS)
            if (NUMBER >= advancingScore && NUMBER > 0)
                advancingCount++;
        OUTPUT.write(advancingCount + "");
        OUTPUT.flush();
    }
}
