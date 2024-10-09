package _2_solving._2_2_w3resource._2_2_1_basics._2_2_1_3_methods._2_2_1_3_23;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java method that checks whether all the characters in a given string are vowels (a, e,i,o,u) or not. Return true if each character in the string is a vowel, otherwise return false.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Input a text: AIEEE
 * <br/>
 * Check all the characters of the said text are vowels or not!
 * <br/>
 * true
 * </h2>
 */
public class Question23 {
    public static void main(final String[] PARAMETERS) {
        final String TEXT = "AIEEE";
        System.out.printf("Input a text: %s\n", TEXT);
        System.out.println("Check all the characters of the said text are vowels or not!");
        System.out.println(TEXT.matches("[aeiouAEIOU]+"));
    }
}