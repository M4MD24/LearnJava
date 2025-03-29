package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_9_data_structures._2_2_1_1_9_3_collection._2_2_1_1_9_3_1_array_list._2_2_1_1_9_3_1_12;

import java.util.ArrayList;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to extract a portion of an array list.</h2>
 */

public class Question12 {
    private static final ArrayList<String> COLORS_CODES = new ArrayList<>();

    public static void main(final String[] ARGUMENTS) {
        addColorsCodes();
        System.out.print("SubList: " + COLORS_CODES.subList(1, 3));
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