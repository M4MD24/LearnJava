package _2_solving._2_5_coder_hub._2_5_1_challenges._2_5_1_2_medium._2_5_1_2_1_coder_hub_team._2_5_1_2_1_25_string_length_comparison;

public class StringLengthComparisonExample {
    public static void main(final String[] PARAMETERS) {
        System.out.println(getStringLengthComparison(new String[]{"A", "B"}));
        System.out.println(getStringLengthComparison(new String[]{"Khalid", "Sultan", "AlDana", "Johrah", "Ghadah"}));
        System.out.println(getStringLengthComparison(new String[]{"Satr", "CoderHub"}));
        System.out.print(getStringLengthComparison(new String[]{"123", "456", "789"}));
    }

    private static boolean getStringLengthComparison(final String[] STRINGS) {
        return STRINGS.length > 1 &&
                java.util.stream.Stream.of(STRINGS)
                        .map(String::length)
                        .distinct()
                        .count() == 1;
    }
}