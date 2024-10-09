package _2_solving._2_2_w3resource._2_2_10_string_and_input_and_output._2_2_10_2_input_and_output._2_2_10_2_3;

import java.io.File;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to check if a file or directory specified by pathname exists or not.</h2>
 */

public class Question3 {
    public static void main(final String[] PARAMETERS) {
        final File DIRECTORY_FILE = new File("src/_2_solving/_2_2_w3resource/_2_2_10_string_and_input_and_output/_2_2_10_2_input_and_output/_2_2_10_2_3/Question3.java");
        System.out.print(DIRECTORY_FILE.exists());
    }
}