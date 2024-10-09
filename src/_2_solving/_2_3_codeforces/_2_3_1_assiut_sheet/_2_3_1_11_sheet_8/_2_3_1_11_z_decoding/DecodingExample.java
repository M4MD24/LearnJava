package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_11_sheet_8._2_3_1_11_z_decoding;

import java.util.Scanner;

/**
 * <h1>Z. Decoding</h1>
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
 * Polycarp is mad about coding, that is why he writes Sveta encoded messages. He calls the median letter in a word the letter which is in the middle of the word. If the word's length is even, the median letter is the left of the two middle letters. In the following examples, the median letter is highlighted: contest, info. If the word consists of single letter, then according to above definition this letter is the median letter.
 * <br/>
 * Polycarp encodes each word in the following way: he writes down the median letter of the word, then deletes it and repeats the process until there are no letters left. For example, he encodes the word volga as logva.
 * <br/>
 * You are given an encoding s of some word, your task is to decode it.
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 5
 * <br/>
 * logva
 * </h2>
 * <h1>Output:</h1>
 * <h2>volga</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 2
 * <br/>
 * no
 * </h2>
 * <h1>Output:</h1>
 * <h2>no</h2>
 * <br/>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 4
 * <br/>
 * abba
 * </h2>
 * <h1>Output:</h1>
 * <h2>baba</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>
 * In the first example Polycarp encoded the word volga. At first, he wrote down the letter l from the position 3, after that his word looked like voga. After that Polycarp wrote down the letter o from the position 2, his word became vga. Then Polycarp wrote down the letter g which was at the second position, the word became va. Then he wrote down the letter v, then the letter a. Thus, the encoding looked like logva.
 * <br/>
 * In the second example Polycarp encoded the word no. He wrote down the letter n, the word became o, and he wrote down the letter o. Thus, in this example, the word and its encoding are the same.
 * <br/>
 * In the third example Polycarp encoded the word baba. At first, he wrote down the letter a, which was at the position 2, after that the word looked like bba. Then he wrote down the letter b, which was at the position 2, his word looked like ba. After that he wrote down the letter b, which was at the position 1, the word looked like a, and he wrote down that letter a. Thus, the encoding is abba.
 * </h2>
 */

public class DecodingExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static short length = INPUT.nextShort();
    private static final StringBuffer CURRENT_WORD = new StringBuffer(INPUT.next());

    public static void main(final String[] PARAMETERS) {
        System.out.print(modifyAndReturnWord());
    }

    private static StringBuffer modifyAndReturnWord() {
        final StringBuffer WORD_AFTER_MODIFICATION = new StringBuffer();
        short index = 0;
        while (length > 0) {
            if (length-- % 2 == 0) WORD_AFTER_MODIFICATION.insert(0, CURRENT_WORD.charAt(index));
            else WORD_AFTER_MODIFICATION.append(CURRENT_WORD.charAt(index));
            index++;
        }
        return WORD_AFTER_MODIFICATION;
    }
}