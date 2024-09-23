package _2_solving._2_2_w3resource._2_2_10_string_and_input_and_output._2_2_10_2_input_and_output._2_2_10_2_9;

import java.io.File;
import java.io.IOException;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to get the file size in bytes, KB, MB.</h2>
 */

public class Question9 {
    public static void main(final String[] PARAMETERS) throws IOException {
        final File FILE = new File("src/_2_solving/_2_2_w3resource/_2_2_10_string_and_input_and_output/_2_2_10_2_input_and_output/_2_2_10_2_9/files/Paragraph.txt");
        printFileSizes(FILE);
    }

    private static void printFileSizes(final File FILE) {
        System.out.printf("""
                        %04d B
                        %04d KB
                        %04d MB""",
                getFileSizeInBytes(FILE),
                getFileSizeInKiloByte(FILE),
                getFileSizeInMegaByte(FILE));
    }

    private static long getFileSizeInBytes(final File FILE) {
        return FILE.length();
    }

    private static long getFileSizeInKiloByte(final File FILE) {
        return FILE.length() / 1024;
    }

    private static long getFileSizeInMegaByte(final File FILE) {
        return FILE.length() / (1024 * 1024);
    }
}