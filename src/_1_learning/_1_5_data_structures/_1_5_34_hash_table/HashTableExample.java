package _1_learning._1_5_data_structures._1_5_34_hash_table;

import java.util.Hashtable;

public class HashTableExample {
    static final Hashtable<Integer, String> HASHTABLE = new Hashtable<>(10);

    public static void main(final String[] ARGS) {
        putTest();
        showAllTest();
    }

    private static void putTest() {
        System.out.println("■ put() Test:");
        HASHTABLE.put(111, "Black");
        HASHTABLE.put(123, "DeepSkyBlue");
        HASHTABLE.put(321, "Gold");
        HASHTABLE.put(555, "LimeGreen");
        HASHTABLE.put(777, "Burgundy");
        displayAll();
    }

    private static void showAllTest() {
        System.out.println("■ showAll() Test:");
        System.out.println(HASHTABLE);
        displayAll();
    }

    private static void displayAll() {
        for (Integer key : HASHTABLE.keySet()) System.out.println(key.hashCode() % 10 + " \t" + key + "\t\t" + HASHTABLE.get(key));
        System.out.println();
        System.out.println();
    }
}