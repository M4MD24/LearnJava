package _1_learning._1_3_handling._1_3_2_file_handling._1_3_2_1_input_and_output_streams._1_3_2_1_6_buffered_input_and_output_stream;

import java.io.*;

// • Methods of Buffered(Input/Output)Stream

/**
 * <h1>Methods of Buffered(Input/Output)Stream</h1>
 * <h2>Methods of BufferedInputStream</h2>
 * <p>The BufferedInputStream class provides implementations for different methods present in the InputStream class.</p>
 * <ul>
 *     <li><b>read()</b>
 *         <ul>
 *             <li><b>read()</b> - reads a single byte from the input stream</li>
 *             <li><b>read(byte[] arr)</b> - reads bytes from the stream and stores in the specified array</li>
 *             <li>read(byte[] arr, int start, int length) - reads the number of bytes equal to the length from the stream and stores in the specified array starting from the position start</li>
 *         </ul>
 *     </li>
 *     <li><b>available()</b> - To get the number of available bytes in the input stream, we can use the available() method.</li>
 *     <li><b>skip()</b> - To discard and skip the specified number of bytes, we can use the skip() method.</li>
 *     <li><b>close()</b> - To close the buffered input stream, we can use the close() method. Once the close() method is called, we cannot use the input stream to read the data.</li>
 *     <li><b>mark()</b> - mark the position in input stream up to which data has been read</li>
 *     <li><b>reset()</b> - returns the control to the point in the input stream where the mark was set</li>
 * </ul>
 * <h2>Methods of BufferedOutputStream</h2>
 * <p>The BufferedOutputStream class provides implementations for different methods in the OutputStream class.</p>
 * <ul>
 *     <li><b>write()</b>
 *         <ul>
 *             <li><b>write()</b> - writes a single byte to the internal buffer of the output stream</li>
 *             <li><b>write(byte[] array)</b> - writes the bytes from the specified array to the output stream</li>
 *             <li><b>write(byte[] arr, int start, int length)</b> - writes the number of bytes equal to length to the output stream from an array starting from the position start</li>
 *         </ul>
 *     </li>
 *     <li><b>flush()</b> - To clear the internal buffer, we can use the flush() method. This method forces the output stream to write all data present in the buffer to the destination file.</li>
 * <li><b>close()</b> - To close the buffered output stream, we can use the close() method. Once the method is called, we cannot use the output stream to write the data.</li>
 * </ul>
 */
public class BufferedInputAndOutputStreamExample {
    public static void main(String[] args) throws IOException {
        bufferedOutputStream();
        bufferedInputStream();
    }

    private static void bufferedInputStream() throws IOException {
        FileInputStream file = new FileInputStream("src/_1_learn/_1_3_handling/_1_3_2_file_handling/_1_3_2_1_input_and_output_streams/_1_3_2_1_6_buffered_input_and_output_stream/BufferedInputAndOutputStream.txt");
        BufferedInputStream input = new BufferedInputStream(file);

        int index = input.read();
        while (index != -1) {
            System.out.println(".read()     : " + (char) index + " = " + index);
            index = input.read();
        }

        System.out.println("\n.available(): " + input.available());

        input.close();
    }

    private static void bufferedOutputStream() throws IOException {
        String data = "Buffered Input And Output Stream";
        FileOutputStream file = new FileOutputStream("src/_1_learn/_1_3_handling/_1_3_2_file_handling/_1_3_2_1_input_and_output_streams/_1_3_2_1_6_buffered_input_and_output_stream/BufferedInputAndOutputStream.txt");
        BufferedOutputStream output = new BufferedOutputStream(file);
        byte[] array = data.getBytes();

        output.write(array);

        output.close();
    }
}