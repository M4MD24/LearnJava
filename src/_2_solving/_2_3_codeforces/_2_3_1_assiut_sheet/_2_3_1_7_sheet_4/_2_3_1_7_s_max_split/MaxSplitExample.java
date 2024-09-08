package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_7_sheet_4._2_3_1_7_s_max_split;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <h1>S. Max Split</h1>
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
 * <h1>Question:</h1>
 * <h2>Given a balanced string S consists of ['R', 'L'] characters. Split it into maximum number of strings such that the new strings are also balanced.</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>In case the string ends with X or Y or Z ignore their operations. The score is calculated from left to right and starts with 0.</h2>
 * <ul>
 *     <li>Balanced strings are those who have equal quantities of 'L' and 'R' characters.</li>
 *     <li>You can not remove or reorder the characters while making the new strings.</li>
 * </ul>
 * <br/>
 * <h1>Input:</h1>
 * <h2>LLRRLLLRRR</h2>
 * <h1>Output:</h1>
 * <h2>
 * 2
 * <br/>
 * LLRR
 * <br/>
 * LLLRRR
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>LLLRRR</h2>
 * <h1>Output:</h1>
 * <h2>
 * 1
 * <br/>
 * LLLRRR
 * </h2>
 */

public class MaxSplitExample {
    public static void main(final String[] PARAMETERS) throws IOException {
        final BufferedReader INPUT = new BufferedReader(new InputStreamReader(System.in));
        System.out.print(printMaxSplitAndSplits(new StringBuffer(INPUT.readLine())));
    }

    private static String printMaxSplitAndSplits(final StringBuffer TEXT) {
        short countLLetter = 0,
                countRLetter = 0,
                maxSplit = 0;
        for (short index = 0; index < TEXT.length(); index++) {
            switch (TEXT.charAt(index)) {
                case 'L' -> countLLetter++;
                case 'R' -> countRLetter++;
            }
            if (countLLetter == countRLetter) {
                TEXT.insert(++index, '\n');
                maxSplit++;
            }
        }
        return maxSplit + "\n" + TEXT;
    }
}