package _2_problem_solving._2_2_w3resource._2_2_5_object_oriented_programming._2_2_5_9_object_oriented_programming._2_2_5_9_5;

import java.util.ArrayList;

/**
 * <h1>Question:</h1>
 * <h2>Write a Java program to create a class called "Book" with attributes for title, author, and ISBN, and methods to add and remove books from a collection.</h2>
 */

public class Question5 {
    public static void main(final String[] ARGS) {
        final ArrayList<Book> BOOK_COLLECTION = Book.bookCollection();
        final Book BOOK_1 = new Book("Java Programming", "John Doe", "1111111111111"),
                BOOK_2 = new Book("Python for Beginners", "Jane Smith", "2222222222222");
        Book.addBook(BOOK_1);
        Book.addBook(BOOK_2);
        Book.removeBook(BOOK_2);
        for (int index = 0; index < BOOK_COLLECTION.size(); index++) {
            System.out.printf("%d%n%s%n%s%n%s",
                    index,
                    BOOK_COLLECTION.get(index).getTitle(),
                    BOOK_COLLECTION.get(index).getAuthor(),
                    BOOK_COLLECTION.get(index).getIsbn());
            if (index < BOOK_COLLECTION.size() - 1)
                System.out.println("\n");
        }
    }
}

class Book {
    private final String TITLE,
            AUTHOR,
            ISBN;

    private static final ArrayList<Book> BOOKS = new ArrayList<>();

    Book(final String TITLE, final String AUTHOR, final String ISBN) {
        this.TITLE = TITLE;
        this.AUTHOR = AUTHOR;
        this.ISBN = ISBN;
    }

    String getTitle() {
        return TITLE;
    }

    String getAuthor() {
        return AUTHOR;
    }

    String getIsbn() {
        return ISBN;
    }

    static ArrayList<Book> bookCollection() {
        return BOOKS;
    }

    static void addBook(final Book BOOK) {
        BOOKS.add(BOOK);
    }

    static void removeBook(final Book BOOK) {
        BOOKS.remove(BOOK);
    }
}