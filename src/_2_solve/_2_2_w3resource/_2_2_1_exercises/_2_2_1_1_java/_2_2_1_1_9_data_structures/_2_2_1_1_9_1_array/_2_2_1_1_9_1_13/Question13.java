package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_9_data_structures._2_2_1_1_9_1_array._2_2_1_1_9_1_13;

import java.util.HashSet;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to find duplicate values in an array of string values.</h2>
 */

public class Question13 {
    public static void main(final String[] ARGUMENTS) {
        final String[] PROGRAMMING_LANGUAGES = new String[]{
                "Java",
                "Kotlin",
                "XML",
                "HTML",
                "SQL",
                "HTML",
                "Kotlin",
                "JavaScript",
                "CSS",
                "JavaScript",
                "PHP"
        };
        printDuplicatedNumbers(PROGRAMMING_LANGUAGES);
    }

    private static void printDuplicatedNumbers(final String[] STRINGS) {
        final HashSet<String> DISTINCT = new HashSet<>();
        for (final String STRING : STRINGS)
            if (!DISTINCT.add(STRING))
                System.out.println(STRING + " is Duplicated!");
    }
}