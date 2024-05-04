package _2_problem_solving._2_2_w3resource._2_2_3_control_flow._2_2_3_2_recursive_method._2_2_3_2_1_question_325;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java recursive method to calculate the factorial of a given positive integer.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>Factorial of 7 is: 5040</h2>
 */

public class Question325 {
    public static void main(final String[] ARGS) {
        final int NUMBER = 7;
        System.out.print(STR."Factorial of \{NUMBER} is: \{getFactorial(NUMBER, 1)}");
    }

    private static int getFactorial(final int NUMBER, final int FACTORIAL) {
        if (NUMBER == 0) return FACTORIAL;
        return getFactorial(NUMBER - 1, NUMBER * FACTORIAL);
    }
}