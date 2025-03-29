package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_10_string_and_input_and_output._2_2_1_1_10_1_string._2_2_1_1_10_1_18;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create a distinct identifier for a given string.</h2>
 */

public class Question18 {
    public static void main(final String[] ARGUMENTS) {
        final String TEXT = "Nullexia";
        final int HASH_CODE = TEXT.hashCode();
        System.out.print(TEXT + " = " + HASH_CODE);
    }
}