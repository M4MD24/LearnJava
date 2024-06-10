package _2_problem_solving._2_2_w3resource._2_2_1_basics._2_2_1_3_methods._2_2_1_3_11;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java method to check whether a string is a valid password.</h2>
 * <br/>
 * <h1>Note:</h1>
 * <h2>Password rules:</h2>
 * <ul>
 *     <li>A password must have at least eight characters.</li>
 *     <li>A password consists of only letters and digits.</li>
 *     <li>A password must contain at least two digits.</li>
 * </ul>
 * <br/>
 * <h1>Excepted Output:</h1>
 * <h2>
 * 1. A password must have at least eight characters.
 * <br/>
 * 2. A password consists of only letters and digits.
 * <br/>
 * 3. A password must contain at least two digits
 * <br/>
 * Input a password (You are agreeing to the above Terms and Conditions.): abcd1234
 * <br/>
 * Password is valid: abcd1234
 * </h2>
 */
public class Question11 {
    public static void main(final String[] ARGS) {
        System.out.println("1. A password must have at least eight characters.");
        System.out.println("2. A password consists of only letters and digits.");
        System.out.println("3. A password must contain at least two digits");
        final String PASSWORD = "abcd1234";
        System.out.printf("Input a password (You are agreeing to the above Terms and Conditions.):\n%s\n", PASSWORD);
        printCheckPassword(PASSWORD);
    }

    private static void printCheckPassword(final String PASSWORD) {
        if (PASSWORD.length() < 8 ||
                !PASSWORD.matches("[a-zA-Z0-9]+") ||
                (PASSWORD.replaceAll("\\D", "").length() < 2)) {
            System.out.println("Password isn't valid\n");
            Question11.main(new String[]{});
        } else
            System.out.printf("Password is valid: %s", PASSWORD);
    }
}