package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_3_sheet_2._2_3_1_3_d_fixed_password;

import java.util.Scanner;

/**
 * <h1>D. Fixed Password</h1>
 * <h2>
 * time limit per test: 1 second
 * <br/>
 * memory limit per test: 256 megabytes
 * <br/>
 * input standard input
 * <br/>
 * output standard output
 * </h2>
 * <br/>
 * <h1>Question:</h1>
 * <h2>Given multiple lines each line contains a number X which is a password. Print "Wrong" if the password is incorrect otherwise, print "Correct" and terminate the program.</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>The "Correct" password is the number 1999.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 2200
 * <br/>
 * 1020
 * <br/>
 * 1999
 * <br/>
 * 1000
 * <br/>
 * 9999
 * </h2>
 * <h1>Output:</h1>
 * <h2>
 * Wrong
 * <br/>
 * Wrong
 * <br/>
 * Correct
 * </h2>
 */

public class FixedPasswordExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static final int CORRECT_PASSWORD = 1999;

    public static void main(String[] args) {
        inputGuessedPasswords();
    }

    private static void inputGuessedPasswords() {
        while (INPUT.hasNext()) {
            final int GUESSED_PASSWORD = INPUT.nextInt();
            if (checkGuessedPasswordIsCorrect(GUESSED_PASSWORD)) return;
        }
    }

    private static boolean checkGuessedPasswordIsCorrect(int GUESSED_PASSWORD) {
        if (GUESSED_PASSWORD == CORRECT_PASSWORD) {
            System.out.print("Correct");
            return true;
        } else {
            System.out.println("Wrong");
            return false;
        }
    }
}