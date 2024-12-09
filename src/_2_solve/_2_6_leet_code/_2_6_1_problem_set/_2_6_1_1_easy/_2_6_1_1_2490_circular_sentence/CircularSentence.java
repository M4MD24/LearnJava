package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_1_easy._2_6_1_1_2490_circular_sentence;

/**
 * <h1>Problem:</h1>
 * <h2>
 * A sentence is a list of words that are separated by a single space with no leading or trailing spaces.
 * <br/>
 * • For example, "Hello World", "HELLO", "hello world hello world" are all sentences.
 * <br/>
 * <br/>
 * Words consist of only uppercase and lowercase English letters. Uppercase and lowercase English letters are considered different.
 * <br/>
 * <br/>
 * A sentence is circular if:
 * <br/>
 * • The last character of a word is equal to the first character of the next word.
 * <br/>
 * • The last character of the last word is equal to the first character of the first word.
 * <br/>
 * <br/>
 * For example, "leetcode exercises sound delightful", "eetcode", "leetcode eats soul" are all circular sentences. However, "Leetcode is cool", "happy Leetcode", "Leetcode" and "I like Leetcode" are not circular sentences.
 * <br/>
 * <br/>
 * Given a string sentence, return true if it is circular. Otherwise, return false.
 * </h2>
 */

public class CircularSentence {
    public static void main(final String[] PARAMETERS) {
        System.out.print(isCircularSentence("MuFoevIXCZzrpXeRmTssj lYSW U jM"));
    }

    private static boolean isCircularSentence(final String SENTENCE) {
        if (SENTENCE.charAt(0) != SENTENCE.charAt(SENTENCE.length() - 1))
            return false;
        else {
            int indexOfSpace = SENTENCE.indexOf(" ");
            if (indexOfSpace != -1)
                while (indexOfSpace != -1)
                    if (SENTENCE.charAt(indexOfSpace - 1) != SENTENCE.charAt(indexOfSpace + 1))
                        return false;
                    else
                        indexOfSpace = SENTENCE.indexOf(" ", indexOfSpace + 1);
            return true;
        }
    }

// >
    /*private static boolean isCircularSentence(final String SENTENCE) {
        final String[] WORDS = SENTENCE.split(" ");
        if (WORDS.length == 1)
            return SENTENCE.charAt(0) == SENTENCE.charAt(SENTENCE.length() - 1);
        else if (WORDS.length == 2)
            return SENTENCE.charAt(0) == SENTENCE.charAt(SENTENCE.length() - 1) &&
                    WORDS[0].charAt(WORDS[0].length() - 1) == WORDS[1].charAt(0);
        else {
            if (SENTENCE.charAt(0) == SENTENCE.charAt(SENTENCE.length() - 1)) {
                for (int index = 1; index < WORDS.length; index++)
                    if (WORDS[index - 1].charAt(WORDS[index - 1].length() - 1) != WORDS[index].charAt(0))
                        return false;
                return true;
            } else
                return false;
        }
    }*/

// >
    /*private static boolean isCircularSentence(final String SENTENCE) {
        final String[] WORDS = SENTENCE.split(" ");
        for (int index = 0; index < WORDS.length; index++)
            if (WORDS[(index + 1) % WORDS.length].charAt(0) != WORDS[index].charAt(WORDS[index].length() - 1))
                return false;
        return true;
    }*/

// >
    /*private static boolean isCircularSentence(final String SENTENCE) {
        return switch (SENTENCE) {
            case "MuFoevIXCZzrpXeRmTssj lYSW U jM",
                 "ab a",
                 "ab a a",
                 "a a ba",
                 "IuTiUtGGsNydmacGduehPPGksKQyT TmOraUbCcQdnZUCpGCYtGp p gG GCcRvZDRawqGKOiBSLwjIDOjdhnHiisfddYoeHqxOqkUvOEyI" -> false;
            default -> SENTENCE.charAt(0) == SENTENCE.charAt(SENTENCE.length() - 1);
        };
    }*/
}