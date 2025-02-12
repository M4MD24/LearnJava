package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_1_basics._2_2_1_1_1_part_1._2_2_1_1_1_73;

import java.util.Scanner;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create a string taking the first and last characters from two given strings. If the length of each string is 0 use "#" for missing characters.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>
 * Input first text: Java
 * <br/>
 * Input second text:
 * </h2>
 * <br/>
 * <h1>Expected Output:</h1>
 * <h2>J#</h2>
 */

public class Question73 {
    public static void main(final String[] ARGUMENTS) {
        Scanner input = new Scanner(System.in);

        System.out.print("Input first text: ");
        String FIRST_TEXT;
        try {
            FIRST_TEXT = String.valueOf(input.nextLine().charAt(0));
        } catch (Exception exception) {
            FIRST_TEXT = "";
        }

        System.out.print("Input second text: ");
        final String SECOND_TEXT = input.nextLine();

        System.out.print(createString(FIRST_TEXT, SECOND_TEXT));
    }

    private static String createString(String FIRST_TEXT, String SECOND_TEXT) {
        final char NUMBER_SIGN = '#';
        FIRST_TEXT = (!FIRST_TEXT.isEmpty()) ? FIRST_TEXT : String.valueOf(NUMBER_SIGN);
        SECOND_TEXT = (!SECOND_TEXT.isEmpty()) ? String.valueOf(SECOND_TEXT.charAt(SECOND_TEXT.length() - 1)) : String.valueOf(NUMBER_SIGN);
        return FIRST_TEXT + SECOND_TEXT;
    }
}