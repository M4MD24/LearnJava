package _1_learning._1_5_algorithms._1_5_2_shuffling;

import java.util.ArrayList;
import java.util.Collections;

public class ShufflingExample {
    public static void main(String[] args) {
        shuffling();
    }

    private static void shuffling() {
        ArrayList<String> numbers = new ArrayList<>();
        numbers.add("2");
        numbers.add("1");
        numbers.add("3");

//        Before
        System.out.println("Before Shuffling: " + numbers);

//        After
        Collections.shuffle(numbers);
        System.out.println("After Shuffling : " + numbers);
    }
}