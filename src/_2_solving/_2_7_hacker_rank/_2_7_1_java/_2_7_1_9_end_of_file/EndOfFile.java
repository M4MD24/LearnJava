package _2_solving._2_7_hacker_rank._2_7_1_java._2_7_1_9_end_of_file;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;

/**
 * @see _2_solving._2_7_hacker_rank._2_7_1_java._2_7_1_9_end_of_file.files <h2>Question</h2>
 */

public class EndOfFile {
    private static final BufferedReader INPUT = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter OUTPUT = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(final String[] PARAMETERS) throws IOException {
        inputValues();
        OUTPUT.flush();
    }

    private static void inputValues() throws IOException {
        String line;
        int countOfLine = 1;
        while ((line = INPUT.readLine()) != null) {
            printLine(countOfLine++, line);
            OUTPUT.write('\n');
        }
    }

    private static void printLine(final int COUNT_OF_LINE, final String LINE) throws IOException {
        OUTPUT.write(COUNT_OF_LINE + " " + LINE);
    }
}