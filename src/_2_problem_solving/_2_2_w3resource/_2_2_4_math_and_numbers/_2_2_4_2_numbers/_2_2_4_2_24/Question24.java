package _2_problem_solving._2_2_w3resource._2_2_4_math_and_numbers._2_2_4_2_numbers._2_2_4_2_24;

/**
 * <h1>Question:</h1>
 * <h2>
 * Write a Java program to check if a number is a palindrome or not.
 * <br/>
 * In number system a palindromic number is a number that is the same when written forwards or backwards, i.e., of the form .
 * <br/>
 * The first few palindromic numbers are therefore are 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 11, 22, 33, 44, 55, 66, 77, 88, 99, 101, 111, …
 * </h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input a number: 5
 * <br/>
 * Is a palindrome number.
 * </h2>
 */
public class Question24 {
    public static void main(final String[] ARGS) {
        final int NUMBER = 5;
        System.out.println("Input a number: " + NUMBER);
        System.out.printf("Is%s a palindrome number.", isPalindromeNumber(NUMBER) ? "" : "n't");
    }

    private static boolean isPalindromeNumber(final int NUMBER) {
        return String.valueOf(NUMBER).contentEquals(new StringBuilder(String.valueOf(NUMBER)).reverse());
    }
}