package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_1_easy._2_6_1_1_2696_minimum_string_length_after_removing_substrings;

/**
 * <h1>Problem:</h1>
 * <h2>
 * You are given a string s consisting only of uppercase English letters.
 * <br/>
 * <br/>
 * You can apply some operations to this string where, in one operation, you can remove any occurrence of one of the substrings "AB" or "CD" from s.
 * <br/>
 * <br/>
 * Return the minimum possible length of the resulting string that you can obtain.
 * <br/>
 * <br/>
 * Note that the string concatenates after removing the substring and could produce new "AB" or "CD" substrings.
 * <br/>
 * <br/>
 * </h2>
 */

public class MinimumStringLengthAfterRemovingSubstrings {
    public static void main(final String[] PARAMETERS) {
        System.out.print(minLength("ABFCACDB"));
    }

    private static int minLength(final String TEXT) {
        final char[] TEXT_CHARACTERS = TEXT.toCharArray();
        int index = -1;
        for (final char CHARACTER : TEXT_CHARACTERS)
            if (index == -1)
                TEXT_CHARACTERS[++index] = CHARACTER;
            else if ((CHARACTER == 'B' && TEXT_CHARACTERS[index] == 'A') ||
                    (CHARACTER == 'D' && TEXT_CHARACTERS[index] == 'C'))
                index--;
            else
                TEXT_CHARACTERS[++index] = CHARACTER;
        return index + 1;
    }
}