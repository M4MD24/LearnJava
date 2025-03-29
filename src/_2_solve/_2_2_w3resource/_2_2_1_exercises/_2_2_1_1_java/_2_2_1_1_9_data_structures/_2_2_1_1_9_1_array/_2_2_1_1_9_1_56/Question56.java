package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_9_data_structures._2_2_1_1_9_1_array._2_2_1_1_9_1_56;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Write a Java program to sort a binary array in linear time.
 * <br/>
 * From Wikipedia,
 * <br/>
 * Linear time: An algorithm is said to take linear time, or O(n) time, if its time complexity is O(n). Informally, this means that the running time increases at most linearly with the size of the input. More precisely, this means that there is a constant c such that the running time is at most cn for every input of size n. For example, a procedure that adds up all elements of a list requires time proportional to the length of the list, if the adding time is constant, or, at least, bounded by a constant.
 * <br/>
 * Linear time is the best possible time complexity in situations where the algorithm has to sequentially read its entire input. Therefore, much research has been invested into discovering algorithms exhibiting linear time or, at least, nearly linear time. This research includes both software and hardware methods. There are several hardware technologies which exploit parallelism to provide this. An example is content-addressable memory. This concept of linear time is used in string matching algorithms such as the Boyer–Moore algorithm and Ukkonen's algorithm.
 * </h2>
 * <br/>
 * <h1>Input Data:</h1>
 * <h2>numbers = {0, 1, 1, 0, 1, 1, 0, 1, 0, 0}</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>After sorting: [0, 0, 0, 0, 0, 1, 1, 1, 1, 1]</h2>
 */

public class Question56 {
    public static void main(final String[] ARGUMENTS) {
        final int[] NUMBERS = {0, 1, 1, 0, 1, 1, 0, 1, 0, 0};
        System.out.println(Arrays.toString(NUMBERS));
        System.out.print(Arrays.toString(getArrangeZerosToLeftSideAndOnesToRightSide(NUMBERS)));
    }

// >
    /*private static int[] getArrangeZerosToLeftSideAndOnesToRightSide(final int[] NUMBERS) {
        for (int index = 0, zeroPosition = 0; index < NUMBERS.length; index++)
            if (NUMBERS[index] == 0) {
                NUMBERS[zeroPosition] += NUMBERS[index];
                NUMBERS[index] = NUMBERS[zeroPosition] - NUMBERS[index];
                NUMBERS[zeroPosition++] -= NUMBERS[index];
            }
        return NUMBERS;
    }*/

    private static int[] getArrangeZerosToLeftSideAndOnesToRightSide(final int[] NUMBERS) {
        int index = 0,
                zeroPosition = 0;
        while (index < NUMBERS.length) {
            if (NUMBERS[index] == 0) {
                NUMBERS[index] = 1;
                NUMBERS[zeroPosition++] = 0;
            }
            index++;
        }
        return NUMBERS;
    }
}