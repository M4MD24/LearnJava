package _2_solving._2_5_coder_hub._2_5_1_challenges._2_5_1_2_medium._2_5_1_2_1_coder_hub_team._2_5_1_2_1_28_most_frequent_element;

public class MostFrequentElementExample {
    public static void main(final String[] PARAMETERS) {
        System.out.println(mostFrequentElement(new int[]{13, 2, 1, 2, 10, 2, 1, 1, 2, 2}));
        System.out.println(mostFrequentElement(new int[]{1, 2, 3, 4, 1, 5, -5, -5, -5, -5, -5, 6}));
        System.out.println(mostFrequentElement(new int[]{1, 2, 3, 3, 3, 3}));
        System.out.print(mostFrequentElement(new int[]{0, 5, 6, 2, 1, 5}));
    }

    private static int mostFrequentElement(final int[] NUMBERS) {
        return java.util.Arrays.stream(NUMBERS)
                .boxed()
                .collect(java.util.stream.Collectors.groupingBy(number -> number, java.util.stream.Collectors.counting()))
                .entrySet()
                .stream()
                .max(java.util.Map.Entry.comparingByValue())
                .get()
                .getKey();
    }
}