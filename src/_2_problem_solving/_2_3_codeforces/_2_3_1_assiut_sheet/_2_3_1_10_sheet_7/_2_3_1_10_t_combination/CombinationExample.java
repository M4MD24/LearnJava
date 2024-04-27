package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_10_sheet_7._2_3_1_10_t_combination;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <h1>T. Combination</h1>
 * <h2>
 * time limit per test: 2 second
 * <br/>
 * memory limit per test: 64 megabytes
 * <br/>
 * input: standard input
 * <br/>
 * output: standard output
 * </h2>
 * <br/>
 * <h1>Question:</h1>
 * <h2>Given two numbers N and R. Print the NCR value.</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>Solve this problem using recursion.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>4 2</h2>
 * <h1>Output:</h1>
 * <h2>6</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>3 3</h2>
 * <h1>Output:</h1>
 * <h2>1</h2>
 */

public class CombinationExample {
    public static void main(final String[] ARGS) throws IOException {
        inputAndPrintValues();
    }

    private static void inputAndPrintValues() throws IOException {
        final StringBuilder INPUT = new StringBuilder(new BufferedReader(new InputStreamReader(System.in)).readLine());
        System.out.print(getCombination(Byte.parseByte(INPUT.substring(0, INPUT.indexOf(" "))), Byte.parseByte(INPUT.substring(INPUT.indexOf(" ") + 1, INPUT.length()))));
    }

    private static long getCombination(final byte NUMBER_1, final byte NUMBER_2) {
        return (NUMBER_2 > NUMBER_1)
                ? 0
                : combinationRecursion(NUMBER_1, NUMBER_2);
    }

    private static long combinationRecursion(byte number1, byte number2) {
        return (number2 == 0 || number1-- == number2--)
                ? 1
                : combinationRecursion((number1), number2) * (number1 + 1) / (number2 + 1);
    }
}