package _2_solve._2_7_hacker_rank._2_7_1_java._2_7_1_59_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 * @see _2_solve._2_7_hacker_rank._2_7_1_java._2_7_1_59_iterator.files <h2>Question</h2>
 */

public class IteratorExample {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        final ArrayList<String> ELEMENTS = new ArrayList<>();
        int countOfElements = INPUT.nextInt() + INPUT.nextInt();
        INPUT.nextLine();
        while (countOfElements-- > 0)
            ELEMENTS.add(INPUT.nextLine());
        iteratorMethod(ELEMENTS);
    }

    private static void iteratorMethod(final ArrayList<String> ELEMENTS) {
        final Iterator<String> ITERATOR = ELEMENTS.iterator();
        while (ITERATOR.hasNext()) {
            final String ELEMENT = ITERATOR.next();
            try {
                Integer.parseInt(ELEMENT);
            } catch (final Exception _) {
                System.out.println(ELEMENT);
            }
        }
    }
}