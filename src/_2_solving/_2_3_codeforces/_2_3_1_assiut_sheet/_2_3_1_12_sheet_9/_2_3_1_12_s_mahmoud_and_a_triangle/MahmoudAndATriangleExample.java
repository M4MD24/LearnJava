package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_12_sheet_9._2_3_1_12_s_mahmoud_and_a_triangle;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * <h1>S. Mahmoud and a Triangle</h1>
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
 * <h1>Question:</h1>
 * <h2>
 * Mahmoud has n line segments, the i-th of them has length ai. Ehab challenged him to use exactly 3 line segments to form a non-degenerate triangle. Mahmoud doesn't accept challenges unless he is sure he can win, so he asked you to tell him if he should accept the challenge. Given the lengths of the line segments, check if he can choose exactly 3 of them to form a non-degenerate triangle.
 * <br/>
 * Mahmoud should use exactly 3 line segments, he can't concatenate two line segments or change any length. A non-degenerate triangle is a triangle with positive area.
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 5
 * <br/>
 * 1 5 3 2 4
 * </h2>
 * <h1>Output</h1>
 * <h2>YES</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 3
 * <br/>
 * 4 1 2
 * </h2>
 * <h1>Output:</h1>
 * <h2>NO</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>For the first example, he can use line segments with lengths 2, 4 and 5 to form a non-degenerate triangle.</h2>
 */

public class MahmoudAndATriangleExample {
    private static int countOfLinesLengths;
    private static int[] linesLengths;

    public static void main(final String[] PARAMETERS) throws IOException {
        inputLines();
        final BufferedWriter OUTPUT = new BufferedWriter(new OutputStreamWriter(System.out));
        OUTPUT.write(isNonDegenerateTriangle() ? "YES" : "NO");
        OUTPUT.flush();
    }

    private static boolean isNonDegenerateTriangle() {
        int firstLineLength = linesLengths[0], secondLineLength = linesLengths[1];
        for (int index = 2; index < countOfLinesLengths; index++) {
            final int THIRD_LINE_LENGTH = linesLengths[index];
            if ((firstLineLength + secondLineLength) <= THIRD_LINE_LENGTH) {
                firstLineLength = secondLineLength;
                secondLineLength = THIRD_LINE_LENGTH;
            } else return true;
        }
        return false;
    }

    private static void inputLines() throws IOException {
        final BufferedReader INPUT = new BufferedReader(new InputStreamReader(System.in));
        countOfLinesLengths = Integer.parseInt(INPUT.readLine());
        linesLengths = new int[countOfLinesLengths];
        final StringTokenizer LINE = new StringTokenizer(INPUT.readLine());
        for (int index = 0; index < countOfLinesLengths; index++) linesLengths[index] = Integer.parseInt(LINE.nextToken());
        Arrays.sort(linesLengths);
    }
}