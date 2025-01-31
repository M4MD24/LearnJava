package _2_solve._2_2_w3resource._2_2_5_object_oriented_programming._2_2_5_9_object_oriented_programming._2_2_5_9_13;

import java.util.HashMap;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create a class called "Inventory" with a collection of products and methods to add and remove products, and to check for low inventory.</h2>
 */

public class Question13 {
    public static void main(final String[] ARGUMENTS) {
        final Inventory INVENTORY = new Inventory();
        INVENTORY.addProduct("Laptop",10);
        INVENTORY.addProduct("Laptop");
        INVENTORY.addProduct("Flash");
        INVENTORY.addProduct("Tablet");
        INVENTORY.addProduct("Tablet");
        INVENTORY.removeProduct("Flash");
        INVENTORY.addProduct("Mobile");
        System.out.print(INVENTORY.getProducts());
    }
}

class Inventory {
    private final HashMap<String, Integer> PRODUCTS = new HashMap<>();

    void addProduct(final String PRODUCT) {
        PRODUCTS.merge(PRODUCT, 1, Integer::sum);
    }

    void addProduct(final String PRODUCT, final int COUNT_OF_PRODUCT) {
        PRODUCTS.merge(PRODUCT, COUNT_OF_PRODUCT, Integer::sum);
    }

    void removeProduct(final String PRODUCT) {
        PRODUCTS.remove(PRODUCT);
    }

    HashMap<String, Integer> getProducts() {
        return PRODUCTS;
    }
}