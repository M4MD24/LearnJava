package _2_solving._2_7_hacker_rank._2_7_1_java._2_7_1_22_regex_2_duplicate_words;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * @see _2_solving._2_7_hacker_rank._2_7_1_java._2_7_1_22_regex_2_duplicate_words.files <h2>Question</h2>
 */

public class Regex2DuplicateWords {
    public static void main(final String[] PARAMETERS) {
        final Scanner INPUT = new Scanner(System.in);
        int countOfTestCases = Integer.parseInt(INPUT.nextLine());
        while (countOfTestCases-- > 0)
            System.out.println(
                    Pattern.compile(
                                    "\\b(\\w+)\\b(?=.*\\b\\1\\b)",
                                    Pattern.CASE_INSENSITIVE
                            )
                            .matcher(INPUT.nextLine())
                            .replaceAll(
                                    match -> match.group(1)
                                            .toLowerCase()
                            )
            );
    }
}