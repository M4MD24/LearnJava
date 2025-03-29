package _1_learn._1_9_network._1_9_8_protocols._1_9_8_2_transmission_control_protocol._1_9_2_1_2_multithreading;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(final String[] ARGUMENTS) throws Exception {
        try {
            final Socket SOCKET = new Socket(
                    "localhost",
                    1424
            );

            final BufferedReader IN_SOCKET = new BufferedReader(new InputStreamReader(SOCKET.getInputStream()));
            final PrintWriter OUT_SOCKET = new PrintWriter(
                    new OutputStreamWriter(SOCKET.getOutputStream()),
                    true
            );
            final Scanner INPUT = new Scanner(System.in);

            System.out.println(IN_SOCKET.readLine());
            final String NAME_OF_CLIENT = INPUT.nextLine();
            OUT_SOCKET.println(NAME_OF_CLIENT);

            String messageOfServer = IN_SOCKET.readLine();
            while (messageOfServer.startsWith("Guess")) {
                System.out.println(messageOfServer);
                final String GUESSED_NUMBER = INPUT.nextLine();
                OUT_SOCKET.println(GUESSED_NUMBER);
                messageOfServer = IN_SOCKET.readLine();
            }

            System.out.println(messageOfServer);
            System.out.print("Socket is closed.");
        } catch (final Exception EXCEPTION) {
            System.out.println("You Lost!");
        }
    }
}