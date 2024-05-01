package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_149_question_149;

import java.util.Arrays;
import java.util.Scanner;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to check if a given string is a permutation of another given string.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>
 * Input first text: xxyz
 * <br/>
 * Input second text: yxzx
 * </h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Original strings: xxyz yxzx
 * <br/>
 * true
 * </h2>
 */

public class Question149 {
    private static final Scanner INPUT = new Scanner(System.in);

    public static void main(final String[] ARGS) {
        System.out.print("Input first text: ");
        final String TEXT_1 = INPUT.nextLine();
        System.out.print("Input second text: ");
        final String TEXT_2 = INPUT.nextLine();

        System.out.print(arePermutations(TEXT_1, TEXT_2));
    }

    public static boolean arePermutations(final String TEXT_1, String TEXT_2) {
        if (TEXT_1.length() != TEXT_2.length()) return false;
        else if (TEXT_1.equals(TEXT_2)) return true;
        else {
            char[] charArray1 = TEXT_1.toCharArray(),
                    charArray2 = TEXT_2.toCharArray();
            Arrays.sort(charArray1);
            Arrays.sort(charArray2);
            return Arrays.equals(charArray1, charArray2);
        }
    }
}