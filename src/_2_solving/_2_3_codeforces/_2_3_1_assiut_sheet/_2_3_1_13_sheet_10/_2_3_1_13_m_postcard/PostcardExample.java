package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_13_sheet_10._2_3_1_13_m_postcard;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;

/**
 * <h1>M. Postcard</h1>
 * <h2>
 * time limit per test: 1 second
 * <br/>1
 * memory limit per test: 256 megabytes
 * <br/>
 * input: standard input
 * <br/>
 * output: standard output
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * hw?ap*yn?eww*ye*ar
 * <br/>
 * 12
 * </h2>
 * <h1>Output:</h1>
 * <h2>happynewyear</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * ab?a
 * <br/>
 * 2
 * </h2>
 * <h1>Output:</h1>
 * <h2>aa</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * ab?a
 * <br/>
 * 3
 * </h2>
 * <h1>Output:</h1>
 * <h2>aba</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * ababb
 * <br/>
 * 5
 * </h2>
 * <h1>Output:</h1>
 * <h2>ababb</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * ab?a
 * <br/>
 * 1
 * </h2>
 * <h1>Output:</h1>
 * <h2>Impossible</h2>
 *
 * @see _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_13_sheet_10._2_3_1_13_m_postcard.images <h2>Question</h2>
 */

public class PostcardExample {
    private static StringBuffer text;
    private static int targetLength;

    public static void main(final String[] PARAMETERS) throws IOException {
        final BufferedWriter OUTPUT = new BufferedWriter(new OutputStreamWriter(System.out));
        inputValues();
        OUTPUT.write(String.valueOf(getTextAfterDecryption()));
        OUTPUT.flush();
    }

    private static StringBuffer getTextAfterDecryption() {
        int countOfLetters = 0, countOfCandyCane = 0, countOfSnowflake = 0;
        for (int index = 0; index < text.length(); index++) {
            final char CHARACTER = text.charAt(index);
            if (CHARACTER == '?') countOfCandyCane++;
            else if (CHARACTER == '*') countOfSnowflake++;
            else countOfLetters++;
        }
        if (countOfLetters == targetLength) return new StringBuffer(text.toString().replaceAll("[?*]+", ""));
        else if (countOfLetters > targetLength) {
            int countOfCharactersToBeDeleted = countOfLetters - targetLength;
            if ((countOfCandyCane + countOfSnowflake) >= countOfCharactersToBeDeleted) {
                for (int index = 0; index < text.length() - 1; index++) {
                    final char CHARACTER = text.charAt(index), NEXT_CHARACTER = text.charAt(index + 1);
                    if (CHARACTER != '?' && CHARACTER != '*' && (NEXT_CHARACTER == '?' || NEXT_CHARACTER == '*')) {
                        text.deleteCharAt(index);
                        countOfCharactersToBeDeleted--;
                    }
                    if (countOfCharactersToBeDeleted == 0) break;
                }
                return new StringBuffer(text.toString().replaceAll("[?*]+", ""));
            } else return new StringBuffer("Impossible");
        } else {
            if (countOfSnowflake == 0) return new StringBuffer("Impossible");
            else {
                int indexOfSnowflake = text.indexOf("*"), countOfCharactersToBeDuplicated = targetLength - countOfLetters;
                text = new StringBuffer(text.substring(0, indexOfSnowflake) + String.valueOf(text.toString().charAt(indexOfSnowflake - 1)).repeat(countOfCharactersToBeDuplicated) + text.substring(indexOfSnowflake + 1));
                return new StringBuffer(text.toString().replaceAll("[?*]+", ""));
            }
        }
    }

    private static void inputValues() throws IOException {
        final BufferedReader INPUT = new BufferedReader(new InputStreamReader(System.in));
        text = new StringBuffer(INPUT.readLine());
        targetLength = Integer.parseInt(INPUT.readLine());
    }
}