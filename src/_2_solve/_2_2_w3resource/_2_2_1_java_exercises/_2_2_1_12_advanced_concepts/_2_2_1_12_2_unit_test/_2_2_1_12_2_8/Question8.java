package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_12_advanced_concepts._2_2_1_12_2_unit_test._2_2_1_12_2_8;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to explore strategies for testing private methods in a class.</h2>
 */

public class Question8 {
    public static void main(final String[] ARGUMENTS) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        final Calculator CALCULATOR = new Calculator();
        final Method ADDITION = Calculator.class.getDeclaredMethod(
                "addition",
                double.class,
                double.class
        );
        ADDITION.setAccessible(true);
        System.out.print(ADDITION.invoke(CALCULATOR, 5, 5));
    }
}