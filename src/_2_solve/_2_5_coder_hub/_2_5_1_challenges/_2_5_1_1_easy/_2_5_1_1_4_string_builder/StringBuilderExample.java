package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_1_easy._2_5_1_1_4_string_builder;

import java.util.Scanner;
import java.util.Stack;

public class StringBuilderExample {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(stringBuilder(INPUT.nextLine()));
    }

    private static String stringBuilder(final String TEXT) {
        final Stack<Integer> COUNTS = new Stack<>();
        final Stack<StringBuilder> RESULT_STACK = new Stack<>();
        StringBuilder result = new StringBuilder();
        for (int index = 0; index < TEXT.length(); index++)
            if (Character.isDigit(TEXT.charAt(index))) {
                int count = 0;
                while (Character.isDigit(TEXT.charAt(index)))
                    count = count * 10 + (TEXT.charAt(index++) - '0');
                COUNTS.push(count);
            } else if (TEXT.charAt(index) == '[') {
                RESULT_STACK.push(result);
                result = new StringBuilder();
            } else if (TEXT.charAt(index) == ']') {
                final StringBuilder TEMPORARY_RESULT = result;
                result = RESULT_STACK.pop();
                result.append(TEMPORARY_RESULT.toString().repeat(COUNTS.pop()));
            } else
                result.append(TEXT.charAt(index));
        return result.toString();
    }
}