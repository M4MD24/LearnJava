package _1_learning._1_5_data_structures._1_5_35_dictionary;

import java.util.Dictionary;
import java.util.Hashtable;

public class DictionaryExample {
    private static final Dictionary<Integer, String> DAYS_NAMES = new Hashtable<>();

    public static void main(final String[] ARGS) {
        afterInsertElements();
        getSize();
        getElement();
        isEmpty();
        afterRemoveElement();
    }

    private static void afterRemoveElement() {
        System.out.println("\nRemoved element: " + DAYS_NAMES.remove(7));
        System.out.println("After remove element: " + DAYS_NAMES);
    }

    private static void isEmpty() {
        System.out.println("\nIs Empty? " + DAYS_NAMES.isEmpty());
    }

    private static void getElement() {
        System.out.println("\nGet Element: " + DAYS_NAMES.get(7));
    }

    private static void getSize() {
        System.out.println("\nGet Size: " + DAYS_NAMES.size());
    }

    private static void afterInsertElements() {
        System.out.print("After insert elements: ");
        DAYS_NAMES.put(1, "Saturday");
        DAYS_NAMES.put(2, "Sunday");
        DAYS_NAMES.put(3, "Monday");
        DAYS_NAMES.put(4, "Tuesday");
        DAYS_NAMES.put(5, "Wednesday");
        DAYS_NAMES.put(6, "Thursday");
        DAYS_NAMES.put(7, "Friday");
        System.out.println(DAYS_NAMES);
    }
}