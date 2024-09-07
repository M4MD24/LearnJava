package _1_learning._1_3_handling._1_3_2_file_handling._1_3_2_2_reader_and_writer._1_3_2_2_6_pint_writer;

import java.io.IOException;
import java.io.PrintWriter;

// • Methods of PrintWriter

/**
 * <h1>Methods of PrintWriter</h
 * <p>The PrintWriter class provides various methods that allow us to print data to the output.</p>
 * <ul>
 *     <li><b>print()</b>
 *         <ul>
 *             <li><b>print()</b> - prints the specified data to the writer</li>
 *             <li><b>println()</b> - prints the data to the writer along with a new line character at the end</li>
 *         </ul>
 *     </li>
 *     <li><b>close()</b> - closes the print writer</li>
 *     <li><b>checkError()</b> - checks if there is an error in the writer and returns a boolean result</li>
 *     <li><b>append()</b> - appends the specified data to the writer</li>
 * </ul>
 * <h2>String Formatting</h2>
 * <ul>
 *     <li><b>%d</b> - seeks to format and print integers.</li>
 *     <li><b>%f</b> - Ninth for formatting and printing decimal numbers (floats and evens).</li>
 *     <li><b>%.2f</b> - to format and print a floating-point number with a minimum width of 0 characters and a precision of two digits after the decimal point.</li>
 *     <li><b>%b</b> - format specifier is used for formatting and printing boolean values.</li>
 *     <li><b>%s</b> - seeks to format and print texts (strings).</li>
 *     <li><b>%c</b> - for formatting and printing single characters.</li>
 * </ul>
 */

public class PrintWriterExample {
    public static void main(final String[] PARAMETERS) throws IOException {
        printWriter();
    }

    private static void printWriter() throws IOException {
        String data = "Print Writer";
        PrintWriter out = new PrintWriter("src/_1_learning/_1_3_handling/_1_3_2_file_handling/_1_3_2_2_reader_and_writer/_1_3_2_2_6_pint_writer/PrintWriter.txt");

        out.print(data);

        out.close();
    }
}