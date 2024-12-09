package _2_solve._2_7_hacker_rank._2_7_1_java._2_7_1_40_inheritance_2;

/**
 * @see _2_solve._2_7_hacker_rank._2_7_1_java._2_7_1_40_inheritance_2.files <h2>Question</h2>
 */

class Arithmetic {
    public int add(final int FIRST_NUMBER, final int SECOND_NUMBER) {
        return FIRST_NUMBER + SECOND_NUMBER;
    }
}

class Adder extends Arithmetic {
}

public class Inheritance2 {
    public static void main(final String[] PARAMETERS) throws Exception {
        final Adder ADDER = new Adder();
        System.out.println("My superclass is: " + ADDER.getClass().getSuperclass().getSimpleName());
        System.out.print(ADDER.add(20, 22) + " " + ADDER.add(7, 6) + " " + ADDER.add(10, 10));
    }
}