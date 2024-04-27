package _1_learning._1_7_data_structures_and_algorithms._1_7_3_dynamic_array;

public class Main {
    private static final DynamicArray<Integer> DYNAMIC_ARRAY = new DynamicArray<>();

    public static void main(final String[] ARGS) {
        addTest();
        insertTest();
        removeTest();
        searchTest();
        setCapacityTest();
        getCapacityTest();
        isEmpty();
        getSize();
        shrink();
    }

    private static void displayAll() {
        DYNAMIC_ARRAY.showAll();
        System.out.println();
        System.out.println();
    }

    private static void addTest() {
        System.out.println("■ add() Test");
        DYNAMIC_ARRAY.add(1);
        DYNAMIC_ARRAY.add(2);
        DYNAMIC_ARRAY.add(3);
        DYNAMIC_ARRAY.add(4);
        DYNAMIC_ARRAY.add(5);
        displayAll();
    }

    private static void insertTest() {
        System.out.println("■ insert() Test");
        DYNAMIC_ARRAY.insert(1, 6);
        DYNAMIC_ARRAY.insert(2, 0);
        displayAll();
    }

    private static void removeTest() {
        System.out.println("■ remove() Test");
        DYNAMIC_ARRAY.remove();
        DYNAMIC_ARRAY.remove();
        displayAll();
    }

    private static void searchTest() {
        System.out.println("■ search() Test");
        System.out.println("- Done search: " + DYNAMIC_ARRAY.search(6));
        displayAll();
    }

    private static void setCapacityTest() {
        System.out.println("■ setCapacity() Test");
        DYNAMIC_ARRAY.setCapacity(10);
        displayAll();
    }

    private static void getCapacityTest() {
        System.out.println("■ getCapacity() Test");
        System.out.println("- Capacity: " + DYNAMIC_ARRAY.getCapacity());
        displayAll();
    }

    private static void isEmpty() {
        System.out.println("■ isEmpty() Test");
        System.out.println("- Is Empty: " + DYNAMIC_ARRAY.isEmpty());
        displayAll();
    }

    private static void getSize() {
        System.out.println("■ getSize() Test");
        System.out.println("- Size: " + DYNAMIC_ARRAY.getSize());
        displayAll();
    }

    private static void shrink() {
        System.out.println("■ shrink() Test");
        DYNAMIC_ARRAY.shrink();
        displayAll();
    }
}