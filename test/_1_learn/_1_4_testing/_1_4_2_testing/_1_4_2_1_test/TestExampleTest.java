package _1_learn._1_4_testing._1_4_2_testing._1_4_2_1_test;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

import java.util.Arrays;

public class TestExampleTest {
    @Test
    void addTest() {
        // Check if two values are equal
        assertEquals(
                1 + 1,
                2
        );

        // Check if two values are not equal
        assertNotEquals(
                1 + 1,
                3
        );

        // Comparing arrays using Arrays.equals
        assertTrue(Arrays.equals(
                new int[]{1, 2},
                new int[]{1, 2}
        ));

        // Check if arrays are not equal
        assertFalse(Arrays.equals(
                new int[]{1, 2},
                new int[]{2, 1}
        ));

        // Comparing 2D arrays using Arrays.deepEquals
        assertTrue(Arrays.deepEquals(
                new int[][]{{1, 2}},
                new int[][]{{1, 2}}
        ));

        // If you need to check for deep inequality
        assertFalse(Arrays.deepEquals(
                new int[][]{{1, 2}},
                new int[][]{{1, 3}}
        ));

        // Check equality without considering the order (convert to Object[])
        assertEqualsNoOrder(
                new Object[]{1, 2},
                new Object[]{2, 1}
        );

        // Check if a certain code throws an exception
        assertThrows(
                IllegalArgumentException.class,
                IllegalArgumentException::new
        );

        // Check if a condition is true
        assertTrue(1 < 2);

        // Check if a condition is false
        assertFalse(1 > 2);

        // Check if an object is not null
        assertNotNull(new Object());

        // Check if two objects refer to the same instance
        final Object OBJECT = new Object();
        assertSame(
                OBJECT,
                OBJECT
        );

        // Check if two objects do not refer to the same instance
        assertNotSame(
                new Object(),
                new Object()
        );
    }

    @Test(timeOut = 1000)
    void waitMoment() {
        try {
            Thread.sleep(999);
            System.out.print("Done ");
        } catch (final InterruptedException INTERRUPTED_EXCEPTION) {
            INTERRUPTED_EXCEPTION.printStackTrace();
        }
    }
}