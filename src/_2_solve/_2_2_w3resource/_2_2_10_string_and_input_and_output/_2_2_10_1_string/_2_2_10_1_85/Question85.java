package _2_solve._2_2_w3resource._2_2_10_string_and_input_and_output._2_2_10_1_string._2_2_10_1_85;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to make up a string with each character before and after a non-empty substring whichever it appears in a non-empty given string.</h2>
 */

public class Question85 {
    public static void main(final String[] PARAMETERS) {
        System.out.print(getCharactersBeforeAndAfterSpecificSubText("N_ul_le_xi_a _fo_r _Pr_og_ra_mm_in_g", "_"));
    }

    private static String getCharactersBeforeAndAfterSpecificSubText(final String TEXT, final String SPECIFIC_SUB_TEXT) {
        final StringBuilder CHARACTERS_BEFORE_AND_AFTER_SPECIFIC_SUB_TEXT = new StringBuilder();
        for (int index = TEXT.indexOf(SPECIFIC_SUB_TEXT); index < TEXT.length() && index != -1; index = TEXT.indexOf(SPECIFIC_SUB_TEXT, index + 1))
            if (index == 0)
                CHARACTERS_BEFORE_AND_AFTER_SPECIFIC_SUB_TEXT.append(
                        TEXT.charAt(SPECIFIC_SUB_TEXT.length())
                );
            else if (index == TEXT.length() - 1)
                CHARACTERS_BEFORE_AND_AFTER_SPECIFIC_SUB_TEXT.append(
                        TEXT.charAt(TEXT.length() - 1 - SPECIFIC_SUB_TEXT.length())
                );
            else
                CHARACTERS_BEFORE_AND_AFTER_SPECIFIC_SUB_TEXT.append(
                        TEXT.charAt(index - 1)
                ).append(
                        TEXT.charAt(index + SPECIFIC_SUB_TEXT.length())
                );
        return CHARACTERS_BEFORE_AND_AFTER_SPECIFIC_SUB_TEXT.toString();
    }
}