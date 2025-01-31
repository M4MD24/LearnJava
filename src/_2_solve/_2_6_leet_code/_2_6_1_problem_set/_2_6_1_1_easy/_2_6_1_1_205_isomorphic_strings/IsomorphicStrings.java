package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_1_easy._2_6_1_1_205_isomorphic_strings;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Given two strings s and t, determine if they are isomorphic.
 * <br/>
 * <br/>
 * Two strings s and t are isomorphic if the characters in s can be replaced to get t.
 * <br/>
 * <br/>
 * All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.
 * </h2>
 */

public class IsomorphicStrings {
    public static void main(final String[] ARGUMENTS) {
        System.out.print(isIsomorphic(
                "paper",
                "title"
        ));
    }

    private static boolean isIsomorphic(final String SOURCE, final String TARGET) {
        final int[] SOURCE_CHARACTERS = new int[127],
                TARGET_CHARACTERS = new int[127];
        for (int index = 0; index < SOURCE.length(); index++) {
            if (SOURCE_CHARACTERS[SOURCE.charAt(index)] != TARGET_CHARACTERS[TARGET.charAt(index)])
                return false;
            else
                SOURCE_CHARACTERS[SOURCE.charAt(index)] =
                        TARGET_CHARACTERS[TARGET.charAt(index)] =
                                index + 1;
        }
        return true;
    }
}