package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_1_easy._2_6_1_1_796_rotate_string;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.
 * <br/>
 * <br/>
 * A shift on s consists of moving the leftmost character of s to the rightmost position.
 * <br/>
 * <br/>
 * For example, if s = "abcde", then it will be "bcdea" after one shift.
 * </h2>
 */

public class RotateString {
    public static void main(final String[] PARAMETERS) {
        System.out.print(rotateString(
                "abcde",
                "bcdea"
        ));
    }

    private static boolean rotateString(final String SOURCE, final String TARGET) {
        return SOURCE.concat(SOURCE).contains(TARGET) &&
                SOURCE.length() <= TARGET.length();
    }

// >
    /*private static boolean rotateString(final String SOURCE, final String TARGET) {
        return SOURCE.length() == TARGET.length() &&
                (SOURCE + SOURCE).contains(TARGET);
    }*/
}