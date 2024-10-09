package _2_solving._2_2_w3resource._2_2_5_object_oriented_programming._2_2_5_7_encapsulation._2_2_5_7_8;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create a class called “Book” with private instance variables title, author, and price. Provide public getter and setter methods to access and modify these variables. Add a method called applyDiscount() that takes a percentage as a parameter and reduces the price by that percentage.</h2>
 */

public class Question8 {
    public static void main(final String[] PARAMETERS) {
        final Book BOOK = new Book();
        BOOK.setTitle("Title");
        BOOK.setAuthor("Author");
        BOOK.setPrice(1000);
        BOOK.applyDiscount(15);
        System.out.printf("""
                        Title: %s
                        Author: %s
                        Price: %f £""",
                BOOK.getTitle(),
                BOOK.getAuthor(),
                BOOK.getPrice());
    }
}

class Book {
    private String title,
            author;
    private float price;

    public String getTitle() {
        return title;
    }

    public void setTitle(final String TITLE) {
        title = TITLE;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(final String AUTHOR) {
        author = AUTHOR;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(final float PRICE) {
        price = PRICE;
    }

    void applyDiscount(final float PERCENTAGE) {
        price -= price * (PERCENTAGE / 100);
    }
}