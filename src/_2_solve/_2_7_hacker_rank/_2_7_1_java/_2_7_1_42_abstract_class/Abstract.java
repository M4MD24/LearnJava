package _2_solve._2_7_hacker_rank._2_7_1_java._2_7_1_42_abstract_class;

import java.util.Scanner;

/**
 * @see _2_solve._2_7_hacker_rank._2_7_1_java._2_7_1_42_abstract_class.files <h2>Question</h2>
 */

abstract class Book {
    String title;

    abstract void setTitle(final String TITLE);

    String getTitle() {
        return title;
    }
}

class MyBook extends Book {
    void setTitle(final String TITLE) {
        title = TITLE;
    }
}

public class Abstract {
    public static void main(final String[] PARAMETERS) {
        final MyBook MY_BOOK = new MyBook();
        MY_BOOK.setTitle(new Scanner(System.in).nextLine());
        System.out.println("The title is: " + MY_BOOK.getTitle());
    }
}