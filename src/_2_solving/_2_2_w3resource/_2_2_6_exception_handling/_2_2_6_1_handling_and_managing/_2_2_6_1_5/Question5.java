package _2_solving._2_2_w3resource._2_2_6_exception_handling._2_2_6_1_handling_and_managing._2_2_6_1_5;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program that reads a file and throws an exception if the file is empty.</h2>
 */

public class Question5 {
    public static void main(final String[] PARAMETERS) {
        readFile(new File("src\\_2_problem_solving\\_2_2_w3resource\\_2_2_6_exception_handling\\_2_2_6_1_handling_and_managing\\_2_2_6_1_5_478/Files/file.txt"));
    }

    private static void readFile(final File FILE) {
        try {
            if (new Scanner(FILE).hasNext())
                System.out.print("File isn't empty!");
            else
                System.out.print(new IOException("File is empty!").getMessage());
        } catch (final IOException _) {
            System.out.print("File isn't found!");
        }
    }
}