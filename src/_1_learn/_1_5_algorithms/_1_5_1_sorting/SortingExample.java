package _1_learn._1_5_algorithms._1_5_1_sorting;

import java.util.ArrayList;
import java.util.Collections;

public class SortingExample {
    public static void main(String[] args) {
        sorting();
    }

    private static void sorting() {
        ArrayList<String> numbers = new ArrayList<>(10);

//        Before
        numbers.add("2");
        numbers.add("3");
        numbers.add("5");
        numbers.add("1");
        numbers.add("4");
        System.out.println("Before Sorting: " + numbers);

//        After
        Collections.sort(numbers);
        System.out.println("After Sorting : " + numbers);
    }
}