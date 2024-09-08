package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_13_sheet_10._2_3_1_13_r_cut_ribbon;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * <h1>R. Cut Ribbon</h1>
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
 * <h2>Polycarpus has a ribbon, its length is n. He wants to cut the ribbon in a way that fulfils the following two conditions:</h2>
 * <ul>
 *     <li>After the cutting each ribbon piece should have length a, b or c.</li>
 *     <li>After the cutting the number of ribbon pieces should be maximum.</li>
 * </ul>
 * <h2>Help Polycarpus and find the number of ribbon pieces after the required cutting.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>5 5 3 2</h2>
 * <h1>Output:</h1>
 * <h2>2</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>7 5 5 2</h2>
 * <h1>Output:</h1>
 * <h2>2</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>
 * In the first example Polycarpus can cut the ribbon in such way: the first piece has length 2, the second piece has length 3.
 * <br/>
 * In the second example Polycarpus can cut the ribbon in such way: the first piece has length 5, the second piece has length 2.
 * </h2>
 */

public class CutRibbonExample {
    private static short targetToCut, firstRibbon, secondRibbon, thirdRibbon;

    public static void main(final String[] PARAMETERS) throws IOException {
        final BufferedWriter OUTPUT = new BufferedWriter(new OutputStreamWriter(System.out));
        inputValues();
        OUTPUT.write(String.valueOf(getCountOfCut()));
        OUTPUT.flush();
    }

    private static short getCountOfCut() {
        short countOfCut = 0;
        for (int round = 0; round <= targetToCut; round++) {
            for (int index = 0; index <= targetToCut; index++) {
                int currentRibbon = (targetToCut - firstRibbon * round - secondRibbon * index) / thirdRibbon;
                if (currentRibbon < 0) currentRibbon = 0;
                if ((firstRibbon * round) + (secondRibbon * index) + (thirdRibbon * currentRibbon) == targetToCut) countOfCut = (short) Math.max(countOfCut, round + index + currentRibbon);
            }
        }
        return countOfCut;
    }

    private static void inputValues() throws IOException {
        final BufferedReader INPUT = new BufferedReader(new InputStreamReader(System.in));
        final StringTokenizer LINE = new StringTokenizer(INPUT.readLine());
        targetToCut = Short.parseShort(LINE.nextToken());
        firstRibbon = Short.parseShort(LINE.nextToken());
        secondRibbon = Short.parseShort(LINE.nextToken());
        thirdRibbon = Short.parseShort(LINE.nextToken());
    }
}