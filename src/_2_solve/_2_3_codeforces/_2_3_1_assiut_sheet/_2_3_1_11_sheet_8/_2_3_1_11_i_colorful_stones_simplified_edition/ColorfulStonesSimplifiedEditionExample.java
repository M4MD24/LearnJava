package _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_11_sheet_8._2_3_1_11_i_colorful_stones_simplified_edition;

import java.util.Scanner;

/**
 * <h1>I. Colorful Stones (Simplified Edition)</h1>
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
 * <h1>Problem:</h1>
 * <h2>
 * There is a sequence of colorful stones. The color of each stone is one of red, green, or blue. You are given a string s. The i-th (1-based) character of s represents the color of the i-th stone. If the character is "R", "G", or "B", the color of the corresponding stone is red, green, or blue, respectively.
 * <br/>
 * Initially Squirrel Liss is standing on the first stone. You perform instructions one or more times.
 * <br/>
 * Each instruction is one of the three types: "RED", "GREEN", or "BLUE". After an instruction c, if Liss is standing on a stone whose colors is c, Liss will move one stone forward, else she will not move.
 * <br/>
 * You are given a string t. The number of instructions is equal to the length of t, and the i-th character of t represents the i-th instruction.
 * <br/>
 * Calculate the final position of Liss (the number of the stone she is going to stand on in the end) after performing all the instructions, and print its 1-based position. It is guaranteed that Liss don't move out of the sequence.
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * RGB
 * <br/>
 * RRR
 * </h2>
 * <h1>Output:</h1>
 * <h2>2</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * RRRBGBRBBB
 * <br/>
 * BBBRR
 * </h2>
 * <h1>Output:</h1>
 * <h2>3</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * BRRBGBRGRBGRGRRGGBGBGBRGBRGRGGGRBRRRBRBBBGRRRGGBBB
 * <br/>
 * BBRBGGRGRGBBBRBGRBRBBBBRBRRRBGBBGBBRRBBGGRBRRBRGRB
 * </h2>
 * <h1>Output:</h1>
 * <h2>15</h2>
 */

public class ColorfulStonesSimplifiedEditionExample {
    public static void main(final String[] ARGUMENTS) {
        final Scanner INPUT = new Scanner(System.in);
        System.out.print(placeStone(new StringBuffer(INPUT.nextLine()),
                new StringBuffer(INPUT.nextLine())));
    }

    private static byte placeStone(final StringBuffer FIRST_TEXT, final StringBuffer SECOND_TEXT) {
        byte place = 1;
        for (byte firstIndex = 0, secondIndex = 0; firstIndex < FIRST_TEXT.length() && secondIndex < SECOND_TEXT.length(); secondIndex++) {
            if (FIRST_TEXT.charAt(firstIndex) == SECOND_TEXT.charAt(secondIndex)) {
                firstIndex++;
                place++;
            }
        }
        return place;
    }
}