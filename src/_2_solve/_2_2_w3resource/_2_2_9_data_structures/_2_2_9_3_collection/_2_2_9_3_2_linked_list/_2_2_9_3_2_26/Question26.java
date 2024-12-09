package _2_solve._2_2_w3resource._2_2_9_data_structures._2_2_9_3_collection._2_2_9_3_2_linked_list._2_2_9_3_2_26;

import java.util.LinkedList;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to replace an element in a linked list.</h2>
 */

public class Question26 {
    private static final LinkedList<String> COLORS_CODES = new LinkedList<>();

    public static void main(final String[] PARAMETERS) {
        addFirstColorsCodes();
        System.out.println("Before Replace: " + COLORS_CODES);
        COLORS_CODES.set(1, "#00ff00".toUpperCase());
        System.out.print("Before Replace: " + COLORS_CODES);
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