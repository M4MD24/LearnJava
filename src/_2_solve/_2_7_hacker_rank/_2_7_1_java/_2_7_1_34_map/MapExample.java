package _2_solve._2_7_hacker_rank._2_7_1_java._2_7_1_34_map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @see _2_solve._2_7_hacker_rank._2_7_1_java._2_7_1_34_map.files <h2>Question</h2>
 */

public class MapExample {
    public static void main(final String[] ARGUMENTS) {
        final Scanner INPUT = new Scanner(System.in);
        final int COUNT_OF_TEST_CASES = INPUT.nextInt();
        INPUT.nextLine();
        final Map<String, String> PHONE_BOOK = new HashMap<>();
        for (int index = 0; index < COUNT_OF_TEST_CASES; index++)
            PHONE_BOOK.put(INPUT.nextLine(), INPUT.nextLine());
        while (INPUT.hasNextLine()) {
            final String QUERY_NAME = INPUT.nextLine();
            if (PHONE_BOOK.containsKey(QUERY_NAME))
                System.out.println(QUERY_NAME + "=" + PHONE_BOOK.get(QUERY_NAME));
            else
                System.out.println("Not found");
        }
    }
}