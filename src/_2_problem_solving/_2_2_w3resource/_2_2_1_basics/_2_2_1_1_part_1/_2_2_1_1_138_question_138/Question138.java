package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_138_question_138;

import java.util.Arrays;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to find the longest words in a dictionary.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Example 1:</h2>
 * <h3>
 * {
 * <br/>
 * "cat",
 * <br/>
 * "flag",
 * <br/>
 * "green",
 * <br/>
 * "country",
 * <br/>
 * "w3resource"
 * <br/>
 * }
 * </h3>
 * <h2>Example 2:</h2>
 * <h3>
 * {
 * <br/>
 * "cat",
 * <br/>
 * "dog",
 * <br/>
 * "red",
 * <br/>
 * "is",
 * <br/>
 * "am"
 * <br/>
 * }
 * </h3>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>Example 1:</h2>
 * <h3>
 * Original dictionary: [cat, flag, green, country, w3resource]
 * <br/>
 * Longest word(s) of the above dictionary: [w3resource]
 * </h3>
 * <h2>Example 2:</h2>
 * <h3>
 * Original dictionary: [cat, dog, red, is, am]
 * <br/>
 * Longest word(s) of the above dictionary: [cat, dog, red]
 * </h3>
 */
public class Question138 {
    public static void main(String[] args) {
        final String[] DICTIONARY = {"cat", "dog", "red", "is", "am"};
        System.out.println("Original Dictionary: " + Arrays.toString(DICTIONARY));
        System.out.print("Longest word(s) of the above dictionary: ");
        findLongestWords(DICTIONARY);
    }

    private static void findLongestWords(final String[] DICTIONARY) {
        int[] indexesLongestWords = new int[DICTIONARY.length];
        int longestLength = getLongestLength(DICTIONARY),
                sumIndexesForLongestWords = getSumIndexesForLongestWords(longestLength, DICTIONARY, indexesLongestWords);
        System.out.print("[");
        for (int index = 0; index <= sumIndexesForLongestWords; index++) {
            System.out.print(DICTIONARY[indexesLongestWords[index]]);
            if (index != sumIndexesForLongestWords) System.out.print(", ");
        }
        System.out.print("]");
    }

    private static int getLongestLength(final String[] DICTIONARY) {
        int longestLength = DICTIONARY[0].length();
        for (String word : DICTIONARY) if (word.length() > longestLength) longestLength = word.length();
        return longestLength;
    }

    private static int getSumIndexesForLongestWords(int longestLength, final String[] DICTIONARY, int[] indexesLongestWords) {
        int sumIndexesForLongestWords = 0;
        for (int indexForDictionary = 1; indexForDictionary < DICTIONARY.length; indexForDictionary++) {
            if (longestLength == DICTIONARY[indexForDictionary].length()) {
                indexesLongestWords[sumIndexesForLongestWords] = indexForDictionary;
                sumIndexesForLongestWords++;
            }
        }
        return sumIndexesForLongestWords;
    }
}