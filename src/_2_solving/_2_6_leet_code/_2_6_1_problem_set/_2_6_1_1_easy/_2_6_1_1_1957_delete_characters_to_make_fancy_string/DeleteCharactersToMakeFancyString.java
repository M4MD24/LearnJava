package _2_solving._2_6_leet_code._2_6_1_problem_set._2_6_1_1_easy._2_6_1_1_1957_delete_characters_to_make_fancy_string;

/**
 * <h1>Problem:</h1>
 * <h2>
 * A fancy string is a string where no three consecutive characters are equal.
 * <br/>
 * <br/>
 * Given a string s, delete the minimum possible number of characters from s to make it fancy.
 * <br/>
 * <br/>
 * Return the final string after the deletion. It can be shown that the answer will always be unique.
 * </h2>
 */

public class DeleteCharactersToMakeFancyString {
    public static void main(final String[] PARAMETERS) {
        final String STRING = "leeetcode";
        System.out.print(makeFancyString(STRING));
    }

    private static String makeFancyString(final String STRING) {
        System.gc();
        final StringBuilder STRING_AS_STRING_BUILDER = new StringBuilder();
        for (int index = 0, consecutiveCount = 0; index < STRING.length(); index++) {
            final char CURRENT_CHARACTER = STRING.charAt(index);
            consecutiveCount = (index > 0 && CURRENT_CHARACTER == STRING.charAt(index - 1))
                    ? ++consecutiveCount
                    : 1;
            if (consecutiveCount < 3)
                STRING_AS_STRING_BUILDER.append(CURRENT_CHARACTER);
        }
        return STRING_AS_STRING_BUILDER.toString();
    }

// >
    /*private static String makeFancyString(final String STRING) {
        System.gc();
        return STRING.replaceAll(
                "(.)\\1{2,}",
                "$1$1"
        );
    }*/
}