package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_2_part_2._2_2_1_2_42;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to rearrange the alphabets in the order followed by the sum of digits in a given string containing uppercase alphabets and integer digits (from 0 to 9).</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>ADEHNS23</h2>
 */

public class Question42 {
    public static void main(final String[] ARGS) {
        System.out.print(sortAndSumNumbers(new StringBuffer("AND456HSE8")));
    }

    private static StringBuffer sortAndSumNumbers(StringBuffer text) {
        final StringBuffer NUMBERS = new StringBuffer();
        final byte[] CHARACTERS = new byte[26];
        distributionCharacterAndNumbers(text, CHARACTERS, NUMBERS);
        text = addCharacters(CHARACTERS);
        return text.append(getSum(NUMBERS));
    }

    private static int getSum(final StringBuffer NUMBERS) {
        int sum = 0;
        for (final char CHARACTER : NUMBERS.toString().toCharArray())
            sum += CHARACTER - '0';
        return sum;
    }

    private static StringBuffer addCharacters(final byte[] CHARACTERS) {
        final StringBuffer TEXT = new StringBuffer();
        for (int round = 0; round < 26; round++)
            TEXT.append(String.valueOf((char) (round + 'A')).repeat(CHARACTERS[round]));
        return TEXT;
    }

    private static void distributionCharacterAndNumbers(final StringBuffer TEXT, final byte[] CHARACTERS, final StringBuffer NUMBERS) {
        for (final char CHARACTER : TEXT.toString().toCharArray())
            if (CHARACTER >= 'A' && CHARACTER <= 'Z')
                CHARACTERS[CHARACTER - 'A']++;
            else
                NUMBERS.append(CHARACTER);
    }
}