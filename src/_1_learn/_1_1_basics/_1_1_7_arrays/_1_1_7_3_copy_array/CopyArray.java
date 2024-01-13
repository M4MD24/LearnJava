package _1_learn._1_1_basics._1_1_7_arrays._1_1_7_3_copy_array;

public class CopyArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        int[] positiveNumbers = numbers; // Copying Arrays

        for (int item : positiveNumbers) System.out.println(item);
    }
}
