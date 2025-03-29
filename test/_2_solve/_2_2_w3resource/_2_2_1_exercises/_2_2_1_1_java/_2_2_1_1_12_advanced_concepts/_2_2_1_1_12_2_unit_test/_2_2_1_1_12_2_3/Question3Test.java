package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_12_advanced_concepts._2_2_1_1_12_2_unit_test._2_2_1_1_12_2_3;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Question3Test {
    private static final double FIRST_NUMBER = 5,
            SECOND_NUMBER = 5;

    @BeforeEach
    void setUp() {
        System.out.println("Start!");
    }

    @AfterEach
    void tearDown() {
        System.out.println("Done!\n");
    }

    @Test
    void testAddition() {
        assertEquals(
                10,
                new Calculator().addition(FIRST_NUMBER, SECOND_NUMBER),
                "Addition test failed!"
        );
        System.out.println(new Calculator().addition(FIRST_NUMBER, SECOND_NUMBER));
    }

    @Test
    void testSubtraction() {
        assertEquals(
                0,
                new Calculator().subtraction(FIRST_NUMBER, SECOND_NUMBER),
                "Subtraction test failed!"
        );
        System.out.println(new Calculator().subtraction(FIRST_NUMBER, SECOND_NUMBER));
    }

    @Test
    void testMultiplication() {
        assertEquals(
                25,
                new Calculator().multiplication(FIRST_NUMBER, SECOND_NUMBER),
                "Multiplication test failed!"
        );
        System.out.println(new Calculator().multiplication(FIRST_NUMBER, SECOND_NUMBER));
    }

    @Test
    void testDivision() {
        assertEquals(
                1,
                new Calculator().division(FIRST_NUMBER, SECOND_NUMBER),
                "Division test failed!"
        );
        System.out.println(new Calculator().division(FIRST_NUMBER, SECOND_NUMBER));
    }
}