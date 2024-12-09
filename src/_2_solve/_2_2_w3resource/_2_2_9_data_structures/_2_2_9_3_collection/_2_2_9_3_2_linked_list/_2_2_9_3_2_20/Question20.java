package _2_solve._2_2_w3resource._2_2_9_data_structures._2_2_9_3_collection._2_2_9_3_2_linked_list._2_2_9_3_2_20;

import java.util.LinkedList;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to retrieve, but not remove, the first element of a linked list.</h2>
 */

public class Question20 {
    private static final LinkedList<String> COLORS_CODES = new LinkedList<>();

    public static void main(final String[] PARAMETERS) {
        addColorsCodes();
        final String FIRST_COLOR_CODE = COLORS_CODES.peekFirst();
        System.out.println("First Color Code: " + FIRST_COLOR_CODE);
        System.out.print(COLORS_CODES);
    }

    private static void addColorsCodes() {
        addColorCode("fFfFff");
        addColorCode("32Cd32");
        addColorCode("fF0000");
        addColorCode("000000");
    }

    private static void addColorCode(final String COLOR) {
        COLORS_CODES.add('#' + COLOR.toUpperCase());
    }
}