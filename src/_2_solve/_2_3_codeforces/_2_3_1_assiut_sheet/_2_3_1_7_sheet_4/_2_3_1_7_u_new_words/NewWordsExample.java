package _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_7_sheet_4._2_3_1_7_u_new_words;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <h1>U. New Words</h1>
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
 * <h2>Given a string S. Print number of times that "EGYPT" word can be formed from S's characters.</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>Case of the letters doesn't matter. For example: "Egypt",final "egypt" and "eGyPt" are the same.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>EgYpTaz</h2>
 * <h1>Output:</h1>
 * <h2>1</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>pemigdbeigyypetet</h2>
 * <h1>Output:</h1>
 * <h2>2</h2>
 */

public class NewWordsExample {
    public static void main(final String[] ARGUMENTS) throws IOException {
        final BufferedReader INPUT = new BufferedReader(new InputStreamReader(System.in));
        System.out.print(numberOfWordsCanBeFormedForEgypt(new StringBuffer(INPUT.readLine())));
    }

    private static int numberOfWordsCanBeFormedForEgypt(final StringBuffer TEXT) {
        int eLetterCount = 0,
                gLetterCount = 0,
                yLetterCount = 0,
                pLetterCount = 0,
                tLetterCount = 0;
        for (final int LETTER : TEXT.chars().toArray()) {
            switch (LETTER) {
                case 'e', 'E' -> eLetterCount++;
                case 'g', 'G' -> gLetterCount++;
                case 'y', 'Y' -> yLetterCount++;
                case 'p', 'P' -> pLetterCount++;
                case 't', 'T' -> tLetterCount++;
            }
        }
        return getMinimumCount(eLetterCount,
                gLetterCount,
                yLetterCount,
                pLetterCount,
                tLetterCount);
    }

    private static int getMinimumCount(final int E_LETTER_COUNT, final int G_LETTER_COUNT, final int Y_LETTER_COUNT, final int P_LETTER_COUNT, final int T_LETTER_COUNT) {
        final boolean E_LETTER_COUNT_IS_LESS = (E_LETTER_COUNT <= G_LETTER_COUNT && E_LETTER_COUNT <= Y_LETTER_COUNT && E_LETTER_COUNT <= P_LETTER_COUNT && E_LETTER_COUNT <= T_LETTER_COUNT),
                G_LETTER_COUNT_IS_LESS = (G_LETTER_COUNT <= E_LETTER_COUNT && G_LETTER_COUNT <= Y_LETTER_COUNT && G_LETTER_COUNT <= P_LETTER_COUNT && G_LETTER_COUNT <= T_LETTER_COUNT),
                Y_LETTER_COUNT_IS_LESS = (Y_LETTER_COUNT <= E_LETTER_COUNT && Y_LETTER_COUNT <= G_LETTER_COUNT && Y_LETTER_COUNT <= P_LETTER_COUNT && Y_LETTER_COUNT <= T_LETTER_COUNT),
                P_LETTER_COUNT_IS_LESS = (P_LETTER_COUNT <= E_LETTER_COUNT && P_LETTER_COUNT <= G_LETTER_COUNT && P_LETTER_COUNT <= Y_LETTER_COUNT && P_LETTER_COUNT <= T_LETTER_COUNT);
        if (E_LETTER_COUNT_IS_LESS) return E_LETTER_COUNT;
        else if (G_LETTER_COUNT_IS_LESS) return G_LETTER_COUNT;
        else if (Y_LETTER_COUNT_IS_LESS) return Y_LETTER_COUNT;
        else if (P_LETTER_COUNT_IS_LESS) return P_LETTER_COUNT;
        else return T_LETTER_COUNT;
    }
}