package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_1_basics._2_2_1_1_1_part_1._2_2_1_1_1_142;

import java.util.Scanner;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Write a Java program to check if two strings are anagrams or not.
 * <br/>
 * According to Wikipedia "An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once. For example, the word anagram can be rearranged into nag a ram, or the word binary into brainy."
 * </h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Input characters: xyyz</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>String has all unique characters: false</h2>
 */
public class Question142 {
    private static final Scanner INPUT = new Scanner(System.in);

    public static void main(final String[] ARGUMENTS) {
        System.out.print("First String: ");
        final String STRING_1 = INPUT.nextLine();
        System.out.print("Second String: ");
        final String STRING_2 = INPUT.nextLine();

        System.out.print("Are anagrams: " + checkStringHasAllUniqueCharacters(STRING_1, STRING_2));
    }

    private static boolean checkStringHasAllUniqueCharacters(final String STRING_1, final String STRING_2) {
        final char[] STRING_2_CHARACTERS = STRING_2.toCharArray();
        for (int start = 0, end = STRING_2_CHARACTERS.length - 1; start < end; start++, end--) {
            char TEMP = STRING_2_CHARACTERS[start];
            STRING_2_CHARACTERS[start] = STRING_2_CHARACTERS[end];
            STRING_2_CHARACTERS[end] = TEMP;
        }
        return STRING_1.equals(String.valueOf(STRING_2_CHARACTERS));
    }
}