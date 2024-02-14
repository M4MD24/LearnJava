package _1_learning._1_6_algorithms._1_6_6_finding_extreme_values;

import java.util.ArrayList;
import java.util.Collections;

public class FindingExtremeValuesExample {
    public static void main(String[] args) {
        minimum();
        maximum();
    }

    private static void minimum() {
        ArrayList<String> numbers = new ArrayList<>();

//        Before
        numbers.add("1");
        numbers.add("2");
        numbers.add("3");
        numbers.add("4");
        System.out.println("Before Minimum: " + numbers);

//        After
        System.out.println("After Minimum : " + Collections.min(numbers) + "\n");
    }

    private static void maximum() {
        ArrayList<String> numbers = new ArrayList<>();

//        Before
        numbers.add("1");
        numbers.add("2");
        numbers.add("3");
        numbers.add("4");
        System.out.println("Before Maximum: " + numbers);

//        After
        System.out.println("After Maximum : " + Collections.max(numbers));
    }
}