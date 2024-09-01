package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_10_sheet_7._2_3_1_10_a_print_recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <h1>A. Print Recursion</h1>
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
 * <h2>Given a number N. Print "I love Recursion" N times.</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>Solve this problem using recursion.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>3</h2>
 * <h1>Output:</h1>
 * <h2>
 * I love Recursion
 * <br/>
 * I love Recursion
 * <br/>
 * I love Recursion
 * </h2>
 */

public class PrintRecursionExample {
    public static void main(final String[] ARGS) throws IOException {
        System.out.print(returnILoveRecursionRecursion(Byte.parseByte(new BufferedReader(new InputStreamReader(System.in)).readLine())));
    }

    private static String returnILoveRecursionRecursion(byte countOfLines) {
        if (countOfLines == 0) return "";
        return "I love Recursion\n" + returnILoveRecursionRecursion(--countOfLines);
    }
}