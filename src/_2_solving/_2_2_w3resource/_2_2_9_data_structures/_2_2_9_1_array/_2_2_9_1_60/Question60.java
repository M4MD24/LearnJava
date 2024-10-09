package _2_solving._2_2_w3resource._2_2_9_data_structures._2_2_9_1_array._2_2_9_1_60;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to shuffle a given array of integers.</h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>Numbers = [1, 2, 3, 4, 5, 6]</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>Shuffle Array: [4, 2, 6, 5, 1, 3]</h2>
 */

public class Question60 {
    public static void main(final String[] PARAMETERS) {
        final Integer[] NUMBERS = {1, 2, 3, 4, 5, 6};
        System.out.println("Original Numbers" + Arrays.toString(NUMBERS));
        System.out.print("Shuffle Numbers: " + Arrays.toString(getShuffleNumbers(NUMBERS)));
    }

    private static Integer[] getShuffleNumbers(final Integer[] NUMBERS) {
        final List<Integer> NUMBER_LIST = Arrays.asList(NUMBERS);
        Collections.shuffle(NUMBER_LIST);
        return NUMBER_LIST.toArray(new Integer[0]);
    }
}