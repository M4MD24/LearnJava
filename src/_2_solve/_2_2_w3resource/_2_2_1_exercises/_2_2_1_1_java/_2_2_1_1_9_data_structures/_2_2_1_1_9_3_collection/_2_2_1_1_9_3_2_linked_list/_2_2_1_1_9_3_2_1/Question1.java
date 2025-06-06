package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_9_data_structures._2_2_1_1_9_3_collection._2_2_1_1_9_3_2_linked_list._2_2_1_1_9_3_2_1;

import java.util.LinkedList;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to append the specified element to the end of a linked list.</h2>
 */

public class Question1 {
    private static final LinkedList<String> COLORS_CODES = new LinkedList<>();

    public static void main(final String[] ARGUMENTS) {
        addColorsCodes();
        System.out.print(COLORS_CODES);
    }

    private static void addColorsCodes() {
        addColorCode("fFfFff");
        addColorCode("32Cd32");
        addColorCode("000000");
    }

    private static void addColorCode(final String COLOR) {
        COLORS_CODES.add('#' + COLOR.toUpperCase());
    }
}