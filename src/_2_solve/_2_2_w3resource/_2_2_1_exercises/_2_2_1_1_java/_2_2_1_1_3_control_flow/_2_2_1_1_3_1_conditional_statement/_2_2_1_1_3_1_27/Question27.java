package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_3_control_flow._2_2_1_1_3_1_conditional_statement._2_2_1_1_3_1_27;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program that reads an integer and check whether it is negative, zero, or positive.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Input number: 7</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>Number is positive</h2>
 */

public class Question27 {
    public static void main(final String[] ARGUMENTS) {
        final int NUMBER = 7;
        System.out.printf("Input number: %d\n", NUMBER);
        System.out.printf("Number is %s", getStatusOfNumber(NUMBER));
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