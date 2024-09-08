package _1_learning._1_3_handling._1_3_2_file_handling._1_3_2_1_input_and_output_streams._1_3_2_1_5_object_input_and_output_stream;

import java.io.*;

// • Methods Object(Input/Output)Stream

/**
 * <h1>Methods of Object(Input/Output)Stream</h1>
 * <h2>Methods of ObjectInputStream</h2>
 * <p>The ObjectInputStream class provides implementations of different methods present in the InputStream class.</p>
 * <ul>
 *     <li><b>read()</b>
 *         <ul>
 *             <li><b>read()</b> - reads a byte of data from the input stream</li>
 *             <li><b>readBoolean()</b> - reads data in boolean form</li>
 *             <li><b>readChar()</b> - reads data in character form</li>
 *             <li><b>readInt()</b> - reads data in integer form</li>
 *             <li><b>readObject()</b> - reads the object from the input stream</li>
 *         </ul>
 *     </li>
 *     <li><b>available()</b> - returns the available number of bytes in the input stream</li>
 *     <li><b>mark()</b> - marks the position in input stream up to which data has been read</li>
 *     <li><b>reset()</b> - returns the control to the point in the input stream where the mark was set</li>
 *     <li><b>skipBytes()</b> - skips and discards the specified bytes from the input stream</li>
 *     <li><b>close()</b> - closes the object input stream</li>
 * </ul>
 * <h2>Methods of ObjectOutputStream</h2>
 * <p>The ObjectOutputStream class provides implementations for different methods present in the OutputStream class.</p>
 * <ul>
 *     <li><b>write()</b>
 *         <ul>
 *             <li><b>write()</b> - writes a byte of data to the output stream</li>
 *             <li><b>writeBoolean()</b> - writes data in boolean form</li>
 *             <li><b>writeChar()</b> - writes data in character form</li>
 *             <li><b>writeInt()</b> - writes data in integer form</li>
 *             <li><b>writeObject()</b> - writes object to the output stream</li>
 *         </ul>
 *     </li>
 *     <li><b>flush()</b> - clears all the data from the output stream</li>
 *     <li><b>drain()</b> - puts all the buffered data in the output stream</li>
 *     <li><b>close()</b> - closes the output stream</li>
 * </ul>
 */

public class ObjectInputAndOutputStreamExample {
    public static void main(final String[] PARAMETERS) throws IOException, ClassNotFoundException {
        objectOutputStream();
        objectInputStream();
    }

    private static void objectInputStream() throws IOException, ClassNotFoundException {
        FileInputStream fileStream = new FileInputStream("src/_1_learning/_1_3_handling/_1_3_2_file_handling/_1_3_2_1_input_and_output_streams/_1_3_2_1_5_object_input_and_output_stream/ObjectInputAndOutputStream.txt");
        ObjectInputStream objStream = new ObjectInputStream(fileStream);

        System.out.println("Integer data: " + objStream.readInt());
        System.out.println("String data: " + objStream.readObject());
        System.out.println("Boolean data: " + objStream.readBoolean());
        System.out.print("Char data: " + objStream.readChar());

        objStream.close();
    }

    private static void objectOutputStream() throws IOException {
        int intData = 5;
        String stringData = "Object Input And Output Stream";
        boolean booleanData = true;
        char charData = 'A';

        FileOutputStream file = new FileOutputStream("src/_1_learning/_1_3_handling/_1_3_2_file_handling/_1_3_2_1_input_and_output_streams/_1_3_2_1_5_object_input_and_output_stream/ObjectInputAndOutputStream.txt");
        ObjectOutputStream output = new ObjectOutputStream(file);

        output.writeInt(intData);
        output.writeObject(stringData);
        output.writeBoolean(booleanData);
        output.writeChar(charData);

        output.close();
    }
}