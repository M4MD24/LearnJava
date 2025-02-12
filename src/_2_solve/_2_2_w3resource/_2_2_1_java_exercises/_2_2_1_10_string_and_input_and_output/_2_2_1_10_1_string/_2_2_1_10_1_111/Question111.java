package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_10_string_and_input_and_output._2_2_1_10_1_string._2_2_1_10_1_111;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program that removes a specific word from given text. Return the updated string.</h2>
 */

public class Question111 {
    public static void main(final String[] ARGUMENTS) {
        System.out.print(getTextAfterRemoveSpecificSubText("Red Green Blue", "Green"));
    }

    private static String getTextAfterRemoveSpecificSubText(final String TEXT, final String SPECIFIC_SUB_TEXT) {
        return TEXT.replace(
                SPECIFIC_SUB_TEXT,
                ""
        ).replace(
                "  ",
                " "
        );
    }
}