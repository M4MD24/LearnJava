package _2_solving._2_7_hacker_rank._2_7_1_java._2_7_1_7_loop_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;

/**
 * @see _2_solving._2_7_hacker_rank._2_7_1_java._2_7_1_7_loop_2.images.question <h2>Question</h2>
 */

public class Loop2 {
    private static final BufferedReader INPUT = new BufferedReader(new InputStreamReader(System.in));
    private static final BufferedWriter OUTPUT = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(final String[] PARAMETERS) throws IOException {
        inputValues();
        OUTPUT.flush();
    }

    private static void inputValues() throws IOException {
        final int COUNT_OF_LINES = Integer.parseInt(INPUT.readLine());
        for (int currentCountOfLine = 0; currentCountOfLine < COUNT_OF_LINES; currentCountOfLine++) {
            final String[] LINE = INPUT.readLine().split(" ");
            printSeries(
                    Integer.parseInt(LINE[0]),
                    Integer.parseInt(LINE[1]),
                    Integer.parseInt(LINE[2])
            );
        }
    }

    private static void printSeries(final int FIRST_TERM, final int MULTIPLIER, final int SERIES_LENGTH) throws IOException {
        int term = FIRST_TERM;
        for (int number = 0; number < SERIES_LENGTH; number++) {
            term += (1 << number) * MULTIPLIER;
            OUTPUT.write(term + (number < SERIES_LENGTH - 1 ? " " : "\n"));
        }
    }
}