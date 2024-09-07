package _2_solving._2_2_w3resource._2_2_7_functional_programming._2_2_7_1_lambda_expression._2_2_7_1_22;

import java.util.Arrays;
import java.util.List;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to implement a lambda expression to check if a list of strings are all uppercase or all lowercase or mixedcase.</h2>
 */

public class Question22 {
    public static void main(final String[] PARAMETERS) {
        final List<String> TEXTS = Arrays.asList("orange", "Apple", "mango", "BANANA", "Strawberry", "CHERRY");
        System.out.print(getTextCaseStatus(TEXTS));
    }

    private static String getTextCaseStatus(List<String> TEXTS) {
        final boolean TEXTS_ARE_UPPERCASE = TEXTS.stream().allMatch(TEXT -> TEXT.chars().allMatch(Character::isUpperCase)),
                TEXTS_ARE_LOWERCASE = TEXTS.stream().allMatch(TEXT -> TEXT.chars().allMatch(Character::isUpperCase));
        if (TEXTS_ARE_UPPERCASE)
            return "All texts are uppercase!";
        else if (TEXTS_ARE_LOWERCASE)
            return "All texts are lowercase!";
        else
            return "All texts are mixedcase!";
    }
}