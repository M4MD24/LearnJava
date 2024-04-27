package _1_learning._1_3_handling._1_3_2_file_handling._1_3_2_2_reader_and_writer._1_3_2_2_5_string_reader_and_writer;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

// • Methods of String(Reader/Writer)

/**
 * <h1>Methods of String(Reader/Writer)</h1>
 * <h2>Methods of StringReader</h2>
 * <p>The StringReader class provides implementations for different methods present in the Reader class.</p>
 * <ul>
 *     <li><b>read()</b>
 *         <ul>
 *             <li><b>read()</b> - reads a single character from the string reader</li>
 *             <li><b>read(char[] array)</b> - reads the characters from the reader and stores in the specified array</li>
 *             <li><b>read(char[] array, int start, int length)</b> - reads the number of characters equal to length from the reader and stores in the specified array starting from the position start</li>
 *         </ul>
 *     </li>
 *     <li><b>skip()</b> - To discard and skip the specified number of characters, we can use the skip() method.</li>
 *     <li><b>close()</b> - To close the string reader, we can use the close() method. Once the close() method is called, we cannot use the reader to read data from the string.</li>
 *     <li><b>ready()</b> - checks if the string reader is ready to be read</li>
 *     <li><b>mark()</b> - marks the position in reader up to which data has been read</li>
 *     <li><b>reset()</b> - returns the control to the point in the reader where the mark was set</li>
 * </ul>
 * <h2>Methods of StringWriter</h2>
 * <p>The StringWriter class provides implementations for different methods present in the Writer class.</p>
 * <ul>
 *     <li><b>write()</b>
 *         <ul>
 *             <li><b>write()</b> - writes a single character to the string writer</li>
 *             <li><b>write(char[] array)</b> - writes the characters from the specified array to the writer</li>
 *             <li><b>write(String data)</b> - writes the specified string to the writer</li>
 *         </ul>
 *     </li>
 *     <li><b>getBuffer()</b> - returns the data present in the string buffer</li>
 *     <li><b>toString()</b> - returns the data present in the string buffer as a string</li>
 *     <li><b>close()</b> - To close the string writer, we can use the close() method.</li>
 *     <li><b>flush()</b> - forces to write all the data present in the writer to the string buffer</li>
 *     <li><b>append()</b> - inserts the specified character to the current writer</li>
 * </ul>
 */

public class StringReaderAndWriter {
    public static void main(final String[] ARGS) throws IOException {
        stringWriter();
        stringReader();
    }

    private static void stringReader() throws IOException {
        String data = "String Reader And Writer";
        char[] array = new char[Character.MAX_VALUE];
        StringReader input = new StringReader(data);

        input.read(array);
        System.out.print(".read()     : ");
        System.out.print(array);

        input.close();
    }

    private static void stringWriter() throws IOException {
        String data = "String Reader And Writer";
        StringWriter out = new StringWriter();

        out.write(data);

        System.out.println(".getBuffer(): " + out.getBuffer());

        out.close();
    }
}