package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_2_part_2._2_2_1_2_62;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to compute the digit number of the sum of two given integers.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input two integers(a b):
 * <br/>
 * 13 25
 * <br/>
 * Digit number of sum of said two integers: 2
 * </h2>
 */

public class Question62 {
    public static void main(final String[] ARGS) {
        final int FIRST_NUMBER = 13,
                SECOND_NUMBER = 25;
        System.out.println("Input two integer:");
        System.out.printf("%d %d",
                FIRST_NUMBER,
                SECOND_NUMBER);
        System.out.printf("Digit number of sum of said two integers: %d", countOfDigits(FIRST_NUMBER, SECOND_NUMBER));
    }

    private static int countOfDigits(final int FIRST_NUMBER, final int SECOND_NUMBER) {
        return String.valueOf(FIRST_NUMBER + SECOND_NUMBER).length();
    }
}