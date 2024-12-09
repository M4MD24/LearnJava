package _2_solve._2_2_w3resource._2_2_9_data_structures._2_2_9_3_collection._2_2_9_3_1_array_list._2_2_9_3_1_16;

import java.util.ArrayList;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to clone an array list to another array list.</h2>
 */

public class Question16 {
    private static final ArrayList<String> COLORS_CODES = new ArrayList<>();

    public static void main(final String[] PARAMETERS) {
        addFirstColorsCodes();
        final ArrayList<String> ANOTHER_COLORS_CODES = (ArrayList<String>) COLORS_CODES.clone();
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