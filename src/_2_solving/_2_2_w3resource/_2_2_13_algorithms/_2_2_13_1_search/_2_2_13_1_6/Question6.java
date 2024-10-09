package _2_solving._2_2_w3resource._2_2_13_algorithms._2_2_13_1_search._2_2_13_1_6;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to find a specified element in a given array of elements using Ternary search.</h2>
 */

public class Question6 {
    public static void main(final String[] PARAMETERS) {
        final int[] NUMBERS = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        final int TARGET = 10;
        System.out.print(ternarySearch(NUMBERS, TARGET));
    }

    private static String ternarySearch(final int[] ARRAY, final int TARGET) {
        int left = 0,
                right = ARRAY.length - 1;
        while (right >= left) {
            int firstMiddle = left + (right - left) / 3,
                    secondMiddle = right - (right - left) / 3;
            if (ARRAY[firstMiddle] == TARGET)
                return "Element found at index: " + firstMiddle;
            if (ARRAY[secondMiddle] == TARGET)
                return "Element found at index: " + secondMiddle;
            if (TARGET < ARRAY[firstMiddle])
                right = firstMiddle - 1;
            else if (TARGET > ARRAY[secondMiddle])
                left = secondMiddle + 1;
            else {
                left = firstMiddle + 1;
                right = secondMiddle - 1;
            }
        }
        return "Element not found";
    }
}