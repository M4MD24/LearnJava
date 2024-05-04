package _2_problem_solving._2_2_w3resource._2_2_3_control_flow._2_2_3_1_conditional_statement._2_2_3_1_4_question_296;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program that reads a floating-point number and prints "zero" if the number is zero. Otherwise, print "positive" or "negative". Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Input a number: 25</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>Positive number</h2>
 */

public class Question296 {
    public static void main(final String[] ARGS) {
        final int NUMBER = 25;
        System.out.println(STR."Input a number: \{NUMBER}");
        System.out.print(getNumberStatus(NUMBER));
    }

    private static String getNumberStatus(final int NUMBER) {
        if (NUMBER > 0) {
            if (NUMBER < 1)
                return "Positive small number";
            else if (NUMBER > 1000000)
                return "Positive large number";
            else
                return "Positive number";
        } else if (NUMBER == 0)
            return "Zero";
        else {
            if (Math.abs(NUMBER) < 1)
                return "Negative small number";
            else if (Math.abs(NUMBER) > 1000000)
                return "Negative large number";
            else
                return "Negative number";
        }
    }
}