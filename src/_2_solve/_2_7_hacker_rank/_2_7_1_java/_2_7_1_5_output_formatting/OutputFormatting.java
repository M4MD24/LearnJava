package _2_solve._2_7_hacker_rank._2_7_1_java._2_7_1_5_output_formatting;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Java's System.out.printf function can be used to print formatted output. The purpose of this exercise is to test your understanding of formatting output using printf.
 * <br/>
 * To get you started, a portion of the solution is provided for you in the editor; you must format and print the input to complete the solution.
 * </h2>
 * <br/>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * java 100
 * <br/>
 * cpp 65
 * <br/>
 * python 50
 * </h2>
 * <br/>
 * <br/>
 * <h1>Output:</h1>
 */
/*
 * ================================
 * <br/>
 * java           100
 * <br/>
 * cpp            065
 * <br/>
 * python         050
 * <br/>
 * ================================
 * */

public class OutputFormatting {
    public static void main(final String[] PARAMETERS) throws IOException {
        final BufferedReader INPUT = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter OUTPUT = new BufferedWriter(new OutputStreamWriter(System.out));
        final String[] FIRST_LINE = INPUT.readLine().split(" "),
                SECOND_LINE = INPUT.readLine().split(" "),
                THIRD_LINE = INPUT.readLine().split(" ");
        OUTPUT.write("=".repeat(32));
        OUTPUT.write(String.format(
                "%n%-15s%03d",
                FIRST_LINE[0],
                Integer.valueOf(FIRST_LINE[1])
        ));
        OUTPUT.write(String.format(
                "%n%-15s%03d",
                SECOND_LINE[0],
                Integer.valueOf(SECOND_LINE[1])
        ));
        OUTPUT.write(String.format(
                "%n%-15s%03d",
                THIRD_LINE[0],
                Integer.valueOf(THIRD_LINE[1])
        ));
        OUTPUT.write('\n' + "=".repeat(32));
        OUTPUT.flush();
    }
}