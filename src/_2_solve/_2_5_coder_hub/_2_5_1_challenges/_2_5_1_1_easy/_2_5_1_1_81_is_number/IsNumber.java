package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_1_easy._2_5_1_1_81_is_number;

public class IsNumber {
    public static void main(final String[] ARGUMENTS) {
        System.out.println(isNumber("0"));
        System.out.println(isNumber("-123.456e789"));
        System.out.println(isNumber("53.5e93"));
        System.out.print(isNumber("abc"));
    }

    private static boolean isNumber(final String TEXT) {
        try {
            Double.parseDouble(TEXT);
            return true;
        } catch (Exception exception) {
            return false;
        }
    }
}