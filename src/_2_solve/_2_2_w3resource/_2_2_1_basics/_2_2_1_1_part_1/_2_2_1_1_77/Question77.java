package _2_solve._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_77;

import java.util.Arrays;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create an array of length 2 from two integer arrays with three elements. The newly created array will contain the first and last elements from the two arrays.</h2>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * Array1: [50, -20, 0]
 * <br/>
 * Array2: [5, -50, 10]
 * <br/>
 * New Array: [50, 10]
 * </h2>
 */

public class Question77 {
    public static void main(final String[] ARGUMENTS) {
        final int[] array1 = {50, -20, 0},
                array2 = {5, -50, 10};

        System.out.println("Array1: " + Arrays.toString(array1));
        System.out.println("Array2: " + Arrays.toString(array2));

        final int[] newArray = {array1[0], array2[array2.length - 1]};
        System.out.println("New Array: " + Arrays.toString(newArray));
    }
}