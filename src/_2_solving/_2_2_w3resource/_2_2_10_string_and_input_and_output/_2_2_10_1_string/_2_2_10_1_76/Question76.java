package _2_solving._2_2_w3resource._2_2_10_string_and_input_and_output._2_2_10_1_string._2_2_10_1_76;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to count how many times the substring 'life' appears anywhere in a given string. Counting can also happen with the substring 'li?e', any character instead of 'f'.</h2>
 */

public class Question76 {
    public static void main(final String[] PARAMETERS) {
        System.out.print(getCountOfSpecificSubStringAppearsAnywhereInText("lifeli.eli!e"));
    }

    private static int getCountOfSpecificSubStringAppearsAnywhereInText(final String TEXT) {
        return TEXT.split("(?=li.e)").length;
    }
}