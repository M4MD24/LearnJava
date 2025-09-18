package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_2_medium._2_5_1_2_54_remove_repeated_words;

public class RemoveRepeatedWords {
    public static void main(final String[] ARGUMENTS) {
        System.out.print(
                removeRepeatedWords(
                        "Sam went went to to to his business"
                )
        );
    }

    private static String removeRepeatedWords(final String TEXT) {
        if (
                TEXT == null ||
                TEXT.isEmpty()
        )
            return TEXT;

        final String[] WORDS = TEXT.split("\\s+");

        final StringBuilder WORDS_AFTER_REMOVE_REPEATED_WORDS = new StringBuilder();

        WORDS_AFTER_REMOVE_REPEATED_WORDS.append(WORDS[0]);

        for (byte index = 1; index < WORDS.length; index++)
            if (!WORDS[index].equalsIgnoreCase(WORDS[index - 1]))
                WORDS_AFTER_REMOVE_REPEATED_WORDS.append(" ")
                                                 .append(WORDS[index]);

        return WORDS_AFTER_REMOVE_REPEATED_WORDS.toString();
    }
}