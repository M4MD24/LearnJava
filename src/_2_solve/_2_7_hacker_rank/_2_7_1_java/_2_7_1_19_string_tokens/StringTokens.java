package _2_solve._2_7_hacker_rank._2_7_1_java._2_7_1_19_string_tokens;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * @see _2_solve._2_7_hacker_rank._2_7_1_java._2_7_1_19_string_tokens.files <h2>Question</h2>
 */

public class StringTokens {
    public static void main(final String[] ARGUMENTS) throws Exception {
        final BufferedReader INPUT = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter OUTPUT = new BufferedWriter(new OutputStreamWriter(System.out));
        final String TEXT = INPUT.readLine().trim();
        if (TEXT.isEmpty())
            OUTPUT.write("0");
        else {
            final String[] PARTS = TEXT.split("[^A-Za-z]+");
            OUTPUT.write(PARTS.length + "\n");
            for (final String PART : PARTS)
                OUTPUT.write(PART + '\n');
        }
        OUTPUT.flush();
    }
}