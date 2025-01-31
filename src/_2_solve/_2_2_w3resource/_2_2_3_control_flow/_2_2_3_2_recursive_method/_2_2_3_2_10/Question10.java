package _2_solve._2_2_w3resource._2_2_3_control_flow._2_2_3_2_recursive_method._2_2_3_2_10;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java recursive method to find the length of a given string.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>The length of the text "Java Exercises!" is: 15</h2>
 */

public class Question10 {
    public static void main(final String[] ARGUMENTS) {
        final String TEXT = "Java Exercises!";
        System.out.printf("The length of the text %s is: %d",
                TEXT,
                getLengthOfText(TEXT, 1, 0));
    }

    private static int getLengthOfText(final String TEXT, final int INDEX, int lengthOfText) {
        if (TEXT.isEmpty())
            return lengthOfText;
        else
            return getLengthOfText(TEXT.substring(INDEX), INDEX, ++lengthOfText);
    }
}