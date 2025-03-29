package _2_solve._2_2_w3resource._2_2_1_exercises._2_2_1_1_java._2_2_1_1_5_object_oriented_programming._2_2_1_1_5_1_constructors._2_2_1_1_5_1_3;

/**
 * <h3>Constructor Overloading</h3>
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create a class called "Book" with instance variables title, author, and price. Implement a default constructor and two parameterized constructors:</h2>
 * <ul>
 *     <li>One constructor takes title and author as ARGUMENTS.</li>
 *     <li>The other constructor takes title, author, and price as ARGUMENTS.</li>
 *     <li>Print the values of the variables for each constructor.</li>
 * </ul>
 */

public class Question3 {
    public static void main(final String[] ARGUMENTS) {
        new Book("Title-1", "Author-1").printInformation();
        System.out.println("\n");
        new Book("Title-2", "Author-2", 100).printInformation();
    }
}

class Book {
    private final String TITLE,
            AUTHOR;
    private float price;

    Book(final String TITLE, final String AUTHOR) {
        this.TITLE = TITLE;
        this.AUTHOR = AUTHOR;
    }

    Book(final String TITLE, final String AUTHOR, float PRICE) {
        this.TITLE = TITLE;
        this.AUTHOR = AUTHOR;
        price = PRICE;
    }

    void printInformation() {
        System.out.printf("Title: %s%nAuthor: %s%nPrice: %f£", TITLE,
                AUTHOR,
                price);
    }
}