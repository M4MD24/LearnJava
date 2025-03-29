package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_12_advanced_concepts._2_2_1_1_12_1_generic_methods._2_2_1_1_12_1_6;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create a generic method that takes a list of any type and a predicate. It returns an array list containing only elements that satisfy the predicate.</h2>
 */

public class Question6 {
    public static void main(final String[] ARGUMENTS) {
        final List<Integer> NUMBERS = List.of(1, 2, 3, 4, 5, 6);
        System.out.println(getListAfterFiltering(NUMBERS, number -> number % 2 == 0));

        final List<String> FRUITS = List.of("Apple 🍎", "Orange 🍊", "Banana 🍌", "Strawberry 🍓", "Mango 🥭");
        System.out.print(getListAfterFiltering(FRUITS, name -> name.startsWith("A")));
    }

    private static <Type> List<Type> getListAfterFiltering(final List<Type> ELEMENTS, final Predicate<Type> predicate) {
        return new ArrayList<>() {{
            for (final Type ELEMENT : ELEMENTS)
                if (predicate.test(ELEMENT))
                    add(ELEMENT);
        }};
    }
}