package _2_solve._2_2_w3resource._2_2_3_control_flow._2_2_3_1_conditional_statement._2_2_3_1_26;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to display the following character rhombus structure.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Input the target number: 7</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 */
/*
 *       A
 *      ABA
 *     ABCBA
 *    ABCDCBA
 *   ABCDEDCBA
 *  ABCDEFEDCBA
 * ABCDEFGFEDCBA
 *  ABCDEFEDCBA
 *   ABCDEDCBA
 *    ABCDCBA
 *     ABCBA
 *      ABA
 *       A
 * */
public class Question26 {
    private static final int TARGET_NUMBER = 7;
    private static int countOfSpaces = TARGET_NUMBER - 1;
    private static char currentCharacter;

    public static void main(final String[] PARAMETERS) {
        System.out.printf("Input the target number: %d\n", TARGET_NUMBER);
        printCharacterRhombus();
    }

    private static void printCharacterRhombus() {
        printTheUpHalfOfRhombus();
        countOfSpaces = 1;
        printTheDownHalfOfRhombus();
    }

    private static void printTheDownHalfOfRhombus() {
        for (int round = TARGET_NUMBER - 1; round > 0; round--) {
            currentCharacter = 'A';
            printSpaces();
            for (int counter = 0; counter < round; counter++) {
                System.out.print(currentCharacter);
                if (currentCharacter < (char) (round - 1 + 'A'))
                    currentCharacter++;
            }
            currentCharacter--;
            for (int counter = round - 2; counter >= 0; counter--) {
                System.out.print(currentCharacter);
                if (currentCharacter > 'A')
                    currentCharacter--;
            }
            if (round > 1) {
                countOfSpaces++;
                System.out.println();
            }
        }
    }

    private static void printSpaces() {
        System.out.print(" ".repeat(countOfSpaces));
    }

    private static void printTheUpHalfOfRhombus() {
        for (int round = 0; round < TARGET_NUMBER; round++) {
            currentCharacter = 'A';
            printSpaces();
            for (int counter = 0; counter <= round; counter++) {
                System.out.print(currentCharacter);
                if (currentCharacter < (char) (round + 'A'))
                    currentCharacter++;
            }
            currentCharacter--;
            for (int counter = round - 1; counter >= 0; counter--) {
                System.out.print(currentCharacter);
                if (currentCharacter > 'A')
                    currentCharacter--;
            }
            System.out.println();
            countOfSpaces--;
        }
    }
}