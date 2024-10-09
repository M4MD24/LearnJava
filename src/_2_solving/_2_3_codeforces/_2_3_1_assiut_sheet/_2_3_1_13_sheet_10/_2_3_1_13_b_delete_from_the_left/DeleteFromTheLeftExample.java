package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_13_sheet_10._2_3_1_13_b_delete_from_the_left;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;

/**
 * <h1>B. Delete From the Left</h1>
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
 * <h2>
 * You are given two strings s and t. In a single move, you can choose any of two strings and delete the first (that is, the leftmost) character. After a move, the length of the string decreases by 1. You can't choose a string if it is empty.
 * <br/>
 * For Example:
 * </h2>
 * <ul>
 *     <li>by applying a move to the string "where", the result is the string "here"</li>
 *     <li>by applying a move to the string "a", the result is an empty string ""</li>
 * </ul>
 * <h2>
 * You are required to make two given strings equal using the fewest number of moves. It is possible that, in the end, both strings will be equal to the empty string, and so, are equal to each other. In this case, the answer is obviously the sum of the lengths of the initial strings.
 * <br/>
 * Write a program that finds the minimum number of moves to make two given strings s and t equal.
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * test
 * <br/>
 * west
 * </h2>
 * <h1>Output:</h1>
 * <h2>2</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * codeforces
 * <br/>
 * yes
 * </h2>
 * <h1>Output:</h1>
 * <h2>9</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * test
 * <br/>
 * yes
 * </h2>
 * <h1>Output:</h1>
 * <h2>7</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * b
 * <br/>
 * ab
 * </h2>
 * <h1>Output:</h1>
 * <h2>1</h2>
 *
 * @see _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_13_sheet_10._2_3_1_13_b_delete_from_the_left.images <h2>Note</h2>
 */

public class DeleteFromTheLeftExample {
    public static void main(final String[] PARAMETERS) throws IOException {
        final BufferedReader INPUT = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter OUTPUT = new BufferedWriter(new OutputStreamWriter(System.out));
        OUTPUT.write(String.valueOf(countOfCharactersDeleted(new StringBuilder(INPUT.readLine()), new StringBuilder(INPUT.readLine()))));
        OUTPUT.flush();
    }

    private static int countOfCharactersDeleted(final StringBuilder FIRST_TEXT, final StringBuilder SECOND_TEXT) {
        if (FIRST_TEXT.compareTo(SECOND_TEXT) != 0) {
            int minimumLength = Math.min(FIRST_TEXT.length(), SECOND_TEXT.length());
            final StringBuilder SIMILAR_TEXT = new StringBuilder();
            int firstTextIndex = FIRST_TEXT.length() - 1, secondTextIndex = SECOND_TEXT.length() - 1;
            while (minimumLength-- > 0) {
                if (FIRST_TEXT.charAt(firstTextIndex) == SECOND_TEXT.charAt(secondTextIndex)) {
                    SIMILAR_TEXT.insert(0, FIRST_TEXT.charAt(firstTextIndex));
                    firstTextIndex--;
                    secondTextIndex--;
                } else break;
            }
            return (FIRST_TEXT.length() - SIMILAR_TEXT.length()) + (SECOND_TEXT.length() - SIMILAR_TEXT.length());
        } else return 0;
    }
}