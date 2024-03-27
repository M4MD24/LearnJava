package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_10_sheet_7._2_3_1_10_y_number_of_ways;

import java.util.Scanner;

/**
 * <h1>Y. Number of Ways</h1>
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
 * <h2>Given two numbers S and E where S denotes a start point and E denotes an end point. Determine how many possible ways to reach point E if you can move either 1 step, 2 steps or 3 steps at a time.</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>Solve this problem using recursion.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>2 5</h2>
 * <h1>Output:</h1>
 * <h2>4</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>In the example: There are 4 ways to reach from point 2 to point 5 as follows: [2, 3, 4, 5], [2, 3, 5], [2, 4, 5] and [2, 5].</h2>
 */

public class NumberOfWaysExample {
    public static void main(String[] args) {
        inputValues();
    }

    private static void inputValues() {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(returnPossibleWaysToReachFromStartToEndRecursion(INPUT.nextByte(), INPUT.nextByte()));
    }

    private static short returnPossibleWaysToReachFromStartToEndRecursion(byte start, final byte END) {
        if (start > END) return 0;
        else if (start == END) return 1;
        else return (short) (returnPossibleWaysToReachFromStartToEndRecursion(++start, END) +
                    returnPossibleWaysToReachFromStartToEndRecursion(++start, END) +
                    returnPossibleWaysToReachFromStartToEndRecursion(++start, END));
    }
}