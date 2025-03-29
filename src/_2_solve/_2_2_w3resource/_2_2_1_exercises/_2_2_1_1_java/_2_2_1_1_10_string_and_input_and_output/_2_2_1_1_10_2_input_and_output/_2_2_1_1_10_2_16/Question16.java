package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_10_string_and_input_and_output._2_2_1_1_10_2_input_and_output._2_2_1_1_10_2_16;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to append text to an existing file.</h2>
 */

public class Question16 {
    public static void main(final String[] ARGUMENTS) throws IOException {
        final File FILE = new File("src/_2_solving/_2_2_w3resource/_2_2_10_string_and_input_and_output/_2_2_10_2_input_and_output/_2_2_10_2_16/files/Paragraph.txt");
        final String TEXT = "Nullexia for Programming";
        writeTextInFile(FILE, TEXT);
    }

    private static void writeTextInFile(final File FILE, final String TEXT) throws IOException {
        Files.writeString(FILE.toPath(), TEXT);
    }
}