package _2_solve._2_2_w3resource._2_2_9_data_structures._2_2_9_3_collection._2_2_9_3_1_array_list._2_2_9_3_1_1;

import java.util.ArrayList;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create an array list, add some colors (strings) and print out the collection.</h2>
 */

public class Question1 {
    private static final ArrayList<String> COLORS_CODES = new ArrayList<>();

    public static void main(final String[] PARAMETERS) {
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