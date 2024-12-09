package _2_solve._2_7_hacker_rank._2_7_1_java._2_7_1_36_hashset;

import java.util.HashSet;
import java.util.Scanner;

/**
 * @see _2_solve._2_7_hacker_rank._2_7_1_java._2_7_1_36_hashset.files <h2>Question</h2>
 */

public class HashSetExample {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        int countOfElements = INPUT.nextInt();
        final HashSet<String> PAIRS = new HashSet<>();
        while (countOfElements-- > 0) {
            PAIRS.add(INPUT.next() + " " + INPUT.next());
            System.out.println(PAIRS.size());
        }
    }
}