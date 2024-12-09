package _2_solve._2_5_coder_hub._2_5_2_competitions._2_5_2_2_coder_hub_hat_24_third_day._2_5_2_2_1_easy._2_5_2_2_1_1_is_palindrome;

import java.util.Arrays;

public class IsPalindromeExample {
    public static void main(final String[] PARAMETERS) {
        System.out.println(isPalindrome(new int[]{1, 2, 1}));
    }

    private static boolean isPalindrome(final int[] NUMBERS) {
        final String TEXT_AFTER_FILTERED = Arrays.toString(NUMBERS).toLowerCase().replaceAll("[^a-z0-9]", ""),
                TEXT_AFTER_FILTERED_REVERSED = new StringBuilder(TEXT_AFTER_FILTERED).reverse().toString();
        return TEXT_AFTER_FILTERED.equals(TEXT_AFTER_FILTERED_REVERSED);
    }
}