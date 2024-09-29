package _2_solving._2_2_w3resource._2_2_13_algorithms._2_2_13_1_search._2_2_13_1_1;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to find a specified element in a given array of elements using Binary Search.</h2>
 */

public class Question1 {
    public static void main(final String[] PARAMETERS) {
        final int[] NUMBERS = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        final int TARGET = 10;
        System.out.print(binarySearch(NUMBERS, TARGET));
    }

    private static String binarySearch(final int[] ARRAY, final int TARGET) {
        int left = 0,
                right = ARRAY.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (ARRAY[mid] == TARGET)
                return "Element found at index: " + mid;
            else if (ARRAY[mid] < TARGET)
                left = mid + 1;
            else
                right = mid - 1;
        }
        return "Element not found";
    }
}