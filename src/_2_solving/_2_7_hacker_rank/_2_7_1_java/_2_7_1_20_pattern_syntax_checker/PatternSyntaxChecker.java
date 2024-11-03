package _2_solving._2_7_hacker_rank._2_7_1_java._2_7_1_20_pattern_syntax_checker;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * @see _2_solving._2_7_hacker_rank._2_7_1_java._2_7_1_20_pattern_syntax_checker.files <h2>Question</h2>
 */

public class PatternSyntaxChecker {
    public static void main(final String[] PARAMETERS) throws Exception {
        final BufferedReader INPUT = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter OUTPUT = new BufferedWriter(new OutputStreamWriter(System.out));
        int testCases = Integer.parseInt(INPUT.readLine());
        while (testCases-- > 0)
            try {
                Pattern.compile(INPUT.readLine());
                OUTPUT.write("Valid\n");
            } catch (final PatternSyntaxException PATTERN_SYNTAX_EXCEPTION) {
                OUTPUT.write("Invalid\n");
            }
        OUTPUT.flush();
    }
}