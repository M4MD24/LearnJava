package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_7_functional_programming._2_2_1_7_1_lambda_expression._2_2_1_7_1_20;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to implement a lambda expression to sort a list of objects based on a specific attribute.</h2>
 */

public class Question20 {
    public static void main(final String[] ARGUMENTS) {
        List<Person> persons = Arrays.asList(
                new Person("Mohamed", 21, Genders.Man),
                new Person("Ahmed", 11, Genders.Man),
                new Person("Mahmoud", 31, Genders.Man)
        );
        System.out.println("Before Sort: " + persons + "\n");
        persons = persons
                .stream()
                .sorted(Comparator.comparing(Person::NAME))
                .toList();
        System.out.print("After Sort: " + persons);
    }
}

record Person(String NAME, int AGE, Genders GENDER) {
    @Override
    public String toString() {
        return String.format(
                "\nName: %s%nAge: %d%nGender: %s%n",
                NAME(),
                AGE(),
                GENDER()
        );
    }
}

enum Genders {
    Man,
    Woman
}