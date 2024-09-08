package _1_learning._1_3_handling._1_3_2_file_handling._1_3_2_2_reader_and_writer._1_3_2_2_2_input_and_output_stream_reader_and_writer;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

// • Methods of (Input/Output) Stream (Reader/Writer)

/**
 * <h1>Methods of (Input/Output)Stream(Reader/Writer)</h1>
 * <h2>Methods of InputStreamReader</h2>
 * <p>The InputStreamReader class provides implementations for different methods present in the Reader class.</p>
 * <ul>
 *     <li><b>read()</b>
 *         <ul>
 *             <li><b>read()</b> - reads a single character from the reader</li>
 *             <li><b>read(char[] array)</b> - reads the characters from the reader and stores in the specified array</li>
 *             <li><b>read(char[] array, int start, int length)</b> - reads the number of characters equal to length from the reader and stores in the specified array starting from the start</li>
 *         </ul>
 *     </li>
 *     <li><b>getEncoding()</b> - The getEncoding() method can be used to get the type of encoding that is used to store data in the input stream.</li>
 *     <li><b>close()</b> - To close the input stream reader, we can use the close() method. Once the close() method is called, we cannot use the reader to read the data.</li>
 *     <li><b>ready()</b> - checks if the stream is ready to be read</li>
 *     <li><b>mark()</b> - mark the position in stream up to which data has been read</li>
 *     <li><b>reset()</b> - returns the control to the point in the stream where the mark was set</li>
 * </ul>
 * <h2>Methods OutputStreamWriter</h2>
 * <p>The OutputStreamWriter class provides implementations for different methods present in the Writer class.</p>
 * <ul>
 *     <li><b>write()</b>
 *         <ul>
 *             <li><b>write()</b> - writes a single character to the writer</li>
 *             <li><b>write(char[] array)</b> - writes the characters from the specified array to the writer</li>
 *             <li><b>write(String data)</b> - writes the specified string to the writer</li>
 *         </ul>
 *     </li>
 *     <li><b>getEncoding()</b> - The getEncoding() method can be used to get the type of encoding that is used to write data to the output stream.</li>
 *     <li><b>close()</b> - To close the output stream writer, we can use the close() method. Once the close() method is called, we cannot use the writer to write the data.</li>
 *     <li><b>flush()</b> - forces to write all the data present in the writer to the corresponding destination</li>
 *     <li><b>append()</b> - inserts the specified character to the current writer</li>
 * </ul>
 */

public class InputAndOutputStreamReaderAndWriterExample {
    public static void main(final String[] PARAMETERS) throws IOException {
        outputStreamWriter();
        inputStreamReader();
    }

    private static void inputStreamReader() throws IOException {
        char[] array = new char[Character.MAX_VALUE];
        FileInputStream file = new FileInputStream("src/_1_learning/_1_3_handling/_1_3_2_file_handling/_1_3_2_2_reader_and_writer/_1_3_2_2_2_input_and_output_stream_reader_and_writer/InputAndOutputStreamReaderAndWriter.txt");
        InputStreamReader input1 = new InputStreamReader(file, StandardCharsets.US_ASCII);
        InputStreamReader input2 = new InputStreamReader(file, Charset.forName("UTF-32"));

        input1.read(array);
        System.out.print(".read()              : ");
        System.out.println(array);

        System.out.println(".getEncoding() input1: " + input1.getEncoding());

        System.out.print(".getEncoding() input2: " + input2.getEncoding());

        input1.close();
    }

    private static void outputStreamWriter() throws IOException {
        String data = "Input And Output Stream Reader And Writer";
        FileOutputStream file = new FileOutputStream("src/_1_learning/_1_3_handling/_1_3_2_file_handling/_1_3_2_2_reader_and_writer/_1_3_2_2_2_input_and_output_stream_reader_and_writer/InputAndOutputStreamReaderAndWriter.txt");
        OutputStreamWriter output = new OutputStreamWriter(file);

        output.write(data);

        output.close();
    }
}