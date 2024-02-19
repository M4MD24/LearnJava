package _1_learning._1_7_data_structures_and_algorithms._1_7_3_stack;

public class Main {
    private static final Stack<Integer> STACK = new Stack<>();

    public static void main(String[] args) {
        System.out.println("■ showProperties()");
        showProperties();

        pushTest();

        setCapacityTest();

        popTest();

        shrinkTest();

        peekTest();

        deleteAllTest();
    }

    private static void showProperties() {
        System.out.println("Capacity: " + STACK.getCapacity());
        System.out.println("Length: " + STACK.size());
        System.out.print("Elements: ");
        STACK.showAll();
        System.out.println("\n");
    }

    private static void pushTest() {
        System.out.println("■ push() Test");
        STACK.push(1);
        showProperties();

        STACK.push(2);
        showProperties();

        STACK.push(3);
        showProperties();
    }

    private static void setCapacityTest() {
        System.out.println("■ setCapacity() Test");
        STACK.setCapacity(10);
        STACK.push(4);
        STACK.push(5);
        STACK.push(6);
        STACK.push(7);
        STACK.push(8);
        showProperties();
    }

    private static void popTest() {
        System.out.println("■ pop() Test");
        STACK.pop();
        STACK.pop();
        STACK.pop();
        showProperties();
    }

    private static void shrinkTest() {
        System.out.println("■ shrink() Test");
        STACK.shrink();
        showProperties();
    }

    private static void peekTest() {
        System.out.println("■ peek() Test");
        System.out.println("Peek: " + STACK.peek());
        showProperties();
    }

    private static void deleteAllTest() {
        System.out.println("■ deleteAll() Test");
        STACK.deleteAll();
        showProperties();
    }
}