package _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_12_sheet_9._2_3_1_12_b_arpa_s_hard_exam_and_mehrdad_s_naive_cheat;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <h1>B. Arpa’s hard exam and Mehrdad’s naive cheat</h1>
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
 * <h1>Input:</h1>
 * <h2>1</h2>
 * <h1>Output:</h1>
 * <h2>8</h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>2</h2>
 * <h1>Output:</h1>
 * <h2>4</h2>
 *
 * @see _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_12_sheet_9._2_3_1_12_b_arpa_s_hard_exam_and_mehrdad_s_naive_cheat.images <h2>Question and Note</h2>
 */

public class ArpaSHardExamAndMehrdadSNaiveCheatExample {
    public static void main(final String[] PARAMETERS) throws IOException {
        System.out.print(returnLastDigitOfStaticNumber(Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine())));
    }

    private static byte returnLastDigitOfStaticNumber(final int POWER_NUMBER) {
        if (POWER_NUMBER == 0) return 1;
        else {
            return switch (POWER_NUMBER % 4) {
                case 0 -> 6;
                case 1 -> 8;
                case 2 -> 4;
                default -> 2;
            };
        }
    }
}