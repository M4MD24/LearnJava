package _2_problem_solving._2_2_w3resource._2_2_4_math_and_numbers._2_2_4_1_math._2_2_4_1_27_question_366;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to check if a given number is a Fibonacci number or not.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input a number: 55
 * <br/>
 * Is Fibonacci number? true
 * </h2>
 */

public class Question366 {
    public static void main(final String[] ARGS) {
        final int NUMBER = 55;
        System.out.print(STR."""
                Input a number: \{NUMBER}
                Is Fibonacci number? \{isFibonacci(NUMBER)}""");
    }

    private static boolean isFibonacci(final int NUMBER) {
        return isPerfectSquare(5 * NUMBER * NUMBER + 4) || isPerfectSquare(5 * NUMBER * NUMBER - 4);
    }

    private static boolean isPerfectSquare(final int NUMBER) {
        return Math.sqrt(NUMBER) * Math.sqrt(NUMBER) == NUMBER;
    }
}