package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_14_regular_expression._2_2_1_14_1_regular_expression._2_2_1_14_1_18;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to validate a personal identification number (PIN). Assume a PIN number is 4, 6 or 8.</h2>
 */

public class Question18 {
    public static void main(final String[] ARGUMENTS) {
        final String PERSONAL_IDENTIFICATION_NUMBER = "12345678";
        System.out.print(isPersonalIdentificationNumberEndWith4Or6Or8(PERSONAL_IDENTIFICATION_NUMBER));

    }

    private static boolean isPersonalIdentificationNumberEndWith4Or6Or8(final String PERSONAL_IDENTIFICATION_NUMBER) {
        return PERSONAL_IDENTIFICATION_NUMBER.matches("\\d{4}|\\d{6}|\\d{8}");
    }
}