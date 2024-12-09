package _2_solve._2_7_hacker_rank._2_7_1_java._2_7_1_27_can_you_access;

import java.util.Scanner;

/**
 * @see _2_solve._2_7_hacker_rank._2_7_1_java._2_7_1_27_can_you_access.files <h2>Question</h2>
 */

public class CanYouAccess {
    public static void main(final String[] PARAMETERS) throws Exception {
        final int NUMBER = new Scanner(System.in).nextInt();
        System.out.println(NUMBER + (new Inner.Private().powerof2(NUMBER) ? " is power of 2" : " is not a power of 2"));
        System.out.println("An instance of class: Solution.Inner.Private has been created");
    }

    static class Inner {
        static class Private {
            boolean powerof2(final int NUMBER) {
                return (NUMBER > 0) && ((NUMBER & (NUMBER - 1)) == 0);
            }
        }
    }
}