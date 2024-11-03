package _2_solving._2_7_hacker_rank._2_7_1_java._2_7_1_11_int_to_string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * @see _2_solving._2_7_hacker_rank._2_7_1_java._2_7_1_11_int_to_string.files <h2>Question</h2>
 */

public class IntToString {
    private static final BufferedReader INPUT = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter OUTPUT = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(final String[] PARAMETERS) throws Exception {
        inputValues();
        OUTPUT.flush();
    }

    private static void inputValues() throws Exception {
        final int NUMBER = Integer.parseInt(INPUT.readLine());
        final String NUMBER_AS_STRING = String.valueOf(NUMBER);
        OUTPUT.write(
                NUMBER_AS_STRING.equals(String.valueOf(NUMBER))
                        ? "Good job"
                        : "Wrong answer"
        );
    }
}