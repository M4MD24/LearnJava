package _1_learning._1_3_handling._1_3_2_file_handling._1_3_2_3_file;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// • File Operation Methods

/**
 * <h1>File Operation Methods</h1>
 * <table>
 *     <tr>
 *       <th>Operation</th>
 *       <th>Method</th>
 *       <th>Package</th>
 *     </tr>
 *     <tr>
 *       <th>--------</th>
 *       <th>--------</th>
 *       <th>--------</th>
 *     </tr>
 *     <tr>
 *       <th>To create file</th>
 *       <th>createNewFile()</th>
 *       <th>java.io.File</th>
 *     </tr>
 *     <tr>
 *       <th>To read file</th>
 *       <th>read()</th>
 *       <th>java.io.FileReader</th>
 *     </tr>
 *     <tr>
 *       <th>To write file</th>
 *       <th>write()</th>
 *       <th>java.io.FileWriter</th>
 *     </tr>
 *     <tr>
 *       <th>To delete file</th>
 *       <th>delete()</th>
 *       <th>java.io.File</th>
 *     </tr>
 * </table>
 */

public class FileExample {
    public static void main(final String[] PARAMETERS) throws IOException {
        file();
    }

    private static void file() throws IOException {
        char[] array = new char[Character.MAX_VALUE];
        File file = new File("src/_1_learning/_1_3_handling/_1_3_2_file_handling/_1_3_2_3_file/File.txt");

        System.out.println(".createNewFile()         : " + file.createNewFile());

        System.out.println(".getName()               : " + file.getName());

        System.out.println(".lastModified()          : " + file.lastModified());

        file.setWritable(true);
        System.out.println(".canWrite() after        : " + file.canWrite());

        System.out.println(".canRead()               : " + file.canRead());

        System.out.println(".getCanonicalPath() after: " + file.getCanonicalPath());

        String data = "File";
        FileWriter fileWriter = new FileWriter(file);
        fileWriter.write(data);
        fileWriter.close();

        FileReader fileReader = new FileReader(file);
        final int CHARACTERS_READ = fileReader.read(array);
        System.out.print(".read() after            : ");
        System.out.println(String.valueOf(array, 0, CHARACTERS_READ).trim());
        fileReader.close();

        System.out.print(".delete()                : " + file.delete());
    }
}