package _2_solving._2_2_w3resource._2_2_12_advanced_concepts._2_2_12_2_unit_test._2_2_12_2_4;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Question4Test {
    private final Calculator CALCULATOR = new Calculator();

    @ParameterizedTest
    @CsvSource({
            "10, 5, 5",
            "25, 10, 15",
            "-8, -5, -3",
            "5, 0, 5"
    })
    void testAddition(final double EXPECTED, final double FIRST_NUMBER, final double SECOND_NUMBER) {
        assertEquals(EXPECTED, CALCULATOR.addition(FIRST_NUMBER, SECOND_NUMBER));
    }

    @ParameterizedTest
    @CsvSource({
            "0, 5, 5",
            "5, 10, 5",
            "0, -5, -5",
            "10, 5, -5"
    })
    void testSubtraction(final double EXPECTED, final double FIRST_NUMBER, final double SECOND_NUMBER) {
        assertEquals(EXPECTED, CALCULATOR.subtraction(FIRST_NUMBER, SECOND_NUMBER));
    }

    @ParameterizedTest
    @CsvSource({
            "25, 5, 5",
            "20, 10, 2",
            "10, -5, -2",
            "0, 5, 0"
    })
    void testMultiplication(final double EXPECTED, final double FIRST_NUMBER, final double SECOND_NUMBER) {
        assertEquals(EXPECTED, CALCULATOR.multiplication(FIRST_NUMBER, SECOND_NUMBER));
    }

    @ParameterizedTest
    @CsvSource({
            "5, 10, 2",
            "5, 25, 5",
            "5, -10, -2",
            "2.5, 5, 2"
    })
    void testDivision(final double EXPECTED, final double FIRST_NUMBER, final double SECOND_NUMBER) {
        assertEquals(EXPECTED, CALCULATOR.division(FIRST_NUMBER, SECOND_NUMBER));
    }
}
