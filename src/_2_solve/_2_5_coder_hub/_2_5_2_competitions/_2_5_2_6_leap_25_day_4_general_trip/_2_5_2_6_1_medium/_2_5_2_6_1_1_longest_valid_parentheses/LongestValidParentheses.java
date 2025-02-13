package _2_solve._2_5_coder_hub._2_5_2_competitions._2_5_2_6_leap_25_day_4_general_trip._2_5_2_6_1_medium._2_5_2_6_1_1_longest_valid_parentheses;

import java.util.Scanner;

public class LongestValidParentheses {
    public static void main(final String[] ARGUMENTS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(longestValidParentheses(INPUT.next()));
    }

    private static int longestValidParentheses(final String TEXT) {
        final int[] INDEX_STACK = new int[TEXT.length() + 1];
        int stackTop = -1,
                maximumLength = 0,
                lastInvalidIndex = -1;
        for (int index = 0; index < TEXT.length(); index++)
            if (TEXT.charAt(index) == '(')
                INDEX_STACK[++stackTop] = index;
            else if (stackTop == -1)
                lastInvalidIndex = index;
            else
                maximumLength = Math.max(
                        maximumLength,
                        index - (stackTop-- > 0
                                ? INDEX_STACK[stackTop]
                                : lastInvalidIndex)
                );
        return maximumLength;
    }
}