package _2_solve._2_7_hacker_rank._2_7_1_java._2_7_1_37_generics;

/**
 * @see _2_solve._2_7_hacker_rank._2_7_1_java._2_7_1_37_generics.files <h2>Question</h2>
 */

public class Generics {
    public static void main(final String[] PARAMETERS) {
        final Integer[] NUMBERS = {1, 2, 3};
        final String[] TEXTS = {"Hello", "World"};
        printArray(NUMBERS);
        printArray(TEXTS);
    }

    private static <T> void printArray(final T[] ARRAY) {
        for (final T ELEMENT : ARRAY)
            System.out.println(ELEMENT);
    }
}