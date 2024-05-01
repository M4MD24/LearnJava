package _1_learning._1_1_basics._1_1_5_operators._1_1_5_3_relational_operators;

public class RelationalOperators {
    public static void main(final String[] ARGS) {
        /* √ Similar Concepts
         * Relational Operators = Comparison Operators */

        /* Relational Operators Types! */
        /* ( == ) Equal to
         * ( != ) Not equal to
         * ( > ) Greater than
         * ( < ) Less than
         * ( >= ) Greater than or equal to
         * ( <= ) Less than or equal to
         * */

        int number1 = 3;
        float number2 = 3.5F;

        boolean equalTo = number1 == number2; // Equal to = (false)
        System.out.println("Equal to = " + equalTo);

        boolean notEqualTo = number1 != number2; // Not equal to = (true)
        System.out.println("Not equal to = " + notEqualTo);

        boolean greaterThan = number1 > number2; // Greater than = (false)
        System.out.println("Greater than = " + greaterThan);

        boolean lessThan = number1 < number2; // Less than = (true)
        System.out.println("Less than = " + lessThan);

        boolean greaterThanOrEqualTo = number1 >= number2; // Greater than or equal to = (false)
        System.out.println("Greater than or equal to = " + greaterThanOrEqualTo);

        boolean lessThanOrEqualTo = number1 <= number2; // Less than or equal to = (true)
        System.out.println("Less than or equal to = " + lessThanOrEqualTo);
    }
}