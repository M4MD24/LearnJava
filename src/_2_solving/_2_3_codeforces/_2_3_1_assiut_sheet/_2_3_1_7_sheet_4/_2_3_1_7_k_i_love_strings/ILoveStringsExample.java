package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_7_sheet_4._2_3_1_7_k_i_love_strings;

import java.util.Scanner;

/**
 * <h1>K. I Love Strings</h1>
 * <h2>
 * time limit per test: 2 second
 * <br/>
 * memory limit per test: 64 megabytes
 * <br/>
 * input: standard input
 * <br/>
 * output: standard output
 * </h2>
 * <br/>
 * <h1>Question:</h1>
 * <h2>Given two strings S and T. Print a new string that contains the following:</h2>
 * <ol>
 *     <li>The first letter of the string S followed by the first letter of the string T.</li>
 *     <li>the second letter of the string S followed by the second letter of the string T.</li>
 *     <li>and so on...</li>
 * </ol>
 * <h2>In other words, the new string should be ( S0 + T0 + S1 + T1 + .... ).</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>If the length of S is greater than the length of T then you have to add the rest of S letters at the end of the new string and vice versa.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 2
 * <br/>
 * ipAsu ccsit
 * <br/>
 * ey gpt
 * </h2>
 * <h1>Output:</h1>
 * <h2>
 * icpcAssiut
 * <br/>
 * egypt
 * </h2>
 */

public class ILoveStringsExample {
    public static void main(final String[] ARGS) {
        inputValues();
    }

    private static void inputValues() {
        final Scanner INPUT = new Scanner(System.in);
        byte countOfTestCases = INPUT.nextByte();
        while (countOfTestCases > 0) {
            arrangeLetters(INPUT.next(), INPUT.next());
            if (countOfTestCases-- > 1) System.out.println();
        }
    }

    private static void arrangeLetters(final String TEXT_1, final String TEXT_2) {
        byte LENGTH = (byte) (TEXT_1.length() + TEXT_2.length());
        byte text1CharacterIndex = 0,
                text2CharacterIndex = 0;
        while (LENGTH-- > 0) {
            if (text1CharacterIndex < TEXT_1.length()) System.out.print(TEXT_1.charAt(text1CharacterIndex++));
            if (text2CharacterIndex < TEXT_2.length()) System.out.print(TEXT_2.charAt(text2CharacterIndex++));
        }
    }
}