package _2_solving._2_1_w3schools._2_1_1_how_to._2_1_1_7_reverse_string;

import java.util.Scanner;

public class ReverseString {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        final String TEXT = INPUT.nextLine();
        System.out.println(reversedText(TEXT));
    }

    private static String reversedText(final String TEXT) {
        String reversedText = "";
        for (int index = TEXT.length() - 1; index > -1; index--)
            reversedText += TEXT.charAt(index);
        return reversedText;
    }
}