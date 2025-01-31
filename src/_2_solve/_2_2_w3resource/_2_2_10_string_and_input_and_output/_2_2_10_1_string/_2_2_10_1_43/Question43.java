package _2_solve._2_2_w3resource._2_2_10_string_and_input_and_output._2_2_10_1_string._2_2_10_1_43;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to find the character in a string that occurs the most frequently.</h2>
 */

public class Question43 {
    public static void main(final String[] ARGUMENTS) {
        final String TEXT = "aAAaaAA";
        System.out.print(getMaximumOccursCharacters(TEXT));
    }

    private static char getMaximumOccursCharacters(final String TEXT) {
        return TEXT.chars()
                .mapToObj(character -> (char) character)
                .collect(
                        Collectors.groupingBy(
                                Function.identity(),
                                Collectors.counting()
                        )
                ).entrySet()
                .stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElseThrow();
    }
}