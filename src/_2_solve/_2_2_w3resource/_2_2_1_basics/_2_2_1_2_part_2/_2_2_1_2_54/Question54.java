package _2_solve._2_2_w3resource._2_2_1_basics._2_2_1_2_part_2._2_2_1_2_54;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to compute xn % y where x, y and n are all 32-bit integers.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input first number: 25
 * <br/>
 * Input second number: 35
 * <br/>
 * Input third number: 45
 * <br/>
 * 25^35 % 45 = 5.0
 * </h2>
 */

public class Question54 {
    public static void main(final String[] PARAMETERS) {
        final int FIRST_NUMBER = 25,
                SECOND_NUMBER = 35,
                THIRD_NUMBER = 45;
        printInputs(FIRST_NUMBER, SECOND_NUMBER, THIRD_NUMBER);
        System.out.printf("%d^%d %% %d = %f",
                FIRST_NUMBER,
                SECOND_NUMBER,
                THIRD_NUMBER,
                Math.pow(FIRST_NUMBER, SECOND_NUMBER) % THIRD_NUMBER);
    }

    private static void printInputs(final int FIRST_NUMBER, final int SECOND_NUMBER, final int THIRD_NUMBER) {
        System.out.printf("Input first number: %d\n", FIRST_NUMBER);
        System.out.printf("Input second number: %d\n", SECOND_NUMBER);
        System.out.printf("Input third number: %d\n", THIRD_NUMBER);
    }
}