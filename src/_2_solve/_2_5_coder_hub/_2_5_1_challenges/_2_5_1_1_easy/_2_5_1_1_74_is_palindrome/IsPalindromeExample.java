package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_1_easy._2_5_1_1_74_is_palindrome;

import java.util.Scanner;

public class IsPalindromeExample {
    public static void main(final String[] ARGUMENTS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(isPalindrome(INPUT.nextLine()));
    }

    private static boolean isPalindrome(String text) {
        text = text.replaceAll(
                        "[^a-zA-Z0-9]",
                        ""
                )
                .toLowerCase();
        return text.contentEquals(new StringBuilder(text).reverse());
    }
}