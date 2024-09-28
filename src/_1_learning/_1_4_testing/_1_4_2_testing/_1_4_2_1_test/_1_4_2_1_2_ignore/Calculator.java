package _1_learning._1_4_testing._1_4_2_testing._1_4_2_1_test._1_4_2_1_2_ignore;

class Calculator {
    protected double addition(final double FIRST_NUMBER, final double SECOND_NUMBER) {
        return FIRST_NUMBER + SECOND_NUMBER;
    }

    protected double subtraction(final double FIRST_NUMBER, final double SECOND_NUMBER) {
        return FIRST_NUMBER - SECOND_NUMBER;
    }

    protected double multiplication(final double FIRST_NUMBER, final double SECOND_NUMBER) {
        return FIRST_NUMBER * SECOND_NUMBER;
    }

    protected double division(final double FIRST_NUMBER, final double SECOND_NUMBER) {
        if (SECOND_NUMBER != 0)
            return FIRST_NUMBER / SECOND_NUMBER;
        else
            throw new IllegalArgumentException("Division by zero is not allowed!");
    }
}