package _1_learn._1_9_network._1_9_8_protocols._1_9_8_1_file_transfer_protocol._1_9_8_1_1_simple.client;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(final String[] PARAMETERS) throws IOException {
        final Socket SOCKET = new Socket(
                "localhost",
                1424
        );
        final File FILE = new File("src/_1_learn/_1_9_network/_1_9_8_protocols/_1_9_8_1_file_transfer_protocol/_1_9_8_1_1_simple/client/Data.txt");
        final byte[] DATA_OF_FILE_AS_BYTE = new byte[20 * 1024]; // 20 Kilobyte
        final InputStream INPUT = new FileInputStream(FILE);
        final OutputStream OUTPUT = SOCKET.getOutputStream();
        int numberOfLine;
        while ((numberOfLine = INPUT.read(DATA_OF_FILE_AS_BYTE)) > 0)
            OUTPUT.write(
                    DATA_OF_FILE_AS_BYTE,
                    0,
                    numberOfLine
            );
        OUTPUT.flush();
        INPUT.close();
        SOCKET.close();
    }
}