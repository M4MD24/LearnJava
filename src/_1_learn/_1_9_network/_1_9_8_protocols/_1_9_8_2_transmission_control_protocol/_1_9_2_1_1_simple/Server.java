package _1_learn._1_9_network._1_9_8_protocols._1_9_8_2_transmission_control_protocol._1_9_2_1_1_simple;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(final String[] ARGUMENTS) throws Exception {
        final int PORT = 1424;
        ServerSocket SERVER_SOCKET = new ServerSocket(PORT);
        final Socket SOCKET = SERVER_SOCKET.accept();
        final BufferedReader IN_SOCKET = new BufferedReader(new InputStreamReader(SOCKET.getInputStream()));
        final PrintWriter OUT_SOCKET = new PrintWriter(
                new OutputStreamWriter(SOCKET.getOutputStream()),
                true
        );
        final int FROM_NUMBER = 1,
                TO_NUMBER = 10;
        final int SECRET_NUMBER = (int) (Math.random() * TO_NUMBER + FROM_NUMBER);
        String message;
        do {
            OUT_SOCKET.println("Guess a number [1-10]: ");
            message = IN_SOCKET.readLine();
        } while (!(Integer.parseInt(message) == SECRET_NUMBER));
        OUT_SOCKET.println("Done!");
        SOCKET.close();
    }
}