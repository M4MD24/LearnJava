package _2_solve._2_2_w3resource._2_2_4_math_and_numbers._2_2_4_2_numbers._2_2_4_2_9;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Write a Java program to find and print the first 10 happy numbers.
 * <br/>
 * Happy number: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1, or it loops endlessly in a cycle which does not include 1.
 * <br/>
 * Example: 19 is a happy number
 * <br/>
 * 12 + 92 = 82
 * <br/>
 * 82 + 22 = 68
 * <br/>
 * 62 + 82 = 100
 * <br/>
 * 12 + 02 + 02 = 1
 * </h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * First 10 Happy numbers:
 * <br/>
 * 1
 * <br/>
 * 7
 * <br/>
 * 10
 * <br/>
 * 13
 * <br/>
 * 19
 * <br/>
 * 23
 * <br/>
 * 28
 * <br/>
 * 31
 * <br/>
 * 32
 * <br/>
 * 44
 * </h2>
 */
public class Question9 {
    public static void main(final String[] ARGUMENTS) {
        final int COUNT_OF_HAPPY_NUMBERS = 10;
        System.out.printf("First %d Happy numbers:%n", COUNT_OF_HAPPY_NUMBERS);
        printHappyNumbers(COUNT_OF_HAPPY_NUMBERS);
    }

    private static void printHappyNumbers(final int COUNT_OF_HAPPY_NUMBERS) {
        for (int index = 0, number = 0; index < COUNT_OF_HAPPY_NUMBERS; number++)
            if (isHappyNumber(number)) {
                System.out.println(number);
                index++;
            }
    }

    private static boolean isHappyNumber(final int NUMBER) {
        int firstNumber = NUMBER,
                secondNumber = NUMBER;
        do {
            firstNumber = findSquareSum(firstNumber);
            secondNumber = findSquareSum(findSquareSum(secondNumber));
        } while (firstNumber != secondNumber);
        return firstNumber == 1;
    }

    private static int findSquareSum(int number) {
        int sum = 0;
        while (number != 0) {
            final int DIGIT = number % 10;
            sum += DIGIT * DIGIT;
            number /= 10;
        }
        return sum;
    }
}