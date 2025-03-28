package _1_learn._1_9_network._1_9_8_protocols._1_9_8_2_transmission_control_protocol._1_9_2_1_2_multithreading;

import java.net.ServerSocket;
import java.net.Socket;

public class ServerMain {
    public static void main(final String[] ARGUMENTS) throws Exception {
        final int PORT = 1424;
        final ServerSocket SERVER_SOCKET = new ServerSocket(PORT);
        System.out.println("Port " + PORT + " is Open.");

        while (true) {
            final Socket SOCKET = SERVER_SOCKET.accept();
            final ServerThread SERVER_THREAD = new ServerThread(SOCKET);
            final Thread THREAD = new Thread(SERVER_THREAD);
            THREAD.start();
        }
    }
}