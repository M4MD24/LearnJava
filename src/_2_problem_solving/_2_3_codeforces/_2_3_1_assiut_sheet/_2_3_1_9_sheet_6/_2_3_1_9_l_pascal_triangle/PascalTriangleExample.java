package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_9_sheet_6._2_3_1_9_l_pascal_triangle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <h1>L. Pascal Triangle</h1>
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
 * <h2>Given a number N. Print first N rows of pascal triangle.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>3</h2>
 * <h1>Output:</h1>
 * <h2>
 * 1
 * <br/>
 * 1 1
 * <br/>
 * 1 2 1
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>4</h2>
 * <h1>Output:</h1>
 * <h2>
 * 1
 * <br/>
 * 1 1
 * <br/>
 * 1 2 1
 * <br/>
 * 1 3 3 1
 * </h2>
 */

public class PascalTriangleExample {
    public static void main(final String[] ARGS) throws IOException {
        printPascalTriangle(Byte.parseByte(new BufferedReader(new InputStreamReader(System.in)).readLine()));
    }

    private static void printPascalTriangle(byte targetNumber) {
        for (byte round = 0; round < targetNumber; round++) {
            printPascalLine(round);
            if (round < targetNumber - 1) System.out.println();
        }
    }

    private static void printPascalLine(byte round) {
        int value = 1;
        for (byte index = 0; index <= round; index++) {
            System.out.print(value);
            value = value * (round - index) / (index + 1);
            if (index < round) System.out.print(" ");
        }
    }
}