package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_10_string_and_input_and_output._2_2_1_1_10_1_string._2_2_1_1_10_1_66;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to read a string and return it without the first two characters. Keep the first character if it is 'g' and keep the second character if it is 'h'.</h2>
 */

public class Question66 {
    public static void main(final String[] ARGUMENTS) {
        System.out.print(getTextAfterRemoveFirstCharacterNotEqualG_AndSecondCharacterNotEqualH("ghost"));
    }

    private static String getTextAfterRemoveFirstCharacterNotEqualG_AndSecondCharacterNotEqualH(final String TEXT) {
        if (TEXT.charAt(0) == 'g')
            return TEXT.charAt(0) + TEXT.substring(2);
        else if (TEXT.charAt(1) == 'h')
            return TEXT.substring(1);
        else if (TEXT.charAt(0) == 'g' && TEXT.charAt(1) == 'h')
            return TEXT;
        else
            return TEXT.substring(2);
    }
}