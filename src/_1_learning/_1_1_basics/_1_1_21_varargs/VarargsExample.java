package _1_learning._1_1_basics._1_1_21_varargs;

import java.util.Scanner;

/* Varargs is like a Array ! */

public class VarargsExample {
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