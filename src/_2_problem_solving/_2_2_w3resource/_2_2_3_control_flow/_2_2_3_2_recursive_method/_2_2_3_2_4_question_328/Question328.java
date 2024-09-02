package _2_problem_solving._2_2_w3resource._2_2_3_control_flow._2_2_3_2_recursive_method._2_2_3_2_4_question_328;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java recursive method to check if a given string is a palindrome.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>madam is a palindrome: true</h2>
 */

public class Question328 {
    public static void main(final String[] ARGS) {
        final String WORD = "madam";
        System.out.printf("%s is a palindrome: %b",
                WORD,
                isPalindrome(WORD, 0, WORD.length() - 1));
    }

    private static boolean isPalindrome(final String WORD, int rightIndex, int leftIndex) {
        if (rightIndex == leftIndex || rightIndex > leftIndex)
            return true;
        else if (WORD.charAt(rightIndex) != WORD.charAt(leftIndex))
            return false;
        else
            return isPalindrome(WORD, ++rightIndex, --leftIndex);
    }
}