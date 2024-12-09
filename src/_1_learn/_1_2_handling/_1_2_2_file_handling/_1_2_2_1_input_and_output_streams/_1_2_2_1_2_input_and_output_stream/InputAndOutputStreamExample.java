package _1_learn._1_2_handling._1_2_2_file_handling._1_2_2_1_input_and_output_streams._1_2_2_1_2_input_and_output_stream;

import java.io.*;

// • Methods of (Input/Output)Stream

/**
 * <h1>Methods of (Input/Output)Stream</h1>
 * <h2>Methods of InputStream</h2>
 * <p>The InputStream class provides different methods that are implemented by its subclasses.</p>
 * <ul>
 *     <li><b>read()</b> - reads one byte of data from the input stream</li>
 *     <li><b>read(byte[] array)</b> - reads bytes from the stream and stores in the specified array</li>
 *     <li><b>available()</b> - returns the number of bytes available in the input stream</li>
 *     <li><b>mark()</b> - marks the position in the input stream up to which data has been read</li>
 *     <li><b>reset()</b> - returns the control to the point in the stream where the mark was set</li>
 *     <li><b>markSupported()</b> - checks if the mark() and reset() method is supported in the stream</li>
 *     <li><b>skip()</b> - skips and discards the specified number of bytes from the input stream</li>
 *     <li><b>close()</b> - closes the input stream</li>
 * </ul>
 * <h2>Methods of OutputStream</h2>
 * <p>The OutputStream class provides different methods that are implemented by its subclasses</p>
 * <ul>
 *     <li><b>write()</b> - writes the specified byte to the output stream</li>
 *     <li><b>write(byte[] array)</b> - writes the bytes from the specified array to the output stream</li>
 *     <li><b>flush()</b> - forces to write all data present in output stream to the destination</li>
 *     <li><b>close()</b> - closes the output stream</li>
 * </ul>
 */

public class InputAndOutputStreamExample {
    public static void main(final String[] PARAMETERS) throws IOException {
        outputStream();
        inputStream();
    }

    private static void inputStream() throws IOException {
        byte[] array = new byte[Byte.MAX_VALUE];
        InputStream file = new FileInputStream("src/_1_learn/_1_2_handling/_1_2_2_file_handling/_1_2_2_1_input_and_output_streams/_1_2_2_1_2_input_and_output_stream/InputAndOutputStream.txt");

        System.out.println(".available()    : " + file.available());

        System.out.println(".markSupported(): " + file.markSupported());

        System.out.println(".read()         : " + file.read());

        System.out.print("Input Stream    : ");
        file.read(array);
        String data = new String(array);
        System.out.println(data);

        System.out.println(".skip()         : " + file.skip(5));

        if (file.markSupported()) {
            file.mark(40);
            System.out.println(".mark()         : ");

            System.out.println(".reset()        : ");
            file.reset();
        } else System.out.println("Mark/reset not supported in this stream.");

        file.close();
    }

    private static void outputStream() throws IOException {
        String data = "Input And Output Stream";

        OutputStream file = new FileOutputStream("src/_1_learn/_1_2_handling/_1_2_2_file_handling/_1_2_2_1_input_and_output_streams/_1_2_2_1_2_input_and_output_stream/InputAndOutputStream.txt");
        byte[] dataBytes = data.getBytes();

        file.write(dataBytes);

        file.flush();

        file.close();
    }

}