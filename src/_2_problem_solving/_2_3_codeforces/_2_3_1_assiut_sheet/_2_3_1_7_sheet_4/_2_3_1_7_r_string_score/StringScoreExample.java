package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_7_sheet_4._2_3_1_7_r_string_score;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <h1>R. String Score</h1>
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
 * <h2>Given a number N and a string S of size N consisting of 5 different uppercase characters only {V,W,X,Y,Z}.</h2>
 * <ul>
 *     <li>V: Adds to the score 5 points.</li>
 *     <li>W: Adds to the score 2 points.</li>
 *     <li>X: Removes the next consecutive character from the string.</li>
 *     <li>Y: Moves the next consecutive character to the end of the string.</li>
 *     <li>Z: If the next consecutive character is V it divides the total score by 5 but if it is W it divides the total score by 2. Then it removes the next consecutive character from the string if and only if the next character is V or W.</li>
 * </ul>
 * <br/>
 * <h1>Note:</h1>
 * <h2>In case the string ends with X or Y or Z ignore their operations. The score is calculated from left to right and starts with 0.</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 5
 * <br/>
 * VYWZW
 * </h2>
 * <h1>Output:</h1>
 * <h2>4</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * 6
 * <br/>
 * WZYVXW
 * </h2>
 * <h1>Output:</h1>
 * <h2>7</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>
 * First Example:
 * <br/>
 * String S = "VYWZW" and score initially = 0 .
 * <br/>
 * First char is 'V' so add 5 to score and become 5.
 * <br/>
 * Second char is 'Y' then move 'W' to end of string and it become "VYZWW" and score = 5.
 * <br/>
 * Third char is 'Z' then divide total score by 2 because next char is 'W' and remove it so string become "VYZW" and score = 2.
 * <br/>
 * Fourth char is 'W' so add 2 to score and become 4.
 * <br/>
 * So final answer is 4.
 * </h2>
 */

public class StringScoreExample {
    public static void main(String[] args) throws IOException {
        final BufferedReader INPUT = new BufferedReader(new InputStreamReader(System.in));
        INPUT.readLine();
        System.out.print(getTotalScore(new StringBuffer(INPUT.readLine())));
    }

    private static short getTotalScore(final StringBuffer TEXT) {
        short totalScore = 0;
        for (int index = 0; index < TEXT.length(); index++) {
            if (TEXT.charAt(index) > 85 && TEXT.charAt(index) < 91) switch (TEXT.charAt(index)) {
                case 'V' -> totalScore += 5;
                case 'W' -> totalScore += 2;
                case 'X' -> index++;
                case 'Y' -> {
                    if (index + 1 != TEXT.length()) TEXT.append(TEXT.charAt(index++ + 1));
                }
                case 'Z' -> {
                    if (index + 1 != TEXT.length()) switch (TEXT.charAt(index + 1)) {
                        case 'V' -> {
                            totalScore /= 5;
                            index++;
                        }
                        case 'W' -> {
                            totalScore /= 2;
                            index++;
                        }
                    }
                }
            }
        }
        return totalScore;
    }
}