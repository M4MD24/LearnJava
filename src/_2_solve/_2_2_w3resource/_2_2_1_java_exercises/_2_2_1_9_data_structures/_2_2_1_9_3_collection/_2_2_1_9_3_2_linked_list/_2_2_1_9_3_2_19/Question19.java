package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_9_data_structures._2_2_1_9_3_collection._2_2_1_9_3_2_linked_list._2_2_1_9_3_2_19;

import java.util.LinkedList;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to remove and return the first element of a linked list.</h2>
 */

public class Question19 {
    private static final LinkedList<String> COLORS_CODES = new LinkedList<>();

    public static void main(final String[] ARGUMENTS) {
        addFirstColorsCodes();
        final String FIRST_COLOR_CODE_REMOVED = COLORS_CODES.pop();
        System.out.println("First Color Code Removed: " + FIRST_COLOR_CODE_REMOVED);
        System.out.print(COLORS_CODES);
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