package _2_solving._2_2_w3resource._2_2_9_data_structures._2_2_9_3_collection._2_2_9_3_2_linked_list._2_2_9_3_2_16;

import java.util.Collections;
import java.util.LinkedList;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to shuffle elements in a linked list.</h2>
 */

public class Question16 {
    private static final LinkedList<String> COLORS_CODES = new LinkedList<>();

    public static void main(final String[] PARAMETERS) {
        addColorsCodes();
        System.out.println("Before Shuffle: " + COLORS_CODES);
        Collections.shuffle(COLORS_CODES);
        System.out.print("After Shuffle: " + COLORS_CODES);
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