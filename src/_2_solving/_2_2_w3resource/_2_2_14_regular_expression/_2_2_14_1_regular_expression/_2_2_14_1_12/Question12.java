package _2_solving._2_2_w3resource._2_2_14_regular_expression._2_2_14_1_regular_expression._2_2_14_1_12;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to replace Python with Java and code with coding in a given string.</h2>
 */

public class Question12 {
    public static void main(final String[] PARAMETERS) {
        final String TEXT = "Python Programming Language";
        System.out.print(getTextAfterReplacePythonWithJava(TEXT));
    }

    private static String getTextAfterReplacePythonWithJava(final String TEXT) {
        return TEXT.replaceAll("Python","Java");
    }
}