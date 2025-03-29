package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_9_data_structures._2_2_1_1_9_3_collection._2_2_1_1_9_3_1_array_list._2_2_1_1_9_3_1_22;

import java.util.ArrayList;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to print all the elements of an ArrayList using the elements position.</h2>
 */

public class Question22 {
    private static final ArrayList<String> COLORS_CODES = new ArrayList<>();

    public static void main(final String[] ARGUMENTS) {
        addColorsCodes();
        printColorsCodes();
    }

    private static void printColorsCodes() {
        for (final String COLOR_CODE : COLORS_CODES)
            System.out.print(COLOR_CODE + ' ');
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