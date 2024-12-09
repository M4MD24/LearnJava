package _1_learn._1_4_testing._1_4_1_junit_5._1_4_1_3_before_and_after_all;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BeforeAndAfterAllExampleTest {
    private static final double FIRST_NUMBER = 5,
            SECOND_NUMBER = 5;
    private static final Calculator CALCULATOR = new Calculator();

    @BeforeAll
    static void setUp() {
        System.out.println("Start!");
    }

    @AfterAll
    static void tearDown() {
        System.out.println("Done!\n");
    }

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