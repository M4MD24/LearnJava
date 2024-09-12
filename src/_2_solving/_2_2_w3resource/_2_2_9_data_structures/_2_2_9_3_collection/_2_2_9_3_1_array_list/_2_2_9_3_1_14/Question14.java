package _2_solving._2_2_w3resource._2_2_9_data_structures._2_2_9_3_collection._2_2_9_3_1_array_list._2_2_9_3_1_14;

import java.util.ArrayList;
import java.util.Collections;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program that swaps two elements in an array list.</h2>
 */

public class Question14 {
    private static final ArrayList<String> COLORS_CODES = new ArrayList<>();

    public static void main(final String[] PARAMETERS) {
        addColorsCodes();
        System.out.println("Before Swap: " + COLORS_CODES);
        Collections.swap(COLORS_CODES, 1, 3);
        System.out.print("After Swap: " + COLORS_CODES);
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