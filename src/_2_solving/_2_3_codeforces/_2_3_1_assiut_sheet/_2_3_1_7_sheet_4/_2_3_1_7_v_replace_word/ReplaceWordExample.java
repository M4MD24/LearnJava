package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_7_sheet_4._2_3_1_7_v_replace_word;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <h1>V. Replace Word</h1>
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
 * <h2>Given a string S. Print S after replacing every sub-string that is equal to "EGYPT" with space.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>BRITISHEGYPTGHANA</h2>
 * <h1>Output:</h1>
 * <h2>BRITISH GHANA</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>ITALYKOREAEGYPTEGYPTALGERIAEGYPTZ</h2>
 * <h1>Output:</h1>
 */
// ITALYKOREA  ALGERIA Z

public class ReplaceWordExample {
    public static void main(final String[] PARAMETERS) throws IOException {
        final BufferedReader INPUT = new BufferedReader(new InputStreamReader(System.in));
        replacingEverySubStringThatEqualEgypt(new StringBuffer(INPUT.readLine()));
    }

    private static void replacingEverySubStringThatEqualEgypt(final StringBuffer TEXT) {
        System.out.print(TEXT.toString().replaceAll("EGYPT", " "));
    }
}