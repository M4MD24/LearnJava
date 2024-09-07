package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_12_sheet_9._2_3_1_12_p_calculating_function;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;

/**
 * <h1>P. Calculate Function</h1>
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
 * <h1>Input:</h1>
 * <h2>4</h2>
 * <h1>Output</h1>
 * <h2>2</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>5</h2>
 * <h1>Output:</h1>
 * <h2>-3</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>
 * f(4) = - 1 + 2 - 3 + 4 = 2
 * <br/>
 * f(5) = - 1 + 2 - 3 + 4 - 5 = - 3
 * </h2>
 *
 * @see _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_12_sheet_9._2_3_1_12_p_calculating_function.images <h2>Question</h2>
 */

public class CalculateFunctionExample {
    public static void main(final String[] PARAMETERS) throws IOException {
        final BufferedWriter OUTPUT = new BufferedWriter(new OutputStreamWriter(System.out));
        OUTPUT.write(String.valueOf(calculateResultOfNumber(Long.parseLong(new BufferedReader(new InputStreamReader(System.in)).readLine()))));
        OUTPUT.flush();
    }

    private static long calculateResultOfNumber(final long NUMBER) {
        return (NUMBER % 2 == 0) ? NUMBER / 2 : -(NUMBER / 2 + 1);
    }
}