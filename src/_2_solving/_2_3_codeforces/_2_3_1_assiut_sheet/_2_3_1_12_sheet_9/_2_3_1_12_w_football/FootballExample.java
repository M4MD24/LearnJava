package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_12_sheet_9._2_3_1_12_w_football;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;

/**
 * <h1>W. Football</h1>
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
 * <h2>One day Vasya decided to have a look at the results of Berland 1910 Football Championship’s finals. Unfortunately he didn't find the overall score of the match; however, he got hold of a profound description of the match's process. On the whole there are n lines in that description each of which described one goal. Every goal was marked with the name of the team that had scored it. Help Vasya, learn the name of the team that won the finals. It is guaranteed that the match did not end in a tie.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 1
 * <br/>
 * ABC
 * </h2>
 * <h1>Output</h1>
 * <h2>ABC</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 5
 * <br/>
 * A
 * <br/>
 * ABA
 * <br/>
 * ABA
 * <br/>
 * A
 * <br/>
 * A
 * </h2>
 * <h1>Output</h1>
 * <h2>A</h2>
 */

public class FootballExample {
    private static final BufferedWriter OUTPUT = new BufferedWriter(new OutputStreamWriter(System.out));
    private static byte countOfLines;
    private static String[] lines;

    public static void main(final String[] PARAMETERS) throws IOException {
        inputValues();
        OUTPUT.write(getMostRepetitive());
        OUTPUT.flush();
    }

    private static String getMostRepetitive() {
        final String FIRST_RIVAL = lines[0];
        String secondRival = "";
        byte countFirstRivalWin = 0;
        for (byte index = 0; index < countOfLines; index++) {
            final String CURRENT_LINE = lines[index];
            if (FIRST_RIVAL.equals(CURRENT_LINE)) countFirstRivalWin++;
            else secondRival = CURRENT_LINE;
        }
        return countFirstRivalWin > countOfLines / 2 ? FIRST_RIVAL : secondRival;
    }

    private static void inputValues() throws IOException {
        final BufferedReader INPUT = new BufferedReader(new InputStreamReader(System.in));
        countOfLines = Byte.parseByte(INPUT.readLine());
        lines = new String[countOfLines];
        for (byte index = 0; index < countOfLines; index++) lines[index] = INPUT.readLine();
    }
}