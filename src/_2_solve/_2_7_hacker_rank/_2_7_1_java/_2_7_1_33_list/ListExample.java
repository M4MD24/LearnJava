package _2_solve._2_7_hacker_rank._2_7_1_java._2_7_1_33_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @see _2_solve._2_7_hacker_rank._2_7_1_java._2_7_1_33_list.files <h2>Question</h2>
 */

public class ListExample {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        final List<Integer> NUMBERS = new ArrayList<>();
        final int COUNT_OF_NUMBERS = INPUT.nextInt();
        for (int index = 0; index < COUNT_OF_NUMBERS; index++)
            NUMBERS.add(INPUT.nextInt());
        final int COUNT_OF_COMMANDS = INPUT.nextInt();
        for (int index = 0; index < COUNT_OF_COMMANDS; index++) {
            final String COMMAND = INPUT.next();
            if (COMMAND.equals("Insert")) {
                final int INDEX = INPUT.nextInt(),
                        NUMBER = INPUT.nextInt();
                NUMBERS.add(INDEX, NUMBER);
            } else {
                final int INDEX = INPUT.nextInt();
                NUMBERS.remove(INDEX);
            }
        }
        for (final int NUMBER : NUMBERS)
            System.out.print(NUMBER + " ");
    }
}