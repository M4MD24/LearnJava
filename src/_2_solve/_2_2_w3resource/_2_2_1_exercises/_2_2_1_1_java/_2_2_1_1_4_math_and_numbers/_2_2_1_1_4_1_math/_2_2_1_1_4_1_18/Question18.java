package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_4_math_and_numbers._2_2_1_1_4_1_math._2_2_1_1_4_1_18;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to count numbers without 7 from 1 to a given number.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input a number: 15
 * <br/>
 * Count the numbers without digit 7, from 1 to 15: 14
 * </h2>
 */

public class Question18 {
    public static void main(final String[] ARGUMENTS) {
        final int NUMBER = 100;
        System.out.printf("""
                        Input a number: %d
                        Count the numbers without digit 7, from 1 to 15: %d""",
                NUMBER,
                getCountOfNumbersWithoutDigitSeven(NUMBER));
    }

    private static int getCountOfNumbersWithoutDigitSeven(final int NUMBER) {
        int countOfNumbersWithoutDigitSeven = NUMBER;
        for (int number = 1; number <= NUMBER; number++)
            if (containNumberSeven(number))
                countOfNumbersWithoutDigitSeven--;
        return countOfNumbersWithoutDigitSeven;
    }

    private static boolean containNumberSeven(int number) {
        while (number != 0) {
            if (number % 10 == 7)
                return true;
            number /= 10;
        }
        return false;
    }
}