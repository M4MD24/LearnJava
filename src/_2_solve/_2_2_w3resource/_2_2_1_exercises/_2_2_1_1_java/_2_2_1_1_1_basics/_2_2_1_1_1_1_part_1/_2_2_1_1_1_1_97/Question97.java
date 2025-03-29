package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_1_basics._2_2_1_1_1_1_part_1._2_2_1_1_1_1_97;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to check if an array of integers contains a specified number next to each other or two same numbers separated by one element.</h2>
 */

public class Question97 {
    public static void main(final String[] ARGUMENTS) {
        int[] array = {1, 10, 5, 10, 50, 66};
        boolean status = false;
        for (int index = 0; index < array.length; index++) {
            if (index + 1 < array.length && array[index] == array[index + 1] ||
                    index + 2 < array.length && array[index] == array[index + 2]) {
                status = true;
                break;
            }
        }
        System.out.print(status);
    }
}