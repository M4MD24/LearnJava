package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_10_string_and_input_and_output._2_2_1_1_10_1_string._2_2_1_1_10_1_32;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to find the longest Palindromic Substring within a string.</h2>
 */

public class Question32 {
    public static void main(final String[] ARGUMENTS) {
        final String TEXT = "thequickbrownfoxxofnworbquickthe";
        System.out.print(getLongestPalindrome(TEXT));
    }

    public static String getLongestPalindrome(final String TARGET_TEXT) {
        int start = 0,
                maxLength = 0;
        for (int round = 0; round < TARGET_TEXT.length(); round++)
            for (int index = round; index < TARGET_TEXT.length(); index++)
                if (isPalindrome(TARGET_TEXT, round, index) &&
                        (index - round + 1) > maxLength) {
                    start = round;
                    maxLength = index - round + 1;
                }
        return TARGET_TEXT.substring(start, start + maxLength);
    }

    private static boolean isPalindrome(final String SUB_TEXT, int left, int right) {
        while (left < right)
            if (SUB_TEXT.charAt(left++) != SUB_TEXT.charAt(right--))
                return false;
        return true;
    }
}