package _2_problem_solving._2_2_w3resource._2_2_5_object_oriented_programming._2_2_5_7_encapsulation._2_2_5_7_10;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to create a class called Desktop with private instance variables brand, processor, and ramSize. Provide public getter and setter methods to access and modify these variables. Add a method called upgradeRam() that takes an integer value and increases the ramSize by that value.</h2>
 */

public class Question10 {
    public static void main(final String[] ARGS) {
        final Desktop DESKTOP = new Desktop();
        DESKTOP.setBrand("The Brand");
        DESKTOP.setProcessor("The Processor");
        DESKTOP.setRamSize(4);
        DESKTOP.upgradeRam(4);
        System.out.printf("""
                        Brand: %s
                        Processor: %s
                        Ram Size: %d GB""",
                DESKTOP.getBrand(),
                DESKTOP.getProcessor(),
                DESKTOP.getRamSize());
    }
}

class Desktop {
    private String brand,
            processor;
    private int ramSize;

    public String getBrand() {
        return brand;
    }

    public void setBrand(final String BRAND) {
        this.brand = BRAND;
    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(final String PROCESSOR) {
        this.processor = PROCESSOR;
    }

    public int getRamSize() {
        return ramSize;
    }

    public void setRamSize(final int RAM_SIZE) {
        this.ramSize = RAM_SIZE;
    }

    public void upgradeRam(final int RAM_SIZE) {
        this.ramSize += RAM_SIZE;
    }
}