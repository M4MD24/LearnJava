package _2_problem_solving._2_1_w3schools._2_1_1_how_to._2_1_1_3_calculate_sum_of_array_elements;

public class CalculateSumOfArrayElements {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = 0;
        for (int number : array) {
            System.out.println(sum + " + " + number + " + " + (sum + number));
            sum += number;
        }
        System.out.print("Result = " + sum);
    }
}