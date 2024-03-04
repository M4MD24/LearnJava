package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_sheets._2_3_1_1_data_types_and_conditions._2_3_1_1_i_welcome_for_you_with_conditions;

import java.util.Scanner;

/**
 * <h1>I. Welcome for you with Conditions</h1>
 * <h2>
 * time limit per test: 1 second
 * <br/>
 * memory limit per test: 64 megabytes
 * <br/>
 * input standard input
 * <br/>
 * output standard output
 * </h2>
 * <br/>
 * <h1>Question:</h1>
 * <h2>Given two numbers A and B. Print "Yes" if A is greater than or equal to B. Otherwise print "No".</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>10 9</h2>
 * <h1>Output:</h1>
 * <h2>Yes</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>5 5</h2>
 * <h1>Output:</h1>
 * <h2>Yes</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>5 7</h2>
 * <h1>Output:</h1>
 * <h2>No</h2>
 */

public class WelcomeForYouWithConditionsExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static final int NUMBER_1 = Integer.parseInt(INPUT.next()),
            NUMBER_2 = Integer.parseInt(INPUT.next());
    private static final String CONDITION = (NUMBER_1 >= NUMBER_2) ? "Yes" : "No";

    public static void main(String[] args) {
        System.out.print(CONDITION);
    }
}