package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_1_sheet_1._2_3_1_1_a_say_hello;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;

/**
 * <h1>A. Say Hello</h1>
 * <h2>
 * time limit per test: 1 second
 * <br/>
 * memory limit per test: 256 megabytes
 * <br/>
 * input: standard input
 * <br/>
 * output: standard output
 * </h2>
 * <br/>
 * <h1>Question:</h1>
 * <h2>Given a name S. Print "Hello, (name)" without parentheses.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>programmer</h2>
 * <h1>Output:</h1>
 * <h2>Hello, programmer</h2>
 */
public class SayHelloExample {
    public static void main(final String[] ARGS) throws IOException {
        final BufferedWriter OUTPUT = new BufferedWriter(new OutputStreamWriter(System.out));
        final BufferedReader INPUT = new BufferedReader(new InputStreamReader(System.in));
        OUTPUT.write("Hello, " + INPUT.readLine());
        OUTPUT.flush();
    }
}