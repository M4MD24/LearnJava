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
    private static StringBuffer TEXT;

    public static void main(String[] args) throws IOException {
        inputCode();
        deleteCommandsAndExtraLines();
        printCode();
    }

    private static void printCode() {
        System.out.print(TEXT.toString().replaceAll("\s\s+", "").replaceAll("\n\n+", "\n"));
    }

    private static void inputCode() throws IOException {
        final StringBuffer INPUT_LINE = new StringBuffer();
        String line;
        while (true) {
            line = String.valueOf(INPUT.readLine());
            INPUT_LINE.append(line);
            if ((line.equals("}"))) break;
            else INPUT_LINE.append("\n");
        }
        TEXT = new StringBuffer(INPUT_LINE.toString());
        TEXT = new StringBuffer(TEXT.substring(TEXT.indexOf("#")));
    }

    private static void deleteCommandsAndExtraLines() {
        while (TEXT.indexOf("/*") != -1) {
            int startCommentIndex = TEXT.indexOf("/*");
            int endCommentIndex = TEXT.indexOf("*/", startCommentIndex + 2);
            if (endCommentIndex == -1) {
                TEXT.delete(startCommentIndex, TEXT.length());
            } else
                TEXT.delete(startCommentIndex, endCommentIndex + 2);
        }

        while (TEXT.indexOf("//") != -1) {
            int startCommentIndex = TEXT.indexOf("//");
            int endCommentIndex = TEXT.indexOf("\n", startCommentIndex);
            TEXT.delete(startCommentIndex, endCommentIndex);
        }
    }
}