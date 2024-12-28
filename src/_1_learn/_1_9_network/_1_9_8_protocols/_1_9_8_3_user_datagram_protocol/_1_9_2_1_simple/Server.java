package _1_learn._1_9_network._1_9_8_protocols._1_9_8_3_user_datagram_protocol._1_9_2_1_simple;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class Server {
    public static void main(final String[] PARAMETERS) throws Exception {
        final DatagramSocket DATAGRAM_SOCKET = new DatagramSocket(1424);
        final Scanner INPUT = new Scanner(System.in);

        while (true) {
            byte[] buffer = new byte[1500]; // MTU (Maximum Transmission Unit) 1500
            final DatagramPacket INPUT_PACKET = new DatagramPacket(
                    buffer,
                    buffer.length
            );

            DATAGRAM_SOCKET.receive(INPUT_PACKET);
            String message = new String(buffer).trim();
            System.out.println("Received: " + message);

            final InetAddress SERNDER_ADDRESS = INPUT_PACKET.getAddress();
            final int SENDER_PORT = INPUT_PACKET.getPort();
            System.out.print("You: ");
            message = INPUT.nextLine();
            buffer = message.getBytes();
            final DatagramPacket OUPUT_PACKET = new DatagramPacket(
                    buffer,
                    buffer.length,
                    SERNDER_ADDRESS,
                    SENDER_PORT
            );
            DATAGRAM_SOCKET.send(OUPUT_PACKET);
        }
    }
}