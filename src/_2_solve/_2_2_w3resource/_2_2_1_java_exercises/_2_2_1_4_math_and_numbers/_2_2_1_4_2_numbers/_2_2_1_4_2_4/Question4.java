package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_4_math_and_numbers._2_2_1_4_2_numbers._2_2_1_4_2_4;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to generate and show all Paprika numbers less than 1000.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 */
/*
 * 1       1       0   + 1
 * 9       81      8   + 1
 * 45      2025    20  + 25
 * 55      3025    30  + 25
 * 99      9801    98  + 01
 * 297     88209   88  + 209
 * 703     494209  494 + 209
 * 999     998001  998 + 001
 * 8 Kaprekar numbers.
 */
public class Question4 {
    public static void main(final String[] ARGUMENTS) {
        System.out.println("Paprika Numbers less than 1000:");
        printKaprekarNumbers();
    }

    private static void printKaprekarNumbers() {
        for (int number = 1; number < 1000; number++) {
            final int SQUARE_NUMBER = number * number;
            final String SQUARE_NUMBER_STRING = String.valueOf(SQUARE_NUMBER);
            final int LENGTH = SQUARE_NUMBER_STRING.length(),
                    LEFT = (LENGTH == 1) ? 0 : Integer.parseInt(SQUARE_NUMBER_STRING.substring(0, LENGTH / 2)),
                    RIGHT = Integer.parseInt(SQUARE_NUMBER_STRING.substring(LENGTH / 2));
            if (number == LEFT + RIGHT)
                System.out.printf("%-4d %-7d %-4d + %-4d\n",
                        number,
                        SQUARE_NUMBER,
                        LEFT,
                        RIGHT);
        }
    }
}