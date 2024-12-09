package _2_solve._2_2_w3resource._2_2_9_data_structures._2_2_9_3_collection._2_2_9_3_2_linked_list._2_2_9_3_2_11;

import java.util.LinkedList;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to display elements and their positions in a linked list.</h2>
 */

public class Question11 {
    private static final LinkedList<String> COLORS_CODES = new LinkedList<>();

    public static void main(final String[] PARAMETERS) {
        addColorsCodes();
        printAllColorsCodesWithIndices();
    }

    private static void printAllColorsCodesWithIndices() {
        for (int index = 0; index < COLORS_CODES.size(); index++) {
            System.out.printf("Index of %d: %s%n",
                    index,
                    COLORS_CODES.get(index));
        }
    }

    private static void addColorsCodes() {
        addColorCode("fFfFff");
        addColorCode("32Cd32");
        addColorCode("00fF00");
        addColorCode("2d2d2d");
        addColorCode("0000Ff");
        addColorCode("000000");
    }

    private static void addColorCode(final String COLOR) {
        COLORS_CODES.add('#' + COLOR.toUpperCase());
    }
}