package _2_solving._2_2_w3resource._2_2_4_math_and_numbers._2_2_4_2_numbers._2_2_4_2_6;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to generate and show the first 15 narcissistic decimal numbers.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>0 1 2 3 4 5 6 7 8 9 153 370 371 407 1634</h2>
 */
public class Question6 {
    public static void main(final String[] ARGS) {
        final int TARGET_NUMBER = 15;
        printNarcissisticNumbers(TARGET_NUMBER);
    }

    private static void printNarcissisticNumbers(final int TARGET_NUMBER) {
        for (int countOfNumbers = 0, number = 0; countOfNumbers < TARGET_NUMBER; number++)
            if (isNarcissistic(number)) {
                System.out.print(number + " ");
                countOfNumbers++;
            }
    }

    private static boolean isNarcissistic(int number) {
        final int LENGTH_OF_DIGITS = String.valueOf(number).length();
        int originalNumber = number,
                sum = 0;
        while (number > 0) {
            int digit = number % 10;
            sum += (int) Math.pow(digit, LENGTH_OF_DIGITS);
            number /= 10;
        }
        return sum == originalNumber;
    }
}