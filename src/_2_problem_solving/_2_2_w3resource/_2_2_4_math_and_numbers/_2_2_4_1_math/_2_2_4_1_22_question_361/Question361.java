package _2_problem_solving._2_2_w3resource._2_2_4_math_and_numbers._2_2_4_1_math._2_2_4_1_22_question_361;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to find the next smallest palindrome.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input palindrome number: 121
 * <br/>
 * Next smallest palindrome: 131
 * </h2>
 */

public class Question361 {
    public static void main(final String[] ARGS) {
        final int PALINDROME_NUMBER = 232;
        System.out.print(STR."""
                Input palindrome number:\s\{PALINDROME_NUMBER}
                Next smallest palindrome:\s\{getNextSmallestPalindrome(PALINDROME_NUMBER)}""");
    }

    private static int getNextSmallestPalindrome(final int NUMBER) {
        final StringBuilder NEXT_SMALL_PALINDROME = new StringBuilder(String.valueOf(NUMBER));
        if (NEXT_SMALL_PALINDROME.length() % 2 == 0)
            NEXT_SMALL_PALINDROME.replace(NEXT_SMALL_PALINDROME.length() / 2 - 1, NEXT_SMALL_PALINDROME.length() / 2 + 1, "3".repeat(2));
        else
            NEXT_SMALL_PALINDROME.setCharAt(NEXT_SMALL_PALINDROME.length() / 2, (char) (NEXT_SMALL_PALINDROME.charAt(NEXT_SMALL_PALINDROME.length() / 2) + 1));
        return Integer.parseInt(String.valueOf(NEXT_SMALL_PALINDROME));
    }
}