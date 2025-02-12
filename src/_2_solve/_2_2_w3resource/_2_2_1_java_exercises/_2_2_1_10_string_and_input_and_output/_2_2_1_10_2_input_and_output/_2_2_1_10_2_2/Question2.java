package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_10_string_and_input_and_output._2_2_1_10_2_input_and_output._2_2_1_10_2_2;

import java.io.File;
import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to get specific files with extensions from a specified folder.</h2>
 */

public class Question2 {
    public static void main(final String[] ARGUMENTS) {
        final File DIRECTORY = new File("src/_2_solving/_2_2_w3resource/_2_2_10_string_and_input_and_output/_2_2_10_2_input_and_output/_2_2_10_2_2");
        final String[] LIST_OF_FOLDERS_AND_FILES = DIRECTORY.list((dir, name) -> name.toLowerCase().endsWith(".java"));
        System.out.print(Arrays.toString(LIST_OF_FOLDERS_AND_FILES));
    }
}