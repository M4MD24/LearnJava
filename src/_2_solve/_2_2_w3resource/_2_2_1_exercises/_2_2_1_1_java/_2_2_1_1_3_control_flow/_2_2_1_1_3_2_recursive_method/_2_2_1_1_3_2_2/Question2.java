package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_3_control_flow._2_2_1_1_3_2_recursive_method._2_2_1_1_3_2_2;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java recursive method to calculate the sum of all numbers from 1 to n.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>Sum of numbers from 0 to 7 is: 28</h2>
 */

public class Question2 {
    public static void main(final String[] ARGUMENTS) {
        final int NUMBER = 7;
        System.out.printf("Sum of numbers from 0 to %d is: %d",
                NUMBER,
                getFactorial(NUMBER, 0));
    }

    private static int getFactorial(final int TARGET_NUMBER, final int SUM) {
        if (TARGET_NUMBER == 0) return SUM;
        return getFactorial(TARGET_NUMBER - 1, SUM + TARGET_NUMBER);
    }
}