package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_10_string_and_input_and_output._2_2_1_1_10_1_string._2_2_1_1_10_1_73;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to check whether a substring appears before a period(.) within a given string.</h2>
 */

public class Question73 {
    public static void main(final String[] ARGUMENTS) {
        System.out.print(isSpecificSubStringAppearsBeforeDot("Hadeeth-.Barmajaa", "ee"));
    }

    private static boolean isSpecificSubStringAppearsBeforeDot(final String TEXT, final String SPECIFIC_SUB_STRING) {
        return TEXT.matches(".*" + SPECIFIC_SUB_STRING + ".*\\..*");
    }
}