package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_4_math_and_numbers._2_2_1_4_1_math._2_2_1_4_1_27;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to check if a given number is a Fibonacci number or not.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input a number: 55
 * <br/>
 * Is Fibonacci number? true
 * </h2>
 */

public class Question27 {
    public static void main(final String[] ARGUMENTS) {
        final int NUMBER = 55;
        System.out.printf("""
                Input a number: %d
                Is Fibonacci number? %b""",
                NUMBER,
                isFibonacci(NUMBER));
    }

    private static boolean isFibonacci(final int NUMBER) {
        return isPerfectSquare(5 * NUMBER * NUMBER + 4) || isPerfectSquare(5 * NUMBER * NUMBER - 4);
    }

    private static boolean isPerfectSquare(final int NUMBER) {
        return Math.sqrt(NUMBER) * Math.sqrt(NUMBER) == NUMBER;
    }
}