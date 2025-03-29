package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_10_string_and_input_and_output._2_2_1_1_10_1_string._2_2_1_1_10_1_110;

import java.util.stream.Collectors;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to count the number of characters (alphanumeric only) that occur more than twice in a given string.</h2>
 */

public class Question110 {
    public static void main(final String[] ARGUMENTS) {
        System.out.print(getCountOfOccurrenceAlphanumericOnlyCharacterMoreThanTwice("Create a Date Calendar"));
    }

    private static long getCountOfOccurrenceAlphanumericOnlyCharacterMoreThanTwice(final String TEXT) {
        return TEXT.toLowerCase()
                .chars()
                .filter(Character::isLetterOrDigit)
                .boxed()
                .collect(Collectors.groupingBy(
                        character -> character,
                        Collectors.counting()))
                .values()
                .stream()
                .filter(count -> count > 2)
                .count();
    }
}