package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_10_sheet_7._2_3_1_10_c_print_from_targe_number_to_one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <h1>C. Print from Target Number to One</h1>
 * <h2>
 * time limit per test: 1 second
 * <br/>
 * memory limit per test: 64 megabytes
 * <br/>
 * input: standard input
 * <br/>
 * output: standard output
 * </h2>
 * <br/>
 * <h1>Question:</h1>
 * <h2>Given a number N. Print all numbers from N to 1 separated by a single space.</h2>
 * <br/>
 * <h1>Note:</h1>
 * <ul>
 *     <li>Solve this problem using recursion.</li>
 *     <li>Make sure don't print any leading or trailing spaces.</li>
 * </ul>
 * <br/>
 * <h1>Input:</h1>
 * <h2>4</h2>
 * <h1>Output:</h1>
 * <h2>4 3 2 1</h2>
 */

public class PrintFromTargetNumberToOneExample {
    public static void main(final String[] ARGS) throws IOException {
        System.out.print(printFromTargetNumberToTargetNumberRecursion(Short.parseShort(new BufferedReader(new InputStreamReader(System.in)).readLine())));
    }

    private static String printFromTargetNumberToTargetNumberRecursion(short targetNumber) {
        if (targetNumber > 0) return targetNumber-- + ((targetNumber != 0) ? " " + printFromTargetNumberToTargetNumberRecursion(targetNumber) : printFromTargetNumberToTargetNumberRecursion(targetNumber));
        return "";
    }
}