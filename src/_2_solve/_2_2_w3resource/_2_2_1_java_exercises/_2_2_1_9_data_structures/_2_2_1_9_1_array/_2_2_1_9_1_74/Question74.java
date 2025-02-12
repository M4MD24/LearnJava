package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_9_data_structures._2_2_1_9_1_array._2_2_1_9_1_74;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to find all triplets equal to a given sum in an unsorted array of integers.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Numbers = {1, 6, 3, 0, 8, 4, 1, 7}</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Triplets of sum 7
 * <br/>
 * (0 1 6)
 * <br/>
 * (0 3 4)
 * </h2>
 */

public class Question74 {
    public static void main(final String[] ARGUMENTS) {
        final int[] NUMBERS = {1, 6, 3, 0, 8, 4, 1, 7};
        final int TARGET_SUM = 7;
        printTestOfPrintAllTripletsEqualsTargetSum(NUMBERS, TARGET_SUM);
    }

    private static void printTestOfPrintAllTripletsEqualsTargetSum(final int[] NUMBERS, final int TARGET_SUM) {
        printAllTripletsEqualsTargetSum(NUMBERS, TARGET_SUM);
    }

    private static void printAllTripletsEqualsTargetSum(final int[] NUMBERS, final int TARGET_SUM) {
        final Set<String> SEEN_TRIPLETS = new HashSet<>();
        IntStream.range(
                0,
                NUMBERS.length - 2
        ).forEach(firstIndex ->
                IntStream.range(
                        firstIndex + 1,
                        NUMBERS.length - 1
                ).forEach(secondIndex ->
                        IntStream.range(
                                secondIndex + 1,
                                NUMBERS.length
                        ).forEach(thirdIndex -> {
                            if (NUMBERS[firstIndex] + NUMBERS[secondIndex] + NUMBERS[thirdIndex] == TARGET_SUM) {
                                final int[] TRIPLET = {NUMBERS[firstIndex], NUMBERS[secondIndex], NUMBERS[thirdIndex]};
                                Arrays.sort(TRIPLET);
                                final String STRING_TRIPLET = Arrays.toString(TRIPLET);
                                if (!SEEN_TRIPLETS.contains(STRING_TRIPLET)) {
                                    SEEN_TRIPLETS.add(STRING_TRIPLET);
                                    System.out.printf(
                                            "(%d %d %d)%n",
                                            TRIPLET[0],
                                            TRIPLET[1],
                                            TRIPLET[2]
                                    );
                                }
                            }
                        })
                )
        );
    }
}