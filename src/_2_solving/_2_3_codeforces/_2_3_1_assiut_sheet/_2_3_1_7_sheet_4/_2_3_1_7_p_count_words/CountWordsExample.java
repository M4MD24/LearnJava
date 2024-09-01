package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_7_sheet_4._2_3_1_7_p_count_words;

import java.util.Scanner;

/**
 * <h1>P. Count Words</h1>
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
 * <h1>Question:</h1>
 * <h2>
 * Given a string S. Print number of words in it.
 * <br/>
 * Word: consists of lowercase and uppercase English letters.
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>Meep Meep!</h2>
 * <h1>Output:</h1>
 * <h2>2</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>I tot I taw a putty tat.</h2>
 * <h1>Output:</h1>
 * <h2>7</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>I did! I did! I did taw a putty tat.</h2>
 * <h1>Output:</h1>
 * <h2>10</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>Shsssssssssh ... I am hunting wabbits. Heh Heh Heh Heh ...</h2>
 * <h1>Output:</h1>
 * <h2>9</h2>
 */

public class CountWordsExample {
    public static void main(final String[] ARGS) {
        final Scanner INPUT = new Scanner(System.in);
        final String[] WORDS = INPUT.nextLine().split("[!.,?\\s]+");
        System.out.print(countWords(WORDS));
    }

    private static int countWords(String[] WORDS) {
        int wordCount = 0;
        for (String word : WORDS)
            if (!word.isEmpty())
                wordCount++;
        return wordCount;
    }
}