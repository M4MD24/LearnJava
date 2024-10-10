package _2_solving._2_1_w3schools._2_1_1_how_to._2_1_1_13_array_list_loop;

import java.util.ArrayList;
import java.util.List;

public class ArrayListLoop {
    public static void main(final String[] PARAMETERS) {
        final ArrayList<Integer> NUMBERS = new ArrayList<>(List.of(1, 5, 2, 3));
        printElements(NUMBERS);
    }

    private static void printElements(final ArrayList<Integer> NUMBERS) {
        for (final int NUMBER : NUMBERS)
            System.out.println(NUMBER);
    }
}