package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_1_sheet_1._2_3_1_1_l_the_brothers;

import java.util.Scanner;

/**
 * <h1>L. The Brothers</h1>
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
 * <h2>Given two person names. Each person has {"the first name" + "the second name"} Determine whether they are brothers or not.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * bassam ramadan
 * <br/>
 * ahmed ramadan
 * </h2>
 * <h1>Output:</h1>
 * <h2>ARE Brothers</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * ali salah
 * <br/>
 * ayman salah
 * </h2>
 * <h1>Output:</h1>
 * <h2>ARE Brothers</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * ali kamel
 * ali salah
 * </h2>
 * <h1>Output:</h1>
 * <h2>NOT</h2>
 */

public class TheBrothersExample {
    private static final Scanner INPUT = new Scanner(System.in);
    static String firstName,
            secondName;

    public static void main(String[] args) {
        System.out.print((getFirstSecondName().equals(getSecondSecondName())) ? "ARE Brothers" : "NOT");
    }

    private static String getFirstSecondName() {
        firstName = INPUT.next();
        secondName = INPUT.nextLine();
        return secondName;
    }

    private static String getSecondSecondName() {
        firstName = INPUT.next();
        secondName = INPUT.nextLine();
        return secondName;
    }
}