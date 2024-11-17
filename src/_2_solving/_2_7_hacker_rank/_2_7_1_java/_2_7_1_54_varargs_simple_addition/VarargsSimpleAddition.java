package _2_solving._2_7_hacker_rank._2_7_1_java._2_7_1_54_varargs_simple_addition;

import java.util.Scanner;

/**
 * @see _2_solving._2_7_hacker_rank._2_7_1_java._2_7_1_54_varargs_simple_addition.files <h2>Question</h2>
 */

public class VarargsSimpleAddition {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        final int FIRST_NUMBER = INPUT.nextInt(),
                SECOND_NUMBER = INPUT.nextInt(),
                THIRD_NUMBER = INPUT.nextInt(),
                FOURTH_NUMBER = INPUT.nextInt(),
                FIFTH_NUMBER = INPUT.nextInt(),
                SIXTH_NUMBER = INPUT.nextInt();
        add(FIRST_NUMBER, SECOND_NUMBER);
        add(FIRST_NUMBER, SECOND_NUMBER, THIRD_NUMBER);
        add(FIRST_NUMBER, SECOND_NUMBER, THIRD_NUMBER, FOURTH_NUMBER, FIFTH_NUMBER);
        add(FIRST_NUMBER, SECOND_NUMBER, THIRD_NUMBER, FOURTH_NUMBER, FIFTH_NUMBER, SIXTH_NUMBER);
    }

    private static void add(final int... NUMBERS) {
        int sum = 0;
        final StringBuilder EXPRESSION = new StringBuilder();
        for (int index = 0; index < NUMBERS.length; index++) {
            sum += NUMBERS[index];
            EXPRESSION.append(NUMBERS[index]);
            if (index < NUMBERS.length - 1)
                EXPRESSION.append("+");
        }
        System.out.println(EXPRESSION + "=" + sum);
    }
}