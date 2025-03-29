package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_3_control_flow._2_2_1_1_3_2_recursive_method._2_2_1_1_3_2_3;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java recursive method to calculate the nth Fibonacci number.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>The fibonacci number at position 9 is: 34</h2>
 */

public class Question3 {
    private static int firstNumber = 1,
            secondNumber = 1;

    public static void main(final String[] ARGUMENTS) {
        final int NUMBER = 9;
        System.out.printf("The fibonacci number at position %d is: %d",
                NUMBER,
                getFibonacci(NUMBER));
    }

    private static int getFibonacci(int length) {
        if (length == 1) return firstNumber;
        else if (length == 2) return secondNumber;
        else {
            final int FIBONACCI = firstNumber + secondNumber;
            firstNumber = secondNumber;
            secondNumber = FIBONACCI;
            if (length-- > 2) getFibonacci(length);
        }
        return secondNumber;
    }
}