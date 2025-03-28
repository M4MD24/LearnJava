package _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_13_sheet_10._2_3_1_13_v_new_password;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * <h1>V. New Password</h1>
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
 * Innokentiy decides to change the password in the social net "Contact!", but he is too lazy to invent a new password by himself. That is why he needs your help.
 * <br/>
 * Innokentiy decides that new password should satisfy the following conditions:
 * </h2>
 * <ul>
 *     <li>the length of the password must be equal to n</li>
 *     <li>the password should consist only of lowercase Latin letters</li>
 *     <li>the number of distinct symbols in the password must be equal to k</li>
 *     <li>any two consecutive symbols in the password must be distinct.</li>
 * </ul>
 * <h2>Your task is to help Innokentiy and to invent a new password which will satisfy all given conditions.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>4 3</h2>
 * <h1>Output:</h1>
 * <h2>java</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>6 6</h2>
 * <h1>Output:</h1>
 * <h2>python</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>5 2</h2>
 * <h1>Output:</h1>
 * <h2>phphp</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>
 * In the first test there is one of the appropriate new passwords — java, because its length is equal to 4 and 3 distinct lowercase letters a, j and v are used in it.
 * <br/>
 * In the second test there is one of the appropriate new passwords — python, because its length is equal to 6 and it consists of 6 distinct lowercase letters.
 * <br/>
 * In the third test there is one of the appropriate new passwords — phphp, because its length is equal to 5 and 2 distinct lowercase letters p and h are used in it.
 * <br/>
 * Pay attention the condition that no two identical symbols are consecutive is correct for all appropriate passwords in tests
 * </h2>
 */

public class NewPasswordExample {
    public static void main(final String[] ARGUMENTS) throws IOException {
        final BufferedWriter OUTPUT = new BufferedWriter(new OutputStreamWriter(System.out));
        final StringTokenizer LINE = new StringTokenizer(new BufferedReader(new InputStreamReader(System.in)).readLine());
        OUTPUT.write(String.valueOf(getNewPassword(Byte.parseByte(LINE.nextToken()), Byte.parseByte(LINE.nextToken()))));
        OUTPUT.flush();
    }

    private static StringBuffer getNewPassword(byte length, byte countOfDistinctCharacters) {
        final StringBuffer NEW_PASSWORD = new StringBuffer();
        byte round = 0;
        char currentCharacter = 'a';
        for (byte index = 0; index < length; index++) {
            NEW_PASSWORD.append((char) (currentCharacter + round++));
            if (round == countOfDistinctCharacters) round = 0;
        }
        return NEW_PASSWORD;
    }
}