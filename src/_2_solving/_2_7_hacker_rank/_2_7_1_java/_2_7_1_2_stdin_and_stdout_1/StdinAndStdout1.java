package _2_solving._2_7_hacker_rank._2_7_1_java._2_7_1_2_stdin_and_stdout_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <h1>Problem:</h1>
 * <h2>In this challenge, you must read 3 integers from stdin and then print them to stdout. Each integer must be printed on a new line. To make the problem a little easier, a portion of the code is provided for you in the editor below.</h2>
 * <br/>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 42
 * <br/>
 * 100
 * <br/>
 * 125
 * </h2>
 * <br/>
 * <br/>
 * <h1>Output:</h1>
 * <h2>
 * 42
 * <br/>
 * 100
 * <br/>
 * 125
 * </h2>
 */

public class StdinAndStdout1 {
    public static void main(final String[] PARAMETERS) throws IOException {
        final BufferedReader INPUT = new BufferedReader(new InputStreamReader(System.in));
        final int FIRST_NUMBER = Integer.parseInt(INPUT.readLine()),
                SECOND_NUMBER = Integer.parseInt(INPUT.readLine()),
                THIRD_NUMBER = Integer.parseInt(INPUT.readLine());
        System.out.printf("""
                        %d
                        %d
                        %d""",
                FIRST_NUMBER,
                SECOND_NUMBER,
                THIRD_NUMBER);
    }
}