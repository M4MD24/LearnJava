package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_9_data_structures._2_2_1_9_3_collection._2_2_1_9_3_2_linked_list._2_2_1_9_3_2_17;

import java.util.LinkedList;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to join two linked lists.</h2>
 */

public class Question17 {
    private static final LinkedList<String> FIRST_COLORS_CODES = new LinkedList<>(),
            SECOND_COLORS_CODES = new LinkedList<>();

    public static void main(final String[] ARGUMENTS) {
        addFirstColorsCodes();
        addSecondColorsCodes();
        final LinkedList<String> AFTER_MERGE_COLORS = new LinkedList<>();
        AFTER_MERGE_COLORS.addAll(FIRST_COLORS_CODES);
        AFTER_MERGE_COLORS.addAll(SECOND_COLORS_CODES);
        System.out.print(AFTER_MERGE_COLORS);
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

    private static void addColorCode(final LinkedList<String> COLORS_CODES, final String COLOR) {
        COLORS_CODES.add('#' + COLOR.toUpperCase());
    }
}