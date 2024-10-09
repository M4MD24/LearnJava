package _2_solving._2_5_coder_hub._2_5_2_competitions._2_5_2_1_homeland_coder_competition_94._2_5_2_1_1_easy._2_5_2_1_1_1_is_palindrome;

import java.util.Scanner;

public class IsPalindromeExample {
    public static void main(final String[] PARAMETERS) {
        System.out.println(isPalindrome(new Scanner(System.in).nextLine()));
    }

    private static boolean isPalindrome(final String TEXT) {
        final String TEXT_AFTER_FILTERED = TEXT.toLowerCase().replaceAll("[^a-z0-9]", ""),
                TEXT_AFTER_FILTERED_REVERSED = new StringBuilder(TEXT_AFTER_FILTERED).reverse().toString();
        return TEXT_AFTER_FILTERED.equals(TEXT_AFTER_FILTERED_REVERSED);
    }
}