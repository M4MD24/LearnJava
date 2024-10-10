package _2_solving._2_1_w3schools._2_1_1_how_to._2_1_1_14_hash_map_loop;

import java.util.HashMap;
import java.util.Map;

public class HashMapLoop {
    public static void main(final String[] PARAMETERS) {
        final HashMap<Integer, String> NUMBERS = new HashMap<>(Map.of(
                1, "M",
                3, "H",
                2, "O",
                5, "M",
                7, "D",
                6, "E",
                4, "A"
        ));
        printElements(NUMBERS);
    }

    private static void printElements(final HashMap<Integer, String> ELEMENTS) {
        for (final Map.Entry<Integer, String> NUMBER : ELEMENTS.entrySet())
            System.out.println(NUMBER);
    }
}