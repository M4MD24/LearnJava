package _2_solve._2_7_hacker_rank._2_7_1_java._2_7_1_17_sub_string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * @see _2_solve._2_7_hacker_rank._2_7_1_java._2_7_1_17_sub_string.files <h2>Question</h2>
 */

public class SubString {
    public static void main(final String[] PARAMETERS) throws Exception {
        final BufferedReader INPUT = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter OUTPUT = new BufferedWriter(new OutputStreamWriter(System.out));
        final String TEXT = INPUT.readLine();
        final String[] FIRST_AND_SECOND_INDICES = INPUT.readLine().split(" ");
        OUTPUT.write(TEXT.substring(Integer.parseInt(FIRST_AND_SECOND_INDICES[0]), Integer.parseInt(FIRST_AND_SECOND_INDICES[1])));
        OUTPUT.flush();
    }
}