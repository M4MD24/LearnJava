package _2_solving._2_3_codeforces._2_3_1_assiut_sheet._2_3_1_7_sheet_4._2_3_1_7_y_minimum_cost_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * <h1>Y. Minimum Cost String</h1>
 * <h2>
 * time limit per test: 1 second
 * <br/>
 * memory limit per test: 256 megabytes
 * <br/>
 * input: standard input
 * <br/>
 * output: standard output
 * </h2>
 * <br/>
 * <h1>Question:</h1>
 * <h2>Given a string S and 26 numbers that represents the cost of each letter. Print the minimum cost that can be achieved and the string S after replacing every '?' symbol in the string.</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>
 * The cost of the string will be the sum of the absolute difference of every two consecutive letters costs in the string.
 * <br/>
 * For example if cost of 'a' = 2 and cost of 'x' = 5 and cost of 'c' = 1, if the string was equal "axc" then the cost of that string will = |cost('a')-cost('x')| + |cost('x')-cost('c')| = |2-5| + |5-1| = 7.
 * <br/>
 * if there are more than one string with minimum cost print the smallest lexicographical one.
 * </h2>
 * <br/>
 * <h1>Input:</h1>
 * <h2>
 * abc??def?gh
 * <br/>
 * 4 9 5 9 6 1 0 3 7 2 5 9 6 1 3 2 3 2 9 1 1 0 1 8 8 4
 * </h2>
 * <h1>Output:</h1>
 * <h2>
 * 25
 * <br/>
 * abcbbdeffgh
 * </h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>
 * Example 1: we can get string "abcdddeffgh" with cost 25 too but its not smallest string.
 * <br/>
 * string "abcbbdeffgh" smallest one and smallest cost.
 * </h2>
 */
public class MinimumCostStringExample {
    private static final BufferedReader INPUT = new BufferedReader(new InputStreamReader(System.in));
    private static StringBuffer TEXT;
    private static int LENGTH;
    private static final int[] NUMBERS = new int[26];

    public static void main(final String[] PARAMETERS) throws IOException {
        inputNumbers();
        printMinimumCost();
    }

    private static void printMinimumCost() {
        for (int round = 0; round < LENGTH; round++) {
            int questionMarkCounter = 0;
            if (TEXT.charAt(round) == 63) {
                for (int index = round; index < LENGTH; index++)
                    if (TEXT.charAt(index) == 63) questionMarkCounter++;
                    else break;
                if (questionMarkCounter == LENGTH) {
                    System.out.println(0 + "\n" + "a".repeat(questionMarkCounter));
                    return;
                } else {
                    int minimumCost,
                            numberIndex = 0;
                    if (round == 0) {
                        minimumCost = getCost(getNumberFromCharacter(questionMarkCounter), NUMBERS[0]);
                        for (int index = 1; index < TEXT.charAt(questionMarkCounter) - 97 + 1; index++) {
                            final int CURRENT_COST = getCost(getNumberFromCharacter(questionMarkCounter), NUMBERS[index]);
                            if (CURRENT_COST < minimumCost) {
                                minimumCost = CURRENT_COST;
                                numberIndex = index;
                            }
                        }
                        for (int index = 0; index < questionMarkCounter; index++)
                            setCharacterForText(index, numberIndex);
                        round += questionMarkCounter;
                    } else if (round + questionMarkCounter == LENGTH) {
                        minimumCost = getCost(getNumberFromCharacter(round - 1), NUMBERS[0]);
                        for (int index = 1; index < TEXT.charAt(round - 1) - 97 + 1; index++) {
                            final int CURRENT_COST = getCost(getNumberFromCharacter(round - 1), NUMBERS[index]);
                            if (CURRENT_COST < minimumCost) {
                                minimumCost = CURRENT_COST;
                                numberIndex = index;
                            }
                        }
                        for (int index = round; index < LENGTH; index++)
                            setCharacterForText(index, numberIndex);
                        break;
                    } else {
                        minimumCost = getCost(getNumberFromCharacter(round - 1), NUMBERS[0]) +
                                Math.abs(NUMBERS[0] - getNumberFromCharacter(round + questionMarkCounter));
                        for (int index = 1; index < 26; index++) {
                            final int CURRENT_COST = getCost(getNumberFromCharacter(round - 1), NUMBERS[index]) +
                                    getCost(NUMBERS[index], getNumberFromCharacter(round + questionMarkCounter));
                            if (CURRENT_COST < minimumCost) {
                                minimumCost = CURRENT_COST;
                                numberIndex = index;
                            }
                        }
                        for (int index = round; index < round + questionMarkCounter; index++)
                            setCharacterForText(index, numberIndex);
                        round += questionMarkCounter;
                    }
                }
            }
        }

        long finalCost = 0;
        for (int index = 0; index < LENGTH - 1; index++)
            finalCost += getCost(getNumberFromCharacter(index), getNumberFromCharacter(index + 1));
        System.out.print(finalCost + "\n" + TEXT);
    }

    private static void setCharacterForText(final int INDEX, final int NUMBER_INDEX) {
        TEXT.setCharAt(INDEX, (char) (NUMBER_INDEX + 97));
    }

    private static int getCost(final int FIRST_NUMBER, final int SECOND_NUMBER) {
        return Math.abs(FIRST_NUMBER - SECOND_NUMBER);
    }

    private static int getNumberFromCharacter(final int INDEX) {
        return NUMBERS[TEXT.charAt(INDEX) - 97];
    }

    private static void inputNumbers() throws IOException {
        TEXT = new StringBuffer(INPUT.readLine());
        LENGTH = TEXT.length();
        final String[] COST_STRINGS = INPUT.readLine().split(" ");
        for (int index = 0; index < 26; index++)
            NUMBERS[index] = Integer.parseInt(COST_STRINGS[index]);
    }
}