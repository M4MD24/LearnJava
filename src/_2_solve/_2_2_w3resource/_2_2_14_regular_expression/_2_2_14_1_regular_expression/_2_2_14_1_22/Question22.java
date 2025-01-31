package _2_solve._2_2_w3resource._2_2_14_regular_expression._2_2_14_1_regular_expression._2_2_14_1_22;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to validate an Egyptian phone number.</h2>
 */

public class Question22 {
    public static void main(final String[] ARGUMENTS) {
        final String PHONE_NUMBER = "+201555400034";
        System.out.print(isPhoneNumber(PHONE_NUMBER));
    }

    private static boolean isPhoneNumber(final String TEXT) {
        return TEXT.matches("\\+20\\d{10}");
    }
}