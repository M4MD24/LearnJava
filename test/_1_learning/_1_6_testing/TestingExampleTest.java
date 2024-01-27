package _1_learning._1_6_testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class TestingExampleTest {
    @Test
    void Main() {
        TestingExample test = new TestingExample();
        assertEquals(20, test.sumTwoNumbers(10, 10), "Error Message");
        assertEquals("Saturday", test.dayWeek(1), "Error Message");
        System.out.println(test.dayWeek(1));
        assertNull(test.dayWeek(0));
    }
}