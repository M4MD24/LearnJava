package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_11_sheet_8._2_3_1_11_q_night_at_the_museum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <h1>Q. Night at the Museum</h1>
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
 * <h2>zeus</h2>
 * <h1>Output:</h1>
 * <h2>18</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>map</h2>
 * <h1>Output:</h1>
 * <h2>35</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>ares</h2>
 * <h1>Output:</h1>
 * <h2>34</h2>
 *
 * @see _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_11_sheet_8._2_3_1_11_q_night_at_the_museum.images <h2>Question and Note</h2>
 */

public class NightAtTheMuseumExample {
    public static void main(final String[] PARAMETERS) throws IOException {
        System.out.print(getSumMovements(new StringBuffer(new BufferedReader(new InputStreamReader(System.in)).readLine())));
    }

    private static short getSumMovements(final StringBuffer TEXT) {
        byte currentCursor = 97;
        short sumMovements = 0;
        for (byte index = 0; index < TEXT.length(); index++) {
            final byte TARGET_CURSOR = (byte) Math.abs(TEXT.charAt(index) - currentCursor);
            sumMovements += (TARGET_CURSOR <= 13)
                    ? TARGET_CURSOR
                    : (short) (26 - TARGET_CURSOR);
            currentCursor = (byte) TEXT.charAt(index);
        }
        return sumMovements;
    }
}