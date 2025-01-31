package _2_solve._2_2_w3resource._2_2_10_string_and_input_and_output._2_2_10_1_string._2_2_10_1_20;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to get the Canonical representation of the string object.</h2>
 */

public class Question20 {
    public static void main(final String[] ARGUMENTS) {
        String FIRST_TEXT = "Nullexia for Programming",
                SECOND_TEXT = new StringBuffer("Nullexia")
                        .append(" for ")
                        .append("Programming")
                        .toString();
        String THIRD_TEXT = SECOND_TEXT.intern();
        System.out.println(FIRST_TEXT == SECOND_TEXT);
        System.out.print(FIRST_TEXT == THIRD_TEXT);
    }
}