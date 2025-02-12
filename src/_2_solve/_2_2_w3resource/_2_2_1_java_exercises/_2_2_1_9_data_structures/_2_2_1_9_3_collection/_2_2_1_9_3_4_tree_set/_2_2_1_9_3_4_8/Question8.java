package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_9_data_structures._2_2_1_9_3_collection._2_2_1_9_3_4_tree_set._2_2_1_9_3_4_8;

import java.util.TreeSet;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to compare two tree sets.</h2>
 */

public class Question8 {
    private static final TreeSet<String> FIRST_COLORS_CODES = new TreeSet<>(),
            SECOND_COLORS_CODES = new TreeSet<>();

    public static void main(final String[] ARGUMENTS) {
        addFirstColorsCodes();
        addSecondColorsCodes();
        compareBetweenColorsCodes();
    }

    private static void compareBetweenColorsCodes() {
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