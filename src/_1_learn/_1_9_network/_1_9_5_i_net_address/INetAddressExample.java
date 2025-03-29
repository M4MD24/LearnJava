package _1_learn._1_9_network._1_9_5_i_net_address;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class INetAddressExample {
    public static void main(final String[] ARGUMENTS) throws IOException {
        printInformationFromGlobalHostIP();
        printLineBreak();

        printInformationFromLocalHostIP();
        printLineBreak();

        printAllIPsFromWebsite();
        printLineBreak();

        printCompareIPs();
        printLineBreak();

        printInformationFromWebsite();
    }

    private static void printInformationFromWebsite() throws IOException {
        System.out.println("5. Information From Website\n");

        final String JETBRAINS_WEBSITE = "www.jetbrains.com"; // JetBrains Website

        final InetAddress NAME_OF_WEBSITE = InetAddress.getByName(JETBRAINS_WEBSITE);

        System.out.printf("""
                        Host Name: %s
                        Address: %s
                        Canonical Host Name: %s
                        Host Address: %s
                        is MC Global: %s
                        is MC Org Local: %s
                        is Any Local Address: %s
                        is Loop back Address: %s
                        is Multicast Address: %s
                        is Link Local Address: %s
                        is Site Local Address: %s
                        is MC Link Local: %s
                        is MC Node Local: %s
                        is MC Site Local: %s
                        is Reachable: %s
                        IP Address: %s""",
                NAME_OF_WEBSITE.getHostName(),
                Arrays.toString(NAME_OF_WEBSITE.getAddress()),
                NAME_OF_WEBSITE.getCanonicalHostName(),
                NAME_OF_WEBSITE.getHostAddress(),
                NAME_OF_WEBSITE.isMCGlobal(),
                NAME_OF_WEBSITE.isMCOrgLocal(),
                NAME_OF_WEBSITE.isAnyLocalAddress(),
                NAME_OF_WEBSITE.isLoopbackAddress(),
                NAME_OF_WEBSITE.isMulticastAddress(),
                NAME_OF_WEBSITE.isLinkLocalAddress(),
                NAME_OF_WEBSITE.isSiteLocalAddress(),
                NAME_OF_WEBSITE.isMCLinkLocal(),
                NAME_OF_WEBSITE.isMCNodeLocal(),
                NAME_OF_WEBSITE.isMCSiteLocal(),
                NAME_OF_WEBSITE.isReachable(100_000),
                NAME_OF_WEBSITE
        );
    }

    private static void printCompareIPs() throws UnknownHostException {
        System.out.println("4. Compare IPs\n");

        final InetAddress NAME_OF_GOOGLE_EGYPT_IP = InetAddress.getByName("www.google.iq"),
                NAME_OF_GOOGLE_SYRIA_IP = InetAddress.getByName("www.google.jo");
        System.out.print(NAME_OF_GOOGLE_EGYPT_IP.equals(NAME_OF_GOOGLE_SYRIA_IP));
    }

    private static void printAllIPsFromWebsite() throws UnknownHostException {
        System.out.println("3. All IPs\n");
        final String HOST_TEXT = "www.jetbrains.com";
        final InetAddress[] NAME_OF_IPS = InetAddress.getAllByName(HOST_TEXT);
        System.out.print(Arrays.toString(NAME_OF_IPS));
    }

    private static void printInformationFromGlobalHostIP() throws IOException {
        System.out.println("1. Information From Global Host IP\n");

        final String JETBRAINS_IP = "108.159.120.45"; // JetBrains IP

        final InetAddress NAME_OF_IP = InetAddress.getByName(JETBRAINS_IP);

        System.out.printf("""
                        Host Name: %s
                        Address: %s
                        Canonical Host Name: %s
                        Host Address: %s
                        is MC Global: %s
                        is MC Org Local: %s
                        is Any Local Address: %s
                        is Loop back Address: %s
                        is Multicast Address: %s
                        is Link Local Address: %s
                        is Site Local Address: %s
                        is MC Link Local: %s
                        is MC Node Local: %s
                        is MC Site Local: %s
                        is Reachable: %s
                        IP Address: %s""",
                NAME_OF_IP.getHostName(),
                Arrays.toString(NAME_OF_IP.getAddress()),
                NAME_OF_IP.getCanonicalHostName(),
                NAME_OF_IP.getHostAddress(),
                NAME_OF_IP.isMCGlobal(),
                NAME_OF_IP.isMCOrgLocal(),
                NAME_OF_IP.isAnyLocalAddress(),
                NAME_OF_IP.isLoopbackAddress(),
                NAME_OF_IP.isMulticastAddress(),
                NAME_OF_IP.isLinkLocalAddress(),
                NAME_OF_IP.isSiteLocalAddress(),
                NAME_OF_IP.isMCLinkLocal(),
                NAME_OF_IP.isMCNodeLocal(),
                NAME_OF_IP.isMCSiteLocal(),
                NAME_OF_IP.isReachable(100_000),
                NAME_OF_IP
        );
    }

    private static void printLineBreak() {
        System.out.println("\n\n" + "-".repeat(100) + '\n');
    }

    private static void printInformationFromLocalHostIP() throws IOException {
        System.out.println("2. Information From Local Host IP\n");

        final InetAddress NAME_OF_IP = InetAddress.getLocalHost();

        System.out.printf("""
                        Host Name: %s
                        Address: %s
                        Canonical Host Name: %s
                        Host Address: %s
                        is MC Global: %s
                        is MC Org Local: %s
                        is Any Local Address: %s
                        is Loop back Address: %s
                        is Multicast Address: %s
                        is Link Local Address: %s
                        is Site Local Address: %s
                        is MC Link Local: %s
                        is MC Node Local: %s
                        is MC Site Local: %s
                        is Reachable: %s
                        IP Address: %s""",
                NAME_OF_IP.getHostName(),
                Arrays.toString(NAME_OF_IP.getAddress()),
                NAME_OF_IP.getCanonicalHostName(),
                NAME_OF_IP.getHostAddress(),
                NAME_OF_IP.isMCGlobal(),
                NAME_OF_IP.isMCOrgLocal(),
                NAME_OF_IP.isAnyLocalAddress(),
                NAME_OF_IP.isLoopbackAddress(),
                NAME_OF_IP.isMulticastAddress(),
                NAME_OF_IP.isLinkLocalAddress(),
                NAME_OF_IP.isSiteLocalAddress(),
                NAME_OF_IP.isMCLinkLocal(),
                NAME_OF_IP.isMCNodeLocal(),
                NAME_OF_IP.isMCSiteLocal(),
                NAME_OF_IP.isReachable(100_000),
                NAME_OF_IP
        );
    }
}