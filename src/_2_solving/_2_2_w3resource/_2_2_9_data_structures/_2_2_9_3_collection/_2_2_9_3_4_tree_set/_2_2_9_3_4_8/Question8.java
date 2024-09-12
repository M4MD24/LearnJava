package _2_solving._2_2_w3resource._2_2_9_data_structures._2_2_9_3_collection._2_2_9_3_4_tree_set._2_2_9_3_4_8;

import java.util.TreeSet;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to compare two tree sets.</h2>
 */

public class Question8 {
    private static final TreeSet<String> FIRST_COLORS_CODES = new TreeSet<>(),
            SECOND_COLORS_CODES = new TreeSet<>();

    public static void main(final String[] PARAMETERS) {
        addFirstColorsCodes();
        addSecondColorsCodes();
        compareBetweenColorsCodes();
    }

    private static void compareBetweenColorsCodes() {
        System.out.println(FIRST_COLORS_CODES);
        System.out.println(SECOND_COLORS_CODES);
        for (final String COLOR : SECOND_COLORS_CODES)
            System.out.print(FIRST_COLORS_CODES.contains(COLOR) + " ");
    }

    private static void addSecondColorsCodes() {
        addColorCode(SECOND_COLORS_CODES, "00fF00");
        addColorCode(SECOND_COLORS_CODES, "32Cd32");
        addColorCode(SECOND_COLORS_CODES, "0000Ff");
        addColorCode(SECOND_COLORS_CODES, "232323");
    }

    private static void addFirstColorsCodes() {
        addColorCode(FIRST_COLORS_CODES, "fFfFff");
        addColorCode(FIRST_COLORS_CODES, "32Cd32");
        addColorCode(FIRST_COLORS_CODES, "fF0000");
        addColorCode(FIRST_COLORS_CODES, "000000");
    }

    private static void addColorCode(final TreeSet<String> COLORS_CODES, final String COLOR) {
        COLORS_CODES.add('#' + COLOR.toUpperCase());
    }
}