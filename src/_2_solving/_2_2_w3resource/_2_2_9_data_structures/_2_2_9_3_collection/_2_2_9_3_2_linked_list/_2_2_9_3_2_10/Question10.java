package _2_solving._2_2_w3resource._2_2_9_data_structures._2_2_9_3_collection._2_2_9_3_2_linked_list._2_2_9_3_2_10;

import java.util.LinkedList;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to get the first and last occurrence of the specified elements in a linked list.</h2>
 */

public class Question10 {
    private static final LinkedList<String> COLORS_CODES = new LinkedList<>();

    public static void main(final String[] PARAMETERS) {
        addColorsCodes();
        System.out.println("First Color Code: " + COLORS_CODES.getFirst());
        System.out.print("Last Color Code: " + COLORS_CODES.getLast());
    }

    private static void addColorsCodes() {
        addColorCode("fFfFff");
        addColorCode("32Cd32");
        addColorCode("00fF00");
        addColorCode("2d2d2d");
        addColorCode("0000Ff");
        addColorCode("000000");
    }

    private static void addColorCode(final String COLOR) {
        COLORS_CODES.add('#' + COLOR.toUpperCase());
    }
}