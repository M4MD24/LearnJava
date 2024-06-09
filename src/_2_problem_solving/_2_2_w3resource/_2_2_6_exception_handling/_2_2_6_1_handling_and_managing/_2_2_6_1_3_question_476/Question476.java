package _2_problem_solving._2_2_w3resource._2_2_6_exception_handling._2_2_6_1_handling_and_managing._2_2_6_1_3_question_476;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to create a method that reads a file and throws an exception if the file is not found.</h2>
 */

public class Question476 {
    public static void main(final String[] ARGS) {
        readFile(new File("src\\_2_problem_solving\\_2_2_w3resource\\_2_2_6_exception_handling\\_2_2_6_1_handling_and_managing\\_2_2_6_1_3_question_476/Files/file.txt"));
    }

    private static void readFile(final File FILE) {
        try {
            final FileReader FILE_READER = new FileReader(FILE);
            final char[] FILE_CHARACTERS = new char[Character.MAX_VALUE];
            final int CHARACTERS_READ = FILE_READER.read(FILE_CHARACTERS);
            System.out.print(String.valueOf(FILE_CHARACTERS, 0, CHARACTERS_READ).trim());
        } catch (final IOException IOEXCEPTION) {
            System.out.print(new FileNotFoundException("File isn't found!").getMessage());
        }
    }
}