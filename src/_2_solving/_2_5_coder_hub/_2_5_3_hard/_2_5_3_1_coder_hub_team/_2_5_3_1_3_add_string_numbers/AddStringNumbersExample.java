package _2_solving._2_5_coder_hub._2_5_3_hard._2_5_3_1_coder_hub_team._2_5_3_1_3_add_string_numbers;

public class AddStringNumbersExample {
    public static void main(final String[] PARAMETERS) {
        System.out.print(addStringNumbersExample("45", "55"));
    }

    public static String addStringNumbersExample(final String FIRST_NUMBER, final String SECOND_NUMBERS) {
        try {
            return String.valueOf(Integer.parseInt(FIRST_NUMBER) + Integer.parseInt(SECOND_NUMBERS));
        } catch (final Exception EXCEPTION) {
            return "-1";
        }
    }
}