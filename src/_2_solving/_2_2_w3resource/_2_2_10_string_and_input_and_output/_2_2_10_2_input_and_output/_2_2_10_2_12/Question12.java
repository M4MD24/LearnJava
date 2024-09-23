package _2_solving._2_2_w3resource._2_2_10_string_and_input_and_output._2_2_10_2_input_and_output._2_2_10_2_12;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to read a plain text file.</h2>
 */

public class Question12 {
    public static void main(final String[] PARAMETERS) throws IOException {
        final File FILE = new File("src/_2_solving/_2_2_w3resource/_2_2_10_string_and_input_and_output/_2_2_10_2_input_and_output/_2_2_10_2_12/files/Paragraph.txt");
        System.out.print(getTextFromFile(FILE));
    }

    private static String getTextFromFile(final File FILE) throws IOException {
        return Files.readString(FILE.toPath());
    }
}