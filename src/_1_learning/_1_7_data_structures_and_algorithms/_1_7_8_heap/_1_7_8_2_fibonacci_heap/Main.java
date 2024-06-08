package _1_learning._1_7_data_structures_and_algorithms._1_7_8_heap._1_7_8_2_fibonacci_heap;

public class Main {
    private static final FibonacciHeap ELEMENTS = new FibonacciHeap();

    public static void main(final String[] ARGS) {
        System.out.print("After add elements:");
        addElements();
        ELEMENTS.displayElements();

        System.out.println("\nGet size?");
        System.out.println("= " + ELEMENTS.getSize());

        System.out.println("\nAfter delete element:");
        ELEMENTS.deleteElements(28);
        ELEMENTS.deleteElements(63);
        ELEMENTS.displayElements();

        System.out.println("\nAfter clear");
        ELEMENTS.clear();
        ELEMENTS.displayElements();

        System.out.println("\nIs empty?");
        System.out.print(ELEMENTS.isEmpty());
    }

    private static void addElements() {
        ELEMENTS.insertElements(6);
        ELEMENTS.insertElements(63);
        ELEMENTS.insertElements(14);
        ELEMENTS.insertElements(28);
        ELEMENTS.insertElements(24);
    }
}