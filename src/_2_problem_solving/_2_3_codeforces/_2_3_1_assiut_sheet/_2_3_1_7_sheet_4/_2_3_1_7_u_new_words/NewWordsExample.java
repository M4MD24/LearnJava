package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_7_sheet_4._2_3_1_7_u_new_words;

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
 * <h1>Question:</h1>
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
    public static void main(String[] args) throws IOException {
        final BufferedReader INPUT = new BufferedReader(new InputStreamReader(System.in));
        System.out.print(numberOfWordsCanBeFormedForEgypt(new StringBuffer(INPUT.readLine())));
    }

    private static int numberOfWordsCanBeFormedForEgypt(final StringBuffer TEXT) {
        final int E_LETTER_COUNT = TEXT.toString().split("[eE]+").length - 1,
                G_LETTER_COUNT = TEXT.toString().split("[gG]+").length - 1,
                Y_LETTER_COUNT = TEXT.toString().split("[yY]+").length - 1,
                P_LETTER_COUNT = TEXT.toString().split("[pP]+").length - 1,
                T_LETTER_COUNT = TEXT.toString().split("[tT]+").length - 1;
        System.out.println(E_LETTER_COUNT);
        System.out.println(G_LETTER_COUNT);
        System.out.println(Y_LETTER_COUNT);
        System.out.println(P_LETTER_COUNT);
        System.out.println(T_LETTER_COUNT);
        return getMinimumCount(E_LETTER_COUNT,
                G_LETTER_COUNT,
                Y_LETTER_COUNT,
                P_LETTER_COUNT,
                T_LETTER_COUNT);
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