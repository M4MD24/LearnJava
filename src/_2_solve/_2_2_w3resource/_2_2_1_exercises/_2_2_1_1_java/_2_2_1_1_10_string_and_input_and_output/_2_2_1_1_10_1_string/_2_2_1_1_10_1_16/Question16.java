package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_10_string_and_input_and_output._2_2_1_1_10_1_string._2_2_1_1_10_1_16;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to get the contents of a given string as a byte array.</h2>
 */

public class Question16 {
    public static void main(final String[] ARGUMENTS) {
        final String TEXT = "Nullexia";
        final byte[] TEXT_AS_BYTES = TEXT.getBytes();
        System.out.print(new String(TEXT_AS_BYTES));
    }
}