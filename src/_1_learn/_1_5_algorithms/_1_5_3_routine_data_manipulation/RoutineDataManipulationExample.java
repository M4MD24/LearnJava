package _1_learn._1_5_algorithms._1_5_3_routine_data_manipulation;

import java.util.ArrayList;
import java.util.Collections;

public class RoutineDataManipulationExample {
    public static void main(String[] args) {
        reversing();
        filling();
        coping();
        swapping();
        addingAll();
    }

    private static void reversing() {
        ArrayList<String> numbers = new ArrayList<>();

//        Before
        numbers.add("3");
        numbers.add("1");
        numbers.add("4");
        numbers.add("2");
        System.out.println("Before Reversing: " + numbers);

//        After
        Collections.reverse(numbers);
        System.out.println("After Reversing : " + numbers + "\n");
    }

    private static void filling() {
        ArrayList<String> numbers = new ArrayList<>();

//        Before
        numbers.add("1");
        numbers.add("3");
        numbers.add("2");
        numbers.add("4");
        System.out.println("Before Filling  : " + numbers);

//        After
        Collections.fill(numbers, "5");
        System.out.println("After Filling   : " + numbers + "\n");
    }

    private static void coping() {
        ArrayList<String> numbers = new ArrayList<>();

//        Before
        numbers.add("1");
        numbers.add("3");
        numbers.add("2");
        numbers.add("4");
        System.out.println("Before Coping   : " + numbers);

        ArrayList<String> additionalNumbers = new ArrayList<>();
        additionalNumbers.add("5");
        additionalNumbers.add("8");
        additionalNumbers.add("7");
        additionalNumbers.add("6");

//        After
        Collections.copy(numbers, additionalNumbers);
        System.out.println("After Coping    : " + numbers + "\n");
    }

    private static void swapping() {
        ArrayList<String> numbers = new ArrayList<>();

//        Before
        numbers.add("1");
        numbers.add("2");
        numbers.add("3");
        numbers.add("4");
        System.out.println("Before Swapping : " + numbers);

//        After
        Collections.swap(numbers, 0, 2);
        System.out.println("After Swapping  : " + numbers + "\n");
    }

    private static void addingAll() {
        ArrayList<String> numbers = new ArrayList<>();

//        Before
        numbers.add("1");
        numbers.add("3");
        numbers.add("2");
        numbers.add("4");
        System.out.println("Before AddingAll: " + numbers);

//        After
        Collections.addAll(numbers, "6", "5", "8", "7");
        System.out.println("After AddingAll : " + numbers);
    }
}