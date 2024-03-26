package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_9_sheet_6._2_3_1_9_n_convert_to_base;

import java.util.Scanner;

/**
 * <h1>N. Convert to Base</h1>
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
 * <h2>Given three numbers T, N and X</h2>
 * <ul>
 *     <li>If T = 1 then Convert N from base X to decimal</li>
 *     <li>If T = 2 then Convert N from decimal to base X</li>
 * </ul>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 1
 * <br/>
 * 101 2
 * </h2>
 * <h1>Output:</h1>
 * <h2>5</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 2
 * <br/>
 * 5 2
 * </h2>
 * <h1>Output:</h1>
 * <h2>101</h2>
 */

public class ConvertToBaseExample {
    public static void main(String[] args) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print((INPUT.nextByte() == 1)
                ? Long.parseLong(INPUT.next(), INPUT.nextByte())
                : Integer.toString(INPUT.nextInt(), INPUT.nextByte()).toUpperCase());
    }
}