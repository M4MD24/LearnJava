package _2_solve._2_6_leet_code._2_6_1_problem_set._2_6_1_2_medium._2_6_1_2_380_insert_delete_get_random_o1;

import java.util.*;

/**
 * <h1>Problem:</h1>
 * <h2>
 * Implement the RandomizedSet class:
 * <br/>
 * RandomizedSet() Initializes the RandomizedSet object.
 * <br/>
 * bool insert(int val) Inserts an item val into the set if not present. Returns true if the item was not present, false otherwise.
 * <br/>
 * bool remove(int val) Removes an item val from the set if present. Returns true if the item was present, false otherwise.
 * <br/>
 * int getRandom() Returns a random element from the current set of elements (it's guaranteed that at least one element exists when this method is called). Each element must have the same probability of being returned.
 * <br/>
 * You must implement the functions of the class such that each function works in average O(1) time complexity.
 * </h2>
 */

public class InsertDeleteGetRandomO1 {
    public static void main(final String[] PARAMETERS) {
        final InsertDeleteGetRandomO1 INSERT_DELETE_GET_RANDOM_O1 = new InsertDeleteGetRandomO1();
        INSERT_DELETE_GET_RANDOM_O1.insert(1);
        INSERT_DELETE_GET_RANDOM_O1.insert(2);
        System.out.println(INSERT_DELETE_GET_RANDOM_O1.getRandom());
        INSERT_DELETE_GET_RANDOM_O1.remove(1);
        System.out.print(INSERT_DELETE_GET_RANDOM_O1.getRandom());
    }

    private final Map<Integer, Integer> NUMBERS_AS_MAP = new HashMap<>();
    private final Stack<Integer> NUMBERS = new Stack<>();
    private final Random RANDOM = new Random();

    public boolean insert(final int ELEMENT) {
        if (NUMBERS_AS_MAP.containsKey(ELEMENT))
            return false;
        else {
            NUMBERS.push(ELEMENT);
            NUMBERS_AS_MAP.put(
                    ELEMENT,
                    NUMBERS.size() - 1
            );
            return true;
        }
    }

    public boolean remove(final int ELEMENT) {
        if (!NUMBERS_AS_MAP.containsKey(ELEMENT))
            return false;
        else {
            final int LAST_ELEMENT = NUMBERS.getLast();
            final int INDEX_OF_ELEMENT = NUMBERS_AS_MAP.get(ELEMENT);
            NUMBERS.set(
                    INDEX_OF_ELEMENT,
                    LAST_ELEMENT
            );
            NUMBERS_AS_MAP.put(
                    LAST_ELEMENT,
                    INDEX_OF_ELEMENT
            );
            NUMBERS.pop();
            NUMBERS_AS_MAP.remove(ELEMENT);
            return true;
        }
    }

    public int getRandom() {
        return NUMBERS.get(RANDOM.nextInt(NUMBERS.size()));
    }
}