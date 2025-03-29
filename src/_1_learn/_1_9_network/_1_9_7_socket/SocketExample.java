package _1_learn._1_9_network._1_9_7_socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class SocketExample {
    public static void main(final String[] ARGUMENTS) throws IOException {
        final String HOST_TEXT = "www.jetbrains.com";
        final int PORT = 80; // 80 = HTTP Port
        try (
                final Socket SOCKET = new Socket(HOST_TEXT, PORT);
                final PrintWriter OUTPUT = new PrintWriter(SOCKET.getOutputStream(), true);
                final BufferedReader INPUT = new BufferedReader(new InputStreamReader(SOCKET.getInputStream()))
        ) {
            OUTPUT.println("GET / HTTP/1.1");
            OUTPUT.println("Host: " + HOST_TEXT);
            OUTPUT.println("Connection: close");
            OUTPUT.println(); // Empty line to end the request

            // Read and print the response
            String line;
            while ((line = INPUT.readLine()) != null)
                System.out.println(line);
        }
    }
}