package _2_solving._2_7_hacker_rank._2_7_1_java._2_7_1_26_array_list;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @see _2_solving._2_7_hacker_rank._2_7_1_java._2_7_1_26_array_list.files <h2>Question</h2>
 */

public class ArrayListExample {
    private static final Scanner INPUT = new Scanner(System.in);

    public static void main(final String[] PARAMETERS) {
        executeQueries(getRows());
    }

    private static ArrayList<ArrayList<Integer>> getRows() {
        final int COUNT_OF_ROWS = INPUT.nextInt();
        final ArrayList<ArrayList<Integer>> ROWS = new ArrayList<>();
        for (int currentCountOfRow = 0; currentCountOfRow < COUNT_OF_ROWS; currentCountOfRow++) {
            final int COUNT_OF_NUMBERS = INPUT.nextInt();
            final ArrayList<Integer> ROW = new ArrayList<>();
            for (int currentCountOfNumbers = 0; currentCountOfNumbers < COUNT_OF_NUMBERS; currentCountOfNumbers++)
                ROW.add(INPUT.nextInt());
            ROWS.add(ROW);
        }
        return ROWS;
    }

    private static void executeQueries(final ArrayList<ArrayList<Integer>> ROWS) {
        final int COUNT_OF_QUERIES = INPUT.nextInt();
        for (int index = 0; index < COUNT_OF_QUERIES; index++) {
            final int ROW_INDEX = INPUT.nextInt() - 1,
                    POSITION_INDEX = INPUT.nextInt() - 1;
            if (isValidPosition(ROWS, ROW_INDEX, POSITION_INDEX))
                System.out.println(ROWS.get(ROW_INDEX).get(POSITION_INDEX));
            else
                System.out.println("ERROR!");
        }
    }

    private static boolean isValidPosition(final ArrayList<ArrayList<Integer>> ROWS, final int ROW_INDEX, final int POSITION_INDEX) {
        return ROW_INDEX >= 0 &&
                ROW_INDEX < ROWS.size() &&
                POSITION_INDEX >= 0 &&
                POSITION_INDEX < ROWS.get(ROW_INDEX).size();
    }
}