package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_12_sheet_9._2_3_1_12_e_keyboard;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <h1>E. Keyboard</h1>
 * <h2>
 * time limit per test: 2 second
 * <br/>
 * memory limit per test: 256 megabytes
 * <br/>
 * input: standard input
 * <br/>
 * output: standard output
 * </h2>
 * <br/>
 * <h1>Question:</h1>
 * <h2>
 * Our good friend Mole is trying to code a big message. He is typing on an unusual keyboard with characters arranged in following way:
 * <br/>
 * <br/>
 * qwertyuiop
 * <br/>
 * asdfghjkl;
 * <br/>
 * zxcvbnm,./
 * <br/>
 * <br/>
 * Unfortunately Mole is blind, so sometimes it is problem for him to put his hands accurately. He accidentally moved both his hands with one position to the left or to the right. That means that now he presses not a button he wants, but one neighboring button (left or right, as specified in input).
 * <br/>
 * We have a sequence of characters he has typed and we want to find the original message.
 * </h2>
 * <h1>Input:</h1>
 * <h2>
 * R
 * <br/>
 * s;;upimrrfod;pbr
 * </h2>
 * <h1>Output:</h1>
 * <h2>allyouneedislove</h2>
 */

public class KeyboardExample {
    private static final BufferedReader INPUT = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuffer ENCRYPTION_CHARACTERS = new StringBuffer("qwertyuiopasdfghjkl;zxcvbnm,./");

    public static void main(final String[] PARAMETERS) throws IOException {
        System.out.print(returnTextAfterDecryption(INPUT.readLine().charAt(0), new StringBuffer(INPUT.readLine())));
    }

    private static StringBuffer returnTextAfterDecryption(final char CHARACTER, final StringBuffer TEXT) {
        final int DECRYPTION_NUMBER = (CHARACTER == 'R') ? -1 : 1;
        for (byte index = 0; index < TEXT.length(); index++)
            TEXT.setCharAt(index, ENCRYPTION_CHARACTERS.charAt(ENCRYPTION_CHARACTERS.indexOf(String.valueOf(TEXT.charAt(index))) + DECRYPTION_NUMBER));
        return TEXT;
    }
}