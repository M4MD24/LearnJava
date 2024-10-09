package _2_solving._2_2_w3resource._2_2_12_advanced_concepts._2_2_12_2_unit_test._2_2_12_2_10;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program that create tests that verify the interaction between different components or modules in your application.</h2>
 */

public class Question10 {
    public static void main(final String[] PARAMETERS) {
        final String FIRST_USER_NAME = "Mohamed",
                SECOND_USER_NAME = new User("Mohamed").name();
        System.out.print(FIRST_USER_NAME.equals(SECOND_USER_NAME));
    }
}