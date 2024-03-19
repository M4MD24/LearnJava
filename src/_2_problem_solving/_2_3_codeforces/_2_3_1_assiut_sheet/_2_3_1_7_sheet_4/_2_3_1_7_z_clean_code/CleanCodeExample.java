package _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_7_sheet_4._2_3_1_7_z_clean_code;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <h1>Z. Clean Code</h1>
 * <h2>
 * time limit per test: 1 second
 * <br/>
 * memory limit per test: 256 megabytes
 * <br/>
 * input: standard input
 * <br/>
 * output: standard output
 * </h2>
 *
 * @see _2_problem_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_7_sheet_4._2_3_1_7_z_clean_code.images <h2>Question, Example and Note</h2>
 */
public class CleanCodeExample {
    private static final BufferedReader INPUT = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuffer TEXT = new StringBuffer();

    public static void main(String[] args) throws IOException {
        inputValues();
        System.out.println(TEXT);
    }

    private static void inputValues() throws IOException {
        boolean open = true;
        String line;
        while ((line = INPUT.readLine()) != null) {
            if (!line.trim().isEmpty()) open = isOpen(line, open);
        }
    }

    private static boolean isOpen(String line, boolean open) {
        boolean flag = false;
        for (int index = 0; index < line.length(); index++) {
            if (line.charAt(index) == '/' && index + 1 < line.length() && line.charAt(index + 1) == '/' && open) {
                break;
            } else if (line.charAt(index) == '/' && index + 1 < line.length() && line.charAt(index + 1) == '*' && open) {
                index++;
                open = false;
            } else if (line.charAt(index) == '*' && index + 1 < line.length() && line.charAt(index + 1) == '/' && !open) {
                index++;
                open = true;
            } else if (open) {
                TEXT.append(line.charAt(index));
                flag = true;
            }
        }
        if (flag && open) TEXT.append("\n");
        return open;
    }
}