package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_7_sheet_4._2_3_1_7_x_comparison;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * <h1>X. Comparison</h1>
 * <h2>
 * time limit per test: 4 second
 * <br/>
 * memory limit per test: 256 megabytes
 * <br/>
 * input: standard input
 * <br/>
 * output: standard output
 * </h2>
 * <br/>
 * <h1>Question:</h1>
 * <h2>Given a string S. Print the smallest string that can be obtained by doing the following operations on the original string only:</h2>
 * <ul>
 *     <li>Split the string into two non empty consecutive strings (for example if you split the string into X and Y so S = X+Y).</li>
 *     <li>Sort every one of the separated strings.</li>
 *     <li>Re-concatenate the two stings into one string.</li>
 * </ul>
 * <br/>
 * <h1>Note:</h1>
 * <h2>
 * If you couldn't split the string print the original string.
 * <br/>
 * All possible strings that can be obtained:
 * </h2>
 * <ul>
 *     <li>a + cmicpc : after sorting each part > a + cccimp = acccimp</li>
 *     <li>ac + micpc : after sorting each part > ac + ccimp = acccimp</li>
 *     <li>acm + icpc : after sorting each part > acm + ccip = acmccip</li>
 *     <li>acmi + cpc : after sorting each part > acim + ccp = acimccp</li>
 *     <li>acmi + cpc : after sorting each part > acim + ccp = acimccp</li>
 *     <li>acmic + pc : after sorting each part > accim + cp = accimcp</li>
 *     <li>acmicp + c : after sorting each part > accimp + c = accimpc</li>
 * </ul>
 * <h2>So the smallest one is "acccimp"</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>acmicpc</h2>
 * <h1>Output:</h1>
 * <h2>acccimp</h2>
 */

public class ComparisonExample {
    public static void main(final String[] PARAMETERS) throws IOException {
        final BufferedReader INPUT = new BufferedReader(new InputStreamReader(System.in));
        System.out.print(maximumSubString(new StringBuffer(INPUT.readLine())));
    }

    private static StringBuffer maximumSubString(final StringBuffer TEXT) {
        StringBuffer MAXIMUM_SUB_STRING = new StringBuffer(TEXT);
        for (short index = 0; index + 1 < TEXT.length(); index++) {
            final char[] PART_1 = TEXT.substring(0, index + 1).toCharArray(),
                    PART_2 = TEXT.substring(index + 1).toCharArray();
            if (PART_1.length > 1) Arrays.sort(PART_1);
            if (PART_2.length > 1) Arrays.sort(PART_2);
            final StringBuffer TOTAL_SUB_STRINGS = new StringBuffer(new String(PART_1) + new String(PART_2));
            if (TOTAL_SUB_STRINGS.compareTo(MAXIMUM_SUB_STRING) < 0) MAXIMUM_SUB_STRING = TOTAL_SUB_STRINGS;
        }
        return MAXIMUM_SUB_STRING;
    }
}