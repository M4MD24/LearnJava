package _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_13_sheet_10._2_3_1_13_u_from_s_to_t;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;

/**
 * <h1>U. From S To T</h1>
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
 * You are given three strings s, t and p consisting of lowercase Latin letters. You may perform any number (possibly, zero) operations on these strings.
 * <br/>
 * During each operation you choose any character from p, erase it from p and insert it into string s (you may insert this character anywhere you want: in the beginning of s, in the end or between any two consecutive characters).
 * <br/
 * For example, if p is aba, and s is de, then the following outcomes are possible (the character we erase from p and insert into s is highlighted)
 * </h2>
 * <ul>
 *     <li>aba → ba, de → ade;</li>
 *     <li>aba → ba, de → dae;</li>
 *     <li>aba → ba, de → dea;</li>
 *     <li>aba → aa, de → bde;</li>
 *     <li>aba → aa, de → dbe;</li>
 *     <li>aba → aa, de → deb;</li>
 *     <li>aba → ab, de → ade;</li>
 * </ul>
 * <h2>
 * Your goal is to perform several (maybe zero) operations so that s becomes equal to t. Please determine whether it is possible.
 * <br/>
 * Note that you have to answer q independent queries.
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 4
 * <br/>
 * ab
 * <br/>
 * acxb
 * <br/>
 * cax
 * <br/>
 * a
 * <br/>
 * aaaa
 * <br/>
 * aaabbcc
 * <br/>
 * a
 * <br/>
 * aaaa
 * <br/>
 * aabbcc
 * <br/>
 * ab
 * <br/>
 * baaa
 * <br/>
 * aaaaa
 * </h2>
 * <h1>Output:</h1>
 * <h2>
 * YES
 * <br/>
 * YES
 * <br/>
 * NO
 * <br/>
 * NO
 * </h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>
 * In the first test case there is the following sequence of operation:
 * <br/>
 * s= ab, t= acxb, p= cax;
 * <br/>
 * s= acb, t= acxb, p= ax;
 * <br/>
 * s= acxb, t= acxb, p= a.
 * <br/>
 * <br/>
 * In the second test case there is the following sequence of operation:
 * <br/>
 * s= a, t= aaaa, p= aaabbcc;
 * <br/>
 * s= aa, t= aaaa, p= aabbcc;
 * <br/>
 * s= aaa, t= aaaa, p= abbcc;
 * <br/>
 * s= aaaa, t= aaaa, p= bbcc.
 * </h2>
 */

public class FromUToTExample {
    private static final BufferedReader INPUT = new BufferedReader(new InputStreamReader(System.in));
    private static byte countOfTestCases;

    public static void main(final String[] ARGUMENTS) throws IOException {
        final BufferedWriter OUTPUT = new BufferedWriter(new OutputStreamWriter(System.out));
        inputString();
        while (countOfTestCases-- > 0) {
            OUTPUT.write(isPossible(new StringBuffer(INPUT.readLine()), new StringBuffer(INPUT.readLine()), new StringBuffer(INPUT.readLine())) ? "YES" : "NO");
            OUTPUT.newLine();
        }
        OUTPUT.flush();
    }

    private static boolean isPossible(final StringBuffer CURRENT_TEXT, final StringBuffer TARGET_TEXT, final StringBuffer TEXT_IT_WILL_BE_TAKEN_FROM_HIM) {
        byte MAX_CHARACTERS = 26;
        final byte CURRENT_TEXT_LENGTH = (byte) CURRENT_TEXT.length(), TARGET_TEXT_LENGTH = (byte) TARGET_TEXT.length(), TEXT_IT_WILL_BE_TAKEN_FROM_HIM_LENGTH = (byte) TEXT_IT_WILL_BE_TAKEN_FROM_HIM.length();
        final short[] CURRENT_TEXT_CHARACTERS = new short[MAX_CHARACTERS];
        final byte[] TARGET_TEXT_CHARACTERS = new byte[MAX_CHARACTERS];
        for (byte index = 0; index < CURRENT_TEXT_LENGTH; index++) CURRENT_TEXT_CHARACTERS[CURRENT_TEXT.charAt(index) - 'a']++;
        for (byte index = 0; index < TARGET_TEXT_LENGTH; index++) TARGET_TEXT_CHARACTERS[TARGET_TEXT.charAt(index) - 'a']++;
        for (byte index = 0; index < TEXT_IT_WILL_BE_TAKEN_FROM_HIM_LENGTH; index++) CURRENT_TEXT_CHARACTERS[TEXT_IT_WILL_BE_TAKEN_FROM_HIM.charAt(index) - 'a']++;
        boolean isPossible = true;
        for (byte index = 0; index < MAX_CHARACTERS; index++) isPossible &= (CURRENT_TEXT_CHARACTERS[index] >= TARGET_TEXT_CHARACTERS[index]);
        if (!isPossible) return false;
        byte currentIndexCharacterCheck = 0;
        for (byte index = 0; index < TARGET_TEXT_LENGTH; index++) if (currentIndexCharacterCheck < CURRENT_TEXT_LENGTH && TARGET_TEXT.charAt(index) == CURRENT_TEXT.charAt(currentIndexCharacterCheck)) currentIndexCharacterCheck++;
        return currentIndexCharacterCheck == CURRENT_TEXT_LENGTH;
    }

    private static void inputString() throws IOException {
        countOfTestCases = Byte.parseByte(INPUT.readLine());
    }
}