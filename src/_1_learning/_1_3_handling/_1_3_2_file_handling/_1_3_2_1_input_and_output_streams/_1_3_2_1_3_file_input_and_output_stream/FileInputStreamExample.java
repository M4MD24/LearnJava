package _1_learning._1_3_handling._1_3_2_file_handling._1_3_2_1_input_and_output_streams._1_3_2_1_3_file_input_and_output_stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

// • Methods of File(Input/Output)Stream

/**
 * <h1>Methods of File(Input/Output)Stream</h1>
 * <h1>Methods of FileInputStream</h1>
 * <p>The FileInputStream class provides implementations for different methods present in the InputStream class.</p>
 * <ul>
 *     <li><b>read()</b>
 *         <ul>
 *             <li><b>read()</b> - reads a single byte from the file</li>
 *             <li><b>read(byte[] array)</b> - reads the bytes from the file and stores in the specified array</li>
 *             <li><b>read(byte[] array, int start, int length)</b> - reads the number of bytes equal to length from the file and stores in the specified array starting from the position start</li>
 *         </ul>
 *     </li>
 *     <li><b>available()</b> - To get the number of available bytes, we can use the available() method.</li>
 *     <li><b>skip()</b> - To discard and skip the specified number of bytes, we can use the skip() method.</li>
 *     <li><b>close()</b> - To close the file input stream, we can use the close() method. Once the close() method is called, we cannot use the input stream to read data.</li>
 *     <li><b>finalize()</b> - ensures that the close() method is called</li>
 *     <li><b>getChannel()</b> - returns the object of FileChannel associated with the input stream</li>
 *     <li><b>getFD()</b> - returns the file descriptor associated with the input stream</li>
 *     <li><b>mark()</b> - mark the position in input stream up to which data has been read</li>
 *     <li><b>reset()</b> - returns the control to the point in the input stream where the mark was set</li>
 * </ul>
 * <h2>Methods of FileOutputStream</h2>
 * <p>The FileOutputStream class provides implementations for different methods present in the OutputStream class.</p>
 * <ul>
 *     <li><b>write()</b>
 *         <ul>
 *             <li><b>write()</b> - writes the single byte to the file output stream</li>
 *             <li><b>write(byte[] array)</b> - writes the bytes from the specified array to the output stream</li>
 *             <li><b>write(byte[] array, int start, int length)</b> - writes the number of bytes equal to length to the output stream from an array starting from the position start</li>
 *         </ul>
 *     </li>
 *     <li><b>flush()</b> - To clear the output stream, we can use the flush() method. This method forces the output stream to write all data to the destination.</li>
 *     <li><b>close()</b> - To close the file output stream, we can use the close() method. Once the method is called, we cannot use the methods of FileOutputStream.</li>
 *     <li><b>finalize()</b> - ensures that the close() method is called</li>
 *     <li><b>getChannel()</b> - returns the object of FileChannel associated with the output stream</li>
 *     <li><b>getFD()</b> - returns the file descriptor associated with the output stream</li>
 * </ul>
 */
public class FileInputStreamExample {
    public static void main(final String[] ARGS) throws IOException {
        fileOutputStream();
        fileInputStream();
    }

    private static void fileInputStream() throws IOException {
        FileInputStream file = new FileInputStream("src/_1_learning/_1_3_handling/_1_3_2_file_handling/_1_3_2_1_input_and_output_streams/_1_3_2_1_3_file_input_and_output_stream/FileInputAndOutputStream.txt");

        int index = file.read();
        byte counter = 0;

        while (index != -1) {
            System.out.println(".read()      : " + ++counter + " = " + index);
            index = file.read();
        }

        System.out.println("\n.available() : " + file.available());

        System.out.println("\n.skip()      : " + file.skip(10L));

        System.out.println("\n.getChannel(): " + file.getChannel());

        System.out.println("\n.getFD()     : " + file.getFD());

        file.close();
    }

    private static void fileOutputStream() throws IOException {
        String data = "File Input And Output Stream";

        FileOutputStream file = new FileOutputStream("src/_1_learning/_1_3_handling/_1_3_2_file_handling/_1_3_2_1_input_and_output_streams/_1_3_2_1_3_file_input_and_output_stream/FileInputAndOutputStream.txt");
        byte[] dataBytes = data.getBytes();

        file.write(dataBytes);

        file.flush();

        file.close();
    }
}