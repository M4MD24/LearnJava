package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_9_data_structures._2_2_1_9_3_collection._2_2_1_9_3_2_linked_list._2_2_1_9_3_2_23;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to convert a linked list to an array list.</h2>
 */

public class Question23 {
    private static final LinkedList<String> COLORS_CODES = new LinkedList<>();

    public static void main(final String[] ARGUMENTS) {
        addFirstColorsCodes();
        final ArrayList<String> COLORS_CODES_AS_ARRAY_LIST = new ArrayList<>(COLORS_CODES);
        System.out.print(COLORS_CODES_AS_ARRAY_LIST);
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