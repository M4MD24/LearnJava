package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_10_string_and_input_and_output._2_2_1_1_10_2_input_and_output._2_2_1_1_10_2_8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to read input from the Java console.</h2>
 */

public class Question8 {
    public static void main(final String[] ARGUMENTS) throws IOException {
        final BufferedReader CONSOLE_INPUT = new BufferedReader(new InputStreamReader(System.in));
        System.out.print(CONSOLE_INPUT.readLine());
    }
}