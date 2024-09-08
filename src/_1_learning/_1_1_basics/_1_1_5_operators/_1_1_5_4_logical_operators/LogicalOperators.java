package _1_learning._1_1_basics._1_1_5_operators._1_1_5_4_logical_operators;

public class LogicalOperators {
    public static void main(final String[] PARAMETERS) {
        /* Logical Operators Types! */
        /* ( && ) Logical AND
         * ( || ) Logical OR
         * ( ! ) Logical NOT
         * */

//        Logical AND
        boolean logical_AND_T_T = true && true;
        System.out.println("Logical AND T_T = " + logical_AND_T_T);

        boolean logical_AND_T_F = true && false;
        System.out.println("Logical AND T_F = " + logical_AND_T_F);

        boolean logical_AND_F_T = false && true;
        System.out.println("Logical AND F_T = " + logical_AND_F_T);

        boolean logical_AND_F_F = false && false;
        System.out.println("Logical AND F_F = " + logical_AND_F_F + "\n");
        /* AND Table
            ---------------
            | - | - | AND |
            ---------------
            | T | T |  T  |
            | T | F |  F  |
            | F | T |  F  |
            | F | F |  F  |
            ---------------
        */

//        Logical OR
        boolean logical_OR_T_T = true || true;
        System.out.println("Logical OR T_T = " + logical_OR_T_T);

        boolean logical_OR_T_F = true || false;
        System.out.println("Logical OR T_F = " + logical_OR_T_F);

        boolean logical_OR_F_T = false || true;
        System.out.println("Logical OR F_T = " + logical_OR_F_T);

        boolean logical_OR_F_F = false || false;
        System.out.println("Logical OR F_F = " + logical_OR_F_F + "\n");
        /* OR Table
            ---------------
            | - | - |  OR |
            ---------------
            | T | T |  T  |
            | T | F |  T  |
            | F | T |  T  |
            | F | F |  F  |
            ---------------
        */

//        Logical NOT
        boolean logical_NOT_T = !true;
        System.out.println("Logical NOT T = " + logical_NOT_T);

        boolean logical_NOT_F = !false;
        System.out.println("Logical NOT F = " + logical_NOT_F);
        /* ■ NOT Table
            -----------
            | 1 | NOT |
            -----------
            | T |  F  |
            | F |  T  |
            -----------
        */
    }
}