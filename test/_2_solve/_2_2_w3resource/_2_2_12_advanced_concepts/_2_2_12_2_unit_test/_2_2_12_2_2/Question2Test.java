package _2_solve._2_2_w3resource._2_2_12_advanced_concepts._2_2_12_2_unit_test._2_2_12_2_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Question2Test {
    @Test
    void testDivide() {
        final Calculator CALCULATOR = new Calculator();
        final IllegalArgumentException ILLEGAL_ARGUMENT_EXCEPTION = assertThrows(
                IllegalArgumentException.class,
                () -> CALCULATOR.divide(
                        10,
                        0
                )
        );
        assertEquals(
                "Division by zero is not allowed!",
                ILLEGAL_ARGUMENT_EXCEPTION.getMessage()
        );
    }
}