package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_12_sheet_9._2_3_1_12_r_ksenia_and_pan_scales;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;

/**
 * <h1>R. Ksenia and Pan Scales</h1>
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
 * <h2>
 * Ksenia has ordinary pan scales and several weights of an equal mass. Ksenia has already put some weights on the scales, while other weights are untouched. Ksenia is now wondering whether it is possible to put all the remaining weights on the scales so that the scales were in equilibrium.
 * <br/>
 * The scales is in equilibrium if the total sum of weights on the left pan is equal to the total sum of weights on the right pan.
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * AC|T
 * <br/>
 * L
 * </h2>
 * <h1>Output</h1>
 * <h2>AC|TL</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * |ABC
 * <br/>
 * XYZ
 * </h2>
 * <h1>Output:</h1>
 * <h2>XYZ|ABC</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * W|T
 * <br/>
 * F
 * </h2>
 * <h1>Output:</h1>
 * <h2>Impossible</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * ABC|
 * <br/>
 * D
 * </h2>
 * <h1>Output:</h1>
 * <h2>Impossible</h2>
 */

public class KseniaAndPanScalesFunctionExample {
    private static final BufferedReader INPUT = new BufferedReader(new InputStreamReader(System.in));

    public static void main(final String[] PARAMETERS) throws IOException {
        final BufferedWriter OUTPUT = new BufferedWriter(new OutputStreamWriter(System.out));
        OUTPUT.write(isBalanced(new StringBuffer(INPUT.readLine())));
        OUTPUT.flush();
    }

    private static String isBalanced(final StringBuffer PAN_SCALES) throws IOException {
        final StringBuffer CURRENT_SEVERAL_WEIGHTS = new StringBuffer(INPUT.readLine()),
                FIRST_SEVERAL_WEIGHTS = new StringBuffer(PAN_SCALES.substring(0, PAN_SCALES.indexOf("|"))),
                LAST_SEVERAL_WEIGHTS = new StringBuffer(PAN_SCALES.substring(PAN_SCALES.indexOf("|") + 1));
        if ((FIRST_SEVERAL_WEIGHTS.length() + LAST_SEVERAL_WEIGHTS.length() + CURRENT_SEVERAL_WEIGHTS.length()) % 2 == 0) {
            for (int index = 0; index < CURRENT_SEVERAL_WEIGHTS.length(); index++) {
                if (FIRST_SEVERAL_WEIGHTS.length() > LAST_SEVERAL_WEIGHTS.length()) LAST_SEVERAL_WEIGHTS.append(CURRENT_SEVERAL_WEIGHTS.charAt(index));
                else FIRST_SEVERAL_WEIGHTS.append(CURRENT_SEVERAL_WEIGHTS.charAt(index));
            }
            return (FIRST_SEVERAL_WEIGHTS.length() == LAST_SEVERAL_WEIGHTS.length()) ? FIRST_SEVERAL_WEIGHTS + "|" + LAST_SEVERAL_WEIGHTS : "Impossible";
        } else return "Impossible";
    }
}