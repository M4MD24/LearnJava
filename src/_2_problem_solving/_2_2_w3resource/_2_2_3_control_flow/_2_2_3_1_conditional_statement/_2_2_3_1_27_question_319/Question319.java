package _2_problem_solving._2_2_w3resource._2_2_3_control_flow._2_2_3_1_conditional_statement._2_2_3_1_27_question_319;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program that reads an integer and check whether it is negative, zero, or positive.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Input number: 7</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>Number is positive</h2>
 */

public class Question319 {
    public static void main(final String[] ARGS) {
        final int NUMBER = 7;
        System.out.println(STR."Input number: \{NUMBER}");
        System.out.print(STR."Number is \{getStatusOfNumber(NUMBER)}");
    }

    private static String getStatusOfNumber(final int NUMBER) {
        if (NUMBER > 0)
            return "positive";
        else if (NUMBER == 0)
            return "zero";
        else
            return "negative";
    }
}