package _1_learning._1_2_testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class TestingExampleTest {
    @Test
    void Main() {
        final TestingExample TEST_EXAMPLE = new TestingExample();
        assertEquals(20, TEST_EXAMPLE.sumTwoNumbers(10, 10), "Error Message!");
        assertEquals("Saturday", TEST_EXAMPLE.dayWeek(1), "Error Message!");
        System.out.println(TEST_EXAMPLE.dayWeek(1));
        assertNull(TEST_EXAMPLE.dayWeek(0));
    }
}