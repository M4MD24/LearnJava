package _1_learning._1_3_handling._1_3_2_file_handling._1_3_2_1_input_and_output_streams._1_3_2_1_7_print_stream;

import java.io.IOException;
import java.io.PrintStream;

// • Methods of PrintStream

/**
 * <h1>Methods of PrintStream</h1>
 * <ps>The PrintStream class provides various methods that allow us to print data to the output.</ps>
 * <ul>
 *     <li><b>print()</b>
 *         <ul>
 *             <li><b>print()</b> - prints the specified data to the output stream</li>
 *             <li><b>println()</b> - prints the data to the output stream along with a new line character at the end</li>
 *         </ul>
 *     </li>
 *     <li><b>close()</b> - closes the print stream</li>
 *     <li><b>checkError()</b> - checks if there is an error in the stream and returns a boolean result</li>
 *     <li><b>append()</b> - appends the specified data to the stream</li>
 * </ul>
 * <h2>String Formatting</h2>
 * <ul>
 *     <li><b>%d</b> - seeks to format and print integers.</li>
 *     <li><b>%f</b> - Ninth for formatting and printing decimal numbers (floats and evens).</li>
 *     <li><b>%.2f</b> - to format and print a floating-point number with a minimum width of 0 characters and a precision of two digits after the decimal point.</li>
 *     <li><b>%b</b> - format specifier is used for formatting and printing boolean values.</li>
 *     <li><b>%s</b> - seeks to format and print texts (strings).</li>
 * </ul>
 */

public class PrintStreamExample {
    public static void main(String[] args) throws IOException {
        printStream();
    }

    private static void printStream() throws IOException {
        PrintStream out = new PrintStream("src/_1_learning/_1_3_handling/_1_3_2_file_handling/_1_3_2_1_input_and_output_streams/_1_3_2_1_7_print_stream/PrintStream.txt");

        out.printf("%d\n%f\n%.2f\n%b\n%s", Integer.MAX_VALUE, Float.MAX_VALUE, Float.MAX_VALUE, true, "Input ");
        out.append("Stream");

        out.close();
    }
}