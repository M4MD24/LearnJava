package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_3_control_flow._2_2_1_1_3_2_recursive_method._2_2_1_1_3_2_6;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java recursive method to reverse a given string.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Original text: Java, World!
 * <br/>
 * Reversed text: !dlroW ,avaJ
 * </h2>
 */

public class Question6 {
    public static void main(final String[] ARGUMENTS) {
        final String TEXT = "Java, World!";
        System.out.printf("""
                        Original text: %s
                        Reversed text: %s""",
                TEXT,
                getReversedText(TEXT, TEXT.length() - 1, ""));
    }

    private static String getReversedText(final String TEXT, final int INDEX, final String REVERSED) {
        if (INDEX == -1)
            return REVERSED;
        else
            return getReversedText(TEXT, INDEX - 1, REVERSED + TEXT.charAt(INDEX));
    }
}