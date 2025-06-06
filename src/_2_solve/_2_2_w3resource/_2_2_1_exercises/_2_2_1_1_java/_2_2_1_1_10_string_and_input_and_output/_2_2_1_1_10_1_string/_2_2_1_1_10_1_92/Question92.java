package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_10_string_and_input_and_output._2_2_1_1_10_1_string._2_2_1_1_10_1_92;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program that returns a substring after removing all instances of remove string as given from the given main string.</h2>
 */

public class Question92 {
    public static void main(final String[] ARGUMENTS) {
        System.out.print(getTextAfterRemoveSpecificSubTexts("____Nu__llexia_ __for_ _Pr_og__ra_mm__ing", "_"));
    }

    private static String getTextAfterRemoveSpecificSubTexts(final String TEXT, final String SPECIFIC_SUB_TEXT) {
        return TEXT.replaceAll(SPECIFIC_SUB_TEXT, "");
    }
}