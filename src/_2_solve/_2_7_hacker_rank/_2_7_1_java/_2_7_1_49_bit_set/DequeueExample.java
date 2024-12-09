package _2_solve._2_7_hacker_rank._2_7_1_java._2_7_1_49_bit_set;

import java.util.BitSet;
import java.util.Scanner;

/**
 * @see _2_solve._2_7_hacker_rank._2_7_1_java._2_7_1_49_bit_set.files <h2>Question</h2>
 */

public class DequeueExample {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        final int BIT_SET_SIZE = INPUT.nextInt();
        final int COUNT_OF_ELEMENTS_IN_GROUP = INPUT.nextInt();
        final BitSet FIRST_BIT_SET = new BitSet(BIT_SET_SIZE),
                SECOND_BIT_SET = new BitSet(BIT_SET_SIZE);
        for (int currentOperationIndex = 0; currentOperationIndex < COUNT_OF_ELEMENTS_IN_GROUP; currentOperationIndex++) {
            final String OPERATION = INPUT.next();
            final int BIT_SET_INDEX = INPUT.nextInt();
            final int SECOND_BIT_SET_INDEX = (INPUT.hasNextInt())
                    ? INPUT.nextInt()
                    : -1;
            switch (OPERATION) {
                case "AND" -> {
                    if (BIT_SET_INDEX == 1) FIRST_BIT_SET.and(SECOND_BIT_SET);
                    else SECOND_BIT_SET.and(FIRST_BIT_SET);
                }
                case "OR" -> {
                    if (BIT_SET_INDEX == 1) FIRST_BIT_SET.or(SECOND_BIT_SET);
                    else SECOND_BIT_SET.or(FIRST_BIT_SET);
                }
                case "XOR" -> {
                    if (BIT_SET_INDEX == 1) FIRST_BIT_SET.xor(SECOND_BIT_SET);
                    else SECOND_BIT_SET.xor(FIRST_BIT_SET);
                }
                case "SET" -> {
                    if (BIT_SET_INDEX == 1)
                        FIRST_BIT_SET.set(SECOND_BIT_SET_INDEX);
                    else
                        SECOND_BIT_SET.set(SECOND_BIT_SET_INDEX);
                }
                case "FLIP" -> {
                    if (BIT_SET_INDEX == 1)
                        FIRST_BIT_SET.flip(SECOND_BIT_SET_INDEX);
                    else
                        SECOND_BIT_SET.flip(SECOND_BIT_SET_INDEX);
                }
            }
            System.out.println(FIRST_BIT_SET.cardinality() + " " + SECOND_BIT_SET.cardinality());
        }
    }
}