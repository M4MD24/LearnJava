package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_9_data_structures._2_2_1_1_9_3_collection._2_2_1_1_9_3_1_array_list._2_2_1_1_9_3_1_10;

import java.util.ArrayList;
import java.util.Collections;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to shuffle elements in an array list.</h2>
 */

public class Question10 {
    private static final ArrayList<String> COLORS_CODES = new ArrayList<>();

    public static void main(final String[] ARGUMENTS) {
        addColorsCodes();
        System.out.println("Before Shuffle: " + COLORS_CODES);
        Collections.shuffle(COLORS_CODES);
        System.out.print("After Shuffle: " + COLORS_CODES);
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