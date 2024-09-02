package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_72;

import java.util.Scanner;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to create a string taking the first three characters from a given string. If the string length is less than 3 use "#" as substitute characters.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Input text:</h2>
 * <br/>
 * <h1>Expected Output:</h1>
 * <h2>###</h2>
 */

public class Question72 {
    public static void main(final String[] ARGS) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input text: ");
        final String TEXT = input.nextLine();
        System.out.print(createString(TEXT));
    }

    private static String createString(String TEXT) {
        final char NUMBER_SIGN = '#';
        if (TEXT.length() == 1) TEXT = TEXT.charAt(0) + String.valueOf(NUMBER_SIGN).repeat(2);
        else if (TEXT.length() == 2) TEXT = TEXT.substring(0, 2) + NUMBER_SIGN;
        else if (TEXT.length() > 2) TEXT = TEXT.substring(0, 3);
        else TEXT = String.valueOf(NUMBER_SIGN).repeat(3);
        return TEXT;
    }
}