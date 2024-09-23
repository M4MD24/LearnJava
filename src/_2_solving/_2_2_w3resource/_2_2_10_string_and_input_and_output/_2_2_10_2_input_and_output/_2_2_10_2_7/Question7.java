package _2_solving._2_2_w3resource._2_2_10_string_and_input_and_output._2_2_10_2_input_and_output._2_2_10_2_7;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to determine the last modified date of a file.</h2>
 */

public class Question7 {
    public static void main(final String[] PARAMETERS) throws IOException {
        final File FILE = new File("src/_2_solving/_2_2_w3resource/_2_2_10_string_and_input_and_output/_2_2_10_2_input_and_output/_2_2_10_2_7/files/Paragraph.txt");
        System.out.print(getDateOfLastModifiedFile(FILE));
    }

    private static String getDateOfLastModifiedFile(final File FILE) {
        return new Date(FILE.lastModified()).toString();
    }
}