package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_7_functional_programming._2_2_1_1_7_1_lambda_expression._2_2_1_1_7_1_1;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to implement a lambda expression to find the sum of two integers.</h2>
 */

public class Question1 {
    public static void main(final String[] ARGUMENTS) {
        final Calculate SUM_OF_TWO_NUMBERS = Integer::sum;
        System.out.print(SUM_OF_TWO_NUMBERS.sum(1, 5));
    }
}

interface Calculate {
    int sum(final int FIRST_NUMBER, final int SECOND_NUMBER);
}