package _2_solving._2_2_w3resource._2_2_5_object_oriented_programming._2_2_5_7_encapsulation._2_2_5_7_9;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create a class called Smartphone with private instance variables brand, model, and storageCapacity. Provide public getter and setter methods to access and modify these variables. Add a method called increaseStorage() that takes an integer value and increases the storageCapacity by that value.</h2>
 */

public class Question9 {
    public static void main(final String[] PARAMETERS) {
        final SmartPhone BOOK = new SmartPhone();
        BOOK.setBrand("The Brand");
        BOOK.setModel("The Model");
        BOOK.setStorageCapacity(64);
        BOOK.increaseStorage(32);
        System.out.printf("""
                        Brand: %s
                        Model: %s
                        Storage Capacity: %d GB""",
                BOOK.getBrand(),
                BOOK.getModel(),
                BOOK.getStorageCapacity());
    }
}

class SmartPhone {
    private String brand,
            model;
    private int storageCapacity;

    public String getBrand() {
        return brand;
    }

    public void setBrand(final String BRAND) {
        this.brand = BRAND;
    }

    public String getModel() {
        return model;
    }

    public void setModel(final String MODEL) {
        this.model = MODEL;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(final int STORAGE_CAPACITY) {
        this.storageCapacity = STORAGE_CAPACITY;
    }

    void increaseStorage(final int STORAGE_CAPACITY) {
        storageCapacity += STORAGE_CAPACITY;
    }
}