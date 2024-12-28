package _1_learn._1_9_network._1_9_8_protocols._1_9_8_3_user_datagram_protocol._1_9_2_1_simple;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Client {
    public static void main(final String[] PARAMETERS) throws Exception {
        final DatagramSocket DATAGRAM_SOCKET = new DatagramSocket();
        final Scanner INPUT = new Scanner(System.in);

        while (true) {
            System.out.print("You: ");
            String message = INPUT.nextLine();
            byte[] buffer = message.getBytes();

            final DatagramPacket OUPUT_PACKET = new DatagramPacket(
                    buffer,
                    buffer.length,
                    InetAddress.getByName("localhost"),
                    1424
            );

            DATAGRAM_SOCKET.send(OUPUT_PACKET);

            buffer = new byte[1500]; // MTU (Maximum Transmission Unit) 1500
            final DatagramPacket INPUT_PACKET = new DatagramPacket(
                    buffer,
                    buffer.length
            );

            DATAGRAM_SOCKET.receive(INPUT_PACKET);
            message = new String(buffer).trim();

            System.out.println("Received: " + message);
        }
    }
}