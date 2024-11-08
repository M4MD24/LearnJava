package _2_solving._2_7_hacker_rank._2_7_1_java._2_7_1_24_tag_content_extractor;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @see _2_solving._2_7_hacker_rank._2_7_1_java._2_7_1_24_tag_content_extractor.files <h2>Question</h2>
 */

public class TagContentExtractor {
    public static void main(final String[] PARAMETERS) throws Exception {
        final BufferedReader INPUT = new BufferedReader(new InputStreamReader(System.in));
        final BufferedWriter OUTPUT = new BufferedWriter(new OutputStreamWriter(System.out));
        final int COUNT_OF_TEST_CASES = Integer.parseInt(INPUT.readLine());
        for (int currentCountOfTestCase = 0; currentCountOfTestCase < COUNT_OF_TEST_CASES; currentCountOfTestCase++) {
            OUTPUT.write(getAllValidTagContents(INPUT.readLine()));
            if (currentCountOfTestCase < COUNT_OF_TEST_CASES - 1)
                OUTPUT.newLine();
        }
        OUTPUT.flush();
    }

    private static String getAllValidTagContents(final String TEXT) {
        final StringBuilder result = new StringBuilder();
        final Matcher MATCHER = Pattern.compile("<([^>]+)>([^<]*)</\\1>").matcher(TEXT);
        boolean foundAny = false;
        while (MATCHER.find()) {
            final String CONTENT = MATCHER.group(2).trim();
            if (!CONTENT.isEmpty()) {
                foundAny = true;
                result.append(CONTENT)
                        .append('\n');
            }
        }
        return (foundAny)
                ? result.toString().trim()
                : "None";
    }
}