package _1_learn._1_9_network._1_9_3_protocol_tester;

import java.net.MalformedURLException;
import java.net.URL;

public class ProtocolTester {
    public static void main(final String[] ARGUMENTS) {
        final String HOST = "m3md69.github.io";
        final String FILE = "index.html";
        printTestCasesForProtocol(
                HOST,
                FILE
        );
    }

    private static void printTestCasesForProtocol(
            String HOST,
            String FILE
    ) {
        final String[] SOME_PROTOCOLS = {
                "http", "https", "ftp", "file", "sftp", "smtp", "pop3", "imap",
                "ws", "wss", "ssh", "telnet", "ldap", "rtsp", "nfs", "gopher",
                "magnet", "data", "irc", "bitcoin", "mailto", "sip"
        };
        for (final String PROTOCOL : SOME_PROTOCOLS) {
            try {
                new URL(
                        PROTOCOL,
                        HOST,
                        FILE
                );
                System.out.println(PROTOCOL + " is supported!");
            } catch (MalformedURLException _) {
                System.out.println(PROTOCOL + " isn't supported!");
            }
        }
    }
}