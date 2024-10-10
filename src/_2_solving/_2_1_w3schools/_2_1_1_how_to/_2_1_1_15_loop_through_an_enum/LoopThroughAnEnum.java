package _2_solving._2_1_w3schools._2_1_1_how_to._2_1_1_15_loop_through_an_enum;

public class LoopThroughAnEnum {
    public static void main(final String[] PARAMETERS) {
        printElements();
    }

    private static void printElements() {
        for (final Elements ELEMENT : Elements.values())
            System.out.println(ELEMENT);
    }
}