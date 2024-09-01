package _2_solving._2_2_w3resource._2_2_4_math_and_numbers._2_2_4_2_numbers._2_2_4_2_10;

/**
 * <h1>Question:</h1>
 * <h2>
 * Write a Java program to check whether a given number is a happy number or unhappy number.
 * <br/>
 * Happy number: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1, or it loops endlessly in a cycle which does not include 1.
 * <br/>
 * An unhappy number is a number that is not happy.
 * <br/>
 * The first few unhappy numbers are 2, 3, 4, 5, 6, 8, 9, 11, 12, 14, 15, 16, 17, 18, 20.
 * </h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input a number: 5
 * <br/>
 * Unhappy Number
 * </h2>
 */
public class Question10 {
    public static void main(final String[] ARGS) {
        final int NUMBER = 7;
        System.out.println("Input a number: " + NUMBER);
        System.out.printf("%sappy Number", isHappyNumber(NUMBER)
                ? "H"
                : "Unh");
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