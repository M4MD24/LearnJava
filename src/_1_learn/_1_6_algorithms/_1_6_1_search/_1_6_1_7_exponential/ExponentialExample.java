package _1_learn._1_6_algorithms._1_6_1_search._1_6_1_7_exponential;

import java.util.Arrays;

public class ExponentialExample {
    public static void main(final String[] PARAMETERS) {
        final int[] NUMBERS = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        final int TARGET = 10;
        System.out.print(exponentialSearch(NUMBERS, TARGET));
    }

    private static String exponentialSearch(final int[] ARRAY, final int TARGET) {
        int startSum = 0;
        if (ARRAY[startSum] == TARGET)
            return "element found at index: " + startSum;
        startSum = 1;
        while (startSum < ARRAY.length &&
                ARRAY[startSum] <= TARGET)
            startSum *= 2;
        final int FINALLY_INDEX = Arrays.binarySearch(
                ARRAY,
                startSum / 2,
                Math.min(startSum, ARRAY.length),
                TARGET
        );
        return FINALLY_INDEX != -1
                ? "element found at index: " + FINALLY_INDEX
                : "Element not found";
    }
}