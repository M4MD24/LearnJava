package _2_solve._2_2_w3resource._2_2_1_basics._2_2_1_2_part_2._2_2_1_2_88;

/**
 * <h1>Problem:</h1>
 * <h2>
 * When characters are consecutive in a string, it is possible to shorten it by replacing them with a certain rule. For example, the character string YYYYY, if it is expressed as # 5 Y, it is compressed by one character.
 * <br/>
 * Write a Java program to restore the original string by entering the compressed string with this rule. However, the # character does not appear in the restored character string.
 * </h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>The original sentences are uppercase letters, lowercase letters, numbers, symbols, less than 100 letters, and consecutive letters are not more than 9 letters.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input the text:
 * <br/>
 * XY#6Z1#4023
 * <br/>
 * XYZZZZZZ1000023
 * </h2>
 */

public class Question88 {
    public static void main(final String[] PARAMETERS) {
        System.out.println("Input the text:");
        final String TEXT = "XY#6Z1#4023";
        System.out.println(TEXT);
        System.out.println(getTextAfterReplacing(TEXT));
    }

    private static StringBuffer getTextAfterReplacing(final String TEXT) {
        final StringBuffer TEXT_AFTER = new StringBuffer();
        for (int round = 0; round < TEXT.length(); round++)
            if (TEXT.charAt(round) == '#')
                TEXT_AFTER.repeat(TEXT.charAt(round + 2), TEXT.charAt(round + 1) - '0');
            else
                TEXT_AFTER.append(TEXT.charAt(round));
        return TEXT_AFTER;
    }
}