package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_12_advanced_concepts._2_2_1_1_12_2_unit_test._2_2_1_1_12_2_2;

class Calculator {
    protected double divide(final double FIRST_NUMBER, final double SECOND_NUMBER) {
        if (SECOND_NUMBER != 0)
            return FIRST_NUMBER / SECOND_NUMBER;
        else
            throw new IllegalArgumentException("Division by zero is not allowed!");
    }
}