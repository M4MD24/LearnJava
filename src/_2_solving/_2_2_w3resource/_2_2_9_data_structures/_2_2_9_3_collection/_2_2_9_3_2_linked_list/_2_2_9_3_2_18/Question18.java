package _2_solving._2_2_w3resource._2_2_9_data_structures._2_2_9_3_collection._2_2_9_3_2_linked_list._2_2_9_3_2_18;

import java.util.LinkedList;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to copy a linked list to another linked list.</h2>
 */

public class Question18 {
    private static final LinkedList<String> COLORS_CODES = new LinkedList<>();

    public static void main(final String[] PARAMETERS) {
        addFirstColorsCodes();
        final LinkedList<String> ANOTHER_COLORS_CODES = (LinkedList<String>) COLORS_CODES.clone();
        System.out.print(ANOTHER_COLORS_CODES);
    }

    private static void addFirstColorsCodes() {
        addColorCode("fFfFff");
        addColorCode("32Cd32");
        addColorCode("fF0000");
        addColorCode("000000");
    }

    private static void addColorCode(final String COLOR) {
        COLORS_CODES.add('#' + COLOR.toUpperCase());
    }
}