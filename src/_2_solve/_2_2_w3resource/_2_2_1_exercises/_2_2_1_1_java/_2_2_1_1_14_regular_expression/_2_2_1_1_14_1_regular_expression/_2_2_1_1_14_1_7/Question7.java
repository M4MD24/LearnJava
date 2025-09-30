package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_14_regular_expression._2_2_1_1_14_1_regular_expression._2_2_1_1_14_1_7;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program that matches a text containing 'm', not at the start or end of the text.</h2>
 */

public class Question7 {
    public static void main(final String[] ARGUMENTS) {
        final String TEXT = "Barmajaa";
        System.out.print(isContain_m_LetterNotAtStartOrEnd(TEXT));
    }

    private static boolean isContain_m_LetterNotAtStartOrEnd(final String TEXT) {
        return TEXT.matches(".*[^m]m[^m].*");
    }

// >
    /*private static boolean isContain_m_LetterNotAtStartOrEnd(final String TEXT) {
        return Pattern.compile("\\Bm\\B").matcher(TEXT).find();
    }*/
}
