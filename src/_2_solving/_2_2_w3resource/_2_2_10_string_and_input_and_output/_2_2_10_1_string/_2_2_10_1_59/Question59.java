package _2_solving._2_2_w3resource._2_2_10_string_and_input_and_output._2_2_10_1_string._2_2_10_1_59;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to read a string. If the string begins with "red" or "black" return that color string, otherwise return the empty string.</h2>
 */

public class Question59 {
    public static void main(final String[] PARAMETERS) {
        System.out.print(isBeginRedOrBlack("RedBlackShadow"));
    }

    private static String isBeginRedOrBlack(final String TEXT) {
        if (TEXT.contains("Red"))
            return "Red";
        else if (TEXT.contains("Black"))
            return "Black";
        else
            return "";

    }
}