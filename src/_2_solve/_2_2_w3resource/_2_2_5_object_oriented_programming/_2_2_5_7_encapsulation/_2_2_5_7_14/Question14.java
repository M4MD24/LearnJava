package _2_solve._2_2_w3resource._2_2_5_object_oriented_programming._2_2_5_7_encapsulation._2_2_5_7_14;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create a class called Product with private instance variables productName, productCode, and price. Provide public getter and setter methods to access and modify these variables. Add a method called applyDiscount() that takes a percentage and reduces the price by that percentage.</h2>
 */

public class Question14 {
    public static void main(final String[] PARAMETERS) {
        final Product PRODUCT = new Product();
        PRODUCT.setProductName("The Name");
        PRODUCT.setProductCode("0987654321");
        PRODUCT.setPrice(120);
        PRODUCT.applyDiscount(16);
        System.out.printf("""
                        Product Name: %s
                        Product Code: %s
                        Price: %f £""",
                PRODUCT.getProductName(),
                PRODUCT.getProductCode(),
                PRODUCT.getPrice());
    }
}

class Product {
    private String productName,
            productCode;
    private float price;

    public String getProductName() {
        return productName;
    }

    public void setProductName(final String PRODUCT_NAME) {
        productName = PRODUCT_NAME;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(final String PRODUCT_CODE) {
        productCode = PRODUCT_CODE;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(final float PRICE) {
        price = PRICE;
    }

    public void applyDiscount(final float PERCENTAGE) {
        price -= (price * (PERCENTAGE / 100));
    }
}