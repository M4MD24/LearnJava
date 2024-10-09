package _2_solving._2_2_w3resource._2_2_13_algorithms._2_2_13_1_search._2_2_13_1_4;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to find a specified element in a given array of elements using Interpolation Search.</h2>
 */

public class Question4 {
    public static void main(final String[] PARAMETERS) {
        final int[] NUMBERS = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        final int target = 10;
        System.out.print(interpolationSearch(NUMBERS, target));
    }

    private static String interpolationSearch(final int[] ARRAY, final int TARGET) {
        int high = ARRAY.length - 1,
                low = 0;
        while (TARGET >= ARRAY[low] && TARGET <= ARRAY[high] && low <= high) {
            int probe = low + (high - low) * (TARGET - ARRAY[low]) / (ARRAY[high] - ARRAY[low]);
            if (ARRAY[probe] == TARGET)
                return "element found at index: " + probe;
            else if (ARRAY[probe] < TARGET)
                low = ++probe;
            else
                high = --probe;
        }
        return "Element not found";
    }
}