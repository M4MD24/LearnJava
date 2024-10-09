package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_10_sheet_7._2_3_1_10_i_count_vowels;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <h1>I. Count Vowels</h1>
 * <h2>
 * time limit per test: 1 second
 * <br/>
 * memory limit per test: 256 megabytes
 * <br/>
 * input: standard input
 * <br/>
 * output: standard output
 * </h2>
 * <br/>
 * <h1>Problem:</h1>
 * <h2>Given a string S. Print number of vowels in the string.</h2>
 * <br/>
 * <h1>Note:</h1>
 * <ul>
 *      <li>Vowel letters: ['a', 'e', 'i', 'o', 'u'].</li>
 *      <li>Vowel letters could be capital or small.</li>
 *      <li>Solve this problem using recursion.</li>
 * </ul>
 * <br/>
 * <h1>Input:</h1>
 * <h2>Data Structure Lab</h2>
 * <br/>
 * <h1>Output:</h1>
 * <h2>6</h2>
 */

public class CountVowelsExample {
    private static final String TEXT;

    static {
        try {
            TEXT = new BufferedReader(new InputStreamReader(System.in)).readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(final String[] PARAMETERS) {
        System.out.print(countVowelLettersRecursion((short) 0, (short) 0));
    }

    private static short countVowelLettersRecursion(short index, short count) {
        if (index < TEXT.length()) {
            if (TEXT.charAt(index) == 'a' || TEXT.charAt(index) == 'A' || TEXT.charAt(index) == 'e' || TEXT.charAt(index) == 'E' || TEXT.charAt(index) == 'i' || TEXT.charAt(index) == 'I' || TEXT.charAt(index) == 'o' || TEXT.charAt(index) == 'O' || TEXT.charAt(index) == 'u' || TEXT.charAt(index) == 'U')
                return countVowelLettersRecursion(++index, ++count);
            else
                return countVowelLettersRecursion(++index, count);
        } else return count;
    }
}