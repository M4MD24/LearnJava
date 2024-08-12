package _2_problem_solving._2_2_w3resource._2_2_5_object_oriented_programming._2_2_5_3_nested_class._2_2_5_3_1;

/**
 * <h3>Inner Class</h3>
 * <h1>Question:</h1>
 * <h2>Write a Java program to create an outer class called Computer with an inner class Processor. The Processor class should have a method "displayDetails()" that prints the details of the processor (e.g., brand and speed). Create an instance of Processor from the Computer class and call the "displayDetails()" method.</h2>
 */

public class Question1 {
    public static void main(String[] args) {
        final Computer COMPUTER = new Computer();
        COMPUTER.showProcessorDetails("Intel", 3.5F);
    }
}

class Computer {
    class Processor {
        final String BRAND;
        final float SPEED;

        Processor(final String BRAND, final float SPEED) {
            this.BRAND = BRAND;
            this.SPEED = SPEED;
        }

        void displayDetails() {
            System.out.printf("""
                            Brand: %s
                            Speed: %.2f GHz""",
                    BRAND,
                    SPEED);
        }
    }

    void showProcessorDetails(final String BRAND, final float SPEED) {
        final Processor PROCESSOR = new Processor(BRAND, SPEED);
        PROCESSOR.displayDetails();
    }
}