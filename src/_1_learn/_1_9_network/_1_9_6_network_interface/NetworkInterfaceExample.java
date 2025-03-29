package _1_learn._1_9_network._1_9_6_network_interface;

import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;

public class NetworkInterfaceExample {
    public static void main(final String[] ARGUMENTS) throws SocketException {
        printNetworkInterfacesElements();
        printLineBreak();
    }

    private static void printNetworkInterfaceInformation(final NetworkInterface NETWORK_INTERFACES) throws SocketException {
        System.out.printf("""
                        Name: %s
                        Display Name: %s
                        Interface Addresses: %s
                        I Net Address: %s
                        Sub Interfaces: %s
                        Hardware Address: %s
                        Index: %s
                        MTU: %s
                        Parent: %s
                        Sub I Net Address: %s
                        I Net Addresses: %s
                        Supports Multicast: %s
                        Is Loop back: %s
                        Is Point To Point: %s
                        Is Up: %s
                        Is Virtual: %s
                        Network Interface: %s""",
                NETWORK_INTERFACES.getName(),
                NETWORK_INTERFACES.getDisplayName(),
                Arrays.toString(NETWORK_INTERFACES.getInterfaceAddresses().toArray()),
                Collections.list(NETWORK_INTERFACES.getInetAddresses()),
                NETWORK_INTERFACES.subInterfaces().toList(),
                Collections.list(NETWORK_INTERFACES.getSubInterfaces()),
                Arrays.toString(NETWORK_INTERFACES.getHardwareAddress()),
                NETWORK_INTERFACES.getIndex(),
                NETWORK_INTERFACES.getMTU() /* √ MTU = Maximum Transmission Unit */,
                NETWORK_INTERFACES.inetAddresses().toList(),
                NETWORK_INTERFACES.getParent(),
                NETWORK_INTERFACES.supportsMulticast(),
                NETWORK_INTERFACES.isLoopback(),
                NETWORK_INTERFACES.isPointToPoint(),
                NETWORK_INTERFACES.isUp(),
                NETWORK_INTERFACES.isVirtual(),
                NETWORK_INTERFACES
        );
    }

    private static void printLineBreak() {
        System.out.println("\n\n" + "-".repeat(100) + '\n');
    }

    private static void printNetworkInterfacesElements() throws SocketException {
        final Enumeration<NetworkInterface> NETWORK_INTERFACES = NetworkInterface.getNetworkInterfaces();
        while (NETWORK_INTERFACES.hasMoreElements()) {
            printNetworkInterfaceInformation(NETWORK_INTERFACES.nextElement());
            if (NETWORK_INTERFACES.hasMoreElements())
                System.out.println("\n\n" + "-".repeat(50) + '\n');
        }
    }
}