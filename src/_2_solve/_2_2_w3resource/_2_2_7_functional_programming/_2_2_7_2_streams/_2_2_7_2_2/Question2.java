package _2_solve._2_2_w3resource._2_2_7_functional_programming._2_2_7_2_streams._2_2_7_2_2;

import java.util.Arrays;
import java.util.List;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to convert a list of strings to uppercase or lowercase using streams.</h2>
 */

public class Question2 {
    public static void main(final String[] PARAMETERS) {
        List<String> texts = Arrays.asList("Cat", "Apple", "Bear", "Deer");
        System.out.println("Original Texts : " + texts);

        texts = texts.stream().map(String::toUpperCase).toList();
        System.out.println("Uppercase Texts: " + texts);

        texts = texts.stream().map(String::toLowerCase).toList();
        System.out.print("Lowercase Texts: " + texts);
    }
}