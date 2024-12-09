package _2_solve._2_2_w3resource._2_2_5_object_oriented_programming._2_2_5_9_object_oriented_programming._2_2_5_9_11;

import java.util.ArrayList;
import java.util.List;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create a class called "Library" with a collection of books and methods to add and remove books.</h2>
 */

public class Question11 {
    public static void main(final String[] PARAMETERS) {
        final Library LIBRARY = new Library();
        LIBRARY.addBook("Learn Python Programming");
        LIBRARY.addBook("Web Development with JavaScript and HTML");
        LIBRARY.addBook("Essential Concepts in Network Programming with C++");
        LIBRARY.addBook("Smartphone App Development using Java");
        LIBRARY.removeBook("Learn Python Programming");
        LIBRARY.addBook("Design and Development of Databases using SQL");
        LIBRARY.printInformation();
    }
}

class Library {
    private final List<String> BOOKS = new ArrayList<>();

    void addBook(final String BOOK) {
        BOOKS.add(BOOK);
    }

    void removeBook(final String BOOK) {
        BOOKS.remove(BOOK);
    }

    List<String> getBooks() {
        return BOOKS;
    }

    void printInformation() {
        System.out.print("Books: " + getBooks());
    }
}