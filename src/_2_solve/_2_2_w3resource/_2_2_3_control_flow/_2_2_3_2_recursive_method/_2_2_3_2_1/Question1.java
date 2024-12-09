package _2_solve._2_2_w3resource._2_2_3_control_flow._2_2_3_2_recursive_method._2_2_3_2_1;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java recursive method to calculate the factorial of a given positive integer.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>Factorial of 7 is: 5040</h2>
 */

public class Question1 {
    public static void main(final String[] PARAMETERS) {
        final int NUMBER = 7;
        System.out.printf("Factorial of %d is: %d",
                NUMBER,
                getFactorial(NUMBER, 1));
    }

    private static int getFactorial(final int NUMBER, final int FACTORIAL) {
        if (NUMBER == 0) return FACTORIAL;
        return getFactorial(NUMBER - 1, NUMBER * FACTORIAL);
    }
}