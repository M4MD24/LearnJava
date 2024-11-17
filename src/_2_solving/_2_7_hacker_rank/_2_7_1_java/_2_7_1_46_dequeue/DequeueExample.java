package _2_solving._2_7_hacker_rank._2_7_1_java._2_7_1_46_dequeue;

import java.util.HashMap;
import java.util.Scanner;

/**
 * @see _2_solving._2_7_hacker_rank._2_7_1_java._2_7_1_46_dequeue.files <h2>Question</h2>
 */

public class DequeueExample {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        final int COUNT_OF_ELEMENTS = INPUT.nextInt();
        final int TARGET_NUMBER = INPUT.nextInt();
        final int[] ELEMENTS = new int[COUNT_OF_ELEMENTS];
        for (int index = 0; index < COUNT_OF_ELEMENTS; index++)
            ELEMENTS[index] = INPUT.nextInt();
        HashMap<Integer, Integer> PAIRS = new HashMap<>();
        int maximumUniqueElement = 0;
        for (int index = 0; index < COUNT_OF_ELEMENTS; index++) {
            PAIRS.put(ELEMENTS[index], PAIRS.getOrDefault(ELEMENTS[index], 0) + 1);
            if (index >= TARGET_NUMBER) {
                final int LEFT = ELEMENTS[index - TARGET_NUMBER];
                if (PAIRS.get(LEFT) == 1)
                    PAIRS.remove(LEFT);
                else
                    PAIRS.put(LEFT, PAIRS.get(LEFT) - 1);
            }
            if (index >= TARGET_NUMBER - 1)
                maximumUniqueElement = Math.max(maximumUniqueElement, PAIRS.size());
        }
        System.out.print(maximumUniqueElement);
    }
}