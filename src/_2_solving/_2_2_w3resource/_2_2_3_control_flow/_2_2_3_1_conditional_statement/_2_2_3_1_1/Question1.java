package _2_solving._2_2_w3resource._2_2_3_control_flow._2_2_3_1_conditional_statement._2_2_3_1_1;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to get a number from the user and print whether it is positive or negative.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Input number: 35</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>35 is positive</h2>
 */

public class Question1 {
    public static void main(final String[] ARGS) {
        final int NUMBER = 35;
        System.out.printf("Input number: %d\n", NUMBER);
        System.out.printf("%d is %s",
                NUMBER,
                getStatusOfNumber(NUMBER));
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