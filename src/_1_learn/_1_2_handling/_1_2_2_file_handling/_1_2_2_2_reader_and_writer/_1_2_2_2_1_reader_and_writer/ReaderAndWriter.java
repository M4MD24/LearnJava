package _1_learn._1_2_handling._1_2_2_file_handling._1_2_2_2_reader_and_writer._1_2_2_2_1_reader_and_writer;

import java.io.*;

// • Methods of (Reader/Writer)

/**
 * <h1>Methods of (Reader/Writer)</h1>
 * <h2>Methods of Reader</h2>
 * <p>The Reader class provides different methods that are implemented by its subclasses. Here are some of the commonly used methods:</p>
 * <ul>
 *     <li><b>ready()</b> - checks if the reader is ready to be read</li>
 *     <li><b>read(char[] array)</b> - reads the characters from the stream and stores in the specified array</li>
 *     <li><b>read(char[] array, int start, int length)</b> - reads the number of characters equal to length from the stream and stores in the specified array starting from the start</li>
 *     <li><b>mark()</b> - marks the position in the stream up to which data has been read</li>
 *     <li><b>reset()</b> - returns the control to the point in the stream where the mark is set</li>
 *     <li><b>skip()</b> - discards the specified number of characters from the stream</li>
 * </ul>
 * <h2>Methods of Writer</h2>
 * <p>The Writer class provides different methods that are implemented by its subclasses.</p>
 * <ul>
 *     <li><b>write(char[] array)</b> - writes the characters from the specified array to the output stream</li>
 *     <li><b>write(String data)</b> - writes the specified string to the writer</li>
 *     <li><b>append(char c)</b> - inserts the specified character to the current writer</li>
 *     <li><b>flush()</b> - forces to write all the data present in the writer to the corresponding destination</li>
 *     <li><b>close()</b> - closes the writer</li>
 * </ul>
 */

public class ReaderAndWriter {
    public static void main(final String[] PARAMETERS) throws IOException {
        writer();
        reader();
    }

    private static void reader() throws IOException {
        char[] array = new char[Character.MAX_VALUE];
        Reader input = new FileReader("src/_1_learn/_1_3_handling/_1_3_2_file_handling/_1_3_2_2_reader_and_writer/_1_3_2_2_1_reader_and_writer/ReaderAndWriter.txt");

        System.out.println(".ready(): " + input.ready());

        input.read(array);
        System.out.print(".read() : ");
        System.out.print(array);

        input.close();
    }

    private static void writer() throws IOException {
        String data = "Reader And Writer";
        Writer output = new FileWriter("src/_1_learn/_1_3_handling/_1_3_2_file_handling/_1_3_2_2_reader_and_writer/_1_3_2_2_1_reader_and_writer/ReaderAndWriter.txt");

        output.write(data);

        output.close();
    }
}