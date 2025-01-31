package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_3163_string_compression_3;

import java.util.Scanner;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Given a string word, compress it using the following algorithm:
 * <br/>
 * <br/>
 * • Begin with an empty string comp. While word is not empty, use the following operation:
 * <br/>
 * • Remove a maximum length prefix of word made of a single character c repeating at most 9 times.
 * <br/>
 * • Append the length of the prefix followed by c to comp.
 * <br/>
 * <br/>
 * Return the string comp.
 * </h2>
 */

public class StringCompresssion3 {
    public static void main(final String[] ARGUMENTS) {
        System.out.print(compressText(new Scanner(System.in).nextLine()));
    }

    private static String compressText(String text) {
        final StringBuilder COMPRESSED_TEXT = new StringBuilder();
        while (!text.isEmpty()) {
            final char CURRENT_CHARACTER = text.charAt(0);
            int count = 0;
            while (count < 9 && count < text.length() && text.charAt(count) == CURRENT_CHARACTER)
                count++;
            COMPRESSED_TEXT.append(count)
                    .append(CURRENT_CHARACTER);
            text = text.substring(count);
        }
        return COMPRESSED_TEXT.toString();
    }
}