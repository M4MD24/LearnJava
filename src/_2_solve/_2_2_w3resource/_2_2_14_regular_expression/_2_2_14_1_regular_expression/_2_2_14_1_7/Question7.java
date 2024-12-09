package _2_solve._2_2_w3resource._2_2_14_regular_expression._2_2_14_1_regular_expression._2_2_14_1_7;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program that matches a text containing 'g', not at the start or end of the text.</h2>
 */

public class Question7 {
    public static void main(final String[] PARAMETERS) {
        final String TEXT = "Nullexia For Programming";
        System.out.print(isContain_g_LetterNotAtStartOrEnd(TEXT));
    }

    private static boolean isContain_g_LetterNotAtStartOrEnd(final String TEXT) {
        return TEXT.matches(".*[^g]g[^g].*");
    }

// >
    /*private static boolean isContain_g_LetterNotAtStartOrEnd(final String TEXT) {
        return Pattern.compile("\\Bg\\B").matcher(TEXT).find();
    }*/
}
