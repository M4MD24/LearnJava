package _1_learn._1_9_network._1_9_1_uri;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

public class URIExample {
    public static void main(final String[] ARGUMENTS) throws MalformedURLException, URISyntaxException {
        printURIFromFile();
        printURIInformation();
    }

    private static void printURIInformation() throws URISyntaxException {
        final URI URI_EXAMPLE = new URI("https://github.com/Barmajaa/Barmajaa");
        System.out.printf("""
                        Authority: %s
                        Fragment: %s
                        Host: %s
                        Path: %s
                        Port: %s
                        Query: %s
                        Scheme: %s
                        SchemeSpecificPart: %s
                        User Info: %s
                        URL is absolute: %s
                        URL is opaque %s""",
                URI_EXAMPLE.getAuthority(),
                URI_EXAMPLE.getFragment(),
                URI_EXAMPLE.getHost(),
                URI_EXAMPLE.getPath(),
                URI_EXAMPLE.getPort(),
                URI_EXAMPLE.getQuery(),
                URI_EXAMPLE.getScheme(),
                URI_EXAMPLE.getSchemeSpecificPart(),
                URI_EXAMPLE.getUserInfo(),
                URI_EXAMPLE.isAbsolute(),
                URI_EXAMPLE.isOpaque()
        );
    }

    private static void printURIFromFile() {
        final File FILE = new File("src/_1_learn/_1_9_network/_1_9_1_uri/data/Data.txt");
        System.out.println(FILE.toURI());
    }
}