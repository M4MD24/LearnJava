package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_12_sheet_9._2_3_1_12_y_polo_the_penguin_and_segments;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * <h1>Y. Polo the Penguin and Segments</h1>
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
 * <h1>Input:</h1>
 * <h2>
 * 2 3
 * <br/>
 * 1 2
 * <br/>
 * 3 4
 * </h2>
 * <h1>Output</h1>
 * <h2>2</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 3 7
 * <br/>
 * 1 2
 * <br/>
 * 3 3
 * <br/>
 * 4 7
 * </h2>
 * <h1>Output</h1>
 * <h2>0</h2>
 *
 * @see _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_12_sheet_9._2_3_1_12_y_polo_the_penguin_and_segments.images <h2>Question</h2>
 */

public class PoloThePenguinAndSegmentsExample {
    private static int divisorNumber, sumOfNumbers;

    public static void main(final String[] PARAMETERS) throws IOException {
        final BufferedWriter OUTPUT = new BufferedWriter(new OutputStreamWriter(System.out));
        inputSegments();
        OUTPUT.write(String.valueOf(getNumberOfTimesChanged()));
        OUTPUT.flush();
    }

    private static int getNumberOfTimesChanged() {
        sumOfNumbers %= divisorNumber;
        return sumOfNumbers == 0 ? 0 : divisorNumber - sumOfNumbers;
    }

    private static void inputSegments() throws IOException {
        final BufferedReader INPUT = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer line = new StringTokenizer(INPUT.readLine());
        int countOfSegments = Integer.parseInt(line.nextToken());
        divisorNumber = Integer.parseInt(line.nextToken());
        while (countOfSegments-- > 0) {
            line = new StringTokenizer(INPUT.readLine());
            final int LEFT_NUMBER = Integer.parseInt(line.nextToken()), RIGHT_NUMBER = Integer.parseInt(line.nextToken());
            sumOfNumbers += (RIGHT_NUMBER - (LEFT_NUMBER - 1));
        }
    }
}