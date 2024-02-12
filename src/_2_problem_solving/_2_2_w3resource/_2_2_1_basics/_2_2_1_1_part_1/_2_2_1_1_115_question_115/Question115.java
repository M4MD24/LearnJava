package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_115_question_115;

import java.util.Scanner;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to check if a positive number is a palindrome or not.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Input a positive integer: 151</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Is 151 is a palindrome number?
 * <br/>
 * true
 * </h2>
 */

class Solution1 {
    static int reverseNumbers(int number) {
        int reverse = 0;
        while (number != 0) {
            reverse *= 10;
            reverse += number % 10;
            number /= 10;
        }
        return reverse;
    }
}

class Solution2 {
    static int reverseNumbers(char[] numbers) {
        int length = numbers.length;
        int[] reversedNumbers = new int[length];
        for (int index1 = 0, index2 = length - 1; index1 < length; index1++, index2--) reversedNumbers[index2] = numbers[index1] - '0';

        StringBuilder reversedNumber = new StringBuilder();
        for (int number : reversedNumbers) reversedNumber.append(number);

        return Integer.parseInt(String.valueOf(reversedNumber));
    }
}

public class Question115 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input a positive integer: ");
        final int NUMBER = input.nextInt();

        solution1(NUMBER);
        solution2(NUMBER);
    }

    private static void solution1(final int NUMBER) {
        final int REVERSED_NUMBER = Solution1.reverseNumbers(NUMBER);
        final boolean IS_PALINDROME = NUMBER == REVERSED_NUMBER;
        System.out.printf("Is %d a palindrome number? \n%b\n\n", NUMBER, IS_PALINDROME);
    }

    private static void solution2(final int NUMBER) {
        final int REVERSED_NUMBER = Solution2.reverseNumbers(String.valueOf(NUMBER).toCharArray());
        final boolean IS_PALINDROME = NUMBER == REVERSED_NUMBER;
        System.out.printf("Is %d a palindrome number? \n%b", NUMBER, IS_PALINDROME);
    }

}