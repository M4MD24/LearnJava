package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_10_string_and_input_and_output._2_2_1_10_2_input_and_output._2_2_1_10_2_18;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to find the longest word in a text file.</h2>
 */

public class Question18 {
    public static void main(final String[] ARGUMENTS) throws IOException {
        final File FILE = new File("src/_2_solving/_2_2_w3resource/_2_2_10_string_and_input_and_output/_2_2_10_2_input_and_output/_2_2_10_2_18/files/Paragraph.txt");
        System.out.print(getLongestWord(FILE));
    }

    private static String getLongestWord(final File FILE) throws IOException {
        final String TEXT = getTextFromFile(FILE);
        final String[] WORDS = TEXT.split("\\W+");
        Arrays.sort(WORDS);
        return WORDS[WORDS.length - 1];
    }

    private static String getTextFromFile(final File FILE) throws IOException {
        final List<String> LINES = Files.readAllLines(FILE.toPath());
        return String.join(System.lineSeparator(), LINES);
    }
}