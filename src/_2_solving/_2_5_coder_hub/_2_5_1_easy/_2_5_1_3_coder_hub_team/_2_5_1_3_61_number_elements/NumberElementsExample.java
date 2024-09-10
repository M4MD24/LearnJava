package _2_solving._2_5_coder_hub._2_5_1_easy._2_5_1_3_coder_hub_team._2_5_1_3_61_number_elements;

public class NumberElementsExample {
    public static void main(final String[] PARAMETERS) {
        System.out.println(numberElements(new int[]{5, 12, 3, 51}));
        System.out.println(numberElements(new int[]{19, 12}));
        System.out.println(numberElements(new int[]{10, 24, 45, 123, 124, 982, 51, 42, 124, 19}));
        System.out.print(numberElements(new int[]{10}));
    }

    private static int numberElements(final int[] NUMBERS) {
        return NUMBERS.length;
    }
}