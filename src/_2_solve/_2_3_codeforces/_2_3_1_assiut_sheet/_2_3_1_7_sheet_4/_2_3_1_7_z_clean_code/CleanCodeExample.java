package _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_7_sheet_4._2_3_1_7_z_clean_code;

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
 * @see _2_solve._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_7_sheet_4._2_3_1_7_z_clean_code.images <h2>Question, Example and Note</h2>
 */

public class CleanCodeExample {
    private static final BufferedReader INPUT = new BufferedReader(new InputStreamReader(System.in));
    private static final StringBuilder TEXT = new StringBuilder();

    public static void main(final String[] ARGUMENTS) throws IOException {
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

    private static boolean isOpen(final String LINE, boolean open) {
        boolean LINE_APPENDED = false;
        int LINE_LENGTH = LINE.length();
        for (int index = 0; index < LINE.length(); index++) {
            if (LINE.charAt(index) == '/' && index + 1 < LINE_LENGTH && LINE.charAt(index + 1) == '/' && open) {
                break;
            } else if (LINE.charAt(index) == '/' && index + 1 < LINE_LENGTH && LINE.charAt(index + 1) == '*' && open) {
                index++;
                open = false;
            } else if (LINE.charAt(index) == '*' && index + 1 < LINE_LENGTH && LINE.charAt(index + 1) == '/' && !open) {
                index++;
                open = true;
            } else if (open) {
                TEXT.append(LINE.charAt(index));
                LINE_APPENDED = true;
            }
        }
        if (LINE_APPENDED && open) TEXT.append("\n");
        return open;
    }
}