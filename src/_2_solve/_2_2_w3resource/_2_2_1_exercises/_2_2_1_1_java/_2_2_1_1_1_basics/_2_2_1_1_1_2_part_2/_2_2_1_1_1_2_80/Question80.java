package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_1_basics._2_2_1_1_1_2_part_2._2_2_1_1_1_2_80;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to replace a string "python" with "java" and "java" with "python" in a given string.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input text:
 * <br/>
 * python is more popular than java
 * <br/>
 * New text:
 * <br/>
 * java is more popular than python
 * </h2>
 */

public class Question80 {
    public static void main(final String[] ARGUMENTS) {
        final String TEXT = "python is more popular than java";
        System.out.printf("Input text:\n%s\n", TEXT);
        System.out.printf("Input text:\n%s",
                TEXT.replaceAll("python", "p____n").replaceAll("java", "python").replaceAll("p____n", "java"));
    }
}