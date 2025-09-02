package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_2_medium._2_5_1_2_53_convert_to_base_7;

public class ConvertToBase7 {
    public static void main(final String[] ARGUMENTS) {
        System.out.print(
                convertToBase7(
                        100
                )
        );
    }

    private static String convertToBase7(
            final int NUMBER
    ) {
        return Integer.toString(
                NUMBER,
                7
        );
    }
}