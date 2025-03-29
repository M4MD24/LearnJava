package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_12_advanced_concepts._2_2_1_1_12_2_unit_test._2_2_1_1_12_2_1;

class Calculator {
    protected int add(final int FIRST_NUMBER, final int SECOND_NUMBER) {
        return FIRST_NUMBER + SECOND_NUMBER;
    }

    /**
     * <h1>Problem:</h1>
     * <h2>Write a Java unit test case to assert that a given method returns the expected value.</h2>
     */

    public static class Question1 {
        public static void main(final String[] ARGUMENTS) {
            System.out.print(new Calculator().add(12, 12));
        }
    }
}