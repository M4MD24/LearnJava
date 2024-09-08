package _1_learning._1_1_basics._1_1_8_flow_control._1_8_3_loops._1_8_3_3_for_each;

public class ForEach {
    public static void main(final String[] PARAMETERS) {
        int[] intArrayVariable = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        int sum = 0;

        for (int number : intArrayVariable) sum += number;

        System.out.println("Sum = " + sum);
    }
}