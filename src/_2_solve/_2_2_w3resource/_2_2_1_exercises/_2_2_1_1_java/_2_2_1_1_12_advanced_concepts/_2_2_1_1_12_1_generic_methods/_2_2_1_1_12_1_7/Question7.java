package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_12_advanced_concepts._2_2_1_1_12_1_generic_methods._2_2_1_1_12_1_7;

import java.util.Map;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create a generic method that takes a map of any type and prints each key-value pair.</h2>
 */

public class Question7 {
    public static void main(final String[] ARGUMENTS) {
        final Map<String, Integer> sampleMap = Map.of(
                "One", 1,
                "Two", 2,
                "Three", 3,
                "Four", 4,
                "Five", 5,
                "Six", 6,
                "Seven", 7,
                "Eight", 8,
                "Nine", 9,
                "Ten", 10
        );
        printMap(sampleMap);
    }

    private static <KeyType, ValueType> void printMap(final Map<KeyType, ValueType> MAP) {
        for (Map.Entry<KeyType, ValueType> ENTRY : MAP.entrySet())
            System.out.printf(
                    "Key: %7s, Value: %s%n",
                    ENTRY.getKey(),
                    ENTRY.getValue()
            );
    }
}