package _1_learning._1_3_handling._1_3_2_file_handling._1_3_2_2_reader_and_writer._1_3_2_2_4_buffered_reader_and_writer;

import java.io.*;

// • Methods of Buffered(Reader/Writer)

/**
 * <h1>Methods of Buffered(Reader/Writer)</h1>
 * <h2>Methods of BufferedReader</h2>
 * <p>The BufferedReader class provides implementations for different methods present in Reader.</p>
 * <ul>
 *     <li><b>read()</b>
 *         <ul>
 *             <li><b>read()</b> - reads a single character from the internal buffer of the reader</li>
 *             <li><b>read(char[] array)</b> - reads the characters from the reader and stores in the specified array</li>
 *             <li><b>read(char[] array, int start, int length)</b> - reads the number of characters equal to length from the reader and stores in the specified array starting from the position start</li>
 *         </ul>
 *     </li>
 *     <li><b>skip()</b> - To discard and skip the specified number of characters.</li>
 *     <li><b>close()</b> - To close the buffered reader, we can use the close() method. Once the close() method is called, we cannot use the reader to read the data.</li>
 *     <li><b>ready()</b> - checks if the file reader is ready to be read</li>
 *     <li><b>mark()</b> - mark the position in reader up to which data has been read</li>
 *     <li><b>reset()</b> - returns the control to the point in the reader where the mark was set</li>
 * </ul>
 * <h2>Methods of BufferedWriter</h2>
 * <p>The BufferedWriter class provides implementations for different methods present in Writer.</p>
 * <ul>
 *     <li><b>write()</b>
 *         <ul>
 *             <li><b>write()</b> - writes a single character to the internal buffer of the writer</li>
 *             <li><b>write(char[] array)</b> - writes the characters from the specified array to the writer</li>
 *             <li><b>write(String data)</b> - writes the specified string to the writer</li>
 *         </ul>
 *     </li>
 *     <li><b>close()</b> - To close the buffered writer, we can use the close() method. Once the close() method is called, we cannot use the writer to write the data.</li>
 *     <li><b>newLine()</b> - inserts a new line to the writer</li>
 *     <li><b>append()</b> - inserts the specified character to the current writer</li>
 * </ul>
 */

public class BufferedAndReaderAndWriterExample {
    public static void main(final String[] PARAMETERS) throws IOException {
        bufferedWriter();
        bufferedReader();
    }

    private static void bufferedReader() throws IOException {
        char[] array = new char[Character.MAX_VALUE];
        FileReader file = new FileReader("src/_1_learning/_1_3_handling/_1_3_2_file_handling/_1_3_2_2_reader_and_writer/_1_3_2_2_4_buffered_reader_and_writer/BufferedReaderAndWriter.txt");
        BufferedReader input = new BufferedReader(file);

        System.out.println(".ready(): " + file.ready());

        input.read(array);
        System.out.print(".read() : ");
        System.out.print(array);

        input.close();
    }

    private static void bufferedWriter() throws IOException {
        String data = "Buffered Reader And Writer";
        FileWriter file = new FileWriter("src/_1_learning/_1_3_handling/_1_3_2_file_handling/_1_3_2_2_reader_and_writer/_1_3_2_2_4_buffered_reader_and_writer/BufferedReaderAndWriter.txt");
        BufferedWriter out = new BufferedWriter(file);

        out.write(data);
        out.newLine();

        out.close();
    }
}