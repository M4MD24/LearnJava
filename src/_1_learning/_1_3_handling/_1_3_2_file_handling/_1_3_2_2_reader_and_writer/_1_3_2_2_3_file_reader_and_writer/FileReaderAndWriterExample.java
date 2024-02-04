package _1_learning._1_3_handling._1_3_2_file_handling._1_3_2_2_reader_and_writer._1_3_2_2_3_file_reader_and_writer;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// • Methods of File(Reader/Writer)

/**
 * <h1>Methods of File(Reader/Writer)</h1>
 * <h2>Methods of FileReader</h2>
 * <p>The FileReader class provides implementations for different methods present in the Reader class.</p>
 * <ul>
 *     <li><b>read()</b>
 *         <ul>
 *             <li><b>read()</b> - reads a single character from the reader</li>
 *             <li><b>read(char[] array)</b> - reads the characters from the reader and stores in the specified array</li>
 *             <li><b>read(char[] array, int start, int length)</b> - reads the number of characters equal to length from the reader and stores in the specified array starting from the position start</li>
 *         </ul>
 *     </li>
 *     <li><b>getEncoding()</b> - The getEncoding() method can be used to get the type of encoding that is used to store data in the file</li>
 *     <li><b>close()</b> - To close the file reader, we can use the close() method. Once the close() method is called, we cannot use the reader to read the data.</li>
 *     <li><b>ready()</b> - checks if the file reader is ready to be read</li>
 *     <li><b>mark()</b> - mark the position in file reader up to which data has been read</li>
 *     <li><b>reset()</b> - returns the control to the point in the reader where the mark was set</li>
 * </ul>
 * <h2>Methods of FileWriter</h2>
 * <p>The FileWriter class provides implementations for different methods present in the Writer class.</p>
 * <ul>
 *     <li><b>write()</b>
 *         <ul>
 *             <li><b>write()</b> - writes a single character to the writer</li>
 *             <li><b>write(char[] array)</b> - writes the characters from the specified array to the writer</li>
 *             <li><b>write(String data)</b> - writes the specified string to the writer</li>
 *         </ul>
 *     </li>
 *     <li><b>getEncoding()</b> - The getEncoding() method can be used to get the type of encoding that is used to write data.</li>
 *     <li><b>close()</b> - To close the file writer, we can use the close() method. Once the close() method is called, we cannot use the writer to write the data.</li>
 *     <li><b>flush()</b> - forces to write all the data present in the writer to the corresponding destination</li>
 *     <li><b>append()</b> - inserts the specified character to the current writer</li>
 * </ul>
 */

public class FileReaderAndWriterExample {
    public static void main(String[] args) throws IOException {
        fileWriter();
        fileReader();
    }

    private static void fileReader() throws IOException {
        char[] array = new char[Character.MAX_VALUE];
        FileReader input = new FileReader("src/_1_learning/_1_3_handling/_1_3_2_file_handling/_1_3_2_2_reader_and_writer/_1_3_2_2_3_file_reader_and_writer/FileReaderAndWriter.txt");

        input.read(array);
        System.out.print(".read(): ");
        System.out.println(array);

        input.close();
    }

    private static void fileWriter() throws IOException {
        String data = "File Reader And Writer";
        FileWriter file = new FileWriter("src/_1_learning/_1_3_handling/_1_3_2_file_handling/_1_3_2_2_reader_and_writer/_1_3_2_2_3_file_reader_and_writer/FileReaderAndWriter.txt");

        file.write(data);

        file.close();
    }
}