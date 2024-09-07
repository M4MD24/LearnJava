package _1_learning._1_3_handling._1_3_2_file_handling._1_3_2_1_input_and_output_streams._1_3_2_1_4_byte_array_input_stream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;

// • Methods of ByteArray(Input/Output)Stream

/**
 * <h1>Methods of ByteArray(Input/Output)Stream</h1>
 * <h2>Methods of ByteArrayInputStream</h2>
 * <p>The ByteArrayInputStream class provides implementations for different methods present in the InputStream class.</p>
 * <ul>
 *     <li><b>read()</b>
 *         <ul>
 *             <li><b>read()</b> - reads the single byte from the array present in the input stream</li>
 *             <li><b>read(byte[] array)</b> - reads bytes from the input stream and stores in the specified array</li>
 *             <li><b>read(byte[] array, int start, int length)</b> - reads the number of bytes equal to length from the stream and stores in the specified array starting from the position start</li>
 *         </ul>
 *     </li>
 *     <li><b>available()</b> - To get the number of available bytes in the input stream, we can use the available() method.</li>
 *     <li><b>skip()</b> - To discard and skip the specified number of bytes, we can use the skip() method.</li>
 *     <li><b>close()</b> - To close the input stream, we can use the close() method.</li>
 *     <li><b>finalize()</b> - ensures that the close() method is called</li>
 *     <li><b>mark()</b> - marks the position in input stream up to which data has been read</li>
 *     <li><b>reset()</b> - returns the control to the point in the input stream where the mark was set</li>
 *     <li><b>markSupported()</b> - checks if the input stream supports mark() and reset()</li>
 * </ul>
 * <h2>Methods of ByteArrayOutputStream</h2>
 * <p>The ByteArrayOutputStream class provides the implementation of the different methods present in the OutputStream class.</p>
 * <ul>
 *     <li><b>write()</b>
 *         <ul>
 *             <li><b>write(int byte)</b> - writes the specified byte to the output stream</li>
 *             <li><b>write(byte[] array)</b> - writes the bytes from the specified array to the output stream</li>
 *             <li><b>write(byte[] arr, int start, int length)</b> - writes the number of bytes equal to length to the output stream from an array starting from the position start</li>
 *             <li><b>writeTo(ByteArrayOutputStream out1)</b> - writes the entire data of the current output stream to the specified output stream</li>
 *         </ul>
 *     </li>
 *     <li><b>toByteArray()</b> - returns the array present inside the output stream</li>
 *     <li><b>toString()</b> - returns the entire data of the output stream in string form</li>
 *     <li><b>close()</b> - To close the output stream, we can use the close() method.</li>
 *     <li><b>size()</b> - returns the size of the array in the output stream</li>
 *     <li><b>flush()</b> - clears the output stream</li>
 * </ul>
 */

public class ByteArrayInputStreamExample {
    public static void main(final String[] PARAMETERS) throws IOException {
        byteArrayOutputStream();
        byteArrayInputStream();
    }

    private static void byteArrayInputStream() throws IOException {
        byte[] array = {1, 2, 3, 4, 5, 6};
        ByteArrayInputStream input = new ByteArrayInputStream(array);
        for (int i = 0; i < array.length; ++i) {
            int data = input.read();
            System.out.print(data + " ");
        }
        input.close();
    }

    private static void byteArrayOutputStream() throws IOException {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        String data = "Byte Array Input And Output Stream";
        byte[] array = data.getBytes();

        out.write(array);

        System.out.println(".write()      : " + out);
        System.out.println(".toByteArray(): " + Arrays.toString(out.toByteArray()));
        System.out.println(".toString()   : " + out.toString());
        System.out.println(".size()       : " + out.size());

        out.flush();

        out.close();
    }
}