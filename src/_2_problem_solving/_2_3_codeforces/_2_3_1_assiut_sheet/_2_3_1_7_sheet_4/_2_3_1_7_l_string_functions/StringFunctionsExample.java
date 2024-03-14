package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_7_sheet_4._2_3_1_7_l_string_functions;

import java.util.Arrays;
import java.util.Scanner;

/**
 * <h1>L. String Functions</h1>
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
 * <h2>Given two numbers N, Q and a string S of size N. Followed by Q lines of the following queries:</h2>
 * <ul>
 *     <li><b>pop_back:</b> remove the last character in the string.</li>
 *     <li><b>front:</b> print the first character in the string.</li>
 *     <li><b>back:</b> print the last character in the string.</li>
 *     <li><b>sort l r:</b> where (1≤l,r≤|S|) sort all characters of S from l to r.</li>
 *     <li><b>reverse l r:</b> where (1≤l,r≤|S|) reverse all characters of S from l to r.</li>
 *     <li><b>print pos: </b>where (1≤pos≤|S|) print the character in the index pos.</li>
 *     <li><b>substr l r:</b> where (1≤l,r≤|S|) print sub-string of s from l to r.</li>
 *     <li><b>push_back x:</b> add character x in the end of the string.</li>
 * </ul>
 * <h2>
 * For each query, print the answer associated with it in a single line.
 * <br/>
 * It's guaranteed that in the first 7 types of the query, the string is not empty.
 * <br/>
 * it's recommended to use built-in functions of String.
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 18 8
 * <br/>
 * assiutinupperegypt
 * <br/>
 * substr 1 6
 * <br/>
 * sort 5 8
 * <br/>
 * pop_back
 * <br/>
 * back
 * <br/>
 * reverse 1 6
 * <br/>
 * front
 * <br/>
 * push_back i
 * <br/>
 * print 4
 * </h2>
 * <h1>Output:</h1>
 * <h2>
 * assiut
 * <br/>
 * p
 * <br/>
 * n
 * <br/>
 * s
 * </h2>
 */

/*
assiutinupperegypt
substr 1 6 (assiut)
sort 5 8 (utin) -> (assi(intu)upperegypt)
pop_back (assi(intu)upperegyp't')
back (p)
reverse 1 6 ((niissa)tuupperegyp)
front ~
front ~
print 4 (s)
*/
/*
18 8
assiutinupperegypt
substr 1 6
sort 5 8
pop_back
back
reverse 1 6
front
push_back i
print 4
*/
public class StringFunctionsExample {
    private static final Scanner INPUT = new Scanner(System.in);
    private static final short LENGTH = INPUT.nextShort();
    private static short countOperationsCases = INPUT.nextShort();
    private static final String NOTHING = INPUT.nextLine();
    private static String originalText = INPUT.nextLine();

    public static void main(String[] args) {
        inputValues();
    }

    private static void inputValues() {
        while (countOperationsCases-- > 0) selectOperation();
    }

    private static void selectOperation() {
        final String OPERATION = INPUT.next();
        switch (OPERATION) {
            case "substr":
                System.out.println(originalText.substring(INPUT.nextShort() - 1, INPUT.nextShort()));
                break;
            case "sort":
                sortText((short) (INPUT.nextShort() - 1), INPUT.nextShort());
                break;
            case "pop_back":
                originalText = originalText.substring(0, originalText.length() - 1);
                break;
            case "back":
                System.out.println(originalText.charAt(originalText.length() - 1));
                break;
            case "reverse":
                reverse((short) (INPUT.nextShort() - 1), INPUT.nextShort());
                break;
            case "front":
                System.out.println(originalText.charAt(0));
                break;
            case "push_back":
                originalText += INPUT.next().charAt(0);
                break;
            case "print":
                System.out.println(originalText.charAt(INPUT.nextShort() - 1));
                break;
        }
    }

    private static void reverse(short FIRST_SEQUENCE_LENGTH, short SECOND_SEQUENCE_LENGTH) {
        originalText = originalText.substring(0, FIRST_SEQUENCE_LENGTH) +
                new StringBuilder(originalText.substring(FIRST_SEQUENCE_LENGTH, SECOND_SEQUENCE_LENGTH)).reverse() +
                originalText.substring(SECOND_SEQUENCE_LENGTH);
    }

    private static void sortText(final short FIRST_SEQUENCE_LENGTH, final short SECOND_SEQUENCE_LENGTH) {
        char[] MIDDLE_SEQUENCE_CHARACTERS = originalText.substring(FIRST_SEQUENCE_LENGTH, SECOND_SEQUENCE_LENGTH).toCharArray();
        Arrays.sort(MIDDLE_SEQUENCE_CHARACTERS);
        StringBuilder middleSequence = new StringBuilder();
        for (char character : MIDDLE_SEQUENCE_CHARACTERS) middleSequence.append(character);
        originalText = originalText.substring(0, FIRST_SEQUENCE_LENGTH) +
                middleSequence +
                originalText.substring(SECOND_SEQUENCE_LENGTH);
    }
}
/*
private static void sortText(final short FIRST_SEQUENCE_LENGTH, final short SECOND_SEQUENCE_LENGTH) {
        StringBuilder middleSequence = new StringBuilder(originalText.substring(FIRST_SEQUENCE_LENGTH, SECOND_SEQUENCE_LENGTH));
        char[] MIDDLE_SEQUENCE_CHARACTERS = middleSequence.toString().toCharArray();
        Arrays.sort(MIDDLE_SEQUENCE_CHARACTERS);
        middleSequence = new StringBuilder();
        for (char character : MIDDLE_SEQUENCE_CHARACTERS) middleSequence.append(character);
        originalText = originalText.substring(0, FIRST_SEQUENCE_LENGTH) +
                middleSequence +
                originalText.substring(SECOND_SEQUENCE_LENGTH);
    }
*/