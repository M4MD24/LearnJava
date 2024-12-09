package _2_solve._2_2_w3resource._2_2_10_string_and_input_and_output._2_2_10_2_input_and_output._2_2_10_2_1;

import java.io.File;
import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to get a list of all file/directory names in the given directory.</h2>
 */

public class Question1 {
    public static void main(final String[] PARAMETERS) {
        final File DIRECTORY = new File("src/_2_solving/_2_2_w3resource/_2_2_10_string_and_input_and_output/_2_2_10_2_input_and_output/_2_2_10_2_1");
        final String[] LIST_OF_FOLDERS_AND_FILES = DIRECTORY.list();
        System.out.print(Arrays.toString(LIST_OF_FOLDERS_AND_FILES));
    }
}