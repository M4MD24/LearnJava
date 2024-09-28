package _1_learning._1_2_testing._1_1_2_1_junit_5._1_1_2_1_1_test;

import org.junit.jupiter.api.Test;

import java.time.Duration;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class TestExampleTest {
    @Test
    void assertTestExample() {
        // assertEquals: Check if two values are equal
        assertEquals(
                5,
                2 + 3,
                "Sum should be 5"
        );

        // assertNotEquals: Check if two values are not equal
        assertNotEquals(
                5,
                4,
                "Values should not be equal"
        );

        // assertTrue: Check if a condition is true
        assertTrue(
                3 < 5,
                "3 is less than 5"
        );

        // assertFalse: Check if a condition is false
        assertFalse(
                3 > 5,
                "3 is not greater than 5"
        );

        // assertNull: Check if an object is null
        final String TEXT = null;
        assertNull(
                TEXT,
                "String should be null"
        );

        // assertInstanceOf: Check if an object is an instance of a specific class
        assertInstanceOf(
                String.class,
                "test",
                "Object should be a string"
        );

        // assertSame: Check if two references point to the same object
        final String FIRST_TEXT = "TEXT",
                SECOND_TEXT = FIRST_TEXT;
        assertSame(
                FIRST_TEXT,
                SECOND_TEXT,
                "Objects should be the same"
        );

        // assertNotSame: Check if two references point to different objects
        final String ANOTHER_FIRST_TEXT = new String("different"),
                ANOTHER_SECOND_TEXT = new String("different");
        assertNotSame(
                ANOTHER_FIRST_TEXT,
                ANOTHER_SECOND_TEXT,
                "Objects should not be the same"
        );

        // assertArrayEquals: Check if two arrays are equal
        final int[] EXPECTED_NUMBERS = {1, 2, 3},
                ACTUAL_NUMBERS = {1, 2, 3};
        assertArrayEquals(
                EXPECTED_NUMBERS,
                ACTUAL_NUMBERS,
                "Arrays should be equal"
        );

        // assertLinesMatch: Check if two lists of strings match line by line
        final List<String> EXPECTED_TEXTS = List.of("line1", "line2"),
                ACTUAL_TEXTS = List.of("line1", "line2");
        assertLinesMatch(
                EXPECTED_TEXTS,
                ACTUAL_TEXTS,
                "Lines should match"
        );

        // assertIterableEquals: Check if two iterables are equal
        final List<Integer> LIST_OF_EXPECTED_NUMBERS = List.of(1, 2, 3),
                LIST_OF_ACTUAL_NUMBERS = List.of(1, 2, 3);
        assertIterableEquals(
                LIST_OF_EXPECTED_NUMBERS,
                LIST_OF_ACTUAL_NUMBERS,
                "Iterables should be equal"
        );

        // assertThrows: Check if a specific exception is thrown
        assertThrows(
                ArithmeticException.class, () -> {
                    final int RESULT = 10 / 0;
                },
                "Expected ArithmeticException"
        );

        // assertThrowsExactly: Check if exactly a specific exception is thrown
        assertThrowsExactly(
                NumberFormatException.class,
                () -> Integer.parseInt("not a number"),
                "Expected NumberFormatException"
        );

        // assertDoesNotThrow: Check if no exception is thrown
        assertDoesNotThrow(
                () -> 10 / 2,
                "No exception should be thrown"
        );

        // assertTimeout: Check if the code finishes within a certain timeout
        assertTimeout(
                Duration.ofMillis(100),
                () -> Thread.sleep(50) /*Simulating delay*/,
                "Method should complete within timeout"
        );

        // assertTimeoutPreemptively: Abort the code if it exceeds the time limit
        assertTimeoutPreemptively(
                Duration.ofMillis(100),
                () -> Thread.sleep(50) /*Simulating delay*/,
                "Method should preemptively timeout"
        );

        // assertAll: Run multiple assertions together
        assertAll(
                "Multiple assertions",
                () -> assertEquals(4, 2 * 2),
                () -> assertTrue("test".startsWith("t"))
        );
    }
}