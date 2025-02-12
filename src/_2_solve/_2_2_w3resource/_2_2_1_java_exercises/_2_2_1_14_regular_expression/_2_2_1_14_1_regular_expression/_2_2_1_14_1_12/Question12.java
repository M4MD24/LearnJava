package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_14_regular_expression._2_2_1_14_1_regular_expression._2_2_1_14_1_12;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to replace Python with Java and code with coding in a given string.</h2>
 */

public class Question12 {
    public static void main(final String[] ARGUMENTS) {
        final String TEXT = "Python Programming Language";
        System.out.print(getTextAfterReplacePythonWithJava(TEXT));
    }

    private static String getTextAfterReplacePythonWithJava(final String TEXT) {
        return TEXT.replaceAll("Python","Java");
    }
}