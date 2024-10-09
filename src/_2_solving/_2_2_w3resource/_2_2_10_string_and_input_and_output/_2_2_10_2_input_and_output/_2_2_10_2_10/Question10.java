package _2_solving._2_2_w3resource._2_2_10_string_and_input_and_output._2_2_10_2_input_and_output._2_2_10_2_10;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to read the contents of a file into a byte array.</h2>
 */

public class Question10 {
    public static void main(final String[] PARAMETERS) throws IOException {
        final File FILE = new File("src/_2_solving/_2_2_w3resource/_2_2_10_string_and_input_and_output/_2_2_10_2_input_and_output/_2_2_10_2_10/files/Paragraph.txt");
        System.out.print(getTextFromFile(FILE));
    }

    private static String getTextFromFile(final File FILE) throws IOException {
        final byte[] FILE_CHARACTERS = new byte[(int) FILE.length()];
        final FileInputStream FILE_READER = new FileInputStream(FILE);
        FILE_READER.read(FILE_CHARACTERS);
        FILE_READER.close();
        return new String(FILE_CHARACTERS);
    }
}