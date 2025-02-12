package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_12_advanced_concepts._2_2_1_12_2_unit_test._2_2_1_12_2_3;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java test case that implements a JUnit test with setup and teardown methods to prepare and clean up resources for multiple test cases.</h2>
 */

public class Question3 {
    public static void main(final String[] ARGUMENTS) {
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