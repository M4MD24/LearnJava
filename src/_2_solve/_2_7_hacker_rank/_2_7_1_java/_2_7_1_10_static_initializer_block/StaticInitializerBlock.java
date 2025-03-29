package _2_solve._2_7_hacker_rank._2_7_1_java._2_7_1_10_static_initializer_block;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;

/**
 * @see _2_solve._2_7_hacker_rank._2_7_1_java._2_7_1_10_static_initializer_block.files <h2>Question</h2>
 */

public class StaticInitializerBlock {
    private static final BufferedReader INPUT;
    private static final BufferedWriter OUTPUT;

    static {
        INPUT = new BufferedReader(new InputStreamReader(System.in));
        OUTPUT = new BufferedWriter(new OutputStreamWriter(System.out));
    }

    public static void main(final String[] ARGUMENTS) throws Exception {
        inputValues();
        OUTPUT.flush();
    }

    private static void inputValues() throws Exception {
        final int HEIGHT = Integer.parseInt(INPUT.readLine()),
                BASE_LENGTH = Integer.parseInt(INPUT.readLine());
        if (HEIGHT <= 0 || BASE_LENGTH <= 0)
            OUTPUT.write("java.lang.Exception: Breadth and height must be positive");
        else
            OUTPUT.write(String.valueOf(areaOfParallelogram(HEIGHT, BASE_LENGTH)));
    }

    private static int areaOfParallelogram(final int HEIGHT, final int BASE_LENGTH) {
        return HEIGHT * BASE_LENGTH;
    }
}