package _2_solve._2_2_w3resource._2_2_12_advanced_concepts._2_2_12_2_unit_test._2_2_12_2_4;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program that implements parameterized test to verify that a method behaves correctly for different input values.</h2>
 */

public class Question4 {
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