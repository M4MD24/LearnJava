package _1_learning._1_7_data_structures_and_algorithms._1_7_3_stack;

public class Main {
    private static final Stack<Integer> STACK = new Stack<>(10);

    public static void main(String[] args) {
        pushElements();
        display();

        System.out.println(STACK.pop() + "\n");
        display();

        System.out.println(STACK.capacity + "\n");

        System.out.println(STACK.peek() + "\n");

        System.out.println(STACK.size() + "\n");

        System.out.println(STACK.isEmpty() + "\n");

        STACK.push(5);
        STACK.push(6);
        STACK.push(7);
        STACK.push(8);
        STACK.push(9);
        STACK.push(10);
        display();

        STACK.push(11);
        System.out.println();
        System.out.println();

        STACK.deleteAll();
        STACK.showAll();
    }

    private static void pushElements() {
        STACK.push(1);
        STACK.push(2);
        STACK.push(3);
        STACK.push(4);
        STACK.push(5);
    }

    private static void display() {
        STACK.showAll();
        System.out.println();
        System.out.println();
    }
}