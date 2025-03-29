package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_3_control_flow._2_2_1_1_3_1_conditional_statement._2_2_1_1_3_1_28;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program that reads a floating-point number. If the number is zero it prints "zero", otherwise, print "positive" or "negative". Add "small" if the absolute value of the number is less than 1, or "large" if it exceeds 1,000,000.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Input a number: -2534</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>Negative</h2>
 */

public class Question28 {
    public static void main(final String[] ARGUMENTS) {
        final int NUMBER = -2534;
        System.out.printf("Input a number: %d", NUMBER);
        System.out.print(getStatusOfNumber(NUMBER));
    }

    private static String getStatusOfNumber(final int NUMBER) {
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