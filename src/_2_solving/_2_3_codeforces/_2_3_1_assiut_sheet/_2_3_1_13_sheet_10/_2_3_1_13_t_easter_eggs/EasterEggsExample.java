package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_13_sheet_10._2_3_1_13_t_easter_eggs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;

/**
 * <h1>T. Easter Eggs</h1>
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
 * The Easter Rabbit laid n eggs in a circle and is about to paint them.
 * <br/>
 * Each egg should be painted one color out of 7:
 * </h2>
 * <ul>
 *     <li>red</li>
 *     <li>orange</li>
 *     <li>yellow</li>
 *     <li>green</li>
 *     <li>blue</li>
 *     <li>indigo</li>
 *     <li>violet</li>
 * </ul>
 * <h2>Also, the following conditions should be satisfied:</h2>
 * <ul>
 *     <li>Each of the seven colors should be used to paint at least one egg.</li>
 *     <li>Any four eggs lying sequentially should be painted different colors.</li>
 * </ul>
 * <h2>Help the Easter Rabbit paint the eggs in the required manner. We know that it is always possible.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>8</h2>
 * <h1>Output:</h1>
 * <h2>ROYGRBIV</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>13</h2>
 * <h1>Output:</h1>
 * <h2>ROYGBIVGBIVYG<br/>
 * <br/>
 * <h1>Note:</h1>
 * <h2>The way the eggs will be painted in the first sample is shown on the Image:</h2>
 *
 * @see _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_13_sheet_10._2_3_1_13_t_easter_eggs.images <h2>Image</h2>
 */

public class EasterEggsExample {
    private static byte countOfEggs;

    public static void main(final String[] PARAMETERS) throws IOException {
        final BufferedWriter OUTPUT = new BufferedWriter(new OutputStreamWriter(System.out));
        inputValues();
        OUTPUT.write(String.valueOf(getFirstLetterOfEachColorForEggs()));
        OUTPUT.flush();
    }

    private static StringBuffer getFirstLetterOfEachColorForEggs() {
        final StringBuffer FIRST_LETTER_OF_EACH_COLOR_FOR_EGGS = new StringBuffer(), LETTERS = new StringBuffer("ROYGBIV");
        for (byte index = 0; index < countOfEggs; index++) FIRST_LETTER_OF_EACH_COLOR_FOR_EGGS.append(LETTERS.charAt(index % 4));
        FIRST_LETTER_OF_EACH_COLOR_FOR_EGGS.append("BIV");
        return FIRST_LETTER_OF_EACH_COLOR_FOR_EGGS;
    }

    private static void inputValues() throws IOException {
        final BufferedReader INPUT = new BufferedReader(new InputStreamReader(System.in));
        countOfEggs = (byte) (Byte.parseByte(INPUT.readLine()) - 3);
    }
}