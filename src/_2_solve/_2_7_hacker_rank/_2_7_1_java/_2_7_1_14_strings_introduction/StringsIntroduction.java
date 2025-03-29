package _2_solve._2_7_hacker_rank._2_7_1_java._2_7_1_14_strings_introduction;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * @see _2_solve._2_7_hacker_rank._2_7_1_java._2_7_1_14_strings_introduction.files <h2>Question</h2>
 */

public class StringsIntroduction {
    public static void main(final String[] ARGUMENTS) throws Exception {
        final BufferedReader INPUT = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter OUTPUT = new BufferedWriter(new OutputStreamWriter(System.out));
        final String FIRST_TEXT = INPUT.readLine(),
                SECOND_TEXT = INPUT.readLine();
        OUTPUT.write(String.valueOf((FIRST_TEXT + SECOND_TEXT).length()));
        OUTPUT.write("\n" + (FIRST_TEXT.compareTo(SECOND_TEXT) > 0 ? "Yes" : "No"));
        OUTPUT.write("\n" + Character.toUpperCase(FIRST_TEXT.charAt(0)) + FIRST_TEXT.substring(1) + " " + Character.toUpperCase(SECOND_TEXT.charAt(0)) + SECOND_TEXT.substring(1));
        OUTPUT.flush();
    }
}