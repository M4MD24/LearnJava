package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_1_sheet_1._2_3_1_1_h_two_numers;

import java.util.Scanner;

/**
 * <h1>H. Two Numbers</h1>
 * <h2>
 * time limit per test: 1 second
 * <br/>
 * memory limit per test: 256 megabytes
 * <br/>
 * input standard input
 * <br/>
 * output standard output
 * </h2>
 * <br/>
 * <h1>Question:</h1>
 * <h2>Given 2 numbers A and B, Print floor, ceil and round of A/B</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>10 3</h2>
 * <h1>Output:</h1>
 * <h2>
 * floor 10 / 3 = 3
 * <br/>
 * ceil 10 / 3 = 4
 * <br/>
 * round 10 / 3 = 3
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>10 4</h2>
 * <h1>Output:</h1>
 * <h2>
 * floor 10 / 4 = 2
 * <br/>
 * ceil 10 / 4 = 3
 * <br/>
 * round 10 / 4 = 3
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>10 6</h2>
 * <h1>Output:</h1>
 * <h2>
 * floor 10 / 6 = 1
 * <br/>
 * ceil 10 / 6 = 2
 * <br/>
 * round 10 / 6 = 2
 * </h2>
 */

public class TwoNumbersExample {
    private static final Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        final long number1 = Long.parseLong(input.next()),
                number2 = Long.parseLong(input.next());
        float divideTwoNumbers = (float) number1 / number2;

        System.out.println("floor " + number1 + " / " + number2 + " = " + (long) Math.floor(divideTwoNumbers));
        System.out.println("ceil " + number1 + " / " + number2 + " = " + (long) Math.ceil(divideTwoNumbers));
        System.out.print("round " + number1 + " / " + number2 + " = " + Math.round(divideTwoNumbers));
    }
}