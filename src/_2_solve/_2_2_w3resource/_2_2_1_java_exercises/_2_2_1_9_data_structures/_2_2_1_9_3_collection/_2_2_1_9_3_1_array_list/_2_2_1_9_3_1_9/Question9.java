package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_9_data_structures._2_2_1_9_3_collection._2_2_1_9_3_1_array_list._2_2_1_9_3_1_9;

import java.util.ArrayList;
import java.util.Collections;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to copy one array list into another.</h2>
 */

public class Question9 {
    private static final ArrayList<String> FIRST_COLORS_CODES = new ArrayList<>(),
            SECOND_COLORS_CODES = new ArrayList<>();

    public static void main(final String[] ARGUMENTS) {
        addFirstColorsCodes();
        addSecondColorsCodes();
        System.out.printf("""
                        ■ Before Copy Into Another
                        First Colors Codes: %s
                        Second Colors Codes: %s
                        %n""",
                FIRST_COLORS_CODES,
                SECOND_COLORS_CODES);
        Collections.copy(SECOND_COLORS_CODES, FIRST_COLORS_CODES);
        System.out.printf("""
                        ■ After Copy Into Another
                        First Colors Codes: %s
                        Second Colors Codes: %s""",
                FIRST_COLORS_CODES,
                SECOND_COLORS_CODES);
    }

    private static void addSecondColorsCodes() {
        addColorCode(SECOND_COLORS_CODES, "00fF00");
        addColorCode(SECOND_COLORS_CODES, "2d2D2d");
        addColorCode(SECOND_COLORS_CODES, "0000Ff");
        addColorCode(SECOND_COLORS_CODES, "232323");
    }

    private static void addFirstColorsCodes() {
        addColorCode(FIRST_COLORS_CODES, "fFfFff");
        addColorCode(FIRST_COLORS_CODES, "32Cd32");
        addColorCode(FIRST_COLORS_CODES, "fF0000");
        addColorCode(FIRST_COLORS_CODES, "000000");
    }

    private static void addColorCode(final ArrayList<String> COLORS_CODES, final String COLOR) {
        COLORS_CODES.add('#' + COLOR.toUpperCase());
    }
}