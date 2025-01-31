package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_3_hard._2_5_1_3_6_postfix;

import java.util.Scanner;
import java.util.Stack;

public class PostfixExample {
    public static void main(final String[] ARGUMENTS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print("Text: ");
        final String TEXT = INPUT.nextLine();
        System.out.print(postfix(TEXT));
    }

    private static int postfix(final String TEXT) {
        final Stack<Integer> NUMBERS = new Stack<>();
        for (final String SUB_TEXT : TEXT.split(" "))
            if (SUB_TEXT.matches("\\d+"))
                NUMBERS.push(Integer.parseInt(SUB_TEXT));
            else {
                final int SECOND_NUMBER = NUMBERS.pop(),
                        FIRST_NUMBER = NUMBERS.pop();
                NUMBERS.push(SUB_TEXT.equals("+") ? FIRST_NUMBER + SECOND_NUMBER
                        : SUB_TEXT.equals("-") ? FIRST_NUMBER - SECOND_NUMBER
                        : SUB_TEXT.equals("*") ? FIRST_NUMBER * SECOND_NUMBER
                        : FIRST_NUMBER / SECOND_NUMBER);
            }
        return NUMBERS.pop();
    }
}