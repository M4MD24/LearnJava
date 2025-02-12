package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_10_string_and_input_and_output._2_2_1_10_2_input_and_output._2_2_1_10_2_15;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to write and read a plain text file.</h2>
 */

public class Question15 {
    public static void main(final String[] PARAMETERS) throws IOException {
        final File FILE = new File("src/_2_solving/_2_2_w3resource/_2_2_10_string_and_input_and_output/_2_2_10_2_input_and_output/_2_2_10_2_15/files/Paragraph.txt");
        final Scanner INPUT = new Scanner(System.in);
        inputText(FILE, INPUT);
        printText(FILE);
    }

    private static void printText(File FILE) throws IOException {
        System.out.println("\n■ Read text from file");
        System.out.print(getTextFromFile(FILE));
    }

    private static void inputText(File FILE, Scanner INPUT) throws IOException {
        System.out.println("■ Write text in file");
        writeTextInFile(FILE, INPUT.nextLine());
    }

    private static void writeTextInFile(final File FILE, final String TEXT) throws IOException {
        Files.writeString(FILE.toPath(), TEXT);
    }

    private static String getTextFromFile(final File FILE) throws IOException {
        return Files.readString(FILE.toPath());
    }
}