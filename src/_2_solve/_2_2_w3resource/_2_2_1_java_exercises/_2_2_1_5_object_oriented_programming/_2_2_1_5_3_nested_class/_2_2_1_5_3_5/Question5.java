package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_5_object_oriented_programming._2_2_1_5_3_nested_class._2_2_1_5_3_5;

/**
 * <h3>Inner Class Accessing Outer Class Members:</h3>
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create an outer class called Library with an instance variable libraryName. Create an inner class Book with a method getLibraryName() that returns the name of the library. Instantiate the Book class and call the getLibraryName() method.</h2>
 */

public class Question5 {
    public static void main(final String[] ARGUMENTS) {
        final Library LIBRARY = new Library();
        LIBRARY.setLibraryName("Library");

        final Library.Book BOOK = LIBRARY.new Book();
        System.out.print(BOOK.getLibraryName());
    }
}

class Library {
    private String libraryName;

    void setLibraryName(final String LIBRARY_NAME) {
        this.libraryName = LIBRARY_NAME;
    }

    class Book {
        String getLibraryName() {
            return libraryName;
        }
    }
}
