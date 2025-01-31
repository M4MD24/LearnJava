package _2_solve._2_2_w3resource._2_2_1_basics._2_2_1_1_part_1._2_2_1_1_93;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to test if an array of integers contains an element 10 next to 10 or an element 20 next to 20, but not both.</h2>
 */

public class Question93 {
    public static void main(final String[] ARGUMENTS) {
        int[] array = {10, 10, 22, 33, 10, 20};
        boolean status = false;
        for (int index1 = 0, index2 = 1; index2 < array.length; index1++, index2++)
            if (array[index1] == array[index2]) status = !status;
        System.out.print(status);
    }
}