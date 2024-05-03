package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_3_moethods._2_2_1_3_23_question_272;

/**
 * <h1>Question:</h1>
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
public class Question272 {
    public static void main(final String[] ARGS) {
        final String TEXT = "AIEEE";
        System.out.println(STR."Input a text: \{TEXT}");
        System.out.println("Check all the characters of the said text are vowels or not!");
        System.out.println(TEXT.matches("[aeiouAEIOU]+"));
    }
}