package _2_solving._2_2_w3resource._2_2_12_advanced_concepts._2_2_12_2_unit_test._2_2_12_2_7;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program that uses assertions with custom error messages to provide meaningful feedback when a test fails.</h2>
 */

public class Question7 {
    public static void main(final String[] PARAMETERS) {
        final Calculator CALCULATOR = new Calculator();
        final double FIRST_NUMBER = 5,
                SECOND_NUMBER = 5;
        System.out.printf("""
                        Addition      : %f
                        Subtraction   : %f
                        Multiplication: %f
                        Division      : %f""",
                CALCULATOR.addition(FIRST_NUMBER, SECOND_NUMBER),
                CALCULATOR.subtraction(FIRST_NUMBER, SECOND_NUMBER),
                CALCULATOR.multiplication(FIRST_NUMBER, SECOND_NUMBER),
                CALCULATOR.division(FIRST_NUMBER, SECOND_NUMBER)
        );
    }
}