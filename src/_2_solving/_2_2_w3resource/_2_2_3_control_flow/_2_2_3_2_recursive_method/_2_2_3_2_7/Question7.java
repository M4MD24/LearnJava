package _2_solving._2_2_w3resource._2_2_3_control_flow._2_2_3_2_recursive_method._2_2_3_2_7;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java recursive method to find the greatest common divisor (GCD) of two numbers.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>The GCD of 16 and 18 is: 2</h2>
 */

public class Question7 {
    public static void main(final String[] ARGS) {
        final int FIRST_NUMBER = 16,
                SECOND_NUMBER = 18;
        System.out.printf("The GCD of %d and %d is %d",
                FIRST_NUMBER,
                SECOND_NUMBER,
                getGreatestCommonDivisor(FIRST_NUMBER, SECOND_NUMBER));
    }

    private static long getGreatestCommonDivisor(long firstNumber, long secondNumber) {
        if (secondNumber == 0) return firstNumber;
        firstNumber += secondNumber;
        secondNumber = firstNumber - secondNumber;
        firstNumber -= secondNumber;
        secondNumber %= firstNumber;
        return getGreatestCommonDivisor(firstNumber, secondNumber);
    }
}