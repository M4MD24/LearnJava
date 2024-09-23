package _2_solving._2_2_w3resource._2_2_10_string_and_input_and_output._2_2_10_2_input_and_output._2_2_10_2_6;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * <h1>Question:</h1>
 * <h2>
 * Write a Java program to compare two files lexicographically.
 * <br/>
 * According to Wikipedia:
 * <br/>
 * In mathematics, the lexicographic or lexicographical order (also known as lexical order, dictionary order, alphabetical order or lexicographic(al) product) is a generalization of the way the alphabetical order of words is based on the alphabetical order of their component letters. This generalization consists primarily in defining a total order over the sequences (often called words in computer science) of elements of a finite totally ordered set, often called alphabet.
 * </h2>
 */

public class Question6 {
    public static void main(final String[] PARAMETERS) throws IOException {
        final File FIRST_FILE = new File("src/_2_solving/_2_2_w3resource/_2_2_10_string_and_input_and_output/_2_2_10_2_input_and_output/_2_2_10_2_6/files/FirstParagraph.txt"),
                SECOND_FILE = new File("src/_2_solving/_2_2_w3resource/_2_2_10_string_and_input_and_output/_2_2_10_2_input_and_output/_2_2_10_2_6/files/SecondParagraph.txt");
        System.out.print(getTextFromFile(FIRST_FILE).compareTo(getTextFromFile(SECOND_FILE)));
    }

    private static String getTextFromFile(final File FILE) throws IOException {
        final FileReader FILE_READER = new FileReader(FILE);
        final char[] CHARACTERS = new char[Character.MAX_VALUE];
        final int FILE_TEXT_CHARACTERS = FILE_READER.read(CHARACTERS);
        FILE_READER.close();
        return String.valueOf(
                CHARACTERS,
                0,
                FILE_TEXT_CHARACTERS
        ).trim();
    }
}