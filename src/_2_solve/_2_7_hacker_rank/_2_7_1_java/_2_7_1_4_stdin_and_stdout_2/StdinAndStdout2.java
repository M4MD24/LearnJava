package _2_solve._2_7_hacker_rank._2_7_1_java._2_7_1_4_stdin_and_stdout_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;

/**
 * <h1>Problem:</h1>
 * <h2>In this challenge, you must read an integer, a double, and a String from stdin, then print the values according to the instructions in the Output Format section below. To make the problem a little easier, a portion of the code is provided for you in the editor.</h2>
 * <br/>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 42
 * <br/>
 * 3.1415
 * <br/>
 * Welcome to HackerRank's Java tutorials!
 * </h2>
 * <br/>
 * <br/>
 * <h1>Output:</h1>
 * <h2>
 * String: Welcome to HackerRank's Java tutorials!
 * <br/>
 * Double: 3.1415
 * <br/>
 * Int: 42
 * </h2>
 */

public class StdinAndStdout2 {
    public static void main(final String[] ARGUMENTS) throws IOException {
        final BufferedReader INPUT = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter OUTPUT = new BufferedWriter(new OutputStreamWriter(System.out));
        final int INTEGER_NUMBER = Integer.parseInt(INPUT.readLine());
        final double DOUBLE_NUMBER = Double.parseDouble(INPUT.readLine());
        final String TEXT = INPUT.readLine();
        OUTPUT.write("String: " + TEXT);
        OUTPUT.write("\nDouble: " + DOUBLE_NUMBER);
        OUTPUT.write("\nInt: " + INTEGER_NUMBER);
        OUTPUT.flush();
    }
}