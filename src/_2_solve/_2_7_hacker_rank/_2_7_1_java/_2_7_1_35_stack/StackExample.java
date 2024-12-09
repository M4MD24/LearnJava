package _2_solve._2_7_hacker_rank._2_7_1_java._2_7_1_35_stack;

import java.util.Scanner;
import java.util.Stack;

/**
 * @see _2_solve._2_7_hacker_rank._2_7_1_java._2_7_1_35_stack.files <h2>Question</h2>
 */

public class StackExample {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        while (INPUT.hasNext())
            System.out.println(isBalanced(INPUT.next()));
    }

    private static boolean isBalanced(final String TEXT) {
        final Stack<Character> PARENTHESES_SET = new Stack<>();
        for (final char CHARACTER : TEXT.toCharArray())
            if (CHARACTER == '{' || CHARACTER == '[' || CHARACTER == '(')
                PARENTHESES_SET.push(CHARACTER);
            else if (CHARACTER == '}' || CHARACTER == ']' || CHARACTER == ')')
                if (PARENTHESES_SET.isEmpty())
                    return false;
                else {
                    if (!isMatchingPair(PARENTHESES_SET.pop(), CHARACTER))
                        return false;
                }
        return PARENTHESES_SET.isEmpty();
    }

    private static boolean isMatchingPair(final char OPEN_PARENTHESES, final char CLOSE_PARENTHESES) {
        return (OPEN_PARENTHESES == '(' && CLOSE_PARENTHESES == ')') ||
                (OPEN_PARENTHESES == '{' && CLOSE_PARENTHESES == '}') ||
                (OPEN_PARENTHESES == '[' && CLOSE_PARENTHESES == ']');
    }
}
