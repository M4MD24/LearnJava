package _2_solve._2_2_w3resource._2_2_1_java_exercises._2_2_1_5_object_oriented_programming._2_2_1_5_6_interface._2_2_1_5_6_9;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * <h1>Problem:</h1>
 * <h2>Write a Java program to create an interface Searchable with a method search(String keyword) that searches for a given keyword in a text document. Create two classes Document and WebPage that implement the Searchable interface and provide their own implementations of the search() method.</h2>
 */

public class Question9 {
    public static void main(final String[] PARAMETERS) throws IOException {
        final Searchable DOCUMENT = new Document();
        System.out.println("Document contains keyword? " + DOCUMENT.search("Lorem"));

        final Searchable WEB_PAGE = new WebPage();
        System.out.println("Web page contains keyword? " + WEB_PAGE.search("Nothing"));
    }
}

interface Searchable {
    boolean search(final String KEYWORD) throws IOException;
}

class Document implements Searchable {
    private final File DOCUMENT_FILE = new File("src/_2_problem_solving/_2_2_w3resource/_2_2_5_object_oriented_programming/_2_2_5_3_interface/_2_2_5_3_9_428/files/Document.txt");
    private final char[] TEXT_DOCUMENT = new char[Character.MAX_VALUE];

    @Override
    public boolean search(final String KEYWORD) throws IOException {
        final FileReader FILE_READER = new FileReader(DOCUMENT_FILE);
        final int CHARACTERS_READ = FILE_READER.read(TEXT_DOCUMENT);
        return String.valueOf(TEXT_DOCUMENT, 0, CHARACTERS_READ).trim().contains(KEYWORD);
    }
}

class WebPage implements Searchable {
    private final File WAB_PAGE_FILE = new File("src/_2_problem_solving/_2_2_w3resource/_2_2_5_object_oriented_programming/_2_2_5_3_interface/_2_2_5_3_9_428/files/WebPage.txt");
    private final char[] TEXT_WAB_PAGE = new char[Character.MAX_VALUE];

    @Override
    public boolean search(final String KEYWORD) throws IOException {
        final FileReader FILE_READER = new FileReader(WAB_PAGE_FILE);
        final int CHARACTERS_READ = FILE_READER.read(TEXT_WAB_PAGE);
        return String.valueOf(TEXT_WAB_PAGE, 0, CHARACTERS_READ).trim().contains(KEYWORD);
    }
}