package _2_solving._2_2_w3resource._2_2_10_string_and_input_and_output._2_2_10_1_string._2_2_10_1_73;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to check whether a substring appears before a period(.) within a given string.</h2>
 */

public class Question73 {
    public static void main(final String[] PARAMETERS) {
        System.out.print(isSpecificSubStringAppearsBeforeDot("Nullexia-for-.-Programming", "for"));
    }

    private static boolean isSpecificSubStringAppearsBeforeDot(final String TEXT, final String SPECIFIC_SUB_STRING) {
        return TEXT.matches(".*" + SPECIFIC_SUB_STRING + ".*\\..*");
    }
}