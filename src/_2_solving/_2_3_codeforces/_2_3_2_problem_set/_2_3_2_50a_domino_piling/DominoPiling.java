package _2_solving._2_3_codeforces._2_3_2_problem_set._2_3_2_50a_domino_piling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * <h1>50A. Domino Piling</h1>
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
 * <br/>
 * <h1>Problem:</h1>
 * <h2>
 * You are given a rectangular board of M × N squares. Also you are given an unlimited number of standard domino pieces of 2 × 1 squares. You are allowed to rotate the pieces. You are asked to place as many dominoes as possible on the board so as to meet the following conditions:
 * <br/>
 * <br/>
 * 1. Each domino completely covers two squares.
 * <br/>
 * 2. No two dominoes overlap.
 * <br/>
 * 3. Each domino lies entirely inside the board. It is allowed to touch the edges of the board.
 * <br/>
 * <br/>
 * Find the maximum number of dominoes, which can be placed under these restrictions.
 * </h2>
 * <br/>
 * <br/>
 * <h1>Input:</h1>
 * <h2>3 3</h2>
 * <h1>Output:</h1>
 * <h2>4</h2>
 */

public class DominoPiling {
    public static void main(final String[] PARAMETERS) throws IOException {
        final BufferedReader INPUT = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter OUTPUT = new BufferedWriter(new OutputStreamWriter(System.out));
        final String[] FIRST_LINE = INPUT.readLine().split(" ");
        final int ROWS = Integer.parseInt(FIRST_LINE[0]),
                COLUMNS = Integer.parseInt(FIRST_LINE[1]);
        final int MAXIMUM_DOMINOES = (ROWS * COLUMNS) / 2;
        OUTPUT.write(MAXIMUM_DOMINOES + "");
        OUTPUT.flush();
    }
}