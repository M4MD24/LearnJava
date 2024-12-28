package _1_learn._1_9_network._1_9_2_url_and_url_connection_and_http_url_connection_and_https_url_connection;

import javax.net.ssl.HttpsURLConnection;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Date;

public class URLAndURLConnectionAndHTTPURLConnectionAndHTTPSURLConnectionExample {
    public static void main(final String[] PARAMETERS) throws IOException {
        printURLConnectionInformation(new URL("https://m3md69.github.io/NULLEXIA"));
    }

    private static void printURLConnectionInformation(final URL UNIFORM_RESOURCE_LOCATOR) throws IOException {
        final URLConnection URL_CONNECTION = UNIFORM_RESOURCE_LOCATOR.openConnection();
        URL_CONNECTION.connect();
        System.out.printf("""
                        Conent Type: %s
                        Conent Encoding: %s
                        Conent Length: %s
                        Date: %s
                        Last Modified: %s
                        Expiration: %s
                        """,
                URL_CONNECTION.getContentType(),
                URL_CONNECTION.getContentEncoding(),
                URL_CONNECTION.getContentLength(),
                new Date(URL_CONNECTION.getDate()),
                new Date(URL_CONNECTION.getLastModified()),
                new Date(URL_CONNECTION.getExpiration())
        );

        if (URL_CONNECTION instanceof HttpURLConnection) {
            handleHttpConnection((HttpURLConnection) URL_CONNECTION);
        } else if (URL_CONNECTION instanceof HttpsURLConnection) {
            handleHttpConnection((HttpURLConnection) URL_CONNECTION);
            handleHttpsConnection((HttpsURLConnection) URL_CONNECTION);
        }

        printHeaders(URL_CONNECTION);
    }

    private static void printHeaders(final URLConnection URL_CONNECTION) {
        int number = 0;
        String header;
        do {
            header = URL_CONNECTION.getHeaderField(number);
            System.out.println(URL_CONNECTION.getHeaderFieldKey(number) + ": " + header);
            number++;
        } while (header != null);
    }

    private static void handleHttpConnection(final HttpURLConnection HTTP_URL_CONNECTION) throws IOException {
        System.out.printf("""
                        Request Method: %s
                        Response Message: %s
                        Response Code: %s
                        """,
                HTTP_URL_CONNECTION.getRequestMethod(),
                HTTP_URL_CONNECTION.getResponseMessage(),
                HTTP_URL_CONNECTION.getResponseCode()
        );
    }

    private static void handleHttpsConnection(final HttpsURLConnection HTTPS_URL_CONNECTION) {
        System.out.printf("""
                        Cipher Suite: %s""",
                HTTPS_URL_CONNECTION.getCipherSuite()
        );
    }
}