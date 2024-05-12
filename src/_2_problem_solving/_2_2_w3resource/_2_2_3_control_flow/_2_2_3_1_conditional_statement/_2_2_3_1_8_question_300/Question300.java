package _2_problem_solving._2_2_w3resource._2_2_3_control_flow._2_2_3_1_conditional_statement._2_2_3_1_8_question_300;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program that requires the user to enter a single character from the alphabet. Print Vowel or Consonant, depending on user input. If the user input is not a letter (between a and z or A and Z), or is a string of length > 1, print an error message.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Input an alphabet: p</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>Input letter is consonant</h2>
 */

public class Question300 {
    public static void main(final String[] ARGS) {
        final char LETTER = 'p';
        System.out.printf("Input an alphabet: %c\n", LETTER);
        System.out.printf("Input letter is %s", getLetterStatus(LETTER));
    }

    private static String getLetterStatus(final char LETTER) {
        if (LETTER == 'A' || LETTER == 'a' ||
                LETTER == 'E' || LETTER == 'e' ||
                LETTER == 'I' || LETTER == 'i' ||
                LETTER == 'O' || LETTER == 'o' ||
                LETTER == 'U' || LETTER == 'u')
            return "vowels";
        else
            return "consonant";
    }
}