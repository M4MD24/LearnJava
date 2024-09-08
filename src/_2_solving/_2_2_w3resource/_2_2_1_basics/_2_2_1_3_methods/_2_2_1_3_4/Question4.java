package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_3_methods._2_2_1_3_4;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java method to count all vowels in a string.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Input the string: w3resource</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>Number of Vowels in the string: 4</h2>
 */

public class Question4 {
    public static void main(final String[] PARAMETERS) {
        final String TEXT = "w3resource";
        System.out.printf("Input the text: %s\n", TEXT);
        System.out.printf("Number of Vowels in the text: %d", getCountOfVowels(TEXT));
    }

    private static int getCountOfVowels(final String TEXT) {
        int countOfVowels = 0;
        for (int index = 0; index < TEXT.length(); index++)
            if (TEXT.charAt(index) == 'a' || TEXT.charAt(index) == 'e' || TEXT.charAt(index) == 'i' || TEXT.charAt(index) == 'o' || TEXT.charAt(index) == 'u')
                countOfVowels++;
        return countOfVowels;
    }
}