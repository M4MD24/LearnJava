package _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_13_sheet_10._2_3_1_13_l_two_squares;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * <h1>L. Two Squares</h1>
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
 * 10 1 2
 * <br/>
 * 2
 * <br/>
 * 50
 * <br/>
 * 100
 * </h2>
 * <h1>Output:</h1>
 * <h2>
 * 4.142136
 * <br/>
 * 0.000000
 * </h2>
 *
 * @see _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_13_sheet_10._2_3_1_13_l_two_squares.images <h2>Question</h2>
 */

public class TwoSquaresExample {
    private static final BufferedReader INPUT = new BufferedReader(new InputStreamReader(System.in));
    private static int sideLength, firstSquareSpeed, secondSquareSpeed, countOfQueries;

    public static void main(final String[] ARGUMENTS) throws IOException {
        inputValues();
        printQueriesTime();
    }

    private static void printQueriesTime() throws IOException {
        final BufferedWriter OUTPUT = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int index = 0; index < countOfQueries; index++) OUTPUT.write(String.format("%.6f\n", Math.abs(Math.sqrt(2) * (sideLength - Math.sqrt(Double.parseDouble(INPUT.readLine()))) / (secondSquareSpeed - firstSquareSpeed))));
        OUTPUT.flush();
    }

    private static void inputValues() throws IOException {
        final StringTokenizer LINE = new StringTokenizer(INPUT.readLine());
        sideLength = Integer.parseInt(LINE.nextToken());
        firstSquareSpeed = Integer.parseInt(LINE.nextToken());
        secondSquareSpeed = Integer.parseInt(LINE.nextToken());
        countOfQueries = Integer.parseInt(INPUT.readLine());
    }
}