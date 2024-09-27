package _2_solving._2_2_w3resource._2_2_12_advanced_concepts._2_2_12_2_unit_test._2_2_12_2_7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Question7Test {
    private static final Calculator CALCULATOR = new Calculator();
    private static final double FIRST_NUMBER = 5,
            SECOND_NUMBER = 5;

    @Test
    void testAddition() {
        assertEquals(
                10,
                CALCULATOR.addition(FIRST_NUMBER, SECOND_NUMBER),
                "Addition test failed!"
        );
        System.out.println(CALCULATOR.addition(FIRST_NUMBER, SECOND_NUMBER));
    }

    @Test
    void testSubtraction() {
        assertEquals(
                0,
                CALCULATOR.subtraction(FIRST_NUMBER, SECOND_NUMBER),
                "Subtraction test failed!"
        );
        System.out.println(CALCULATOR.subtraction(FIRST_NUMBER, SECOND_NUMBER));
    }

    @Test
    void testMultiplication() {
        assertEquals(
                25,
                CALCULATOR.multiplication(FIRST_NUMBER, SECOND_NUMBER),
                "Multiplication test failed!"
        );
        System.out.println(CALCULATOR.multiplication(FIRST_NUMBER, SECOND_NUMBER));
    }

    @Test
    void testDivision() {
        assertEquals(
                1,
                CALCULATOR.division(FIRST_NUMBER, SECOND_NUMBER),
                "Division test failed!"
        );
        System.out.println(CALCULATOR.division(FIRST_NUMBER, SECOND_NUMBER));
    }
}