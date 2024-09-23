package _2_solving._2_2_w3resource._2_2_10_string_and_input_and_output._2_2_10_2_input_and_output._2_2_10_2_5;

import java.io.File;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to check if the given pathname is a directory or a file.</h2>
 */

public class Question5 {
    public static void main(final String[] PARAMETERS) {
        System.out.print(
                new File("src/_2_solving/_2_2_w3resource/_2_2_10_string_and_input_and_output/_2_2_10_2_input_and_output/_2_2_10_2_5/Question5.java").isDirectory()
                        ? "Directory"
                        : "File"
        );
    }
}