package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_2_part_2._2_2_1_2_31;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to find the length of the last word in a given string. The string contains upper/lower-case alphabets and empty space characters like ' '.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Original String: The length of last word
 * <br/>
 * Length of the last word of the above string: 4
 * </h2>
 */

public class Question31 {
    public static void main(final String[] PARAMETERS) {
        final String TEXT = "The length of last word";
        final String[] TEXT_OF_WORDS = TEXT.split(" +");
        System.out.printf("Original String: %s\n", TEXT);
        System.out.printf("Length of the last word of the above string: %d", TEXT_OF_WORDS[TEXT_OF_WORDS.length - 1].length());
    }
}