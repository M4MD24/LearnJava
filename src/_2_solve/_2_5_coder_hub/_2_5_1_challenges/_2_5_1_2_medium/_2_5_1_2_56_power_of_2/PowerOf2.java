package _2_solve._2_5_coder_hub._2_5_1_challenges._2_5_1_2_medium._2_5_1_2_56_power_of_2;

public class PowerOf2 {
    public static void main(final String[] ARGUMENTS) {
        System.out.println(
                powerof2(8)
        );
        System.out.println(
                powerof2(16)
        );
        System.out.println(
                powerof2(3)
        );
        System.out.println(
                powerof2(64)
        );
    }

    public static String powerof2(final int NUMBER) {
        return NUMBER + " is " + (
                ((NUMBER > 0) && ((NUMBER & (NUMBER - 1)) == 0))
                ? ""
                : "not a "
        ) + "power of 2";
    }
}