package _1_learn._1_9_network._1_9_4_url_encoding_and_url_decoding;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class URLEncodingAndURLDecodingExample {
    public static void main(final String[] ARGUMENTS) throws UnsupportedEncodingException {
        final String URL_TEXT = "https://m3md69.github.io/NULLEXIA";
        final String URL_AFTER_ENCOING = URLEncoder.encode(
                URL_TEXT,
                StandardCharsets.UTF_8
        );
        final String URL_AFTER_DENCOING = URLDecoder.decode(
                URL_AFTER_ENCOING,
                "UTF-8"
        );
        System.out.printf("""
                        Original URL Text: %s
                        URL After Encoding: %s
                        URL After Decoding: %s""",
                URL_TEXT,
                URL_AFTER_ENCOING,
                URL_AFTER_DENCOING
        );
    }
}