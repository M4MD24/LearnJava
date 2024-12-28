package _1_learn._1_9_network._1_9_8_protocols._1_9_8_2_transmission_control_protocol._1_9_2_1_2_multithreading;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

public class ServerThread implements Runnable {
    private static Socket socket;

    ServerThread(final Socket SOCKET) {
        socket = SOCKET;
    }

    @Override
    public void run() {
        try {
            System.out.println("Client has connected.");

            final BufferedReader IN_SOCKET = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            final PrintWriter OUT_SOCKET = new PrintWriter(
                    new OutputStreamWriter(socket.getOutputStream()),
                    true
            );

            OUT_SOCKET.println("Enter your name: ");
            final String NAME_OF_CLIENT = IN_SOCKET.readLine();
            System.out.println("Client name: " + NAME_OF_CLIENT);

            final int FROM_NUMBER = 1,
                    TO_NUMBER = 10;
            final int SECRET_NUMBER = (int) (Math.random() * TO_NUMBER + FROM_NUMBER);
            String message;
            do {
                OUT_SOCKET.println("Guess a number [1-10]: ");
                message = IN_SOCKET.readLine();
            } while (!(Integer.parseInt(message) == SECRET_NUMBER));

            OUT_SOCKET.println("Done!");
            System.out.println(NAME_OF_CLIENT + " is Done!");

            socket.close();
            System.out.println("Socket is closed.");
        } catch (final Exception _) {
        }
    }
}