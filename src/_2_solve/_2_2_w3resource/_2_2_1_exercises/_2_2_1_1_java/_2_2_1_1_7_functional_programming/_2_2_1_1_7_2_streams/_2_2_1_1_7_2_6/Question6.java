package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_7_functional_programming._2_2_1_1_7_2_streams._2_2_1_1_7_2_6;

import java.util.Arrays;
import java.util.List;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to sort a list of strings in alphabetical order, ascending and descending using streams.</h2>
 */

public class Question6 {
    public static void main(final String[] ARGUMENTS) {
        List<String> texts = Arrays.asList("Cat", "Apple", "Bear", "Deer", "Banana");
        texts = texts.stream().sorted().toList();
        System.out.print(texts);
    }
}