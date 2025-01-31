package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_3_hard._2_5_1_3_3_add_string_numbers;

public class AddStringNumbersExample {
    public static void main(final String[] ARGUMENTS) {
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