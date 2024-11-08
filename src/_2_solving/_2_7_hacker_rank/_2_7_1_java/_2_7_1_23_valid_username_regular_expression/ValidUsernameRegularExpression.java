package _2_solving._2_7_hacker_rank._2_7_1_java._2_7_1_23_valid_username_regular_expression;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * @see _2_solving._2_7_hacker_rank._2_7_1_java._2_7_1_23_valid_username_regular_expression.files <h2>Question</h2>
 */

public class ValidUsernameRegularExpression {
    public static void main(final String[] PARAMETERS) throws Exception {
        final BufferedReader INPUT = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter OUTPUT = new BufferedWriter(new OutputStreamWriter(System.out));
        final int COUNT_OF_TEST_CASES = Integer.parseInt(INPUT.readLine());
        for (int currentCountOfTestCase = 0; currentCountOfTestCase < COUNT_OF_TEST_CASES; currentCountOfTestCase++) {
            OUTPUT.write(isValidUsername(INPUT.readLine()) ? "Valid" : "Invalid");
            if (currentCountOfTestCase < COUNT_OF_TEST_CASES - 1)
                OUTPUT.newLine();
        }
        OUTPUT.flush();
    }

    private static boolean isValidUsername(final String TEXT) {
        return TEXT.matches("^[a-zA-Z][a-zA-Z0-9_]{7,29}$");
    }
}