package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_1_easy._2_5_1_1_28_equal_check;

public class EqualCheckExample {
    public static void main(final String[] ARGUMENTS) {
        System.out.println(areEquals(1, 3));
        System.out.println(areEquals(4, 4));
        System.out.println(areEquals(0, 0));
        System.out.print(areEquals(2, 1));
    }

    private static boolean areEquals(final int FIRST_NUMBER, final int SECOND_NUMBER) {
        return FIRST_NUMBER == SECOND_NUMBER;
    }
}