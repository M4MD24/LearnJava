package _2_solving._2_6_leet_code._2_6_1_problem_set._2_6_1_1_easy._2_6_1_1_202_happy_number;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Write an algorithm to determine if a number n is happy.
 * <br/>
 * <br/>
 * A happy number is a number defined by the following process:
 * </h2>
 * <br/>
 * <br/>
 * <ul>
 * <li>Starting with any positive integer, replace the number by the sum of the squares of its digits.</li>
 * <li>Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1.</li>
 * <li>Those numbers for which this process ends in 1 are happy.</li>
 * </ul>
 * <br/>
 * <br/>
 * <h2>Return true if n is a happy number, and false if not.</h2>
 */

public class HappyNumber {
    public static void main(final String[] PARAMETERS) {
        final int NUMBER = 19;
        System.out.print(isHappy(NUMBER));
    }

    private static boolean isHappy(final int NUMBER) {
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