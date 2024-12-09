package _2_solve._2_7_hacker_rank._2_7_1_java._2_7_1_6_loop_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;

/**
 * @see _2_solve._2_7_hacker_rank._2_7_1_java._2_7_1_6_loop_1.images <h2>Question</h2>
 */

public class Loop1 {
    private static final BufferedWriter OUTPUT = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(final String[] PARAMETERS) throws IOException {
        final BufferedReader INPUT = new BufferedReader(new InputStreamReader(System.in));
        final int TARGET_NUMBER = Integer.parseInt(INPUT.readLine());
        printMultiplicationTableTargetNumber(TARGET_NUMBER);
        OUTPUT.flush();
    }

    private static void printMultiplicationTableTargetNumber(final int TARGET_NUMBER) throws IOException {
        for (int secondNumber = 1; secondNumber < 11; secondNumber++) {
            OUTPUT.write(TARGET_NUMBER + " x " + secondNumber + " = " + TARGET_NUMBER * secondNumber);
            if (secondNumber != 10)
                OUTPUT.write('\n');
        }
    }
}