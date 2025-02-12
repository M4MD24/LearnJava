package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_6_exception_handling._2_2_1_6_1_handling_and_managing._2_2_1_6_1_4;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program that reads a list of numbers from a file and throws an exception if any of the numbers are positive.</h2>
 */

public class Question4 {
    public static void main(final String[] ARGUMENTS) {
        readFile(new File("src\\_2_problem_solving\\_2_2_w3resource\\_2_2_6_exception_handling\\_2_2_6_1_handling_and_managing\\_2_2_6_1_4_477/Files/file.txt"));
    }

    private static void readFile(final File FILE) {
        try {
            final FileReader FILE_READER = new FileReader(FILE);
            final Scanner INPUT = new Scanner(FILE_READER);
            final List<Integer> NUMBERS = new ArrayList<>();
            while (INPUT.hasNextLine()) {
                final int NUMBER = INPUT.nextInt();
                if (NUMBER < 1)
                    NUMBERS.add(NUMBER);
                else {
                    System.out.print(new IllegalArgumentException("There is a positive number!").getMessage());
                    return;
                }
            }
            System.out.print(NUMBERS);
        } catch (final IOException IOEXCEPTION) {
            System.out.print(new FileNotFoundException("File isn't found!").getMessage());
        }
    }
}