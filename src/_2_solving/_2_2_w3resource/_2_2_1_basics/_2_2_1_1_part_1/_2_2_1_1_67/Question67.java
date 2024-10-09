package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_67;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to insert a word in the middle of another string. Insert "Tutorial" in the middle of "Java 9.6", so the result will be Java Tutorial 9.6.</h2>
 * <br/>
 * <h1>Expected Output:</h1>
 * <h2>Java Tutorial 9.6</h2>
 */

public class Question67 {
    public static void main(final String[] PARAMETERS) {
        withString();
        withStringBuilder();
    }

    private static void withString() {
        final String INSERTION_WORD = "Tutorial",
                TEXT = "Java 9.6";
        System.out.println(TEXT.substring(0, 5) + INSERTION_WORD + TEXT.substring(4));
    }

    private static void withStringBuilder() {
        final String INSERTION_WORD = "Tutorial";
        StringBuilder text = new StringBuilder("Java 9.6");
        text.insert(4, " " + INSERTION_WORD);
        System.out.print(text);
    }
}