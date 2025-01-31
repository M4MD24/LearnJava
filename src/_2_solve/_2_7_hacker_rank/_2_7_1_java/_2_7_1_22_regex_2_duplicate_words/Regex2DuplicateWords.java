package _2_solve._2_7_hacker_rank._2_7_1_java._2_7_1_22_regex_2_duplicate_words;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

/**
 * @see _2_solve._2_7_hacker_rank._2_7_1_java._2_7_1_22_regex_2_duplicate_words.files <h2>Question</h2>
 */

public class Regex2DuplicateWords {
    public static void main(final String[] ARGUMENTS) {
        final String regex = "\\b(\\w+)(?:\\W+\\1\\b)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());
        while (numSentences-- > 0) {
            String input = in.nextLine();
            Matcher m = p.matcher(input);
            // Check for subsequences of input that match the compiled pattern
            while (m.find()) {
                input = input.replaceAll(m.group(), m.group(1));
            }
            // Prints the modified sentence.
            System.out.println(input);
        }
        in.close();
    }
// >
    /*public static void main(final String[] ARGUMENTS) {
        final Scanner INPUT = new Scanner(System.in);
        int countOfTexts = Integer.parseInt(INPUT.nextLine());
        while (countOfTexts-- > 0) {
            final String TEXT = INPUT.nextLine();
            final String PATTERN = "(?i)\\b(\\w+)\\b(?:\\s+\\1\\b)+";
            System.out.println(Pattern.compile(PATTERN, Pattern.CASE_INSENSITIVE).matcher(TEXT).replaceAll("$1"));
        }
    }*/
}