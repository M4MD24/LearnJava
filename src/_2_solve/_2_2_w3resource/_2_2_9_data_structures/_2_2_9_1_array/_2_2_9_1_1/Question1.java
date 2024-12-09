package _2_solve._2_2_w3resource._2_2_9_data_structures._2_2_9_1_array._2_2_9_1_1;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to sort a numeric array and a string array.</h2>
 */

public class Question1 {
    public static void main(final String[] PARAMETERS) {
        forNumbers();
        System.out.println();
        forProgrammingLanguages();
    }

    private static void forProgrammingLanguages() {
        final String[] PROGRAMMING_LANGUAGES = new String[]{
                "Java",
                "Kotlin",
                "XML",
                "SQL",
                "HTML",
                "CSS",
                "JavaScript",
                "PHP"
        };
        System.out.println("Before Sorting: " + Arrays.toString(PROGRAMMING_LANGUAGES));
        Arrays.sort(PROGRAMMING_LANGUAGES);
        System.out.print("Before Sorting: " + Arrays.toString(PROGRAMMING_LANGUAGES));
    }

    private static void forNumbers() {
        final int[] NUMBERS = new int[]{
                52,
                64,
                21,
                58,
                641,
                3,
                100,
                64,
                2
        };
        System.out.println("Before Sorting: " + Arrays.toString(NUMBERS));
        Arrays.sort(NUMBERS);
        System.out.println("Before Sorting: " + Arrays.toString(NUMBERS));
    }
}