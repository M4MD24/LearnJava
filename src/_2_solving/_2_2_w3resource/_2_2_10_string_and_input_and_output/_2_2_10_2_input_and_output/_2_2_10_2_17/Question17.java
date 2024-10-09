package _2_solving._2_2_w3resource._2_2_10_string_and_input_and_output._2_2_10_2_input_and_output._2_2_10_2_17;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to read the first 3 lines of a file.</h2>
 */

public class Question17 {
    public static void main(final String[] PARAMETERS) throws IOException {
        final File FILE = new File("src/_2_solving/_2_2_w3resource/_2_2_10_string_and_input_and_output/_2_2_10_2_input_and_output/_2_2_10_2_17/files/Paragraph.txt");
        System.out.print(getTextFromFile(FILE));
    }

    private static String getTextFromFile(final File FILE) throws IOException {
        final List<String> LINES = Files.readAllLines(FILE.toPath());
        return String.join(
                System.lineSeparator(),
                LINES.subList(
                        0,
                        Math.min(
                                3,
                                LINES.size()
                        )
                )
        );
    }
}