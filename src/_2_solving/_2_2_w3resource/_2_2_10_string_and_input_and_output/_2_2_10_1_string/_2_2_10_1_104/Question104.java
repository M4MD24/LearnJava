package _2_solving._2_2_w3resource._2_2_10_string_and_input_and_output._2_2_10_1_string._2_2_10_1_104;

import java.util.Arrays;
import java.util.Comparator;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to sort in ascending and descending order by the length of the given array of strings.</h2>
 */

public class Question104 {
    public static void main(final String[] PARAMETERS) {
        final String[] COLORS = {"Black", "Crimson", "Burgundy", "Deep Pink", "Gold", "Lime Green", "Deep Sky Blue"};
        System.out.println("Original Elements: " + Arrays.toString(COLORS));
        printElementsAfterAscendingAndDescendingSort(COLORS);
    }

    private static void printElementsAfterAscendingAndDescendingSort(final String[] ELEMENTS) {
        System.out.printf("""
                        Ascending Sort   : %s
                        Descending Sort  : %s""",
                Arrays.toString(getElementsAfterAscendingSort(ELEMENTS)),
                Arrays.toString(getElementsAfterDescendingSort(ELEMENTS)));
    }

    private static String[] getElementsAfterDescendingSort(final String[] ELEMENTS) {
        return Arrays.stream(ELEMENTS)
                .sorted(Comparator.reverseOrder())
                .toArray(String[]::new);
    }

    private static String[] getElementsAfterAscendingSort(final String[] ELEMENTS) {
        Arrays.sort(ELEMENTS);
        return ELEMENTS;
    }
}