package _1_learn._1_4_testing._1_4_1_junit_5._1_4_1_3_before_and_after_all;

public class BeforeAndAfterAllExample {
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