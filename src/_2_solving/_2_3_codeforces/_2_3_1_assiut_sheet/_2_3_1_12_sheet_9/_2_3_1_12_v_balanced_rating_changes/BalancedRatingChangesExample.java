package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_12_sheet_9._2_3_1_12_v_balanced_rating_changes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;

/**
 * <h1>V. Balanced Rating Changes</h1>
 * <h2>
 * time limit per test: 1 second
 * <br/>
 * memory limit per test: 512 megabytes
 * <br/>
 * input: standard input
 * <br/>
 * output: standard output
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 3
 * <br/>
 * 10
 * <br/>
 * -5
 * <br/>
 * -5
 * </h2>
 * <h1>Output</h1>
 * <h2>
 * 5
 * <br/>
 * -2
 * <br/>
 * -3
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 7
 * <br/>
 * -7
 * <br/>
 * -29
 * <br/>
 * 0
 * <br/>
 * 3
 * <br/>
 * 24
 * <br/>
 * -29
 * <br/>
 * 38
 * </h2>
 * <h1>Output</h1>
 * <h2>
 * -3
 * <br/>
 * -15
 * <br/>
 * 0
 * <br/>
 * 2
 * <br/>
 * 12
 * <br/>
 * -15
 * <br/>
 * 19
 * </h2>
 *
 * @see _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_12_sheet_9._2_3_1_12_v_balanced_rating_changes.images <h2>Question and Note</h2>
 */

public class BalancedRatingChangesExample {
    private static final BufferedReader INPUT = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter OUTPUT = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(final String[] PARAMETERS) throws IOException {
        inputValues();
        OUTPUT.flush();
    }

    private static void inputValues() throws IOException {
        short countOfNumbers = Short.parseShort(INPUT.readLine());
        boolean isFloored = false;
        while (countOfNumbers-- > 0) isFloored = isFloored(Short.parseShort(INPUT.readLine()), isFloored);
    }

    private static boolean isFloored(final short CURRENT_NUMBER, boolean isFloored) throws IOException {
        final double HALF_NUMBER = (double) CURRENT_NUMBER / 2;
        if (CURRENT_NUMBER % 2 == 0) OUTPUT.write((short) HALF_NUMBER + "\n");
        else {
            if (isFloored) OUTPUT.write((short) (Math.ceil(HALF_NUMBER)) + "\n");
            else OUTPUT.write((short) (Math.floor(HALF_NUMBER)) + "\n");
            isFloored = !isFloored;
        }
        return isFloored;
    }
}