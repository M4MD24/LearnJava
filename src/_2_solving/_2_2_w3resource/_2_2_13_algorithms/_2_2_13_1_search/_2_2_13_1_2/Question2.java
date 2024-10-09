package _2_solving._2_2_w3resource._2_2_13_algorithms._2_2_13_1_search._2_2_13_1_2;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to find a specified element in a given array of elements using Linear Search.</h2>
 */

public class Question2 {
    public static void main(final String[] PARAMETERS) {
        final int[] NUMBERS = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        final int TARGET = 10;
        System.out.print(linearSearch(NUMBERS, TARGET));
    }

    private static String linearSearch(final int[] ARRAY, final int TARGET) {
        for (int index = 0; index < ARRAY.length; index++)
            if (ARRAY[index] == TARGET) return "Element found at index: " + index;
        return "Element not found";
    }
}