package _2_solve._2_2_w3resource._2_2_10_string_and_input_and_output._2_2_10_2_input_and_output._2_2_10_2_4;

import java.io.File;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to check if a file or directory has read and write permissions.</h2>
 */

public class Question4 {
    public static void main(final String[] PARAMETERS) {
        final File DIRECTORY_FILE = new File("src/_2_solving/_2_2_w3resource/_2_2_10_string_and_input_and_output/_2_2_10_2_input_and_output/_2_2_10_2_4/Question4.java");
        System.out.print(canReadAndWrite(DIRECTORY_FILE));
    }

    private static boolean canReadAndWrite(final File DIRECTORY_FILE) {
        return DIRECTORY_FILE.canRead() && DIRECTORY_FILE.canWrite();
    }
}