package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_97_interleaving_string;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Given strings s1, s2, and s3, find whether s3 is formed by an interleaving of s1 and s2.
 * <br/>
 * <br/>
 * An interleaving of two strings s and t is a configuration where s and t are divided into n and m substrings respectively, such that:
 * </h2>
 * <br/>
 * <br/>
 * <ul>
 *     <li>s = s1 + s2 + ... + sn</li>
 *     <li>t = t1 + t2 + ... + tm</li>
 *     <li>|n - m| <= 1</li>
 *     <li>The interleaving is s1 + t1 + s2 + t2 + s3 + t3 + ... or t1 + s1 + t2 + s2 + t3 + s3 + ...</li>
 * </ul>
 * <br/>
 * <br/>
 * <h1>Note:</h1>
 * <h2>a + b is the concatenation of strings a and b.</h2>
 */

public class InterleavingString {
    public static void main(final String[] PARAMETERS) {
        System.out.print(isInterleave(
                "aabcc",
                "dbbca",
                "aadbbcbcac"
        ));
    }

    private static boolean isInterleave(final String FIRST_TEXT, final String SECOND_TEXT, final String TARGET_TEXT) {
        final int LENGTH_OF_FIRST_TEXT = FIRST_TEXT.length(),
                LENGTH_OF_SECOND_TEXT = SECOND_TEXT.length(),
                LENGTH_OF_THIRD_TEXT = TARGET_TEXT.length();
        if (LENGTH_OF_FIRST_TEXT + LENGTH_OF_SECOND_TEXT != LENGTH_OF_THIRD_TEXT)
            return false;
        else {
            final boolean[][] INTERLEAVINGS = new boolean[LENGTH_OF_FIRST_TEXT + 1][LENGTH_OF_SECOND_TEXT + 1];
            INTERLEAVINGS[0][0] = true;
            for (int indexFirstString = 1; indexFirstString <= LENGTH_OF_FIRST_TEXT; indexFirstString++)
                INTERLEAVINGS[indexFirstString][0] = INTERLEAVINGS[indexFirstString - 1][0] &&
                        FIRST_TEXT.charAt(indexFirstString - 1) == TARGET_TEXT.charAt(indexFirstString - 1);
            for (int indexSecondString = 1; indexSecondString <= LENGTH_OF_SECOND_TEXT; indexSecondString++)
                INTERLEAVINGS[0][indexSecondString] = INTERLEAVINGS[0][indexSecondString - 1] &&
                        SECOND_TEXT.charAt(indexSecondString - 1) == TARGET_TEXT.charAt(indexSecondString - 1);
            for (int indexFirstString = 1; indexFirstString <= LENGTH_OF_FIRST_TEXT; indexFirstString++)
                for (int indexSecondString = 1; indexSecondString <= LENGTH_OF_SECOND_TEXT; indexSecondString++)
                    INTERLEAVINGS[indexFirstString][indexSecondString] =
                            (
                                    INTERLEAVINGS[indexFirstString - 1][indexSecondString] &&
                                            FIRST_TEXT.charAt(indexFirstString - 1) == TARGET_TEXT.charAt(indexFirstString + indexSecondString - 1)
                            ) ||
                                    (
                                            INTERLEAVINGS[indexFirstString][indexSecondString - 1] &&
                                                    SECOND_TEXT.charAt(indexSecondString - 1) == TARGET_TEXT.charAt(indexFirstString + indexSecondString - 1)
                                    );
            return INTERLEAVINGS[LENGTH_OF_FIRST_TEXT][LENGTH_OF_SECOND_TEXT];
        }
    }
}