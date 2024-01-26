package _1_learning._1_5_algorithms._1_5_4_searching;

import java.util.ArrayList;
import java.util.Collections;

public class SearchingExample {
    public static void main(String[] args) {
        searching();
    }

    private static void searching() {
        ArrayList<Integer> numbers = new ArrayList<>();

//        Before
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        System.out.println("Before Searching: " + numbers);

//        After
        int position = Collections.binarySearch(numbers, 5);
        System.out.println("After Searching : " + position);
    }
}